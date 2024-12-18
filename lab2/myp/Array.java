import java.util.Scanner;

public class Array{
	int[] arr1 = new int[20];
	int[] arr2 = new int[19];
	Scanner x = new Scanner(System.in);
	
	public void arrget(){
		
		
		for (int a=0;a<20;a++){
			System.out.print("Enter the element : ");
			arr1[a]=x.nextInt();
	}}
	
	public void arrcheck(){
		for (int b=0;b<20;b++){
			System.out.print(arr1[b]+" ,");
	}}
	
	public void arrint(){
		System.out.print("\nEnter 1st element : ");
		int i=x.nextInt();
		System.out.print("\nEnter 2nd element : ");
		int j=x.nextInt();
		
		int temp = arr1[i-1];
		arr1[i-1]=arr1[j-1];
		arr1[j-1]=temp;
		
	}
	
    public void arrk(){
		System.out.print("\nEnter k element : ");
		int k=x.nextInt();
		System.out.print("\nk element is : "+k);
	}
	
	public void arrdel(){
		
		System.out.print("\nEnter delete element : ");
		int d=x.nextInt();
		
		for (int e=0;e<20;e++){
			if (e==d-1){
				for (int f=e;f<19;f++){
					arr2[f]=arr1[f+1];
				}
				break;
			}
			else{
				arr2[e]=arr1[e];
			}
	}}
	public void arrcheck1(){
		for (int b=0;b<19;b++){
			System.out.print(arr2[b]+" ,");
	}}
	
	
	
public static void main(String[] args){
	Array obj1 = new Array();
	obj1.arrget();
	obj1.arrcheck();
	obj1.arrint();
	obj1.arrcheck();
	obj1.arrk();
	obj1.arrdel();
	obj1.arrcheck1();
	
}}