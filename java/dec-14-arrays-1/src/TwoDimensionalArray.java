
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int marks[][]= {
				{1,2,3,4,5,6,7},
				{11,22,33,44},
				{111,222,333,444,555,666,777,888,999}
				};
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.printf("Element at i=%d\tj=%d is %d\n",i,j,marks[i][j]);
			}
		}
	}

}
