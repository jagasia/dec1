import java.util.ArrayList;
import java.util.Scanner;

public class Req2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the University: ");
		String universityName=sc.nextLine();
		University university=new University(universityName, new ArrayList<College>());
		int choice=0;
		do
		{
			System.out.println("1.Add College \r\n" + 
					"2.Delete College \r\n" + 
					"3.Display Colleges \r\n" + 
					"4.Exit \r\n" + 
					"");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:	//add college
				String detail=sc.nextLine();
				if(detail.equals(""))
					detail=sc.nextLine();
				//parse the csv string into college object
				College college=College.createCollege(detail);
				university.addCollegeToUniversity(college);
				System.out.println("College successfully added");
				break;
			case 2:	//delete college
				System.out.println("Enter the name of the college to be deleted: ");
				String collegeName=sc.nextLine();
				if(collegeName.equals(""))
					collegeName=sc.nextLine();
				Boolean status = university.removeCollege(collegeName);
				if(status)
				{
					System.out.println("College successfully deleted");
				}else
				{
					System.out.println("College not found in the University");
				}
				break;
			case 3:	//display colleges
				university.displayColleges();
				break;
				
			}
		}while(choice<=3);
	}

}
