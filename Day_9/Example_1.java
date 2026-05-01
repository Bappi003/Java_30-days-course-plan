import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Jackfruit");
        System.out.println("ArrayList: " + fruits);
        System.out.println("Second Fruit: " + fruits.get(1));
        fruits.remove(0);
        System.out.println("After Removal: " + fruits);
    }
}
