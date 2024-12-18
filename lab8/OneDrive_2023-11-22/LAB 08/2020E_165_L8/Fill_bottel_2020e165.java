import java.util.*;

public class Fill_bottel_2020e165
{
	public static int maximun_bottel(int []array,int capacity_of_container)
	{
		int total=0,number_of_bottel=0;
		int[] sorted_array=bubble_sort(array);
		if (capacity_of_container <= 0) 
		{
			return 0;
		}
		for (int i = 0; i<sorted_array.length;++i)
		{
			if (total<=capacity_of_container) 
			{
				total+=sorted_array[i];
				++number_of_bottel;
			}
		}
		if(total>capacity_of_container)
		{
			number_of_bottel-=1;
		}
		return number_of_bottel;
	}	
	
	public static int [] bubble_sort(int array[])
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
		System.out.print("Enter the number of bottel : ");
		Scanner Number_of_bottel=new Scanner(System.in);
		int number_of_bottel=Number_of_bottel.nextInt();
		System.out.print("Enter the  of capacity of the container : ");
		Scanner Capacity_of_container=new Scanner(System.in);
		int capacity_of_container=Capacity_of_container.nextInt();
		int []array_bottel=new int[number_of_bottel];
        System.out.print("Enter the bottel capacity: ");
        Scanner Bottels_capacities=new Scanner(System.in);
		for(int i=0;i<number_of_bottel;++i)
		{
             array_bottel[i]= Bottels_capacities.nextInt();
		}
		System.out.println("Maixinum number of bottel : "+maximun_bottel(array_bottel,capacity_of_container));
	}	
}



