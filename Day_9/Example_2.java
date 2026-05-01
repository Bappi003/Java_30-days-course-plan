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
