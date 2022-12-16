import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> countryMap=new HashMap<>();
		countryMap.put(1,"India");
		countryMap.put(2,"Australia");
		countryMap.put(null,"Japan");
		countryMap.put(4,"China");
		countryMap.put(5,"Sri lanka");
		countryMap.put(6,"Germany");
		countryMap.put(7,"France");
		countryMap.put(4,"England");		//what happens?
		countryMap.put(null,"Argentina");
		countryMap.put(10,"Brazil");
		
		//added 10 entries into the map
		
		//how to display all the entries
		//1) using for each loop
		
//		for(Entry<Integer, String> entry:countryMap.entrySet())
//		{
//			System.out.println(entry.getKey()+"\t"+entry.getValue());
//		}
		
//		2) using keys
		Set<Integer> keys = countryMap.keySet();
//		System.out.println(keys);
		for(Integer key:keys)
		{
			System.out.println(key+"\t"+countryMap.get(key));
		}
	}

}
