import java.util.Date;

public class Employee {
	private String id;			//property
	private String firstName;	//read-only property
	private String lastName;	//write-only property
	private Date dateOfJoining;	//is not a property
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)	//local variable
	{
		if(id.length()<5)
			throw new RuntimeException("The name must be atleast 5 characters");
		this.id=id;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}

	public static void main(String[] args) {
		Employee raja=new Employee();
		raja.id="Raja";
		
	}
}
