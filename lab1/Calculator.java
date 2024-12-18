import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;
    private double sum;

    public Calculator() {
        num1 = 0;
        num2 = 0;
        sum = 0;
    }

    public void addition() {
        sum = num1 + num2;
    }

    public void subtraction() {
        sum = num1 - num2;
    }

    public void multiplication() {
        sum = num1 * num2;
    }

    public void division() {
            sum = num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter your first number : ");
        calculator.num1 = scanner.nextDouble();

        System.out.print("Enter your second number : ");
        calculator.num2 = scanner.nextDouble();

        System.out.print("Enter the op (+, -, *, /) : ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                calculator.addition();
                break;
            case '-':
                calculator.subtraction();
                break;
            case '*':
                calculator.multiplication();
                break;
            case '/':
                calculator.division();
                break;
            default:
                System.out.println("Invalid op");
                break;
        }

        System.out.println("sum: " + calculator.sum);

        scanner.close();
    }
}
