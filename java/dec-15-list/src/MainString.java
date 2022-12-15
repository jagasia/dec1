import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainString {

	public static void main(String[] args) {
//		ArrayList<String> countries=new ArrayList<String>();
		List<String> countries=new ArrayList<String>();
		countries.add("India");
		countries.add("Australia");
		countries.add("China");
		countries.add("Japan");
		countries.add("China");
		countries.add("Sri lanka");
		countries.add("Argentina");
		countries.add("Brazil");
		countries.add("Spain");
		countries.add("New zealand");
		
		System.out.println(countries);
		
//		for(String c:countries)
//		{
//			System.out.println("Current element is "+c);
//			if(c.equals("China"))
//				countries.remove(c);
//		}
		
		Iterator<String> it = countries.iterator();
		while(it.hasNext())
		{
			String c=it.next();
			System.out.println(c);
			if(c.equals("China"))
				it.remove();
		}
		
		System.out.println("Showing after removal:");
		System.out.println(countries);
		
	}

}
