import java.util.HashSet;

public class Main2 {

	public static void main(String[] args) {
		HashSet<Employee> empSet=new HashSet<Employee>();
//		Employee e1=new Employee(101, "Raja", 121212.0);
//		Employee e2=new Employee(101, "Raja", 121212.0);
		empSet.add(new Employee(101, "Raja", 121212.0));
		empSet.add(new Employee(102, "Abdul", 211212.0));
		empSet.add(new Employee(103, "Zaheer", 421212.0));
		empSet.add(new Employee(101, "John", 151212.0));
		empSet.add(new Employee(105, "Abdul", 126212.0));
		
		System.out.println(empSet);
	}

}
