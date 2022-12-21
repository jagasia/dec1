import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
//		File f1=new File("ijkl");
//		f1.createNewFile();
//		Scanner sc=new Scanner(new File("abcd.txt"));
//		System.out.println(sc.nextLine());

//		BufferedReader
		
//		File f=new File("d:\\jag");
//		String[] list = f.list();
//		for(String s:list)
//			System.out.println(s);
//		
		BufferedInputStream bis=new BufferedInputStream(System.in);
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		System.out.println(input);
	}

}
