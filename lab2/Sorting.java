import java.util.Scanner;

public class Sorting {
    private int[] arr;

    public Sorting(int[] arr) {
        this.arr = arr;
    }

    public int linearSearch(int t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                return i;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public void insertionSort() {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int k = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }

    public void selectionSort() {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int m = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[m]) {
                    m = j;
                }
            }

            int temp = arr[m];
            arr[m] = arr[i];
            arr[i] = temp;
        }
    }

    public void printarr() {
        System.out.print("arr: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];

        System.out.println("Enter 20 elements for the arr:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter element : ");
            arr[i] = scanner.nextInt();
        }

        Sorting sorting = new Sorting(arr);

        System.out.println("Original arr:");
        sorting.printarr();

        System.out.print("Enter a number to search for: ");
        int t = scanner.nextInt();

        int x = sorting.linearSearch(t);
        if (x != -1) {
            System.out.println("Linear Search: Found at index " + x);
        } else {
            System.out.println("Linear Search: Not found");
        }

        sorting.bubbleSort();
        System.out.println("Bubble Sort:");
        sorting.printarr();

        sorting.insertionSort();
        System.out.println("Insertion Sort:");
        sorting.printarr();

        sorting.selectionSort();
        System.out.println("Selection Sort:");
        sorting.printarr();

        scanner.close();
    }
}
