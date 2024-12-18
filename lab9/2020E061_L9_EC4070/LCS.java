import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class LCS
{
	public static void main(String[] args) throws IOException
	{
		// Getting input from the user
		System.out.print("\nEnter first word: ");
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		String input1 = reader1.readLine();
		
		System.out.print("Enter second word: ");
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
		String input2 = reader2.readLine();

		LSC(input1,input2);
    }
	// methode to find LSC
	static void LSC(String s1, String s2) 
	{
		int[][] array = new int[s1.length()+1][s2.length()+1];

		for (int i = 0;i <= s1.length();i++) 
		{
			for (int j=0;j<= s2.length();j++) 
			{
				if (i==0||j==0)
				{
					array[i][j] = 0;
				}
				else if (s1.charAt(i-1)==s2.charAt(j-1))
				{
					array[i][j]=array[i-1][j-1]+1;
				}
				else
				{
					array[i][j]=Math.max(array[i-1][j], array[i][j-1]);
				}
			}
		}

		int n=array[s1.length()][s2.length()];
		int temp=n;

		char[] c = new char[n+1];
		c[n] = '\0';

		int x = s1.length(), y=s2.length();
		while (x > 0 && y > 0) 
		{
			if (s1.charAt(x-1) == s2.charAt(y-1)) 
			{
				c[n-1] = s1.charAt(x-1);
				x--;
				y--;
				n--;
			}

			else if (array[x-1][y]>array[x][y-1])
				x--;
			else
				y--;
		}
		// printing LSCs
		System.out.print("\nLCS: ");
		
		for (int a = 0; a <= temp; a++)
		{
			System.out.print(c[a]);
		}
		if(temp==0)
		{
			System.out.print("There is no LSC!");
		}
	}
}