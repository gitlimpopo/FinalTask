import javax.management.DynamicMBean;
import java.util.ArrayList;

/**
 * Created by Maxim on 10.03.2017.
 */
public class DynamicStringList implements SimpleList {

    private int sizeArray = 10;
    private ArrayList<String> array = new ArrayList<>(sizeArray);

    public DynamicStringList(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public DynamicStringList() { }

    @Override
    public void add(String s) {
       array.add(s);
        System.out.println("Добавлена строка");
    }

    @Override
    public String get() {
        return array.get(array.size()-1);
    }

    @Override
    public String get(int id) {
        return array.get(id);
    }
    @Override
    public String remove() {
        return array.remove(array.size()-1);
    }

    @Override
    public String remove(int id) {
        return array.remove(id);
    }

    @Override
    public boolean delete() {
        array.clear();
        if(array.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        System.out.println();
        return "DynamicStringList{" +
                "sizeArray=" + sizeArray +
                ", array='" + array + '\'' +
                '}';
    }
}
