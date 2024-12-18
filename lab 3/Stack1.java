import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("cat");
        stack.push("dog");
        stack.push("ant");

        System.out.print("Stack elements: ");
        System.out.println(stack);

        String topn = stack.peek();
        System.out.println("Peek (top): " + topn);

        String popn = stack.pop();
        System.out.println("Pop: " + popn);

        System.out.print("Stack after pop: ");
        System.out.println(stack);

        int sizen = stack.size();
        System.out.println("Stack size: " + sizen);
    }
}
