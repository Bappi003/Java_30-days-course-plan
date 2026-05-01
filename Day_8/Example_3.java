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
