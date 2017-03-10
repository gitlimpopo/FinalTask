/**
 * Created by Maxim on 10.03.2017.
 */
public class Main {
    public static void main(String args []){
        String s = "Massiv";
        DynamicStringList dynamicStringList = new DynamicStringList();
        dynamicStringList.add(s);
        System.out.println("Последний элемент из массива: " + dynamicStringList.get());
        System.out.println("Элемент по его индексу: " + dynamicStringList.get(3));
        System.out.println("Удаленный последний элемент: "+dynamicStringList.remove());
        System.out.println(" Удаленный элемент по индексу: " + dynamicStringList.remove(3));
        System.out.println("Удаление всех елементов: " + dynamicStringList.delete());
        DynamicStringList dynamicStringList1 = new DynamicStringList(5);
        dynamicStringList1.add(s);

    }
}
