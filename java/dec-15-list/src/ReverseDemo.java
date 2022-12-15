import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseDemo {

	public List<String> reverse(ArrayList<String> source)
	{
		//reverse the source list and return
		ArrayList<String> result=new ArrayList<>();
		ListIterator<String> it=source.listIterator(source.size());
//		while(it.hasNext())
//		{
//			it.next();
//		}
		//reverse
		while(it.hasPrevious())
		{
			String s=it.previous();
			result.add(s);
		}
		return result;
	}

	
	public static void main(String[] args) {
		ArrayList<String> countries=new ArrayList<String>();
		countries.add("A");
		countries.add("B");
		countries.add("C");
		countries.add("D");
		countries.add("E");
		countries.add("F");
		countries.add("G");
		countries.add("H");
		countries.add("I");
		countries.add("J");
		
		ReverseDemo rd=new ReverseDemo();
		 List<String> result = rd.reverse(countries);
		 System.out.println(result);
	
	}

}
