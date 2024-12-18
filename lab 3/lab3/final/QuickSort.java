import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("how many elements in your array: ");
        int n = x.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " , ");
        }

        x.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int id = ch(arr, low, high);
            quickSort(arr, low, id - 1);
            quickSort(arr, id + 1, high);
        }
    }

    public static int ch(int[] arr, int low, int high) {
        int num1 = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < num1) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
