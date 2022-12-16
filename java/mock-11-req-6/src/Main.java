import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<College> collegeList=new ArrayList<College>();
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
		
		Map<String, Integer> result = College.calculateLocationCount(collegeList);
		
		System.out.format("%-15s %s\n","Location","Count");
		//how do you loop a map
		for(Entry<String, Integer> entry:result.entrySet())
			System.out.format("%-15s %s\n",entry.getKey(),entry.getValue());
	}

}
