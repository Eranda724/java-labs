import java.util.Scanner;

public class Array{
	int[] arr1 = new arr[20];
	
	public void arrget(){
		Scanner x = new Scanner(System.in);
		for (int i=0;i<20;i++){
			System.out.println("Enter the element : ");
			arr1[i]=x.nextInt();
	}
	}
	
	public void arrcheck(){
		for (int a=0;a<20;a++){
			System.out.println(arr1[a]+" ,");
	}}
	
public static void main(String[] args){
	Array obj1 = new Array();
	obj1.arrget();
	obj1.arrcheck();
	
}}