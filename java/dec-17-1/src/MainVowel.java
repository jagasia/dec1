import java.util.Scanner;

public class MainVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		char []arr=input.toCharArray();

	for(char c : arr)
	{
//		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			
		switch(c)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(c);
				break;
		}
	}

	}

}
