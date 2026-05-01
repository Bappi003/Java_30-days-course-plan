abstract class Computer {
    abstract void startup();
    void shutdown() {
        System.out.println("System shutting down...");
    }
}
class Laptop extends Computer {
    void startup() {
        System.out.println("Laptop starting with battery...");
    }
}
public class Main {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.startup();
        myLaptop.shutdown();
    }
}
