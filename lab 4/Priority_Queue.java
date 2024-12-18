package priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author Chamil Sachintha (2018/E/104)
 */
public class Priority_Queue
{
    /**
     * This method will print the array
     * @param array: the input array
     */
    public static void printArray(int[] array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + "  ");
        }
    }



    public static void main(String[] args) throws IOException {
        System.out.println("Priority Queue - Maximize array sum after k negations ");

        //Getting input size of the array from the user
        System.out.print("Enter input array size (n): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        //Getting input elements of the array from the user
        int array[] = new int[n];
        int inputSize = 0;
        String input;
        do {
            System.out.print("Enter " + n + " numbers, separated by spaces (n1 n2 n3 ...): ");
            input = reader.readLine();
            inputSize = input.split(" ").length;
        } while (inputSize != n);

        //Creating & store the array according to the user inputs
        String[] numbers = input.split(" ");
        for (int j = 0; j<n; j++)
        {
            array[j] = Integer.parseInt(numbers[j]);
        }

        //Getting input how many number of modifications(k) need to do, from the user
        System.out.print("Enter the number of modifications (k): ");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader1.readLine());
        System.out.println();

        System.out.print("The input array: ");
        printArray(array); //printing the input array(without modifications)
        System.out.println();

        PriorityQueue<Data> elements = new PriorityQueue<Data>();
        for (int i:array)
        {
            elements.add(new Data(i));
        }

        System.out.print("The array, after " + k + " number of modifications : ");
        Iterator<Data> iter = elements.iterator();
        int sum = 0;
        int count = 0;
        while(iter.hasNext())
        {
            int tempVal = elements.poll().value;
            if(count < k)
            {
                tempVal *= -1;
            }
            sum += tempVal;
            System.out.print(" " + tempVal);
            count ++;
        }
        System.out.println("\n" + "After " + k + " operations,the maximum sum of the array = " + sum);
    }
}



class Data implements Comparable<Data>
{
    int value;
    public Data(int v)
    {
        this.value = v;
    }

    @Override
    public int compareTo(Data o)
    {
        if(value <= o.value)
        {
            return -1;
        }
        else {
            return 1;
        }
    }

}