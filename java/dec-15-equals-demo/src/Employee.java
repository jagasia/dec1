
public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee arg=(Employee) obj;
//		return this.getId().equals(arg.getId());
		return this.getId()==arg.getId();
	}


//	public boolean equals(Employee arg) {
//		return this.getId().equals(arg.getId());
//	}

	

	
	
}
