import java.util.*;
import java.util.Map.Entry;
public class Ex1 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
String input = sc.nextLine();
Map<Character, Integer> result=new LinkedHashMap<Character, Integer>();
for(char c : input.toCharArray())
{
//	if(result.containsKey(c)
	Integer count=result.get(c);	//checking if c is already found in the map or not. If not found, you will get null
	
	if(count==null)
		count=0;
	count++;
	result.put(c, count);
	
}
	for(Entry<Character,Integer> entry: result.entrySet())
	{
		System.out.println(entry);
	}
	}
}