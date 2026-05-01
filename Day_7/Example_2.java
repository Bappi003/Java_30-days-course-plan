class Motherboard {
    static String model = "ASUS ROG";
    static class USB {
        void connect() {
            System.out.println("USB Device connected to: " + model);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Motherboard.USB port = new Motherboard.USB();
        port.connect();
    }
}
