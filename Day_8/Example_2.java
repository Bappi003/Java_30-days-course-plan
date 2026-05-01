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
