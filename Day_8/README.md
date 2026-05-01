#  Example 1
~~~ java
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
~~~
#  Example 2
~~~ java
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.addFirst("JavaScript");
        list.addLast("Kotlin");
        System.out.println(list.get(0));       
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
~~~
#  Example 3
~~~ java
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Rahim");
        names.add("Karim");
        names.add("John");
        names.add("Rahim");
        System.out.println("Size: " + names.size());
        System.out.println("Contains John: " + names.contains("John"));
        names.remove("Karim");
        System.out.println("Set: " + names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
~~~
#  Example 4
~~~ java
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Rahim");
        students.put(102, "Karim");
        students.put(103, "John");
        System.out.println(students.get(101));
        students.remove(102);
        System.out.println("Size: " + students.size());
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
~~~
