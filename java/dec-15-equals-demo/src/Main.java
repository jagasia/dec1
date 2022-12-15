
public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Raja",123456.0); 
		Employee e2=new Employee(1,"Raja",123456.0);
//		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}

}
