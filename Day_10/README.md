#  Example 1
~~~ java
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Dhaka");
        cities.add("Chittagong");
        cities.add("Sylhet");
        cities.add("Dhaka"); 
        System.out.println("HashSet (No specific order): " + cities);
        if (cities.contains("Sylhet")) {
            System.out.println("Sylhet is in the set.");
        }
        cities.remove("Chittagong");
        System.out.println("After Removal: " + cities);
    }
}
~~~
#  Example 2
~~~ java
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
~~~
