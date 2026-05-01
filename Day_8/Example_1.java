import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits.get(0));
        fruits.set(1, "Orange");
        fruits.remove(2);
        System.out.println("Size: " + fruits.size());
        System.out.println("List: " + fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
