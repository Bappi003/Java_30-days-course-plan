#  Example 1
~~~ java
interface DataBase {
    void connect();
}
interface Cloud {
    void upload();
}
class SystemServer implements DataBase, Cloud {
    public void connect() {
        System.out.println("Connected to SQL Database");
    }
    public void upload() {
        System.out.println("Data uploaded to Cloud");
    }
}
public class Main {
    public static void main(String[] args) {
        SystemServer server = new SystemServer();
        server.connect();
        server.upload();
    }
}
~~~

#  Example_2
~~~java
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
~~~
