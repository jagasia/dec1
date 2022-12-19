import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return b-a;
	}
	
}

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(50);
		marks.add(70);
		marks.add(60);
		marks.add(30);
		marks.add(90);
		marks.add(100);
		marks.add(95);
		marks.add(85);
		marks.add(75);
		
//		Collections.sort(marks, new MyComparator());
		Collections.sort(marks,(a,b)->b-a);
//		Collections.reverse(marks);
		System.out.println(marks);

	}

}
