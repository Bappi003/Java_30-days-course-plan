#  Example 1
~~~ java
import java.util.TreeMap;

public class Example1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Watermelon", 3);
        map.put("Lychee", 1);
        map.put("Mango", 2);

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
~~~
#  Example 
~~~ java
import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        map.remove(2);

        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
~~~
