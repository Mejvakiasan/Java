package dublicate;
import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue); // Output: Queue: [Alice, Bob, Charlie]

        String firstPerson = queue.poll();
        System.out.println("Dequeued: " + firstPerson); // Output: Dequeued: Alice
        System.out.println("Queue after poll: " + queue); // output: Queue after poll: [Bob, Charlie]

        String nextPerson = queue.peek();
        System.out.println("Peek: " + nextPerson); // Output: Peek: Bob
        System.out.println("Queue after peek: " + queue); // output: Queue after peek: [Bob, Charlie]

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }
    }
}