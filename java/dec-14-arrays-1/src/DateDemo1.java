import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo1 {

	public static void main(String[] args) throws ParseException  {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
//		System.out.println(input);
		Date dt=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		dt=sdf.parse(input);
		
		System.out.println(dt);
		
		//convert dt(Date) into string in a format		yyyy-MM-dd
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(dt));
		
		
	}

}
