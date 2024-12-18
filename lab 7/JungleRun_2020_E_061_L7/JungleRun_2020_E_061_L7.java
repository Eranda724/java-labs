import java.util.Stack;
class JungleRun_2020_E_061_L7
{
	private Node startPoint, endPoint;
	private Node[][] jungleMat;
	Stack<Node> stack = new Stack<>();
	
	public class Node 
	{
		Node previous;
		int position;
		boolean isVisited = false;
		boolean isPath = false;
		boolean isSelected = false;
		char CurPos = ' ';
	}
	public void JungleRun(char[][] map, int n) 
	{
		jungleMat = new Node[n][n];
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				int tempPos = i * n + j;
				jungleMat[i][j] = new Node(tempPos);
				jungleMat[i][j].CurPos = map[i][j];
				if (jungleMat[i][j].CurPos == 'P') 
				{
					jungleMat[i][j].isPath = true;
				}
				if (jungleMat[i][j].CurPos == 'S') 
				{
					this.startPoint = jungleMat[i][j];
				}
				if (jungleMat[i][j].CurPos == 'E') 
				{
					this.endPoint = jungleMat[i][j];
				}
			}
		}
	}
	
	
	public void main (String[] args)
	{
		
	}
}