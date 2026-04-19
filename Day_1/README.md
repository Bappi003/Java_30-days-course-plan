# Example 01
```java
public class Car {
    
    String brand;
    int speed;

    
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        
        Car c1 = new Car(); 
        c1.brand = "Toyota";
        c1.speed = 120;

        
        Car c2 = new Car(); 
        c2.brand = "BMW";
        c2.speed = 180;

        
        c1.showDetails();
        c2.showDetails();
    }
}
```

# Examle 02 
```java
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Bappi";
        s1.age = 22;

        s1.display();
    }
}
```



