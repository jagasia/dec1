
public class Main1 {

	public static void main(String[] args) {
		String body="Hi There Hows you";
		char []arr=body.toCharArray();
		String cipher="";
		for(char x:arr)
		{				
			if(x==' ')
				continue;
			int ascii=x;
			if(ascii>=97 && ascii<=(97+25))
			{
				ascii+=3;

				if(ascii>(97+25))
				{
					ascii-=26;
				}
				cipher+=(char)ascii;
			}
			else if(ascii>=65 && ascii<=(65+25))
			{
				ascii+=3;

				if(ascii>(65+25))
				{
					ascii-=26;
				}
				cipher+=(char)ascii;
			}
		}
		System.out.println(cipher);
	}

}
