import java.io.IOException;

public class Main {

	public static void display() throws IOException
	{
		throw new IOException();
	}
	
	public static void main(String[] args) {
		try {
			display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello world");
	}

}
