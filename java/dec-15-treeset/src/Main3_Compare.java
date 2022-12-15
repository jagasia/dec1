import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main3_Compare {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dt1=new Date();
		Date dt2=new Date();
		
		dt1=sdf.parse("2022-12-10");
		dt2=sdf.parse("2022-12-16");
		
		System.out.println(dt1.compareTo(dt2));
	}

}
