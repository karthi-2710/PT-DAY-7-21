import java.util.*;
public class queue_example {
    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();

        // Enqueue elements into the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Dequeue an element from the queue
        System.out.println("Dequeued element: " + queue.poll());

        // Peek at the front element of the queue
        System.out.println("Front element: " + queue.peek());

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Get the size of the queue
        System.out.println("Queue size: " + queue.size());
    }
}
