/**
 * Created by Maxim on 10.03.2017.
 */
public class Main {
    public static void main(String args []){
        String s = "Massiv";
        String b = "Strok";
        String c = "Java";
        DynamicStringList dynamicStringList = new DynamicStringList();
        dynamicStringList.add(s);
        dynamicStringList.add(b);
        dynamicStringList.add(c);
        dynamicStringList.toString();
        System.out.println("Последний элемент из массива: " + dynamicStringList.get());
        System.out.println("Получить элемент по его индексу: " + dynamicStringList.get(0));
        System.out.println("Удаление последнего элемента: " + dynamicStringList.remove());
        System.out.println("Удаление элемента по индексу: " + dynamicStringList.remove(0));
        System.out.println("Удаление всех элементов массива: " + dynamicStringList.delete());

    }
}
