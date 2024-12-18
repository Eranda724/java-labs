import java.util.Scanner;
public class binaryS {
	public static int search(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;
		
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (arr[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("how many elements in your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int t = sc.nextInt();
        int sum = search(arr, t);

        if (sum != -1) {
            System.out.println("Element " + t + " found at index " + sum);
        } else {
            System.out.println("Element " + t + " not found in the array.");
        }
        sc.close();
    }

}