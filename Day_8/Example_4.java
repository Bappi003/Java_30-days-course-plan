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
