import java.util.PriorityQueue;

public class Max {
    public static int maxim(int[] A, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : A) {
            minHeap.offer(n);
        }

        for (int i = 0; i < k; i++) {
            int smallest = minHeap.poll();
            minHeap.offer(-smallest);
        }

        int arraySum = 0;
        for (int n : minHeap) {
            arraySum += n;
        }

        return arraySum;
    }

    public static void main(String[] args) {
        int[] A = {4,2,3,12,6,8,10};
        int k = 2;
        int result = maxim(A, k);
        System.out.println("Maximum array sum after " + k + " negations: " + result);
    }
}
