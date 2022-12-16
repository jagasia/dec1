import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DistinctTask
{
	public static ArrayList<Integer> findDistinct(ArrayList<Integer> input)
	{
		//return only the DISTINCT elements present in the input
		//code here
		LinkedHashSet<Integer> temp=new LinkedHashSet<>(input);		//unordered
		ArrayList<Integer> result=new ArrayList<>(temp);
		return result;		//incomplete
	}

	public static void main(String args[])
	{
		ArrayList<Integer> source=new ArrayList<>();
		source.add(10);
		source.add(20);
		source.add(10);
		source.add(30);
		source.add(10);
		source.add(40);
		source.add(50);
		source.add(40);
			
		ArrayList<Integer> result=findDistinct(source);	
		//output should be 10, 20, 30, 40, 50
		for(Integer i : result)
			System.out.println(i);
	}
}