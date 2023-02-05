import java.util.HashMap;

/*Разработать программу, имитирующую поведение коллекции HashSet.
В программе содать метод add добавляющий элемент, и метод позволяющий 
выводить эллементы коллекции в консоль. Формат данных Integer.*/

public class w6 {
    private static HashMap <Integer,Object> hMap = new HashMap<>();
    private static final  Object OBJECT = new Object();
    public static void main (String[] args) {
        add(123);
        add(255882);
        add(558688954);
        add(25679498);

        Print();
        
}
public static void add(Integer numbers) {

    hMap.put(numbers, OBJECT);

}
public static void Print() {
    System.out.println(hMap.keySet());
}


}