import java.util.Scanner;

class Node {
    int d;
    Node n;

    public Node(int d) {
        this.d = d;
    }
}

class CircularLinkedList {
    private Node head;
    private int size;

    public CircularLinkedList(int n) {
        size = n;
        if (n < 1) {
            return;
        }

        head = new Node(1);
        Node current = head;
        for (int i = 2; i <= n; i++) {
            current.n = new Node(i);
            current = current.n;
        }
        current.n = head;
    }

    public void solveJosephusProblem(int m) {
        Node current = head;
        Node prev = null;

        System.out.print("The people who committed suicide: ");
        while (size > 1) {
            for (int i = 1; i < m; i++) {
                prev = current;
                current = current.n;
            }

            prev.n = current.n;
            System.out.print(current.d + " ");
            current = prev.n;
            size--;
        }

        int josephusPosition = current.d;
        System.out.println("\nThe position to be alive: " + josephusPosition);
    }
}

public class Joseph{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of people in the circle (n): ");
        int n = x.nextInt();
        System.out.print("Enter the number used for counting off (m): ");
        int m = x.nextInt();

        CircularLinkedList circularList = new CircularLinkedList(n);
        circularList.solveJosephusProblem(m);
    }
}
