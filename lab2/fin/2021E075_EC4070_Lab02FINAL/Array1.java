import java.util.Scanner;

public class Array{
 
 public static void main (String[] args){
        
		int[] arr;
		arr = new int[20];
        
		Scanner sc =new Scanner(System.in);
		for(int a=0;a<20;a++)
		{
			System.out.print("enter the element:   ");
			arr[a] = sc.nextInt();
			
		}
		 System.out.print("The array: ");
		 for(int b=0;b<20;b++)
		 {
			 System.out.print(arr[b]+" " );
			 
		 }
		 
		 System.out.print("\n");
		
		 
		 System.out.print("Enter the number to swap: ");
		 int i = sc.nextInt();
		 System.out.print("Enter the second number to swap: ");
		 int j = sc.nextInt();
		 
		 int temp = arr[i-1];
		 arr[i-1]=arr[j-1];
		 arr[j-1] =temp;
		 
		 System.out.print("The array after swap: ");
		 for(int c=0;c<20;c++)
		 {
			 System.out.print(arr[c]+" ");
		 }
		 System.out.print("\n");
		 

		 System.out.print("Enter k th element: ");
		 int k= sc.nextInt();
		 System.out.println("The k th element is: "+arr[k-1]);
		 

		 int[] arr1 = new int[19];
		 for(int d=0,f=0; d<20&&f<19;d++)
		 {
			 if(d==k-1)
			 {
				 continue;
			 }
			 arr1[f++]=arr[d];
		 }
		 
		 System.out.print("The array after deletion : ");
		 for(int e=0; e<19 ;e++)
		 {
			 System.out.print(arr1[e]+" ");
		 }
		 System.out.print("\n");
		 
		 


        int[] arr2= new int[20];
        System.out.print("Enter new element: ");
        int n=sc.nextInt();

        for (int d=0,h=0;d<19 && h<20;d++)
        {
            arr2[h++]=arr1[d];
        }
        arr2[19]=n;
        System.out.print("after the insertion: ");

        for (int p=0;p<20;p++)
        {
            System.out.print(arr2[p]+" ");
        }
		System.out.print("\n");


        System.out.print("Enter the element: ");
        int ele = sc.nextInt();

        int index=20 ;
        for (int x=0;x<20;x++)
        {
            if(arr2[x]==ele)
            {
                index =x;
            }
        }
        if(index==20)
        {
            System.out.println("Element is not found in this array");
        }
        else
        {
            System.out.println("Element is in the array");
        }

		
 }


}