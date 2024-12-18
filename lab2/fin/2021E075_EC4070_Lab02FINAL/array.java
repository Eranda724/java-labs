import java.util.Scanner;
public class array{
	int[] arr = new int[20];
	int num1,num2,temp,numDisplay,numDelete,numAdd,elementAdd,indexAdd,x,y,numSearch;
	
	public void arrRead(){
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<20; i++){
			System.out.print("Enter a Number : ");
			arr[i] = scanner.nextInt();
		}
	}
	
	public void arrPrint(){
		for(int i=0; i<20; i++){
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\n");
	}
	
	public void arrSwap(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter first number to Swap : ");
		num1 = scanner.nextInt();
		System.out.print("Enter second number to Swap : ");
		num2 = scanner.nextInt();
		
		temp = arr[num1-1];
		arr[num1-1] = arr[num2-1];
		arr[num2-1] = temp;
		System.out.print("\n");
		
		for(int i=0; i<20; i++){
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\n");
	}
	
	public void printElement(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number if you want to Display : ");
		numDisplay = scanner.nextInt();
		System.out.print("The number is " + arr[numDisplay-1]);
		System.out.print("\n");
		

	}
	
	public void deleteElement(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number want to Delete : ");
		numDelete = scanner.nextInt();
		for (int j=(numDelete-1); j<19; j++){
			arr[j] = arr[j+1];
		}
		System.out.print("\n");
		
		for(int i=0; i<20; i++){
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\n");
	}
	
	public void addElement(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number to add the arry : ");
		numAdd = scanner.nextInt();
		System.out.print("Enter the place in the arry : ");
		elementAdd = scanner.nextInt();
		indexAdd = elementAdd - 1;
		for (int i=19; i>indexAdd; i--){
			arr[i] = arr[i-1];
		}
		arr[elementAdd] = numAdd;
		System.out.print("\n");
		
		for(int i=0; i<20; i++){
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\n");
	}
	
	public void elementSearch(){
		Scanner scanner = new Scanner(System.in);
		x = 1;
		y = 0;
		while (x<3){
			x++;
			System.out.print("\nEnter the Number search : ");
			numSearch = scanner.nextInt();
			for (int k=0; k<20; k++){
				if (arr[k] == numSearch){
					System.out.print("Number that you search is  Element of the array.");
					y++;
				}
				else if(arr[k] != numSearch && k==19 && y==0){
					System.out.print("Number that you search is not in the array.");
				}
			}
			y = 0;
		}	
	}
	
	public static void main(String[] args){
		array obj1 = new array();
		obj1.arrRead();
		obj1.arrPrint();
		obj1.arrSwap();
		obj1.printElement();
		obj1.deleteElement();
		obj1.addElement();
		obj1.elementSearch();
	}
}