import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		List<College> collegeList=new ArrayList<College>();
		CollegeBO cbo=new CollegeBO();
		System.out.println("Enter the number of colleges:");
		int noOfColleges=sc.nextInt();
		for(int i=0;i<noOfColleges;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			
			College college=College.createCollege(detail);
			collegeList.add(college);
		}
		
		List<College> result =null;
		System.out.println("Enter a search type:\r\n" + 
				"1.By name\r\n" + 
				"2.By starting date\r\n" + 
				"3.By location\r\n" + 
				"");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:		//by name
			System.out.println("Enter the number of names:");
			int noOfNames=sc.nextInt();
			List<String> nameList=new ArrayList<>();
			for(int i=0;i<noOfNames;i++)
			{				
				String collegeName=sc.nextLine();
				if(collegeName.equals(""))
					collegeName=sc.nextLine();
				nameList.add(collegeName);
			}
			result = cbo.findCollege(collegeList, nameList);
			break;
		case 2:		//starting Date
			System.out.println("Enter the starting date:");
			String sdate=sc.nextLine();
			if(sdate.equals(""))
				sdate=sc.nextLine();
			//convert sdate (string) into Date
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			Date startingDate=new Date();
			startingDate=sdf.parse(sdate);
			result=cbo.findCollege(collegeList, startingDate);
			break;
		case 3:		//location
			System.out.println("Enter the location:");
			String location=sc.nextLine();
			if(location.equals(""))
				location=sc.nextLine();
			result=cbo.findCollege(collegeList, location);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		if(result==null)
		{
			System.exit(0);
		}
		else if(result.isEmpty())
		{
			System.out.println("No such college is present");
		}
		else
		{
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
			for(College c:result)
			{
				System.out.print(c);
			}
		}
	}

}
