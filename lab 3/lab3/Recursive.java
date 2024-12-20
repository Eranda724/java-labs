import java.util.Scanner;

public class Recursive{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter a number to check triangular number: ");
        int num1 = x.nextInt();
        int trinum = checktriangulaer(num1);
        System.out.println("Triangular number of " + num1 + " is " + trinum);

        System.out.print("\nEnter a number to check factorial: ");
        int num2 = x.nextInt();
        int facnum = checkfactorial(num2);
        System.out.println("Factorial of " + num2 + " is " + facnum);

        x.nextLine();

        System.out.print("\nEnter first string: ");
        String str1 = x.nextLine();
        System.out.print("Enter second string: ");
        String str2 = x.nextLine();

        boolean anagram = anagram(str1, str2);
        if (anagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        System.out.print("\nEnter the number for check Towers of Hanoi: ");
        int num3 = x.nextInt();
        hanoi(num3, 'A', 'C', 'B');

        x.close();
    }

    public static int checktriangulaer(int n) {
        if (n <= 0) {

            return 0;
        } else {
            return n + checktriangulaer(n - 1);
        }
    }

    public static int checkfactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * checkfactorial(n - 1);
        }
    }

    public static boolean anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        if (str1.length() == 0) {
            return true;
        }

        char firstChar = str1.charAt(0);
        int index = str2.indexOf(firstChar);

        if (index == -1) {
            return false;
        } else {
            String newStr1 = str1.substring(1);
            String newStr2 = str2.substring(0, index) + str2.substring(index + 1);
            return anagram(newStr1, newStr2);
        }
    }

    public static void hanoi(int num3, char c1, char c2, char c3) {
        if (num3 == 1) {
            System.out.println("Move disk 1 from " + c1 + " to " + c2);
            return;
        }

        hanoi(num3 - 1, c1, c3, c2);
        System.out.println("Move disk " + num3 + " from " + c1 + " to " + c2);
        hanoi(num3 - 1, c3, c2, c1);
    }
}
