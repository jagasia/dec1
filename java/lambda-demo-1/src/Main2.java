import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class MyPredicate implements Predicate<Employee>
//{
//
//	@Override
//	public boolean test(Employee t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
//}

public class Main2 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(12, "Raja", "IT", 1.0));
		empList.add(new Employee(1, "Abdul", "ECE", 1.0));
		empList.add(new Employee(112, "Dinesh", "IT", 1.0));
		empList.add(new Employee(15, "Prasad", "IT", 1.0));
		empList.add(new Employee(21, "Krishna", "CSE", 1.0));
		empList.add(new Employee(52, "Sathish", "ECE", 1.0));
		empList.add(new Employee(32, "Dinesh", "CSE", 1.0));
		empList.add(new Employee(18, "Raja", "CSE", 1.0));
		
//		Collections.sort(empList, (a,b)->a.getName().compareTo(b.getName()));
		
//		Stream<Employee> stream = empList.stream();
//		stream=stream.sorted((a,b)->b.id-a.id);
//		stream.forEach(System.out::println);

//		Optional<Employee> result = empList.stream()
////		.filter((a)->a.department=="IT")
////		.filter((a)->a.name.startsWith("D"))
//		.max((a,b)->(int)(a.getSalary()-b.getSalary()));
//		
//		System.out.println(result);
//		
		
//		for(Employee e:empList)
//			System.out.println(e);
		
		Map<String, Double> result = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		for(Entry<String, Double> entry:result.entrySet())
			System.out.println(entry.getKey()+"\t"+entry.getValue());
	}

}
