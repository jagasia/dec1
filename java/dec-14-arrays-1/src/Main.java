import java.util.Arrays;	//ctrl+shift+o	will automatically import packages

public class Main {

	public static void main(String[] args) {
		int marks[]={90,100,80,20,50,40,30};
//		System.out.println(Arrays.toString(marks));
//		for(int i=0;i<marks.length;i++)
//		{
//			System.out.println(marks[i]);
//		}
		
		int i=0;
		for(int x:marks)
		{		
			
			System.out.println(x);
			i++;
		}
	}

}
