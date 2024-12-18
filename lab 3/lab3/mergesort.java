import java.util.Scanner;
public class mergesort {
    public static void merge(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            merge(arr, left, mid);
            merge(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            } 
			else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = x.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }
        merge(arr, 0, n - 1);
        printArray(arr);
        x.close();
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}