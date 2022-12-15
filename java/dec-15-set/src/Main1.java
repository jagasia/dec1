import java.util.HashSet;

public class Main1 {

	public static void main(String[] args) {
		HashSet<Integer> marks=new HashSet<>();
		marks.add(95);
		marks.add(100);
		marks.add(55);
		marks.add(65);
		marks.add(45);
		marks.add(35);
		marks.add(15);
		marks.add(25);
		marks.add(55);	//duplicate. Not added
		marks.add(65);	//duplicate. Not added
		marks.add(95);	//duplicate. Not added
		
		System.out.println(marks);
	}

}
