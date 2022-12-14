import java.util.Scanner;

public class Tower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cityLength=sc.nextInt();
		int city[][]=new int[cityLength][cityLength];
		int noOfTowers=sc.nextInt();
		int towers[][]=new int[noOfTowers][2];
		for(int i=0;i<noOfTowers;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			towers[i][0]=x;
			towers[i][1]=y;
		}
		
		//if there is one tower at 2,2 then
//		city[2][2]=1;
		for(int i=0;i<noOfTowers;i++)
		{
			int x=towers[i][0];
			int y=towers[i][1];	
			
//			city[x][y]=1;		//signal is there at tower location
			for(int a=-1;a<=1;a++)
			{
				for(int b=-1;b<=1;b++)
				{
					if(x+a<0 || x+a>=cityLength ||y+a<0 || y+a>=cityLength)
						continue;
					city[x+a][y+b]=1;
				}
			}
		}
		//loop the city elements and count the zeros
		int zeroCount=0;
		for(int i=0;i<cityLength;i++)
		{
			for(int j=0;j<cityLength;j++)
			{
//				System.out.print(city[i][j]+"\t");
				if(city[i][j]==0)
				{
					zeroCount++;
				}
			}
//			System.out.println();
		}
		if(zeroCount==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
			System.out.println();
		}
	}

}
