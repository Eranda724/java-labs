import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Chamil Sachintha (2018/E/104)
 */

public class CircularLinkedList
{
    /**
     * This Node class will store data
     */
    static class Node
    {
        public int data ;
        public Node next;
        public Node( int data )
        {
            this.data = data;
        }
    }


    /**
     * This method will find the correct position of Josephus
     * @param m: the counting off number
     * @param n: number of people in the group
     */
    static void getPosition(int m, int n)
    {
        Node head = new Node(1);
        Node demo = head;
        for(int i=2; i<=n; i++) //creating a circular linked list
        {
            demo.next = new Node(i);
            demo = demo.next;
        }

        demo.next = head; //connecting the last node to the first node
        Node current = head, prve = head;

        while(current.next != current)
        {
            //Finding mth node
            int count = 1;

            while(count != m)
            {
                prve = current;
                current = current.next;
                count++;
            }
            System.out.print(current.data + "\t");

            //Removing mth node
            prve.next = current.next;
            current = prve.next;
        }
        System.out.println ("\nThe position to be alive: " + current.data);
    }



    public static void main(String args[])throws IOException
    {
        System.out.println("***The Josephus famous mathematical puzzle***\n" + "Enter the number of people in the circle (n):");

        //Getting input size from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());


        System.out.println("Enter the number used for counting off (m):");
        //Getting the counting off number from the user
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader1.readLine());

        System.out.print("\nThe people who committed suicide: " );
        getPosition(m, n);
    }
}