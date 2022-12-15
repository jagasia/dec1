import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//class DescendingComparator implements Comparator<Integer>
//{
//
//	@Override
//	public int compare(Integer a, Integer b) {
//		return b-a;
//	}
//	
//}


public class Main4 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(90);
		marks.add(50);
		marks.add(70);
		marks.add(30);
		marks.add(40);
		marks.add(60);
		marks.add(95);
		marks.add(55);
		marks.add(65);
		marks.add(45);
		
		//sort the list
		//list can sorted. Set cannot be sorted after adding elements.
//		DescendingComparator dc=new DescendingComparator();
//		Collections.sort(marks,dc);

		Collections.sort(marks,(a,b)->b-a);
		
		System.out.println(marks);
	}

}
