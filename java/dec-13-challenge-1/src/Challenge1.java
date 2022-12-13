import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int value1=sc.nextInt();
		
		System.out.println("Enter Value 2:");
		int value2=sc.nextInt();
		
		if(value1<0 || value1>6 || value2<0 || value2>6)
		{
			System.out.println("Invalid Input");
			System.exit(0); 	//terminate the program here
		}
		
		//now that the inputs are valid only. sum the values
		int sum=value1+value2;
		if(value1==value2)
		{
			sum*=2;
		}
		
		System.out.println("The points scored is  "+sum);
		sc.close();
	}

}
