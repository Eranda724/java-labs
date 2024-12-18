import java.util.Scanner;

public class Calculater{
    double num1,num2,sum;
    char op;

    Calculater() {
        num1 = 0;
        num2 = 0;
        sum = 0;
    }

    public void add(){
        sum=num1+num2;
    }
    public void sub(){
        sum=num1+num2;
    }
    public void mul(){
        sum=num1+num2;
    }
    public void div(){
        sum=num1+num2;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Calculater cal = new Calculater();
        System.out.println("Enter num1 = ");
        int num1 = x.nextInt();

        System.out.println("Enter num2 = ");
        int num2 = x.nextInt();

        System.out.println("Enter op = ");
        int op = x.next().charAt(0);

        switch (op) {
            case '+':
                cal.add();
                break;
            case '-':
                cal.sub();
                break;
            case '*':
                cal.mul();
                break;
            case '/':
                cal.div();
                break;
            default:
                System.out.print("enter real");
                break;

        }

        System.out.print("Sum is = "+cal.sum);
    }
}