import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); ে
        System.out.println("TreeSet (Sorted order): " + numbers);
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());
        System.out.println("Lower than 30: " + numbers.headSet(30));
    }
}
