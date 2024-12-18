import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            queue.offer(i);
        }

        displayQueue(queue);

        int removedItem = queue.poll();
        System.out.println("Dequeued item: " + removedItem);

        displayQueue(queue);

        int frontItem = queue.peek();
        System.out.println("Front item: " + frontItem);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }

    public static void displayQueue(Queue<Integer> queue) {
        System.out.print("Queue: ");
        for (int item : queue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}