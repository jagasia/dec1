import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainLinkedList1 {

	public static void main(String[] args) {
		List<String> countries=new LinkedList<String>();
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
	
//		Iterator<String> it = countries.iterator();
//		while(it.hasNext())
//		{
//			String c = it.next();
//			System.out.println(c);
//		}
		
		ListIterator<String> it = countries.listIterator();
		while(it.hasNext())
		{
			String c = it.next();
			System.out.println(c);
		}
		System.out.println("Now, in reverse");
		while(it.hasPrevious())
		{
			String c=it.previous();
			System.out.println(c);
		}
	}

}
