
public class Main {
    public static void main(String args []){
        String s = "Massiv";
        String b = "Strok";
        String c = "Java";
        DynamicStringList dynamicStringList = new DynamicStringList(3);
        dynamicStringList.add(s);
        dynamicStringList.add(b);
        dynamicStringList.add(c);
        System.out.println("Последний элемент: " + dynamicStringList.get());
        System.out.println("Элемент по индексу: " + dynamicStringList.get(1));
        System.out.println("Удаление последнего елемента: " + dynamicStringList.remove());
        System.out.println("Удаление элемента по индексу: " + dynamicStringList.remove(0));
        System.out.println("Очистка " + dynamicStringList.delete());
    }
}
