import java.util.Scanner;
import java.util.Stack;

public class Delim {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter delimiter word: ");
        String str = x.nextLine();

        boolean isMatched = checkDM(str);

        if (isMatched) {
            System.out.println("Delimiters matched.");
        } else {
            System.out.println("Delimiters are not matched.");
        }
    }

    public static boolean checkDM(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
			else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop();

                if (!isMatchingPair(open, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
