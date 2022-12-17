import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//check if input is an ip address or not
		boolean isValid=true;
		String[] arr = input.split("\\.");
		//check there are 4 parts
		if(arr.length!=4)
		{
			isValid=false;			
		}else
		{		
			//check if every portion is a number or not
			for(int i=0;i<4;i++)
			{
				int no=0;
				try {
					no=Integer.parseInt(arr[i]);
					if(no<0 || no>255)
					{
						isValid=false;
					}
				}catch(NumberFormatException nfe)
				{
					isValid=false;
				}
			}
		}
		
		
		if(isValid)
		{
			System.out.println("Valid ip address");
		}else
		{
			System.out.println("Invalid ip address");
		}
	}

}
