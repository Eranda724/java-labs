import java.util.Scanner;
public class binaryS1 {
    public static int search1(int[] arr, int t, int a, int b) {
        if (a <= b) {
            int mid = a + (b - a) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                return search1(arr, t, mid + 1, b);
            } else {
                return search1(arr, t, a, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("How many elements in your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value to search for: ");
        int t = sc.nextInt();
        int sum = search1(arr, t, 0, arr.length - 1);
        if (sum != -1) {
            System.out.println(t + " is found at index " + sum);
        } else {
            System.out.println(t + " is not found in the array.");
        }
        sc.close();
    }
}