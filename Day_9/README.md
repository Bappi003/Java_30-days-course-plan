#  Example 1
~~~ java
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
~~~
#  Example 2
~~~ java
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Tiger");
        animals.add("Deer");
        animals.add("Rabbit");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);
        animals.removeFirst();
        animals.removeLast();
        System.out.println("Updated LinkedList: " + animals);
    }
}
~~~
