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
