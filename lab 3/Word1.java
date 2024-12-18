import java.util.Scanner;
import java.util.Stack;

public class Word1{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		System.out.print("Enter your word : ");
		String word = x.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i < word.length();i++){
			stack.push(word.charAt(i));
		}
		System.out.print("Your reverced word is ");
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
	}
}