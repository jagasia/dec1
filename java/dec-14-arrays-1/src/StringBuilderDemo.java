import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String str=new Scanner(System.in).next();
		System.out.println(str);
		//reverse the string
		StringBuilder sb=new StringBuilder(str);
		
		sb.reverse();
		str=sb.toString();
		System.out.println(str);
	}

}
