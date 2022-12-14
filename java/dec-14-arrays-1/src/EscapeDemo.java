import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EscapeDemo {

	public static void main(String[] args) {
		String input=new Scanner(System.in).nextLine();
//		System.out.println(input.matches("E\\d{3}"));
		Pattern p = Pattern.compile("\\d{10}");
		Matcher m=p.matcher(input);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}
