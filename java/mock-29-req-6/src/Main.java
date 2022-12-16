import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of mobiles");
		int noOfMobiles=sc.nextInt();
		List<Mobile> mobileList=new ArrayList<Mobile>();
		for(int i=0;i<noOfMobiles;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			Mobile mobile = Mobile.createMobile(detail);
			mobileList.add(mobile);
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		Map<Date, Integer> result = Mobile.yearWiseCount(mobileList);
		System.out.format("%-15s %s\n","Year","No. of Mobiles");
		for(Entry<Date, Integer> entry:result.entrySet())
		{
			System.out.format("%-15s %s\n",sdf.format(entry.getKey()),entry.getValue());
		}
	}

}
