import java.util.Scanner;

public class NextLineDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int i=sc.nextInt();
		String input=sc1.nextLine();
//		String input=sc.nextLine();
//		if(input.equals(""))
//			input=sc.nextLine();
		System.out.println("i="+i);
		System.out.println("input="+input);
	}

}
