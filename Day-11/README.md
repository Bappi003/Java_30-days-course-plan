#  Example 1
~~~ java
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Person 1");
        queue.add("Person 2");
        queue.add("Person 3");
        System.out.println("Current Queue: " + queue);
        System.out.println("Next in line: " + queue.peek());
        String removed = queue.poll();
        System.out.println("Served: " + removed);
        System.out.println("Final Queue: " + queue);
    }
}
~~~

#  Example 2

~~~ java
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
~~~
