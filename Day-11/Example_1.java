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
