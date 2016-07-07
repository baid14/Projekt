package pr;
import java.util.TimerTask;

public class SokobanModel extends TimerTask {

	static int board[][] = new int[10][14];
	static int exit[][] = new int[10][14];
	static int pos1 = 4;
	static int pos2 = 7;
	boolean end = false;
	
	public static SokobanModel instance = null;
	public String name;

public int getPos1(){
	return pos1;
}

public int getPos2(){
	return pos1;
}
	
	
private SokobanModel()
{

}

public static synchronized SokobanModel getInstance()
{
	if(instance == null)
		instance = new SokobanModel();
	return instance;
	
}

	public void run() {
		if(end()==true)
		{
		SokobanView.stan = 2;
		}
		SokobanView.applet.repaint();
	}
	

	
	public boolean end() {
		for(int i = 0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length;j++)
			{
				if((exit[i][j]==2)&&(board[i][j]!=3))
				{
					return false;
				}
			}
		}
		return true;
	}



	public void taketheboard()
	{
		int board2[][] = {
				{1,1,1,1,1,1,1,1,1,1,1,1,0,0},
				{1,0,0,0,0,1,0,0,0,0,0,1,1,1},
				{1,0,0,0,0,1,0,3,0,0,3,0,0,1},
				{1,0,0,0,0,1,3,1,1,1,1,0,0,1},
				{1,0,0,0,0,3,0,4,0,1,1,0,0,1},
				{1,0,2,0,0,1,0,1,0,0,3,0,1,1},
				{1,1,1,1,1,1,0,1,1,3,0,3,0,1},
				{0,0,1,0,3,0,0,3,0,3,0,3,0,1},
				{0,0,1,0,0,0,0,1,0,0,0,0,0,1},
				{0,0,1,1,1,1,1,1,1,1,1,1,1,1},
		};
		
		SokobanView.stan = 0;	

	for(int i = 0;i<board.length;i++)
	{
		for(int j=0;j<board[0].length;j++)
		{
			board[i][j]=board2[i][j];
		}
	}
	for(int i = 0;i<board.length;i++)
	{
		for(int j=0;j<board[0].length;j++)
		{
			if(board[i][j]==2)
			{
				board[i][j] = 0;
				exit[i][j] = 2;
			}
		}
	}
	
	}
	public static void ifw() {
		if(board[pos1-1][pos2]==0)
		{
			board[pos1-1][pos2]=4;
			board[pos1][pos2]=0;
			pos1--;
		}
		else if((board[pos1-1][pos2]==3)&&(board[pos1-2][pos2]==0))
		{
			board[pos1-2][pos2]=3;
			board[pos1-1][pos2]=4;
			board[pos1][pos2]=0;
			pos1--;
		}
	}
	public static void ifa() {
		if(board[pos1][pos2-1]==0)
		{
			board[pos1][pos2-1]=4;
			board[pos1][pos2]=0;
			pos2--;
		}
		else if((board[pos1][pos2-1]==3)&&(board[pos1][pos2-2]==0))
		{
			board[pos1][pos2-2]=3;
			board[pos1][pos2-1]=4;
			board[pos1][pos2]=0;
			pos2--;
		}
	}
	public static void ifs() {
		if(board[pos1+1][pos2]==0)
		{
			board[pos1+1][pos2]=4;
			board[pos1][pos2]=0;
			pos1++;
		}
		else if((board[pos1+1][pos2]==3)&&(board[pos1+2][pos2]==0))
		{
			board[pos1+2][pos2]=3;
			board[pos1+1][pos2]=4;
			board[pos1][pos2]=0;
			pos1++;
		}
		
	}
	public static void ifd() {
		if(board[pos1][pos2+1]==0)
		{
			board[pos1][pos2+1]=4;
			board[pos1][pos2]=0;
			pos2++;
		}
		else if((board[pos1][pos2+1]==3)&&(board[pos1][pos2+2]==0))
		{
			board[pos1][pos2+2]=3;
			board[pos1][pos2+1]=4;
			board[pos1][pos2]=0;
			pos2++;
		}
	}
    static boolean ifexit()
    {
    if (exit[pos1][pos2]==2)
    	return true;
    return false;
    }
    
	
}
