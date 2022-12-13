import java.util.Scanner;

public class RunLength3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfElements=sc.nextInt();
		int arr[]=new int[noOfElements];
		for(int i=0;i<noOfElements;i++)
		{
			arr[i]=sc.nextInt();
		}
		//algorithm starts here
		int runLength=1;
		int maxRunLength=1;
		int startIndex=-1;
		int maxStartIndex=-1;
		for(int i=0;i<noOfElements-1;i++)
		{
//			System.out.println("Compare "+arr[i]+" with "+arr[i+1]);
			if(arr[i]==arr[i+1])
			{
				runLength++;
				if(runLength==2)
				{
					startIndex=i;
				}
				if(runLength>maxRunLength)
				{
					maxRunLength=runLength;
					maxStartIndex=startIndex;
				}
			}
			else
			{
				runLength=1;
			}
//			System.out.println("MaxRunLength="+maxRunLength);
			
		}
		
		System.out.println(maxRunLength);
		System.out.println(maxStartIndex);
	}
}
