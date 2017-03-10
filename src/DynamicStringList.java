import javax.management.DynamicMBean;

/**
 * Created by Maxim on 10.03.2017.
 */
public class DynamicStringList implements SimpleList {

    private int sizeArray = 10;
    private String array = new String();

    public DynamicStringList(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public DynamicStringList() {
    }

    @Override
    public void add(String s) {
        array = s;
        System.out.println("Добавление строки: " + array);
    }

    @Override
    public String get() {
        return String.valueOf(array.charAt(array.length()-1));
    }

    @Override
    public String get(int id) {
        return String.valueOf(array.charAt(id));
    }

    @Override
    public String remove() {
        array = array.substring(0,array.length()-1);
        return array;
    }

    @Override
    public String remove(int id) {
        array = array.substring(0,id)+ array.substring(id+1);
        return array;
    }

    @Override
    public boolean delete() {
        array = array.substring(0,0);
        if(array.length()==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "DynamicStringList{" +
                "sizeArray=" + sizeArray +
                ", array='" + array + '\'' +
                '}';
    }
}
