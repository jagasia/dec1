import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<College> collegeList=new ArrayList<College>();
		System.out.println("Enter the number of the colleges:");
		int noOfColleges=sc.nextInt();
		for(int i=0;i<noOfColleges;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			College college=College.createCollege(detail);
			collegeList.add(college);
		}
		
		System.out.println("Enter a type to sort:\r\n" + 
				"1.Sort by name\r\n" + 
				"2.Sort by number of departments\r\n" + 
				"3.Sort by starting date\r\n" + 
				"");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:			//name
			Collections.sort(collegeList);
			break;
		case 2:			//number  of dept
			Collections.sort(collegeList,new DepartmentComparator());
			break;
		case 3:			//starting date
			Collections.sort(collegeList,new StartingDateComparator());
			break;
		default:
			break;
		}
		
		System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
		for(College c:collegeList)
			System.out.print(c);
	}

}
