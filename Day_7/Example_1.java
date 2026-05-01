class CPU {
    double price = 50000;
    class Processor {
        String manufacturer = "Intel";

        void displayInfo() {
            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("CPU Price: " + price);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        CPU myCpu = new CPU();
        
        CPU.Processor myProcessor = myCpu.new Processor();
        myProcessor.displayInfo();
    }
}
