import java.util.Scanner;

public class Req3 {

	static Boolean validateWebsite(String website)
	{
		String regex="((http://)|(https://))(www.){0,1}([A-Za-z])+[.][a-z]{2,6}([.][a-z]{2,6}){0,1}";
		return website.matches(regex);
	}
	
	static Boolean validateMobile(String mobileNo)
	{
		String regex="([+]91){1}(\\d{10})";
		return mobileNo.matches(regex);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Validate Website\r\n" + 
				"2.Validate Mobile number\r\n" + 
				"Enter your choice:\r\n" + 
				"");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:	//validate website
			System.out.println("Enter the Website to be validated:");
			String website=sc.next();
//			if(website.equals(""))
//				website=sc.next();
			if(validateWebsite(website))
			{
				System.out.println("Website is valid");
			}else
			{
				System.out.println("Website is invalid");
			}
			break;
		case 2:	//validate mobile number
			System.out.println("Enter the Mobile no. to be validated:");
			String mobileNo=sc.next();
			if(validateMobile(mobileNo))
			{
				System.out.println("Mobile number is valid");
			}else
			{
				System.out.println("Mobile number is invalid");
			}
			break;
		}
	}
	
	
}
