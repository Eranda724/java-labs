import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class priority{
	public static void main(String[] args){
		Queue<String> queue=new PriorityQueue<>();
		
		queue.offer("dog");
		queue.offer("cat");
		queue.offer("elephant");
		queue.offer("bird");
		queue.offer("cow");
		System.out.println(queue);
		Queue<Integer> queue2 = new PriorityQueue<>(Collections.reverseOrder());
		
		queue2.offer(2);
		queue2.offer(9);
		queue2.offer(101);
		queue2.offer(89);
		queue2.offer(5);
		System.out.println(queue2);
		queue.poll();
		queue.poll();
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		System.out.println(queue.size()); 
		}
		}