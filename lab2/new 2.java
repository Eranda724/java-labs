import java.util.Scanner;

class MyArray {
    private int[] array;
    private int size;

    public MyArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void readElements(Scanner scanner) {
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public void printArray() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void interchangeElements(int i, int j) {
        if (i >= 0 && i < size && j >= 0 && j < size) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            System.out.println("Elements at positions " + i + " and " + j + " interchanged.");
        } else {
            System.out.println("Invalid values for i and j.");
        }
    }
