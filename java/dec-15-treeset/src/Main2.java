import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		TreeSet<Employee> empSet=new TreeSet<Employee>();
		empSet.add(new Employee(55, "Raja", 121212.0));
		empSet.add(new Employee(15, "Abdul", 621212.0));
		empSet.add(new Employee(51, "John", 141212.0));
		empSet.add(new Employee(155, "Zaheer", 521212.0));
		empSet.add(new Employee(515, "Brejesh", 921212.0));
		empSet.add(new Employee(551, "Dinesh", 21212.0));
		empSet.add(new Employee(255, "Prasad", 321212.0));
		empSet.add(new Employee(525, "Ram", 1221212.0));
		empSet.add(new Employee(525, "Gokul", 1321212.0));
		empSet.add(new Employee(55, "Manish", 421212.0));	//Set rejects duplicate
		
		for(Employee e:empSet)
			System.out.println(e);
	}

}
