import java.util.LinkedList;
import java.util.Queue;
public class PrinterSystem {
    public static void main(String[] args) {
        Queue<String> printJobs = new LinkedList<>();
        printJobs.add("Resume.pdf");
        printJobs.add("Photo.jpg");
        printJobs.add("Assignment.docx");
        System.out.println("Printer Status: Waiting for " + printJobs.size() + " jobs.");
        while (!printJobs.isEmpty()) {
            System.out.println("Printing: " + printJobs.poll());
          
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }

        System.out.println("All jobs completed!");
    }
}
