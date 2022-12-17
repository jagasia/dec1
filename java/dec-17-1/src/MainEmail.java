import java.util.Scanner;

public class MainEmail {

	public static void main(String[] args) {
		//start with alphabet
		//can contain _
		// must have @
		//word followed by @ and followed by word and followed by . and then 2 or 3 characters
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
//		String regex="([A-Za-z_]+)(@)([A-Za-z]+)[.]([A-Za-z]+)";
		String regex="([A-Za-z_]+)([@]{1})([a-z]+)([.]{1})([a-z]+)";

		if(input.matches(regex))
		{
			System.out.println("Valid email");
		}else
		{
			System.out.println("Invalid email");
		}
	}

}
