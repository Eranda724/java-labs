import java.util.*;

public class FillBottle
{
	public static int maxbottles(int []array,int capacity)
	{
		int total=0,num=0;
		int[] arr = arr_sort(array);
		if (capacity <= 0) 
		{
			return 0;
		}
		for (int i = 0; i<arr.length;++i)
		{
			if (total<=capacity) 
			{
				total+=arr[i];
				++num;
			}
		}
		if(total>capacity)
		{
			num-=1;
		}
		return num;
	}	
	
	public static int [] arr_sort(int array[])
	{
		int temp;
		for(int i=0;i<array.length-1;++i)
		{
			for(int j=0;j<array.length-i-1;++j)
			{
				if(array[j]>=array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  of capacity of the container : ");
		int capacity=sc.nextInt();
		System.out.print("Enter the number of bottle : ");
		int num = sc.nextInt();
		int [] arr2  =new int[num];
        System.out.print("Enter the bottel capacity: ");
		for(int i=0;i<num;++i)
		{
             arr2[i]= sc.nextInt();
		}
		System.out.println(maxbottles(arr2,capacity)+" maximum number of bottles can fill.");
	}	
}



