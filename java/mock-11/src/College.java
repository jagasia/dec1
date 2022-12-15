import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDept;
	private String location;
	private Date startingDate;
	
	public College() {}
	
	
	
	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location,
			Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDept = numberOfDept;
		this.location = location;
		this.startingDate = startingDate;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public Integer getNumberOfDept() {
		return numberOfDept;
	}
	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}



	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return String.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", name,website,mobile,founder,numberOfDept,location,sdf.format(startingDate));
	}
	
	public static College createCollege(String detail)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String[] arr = detail.split(",");
		College college=new College();
		college.setName(arr[0]);
		college.setWebsite(arr[1]);
		college.setMobile(arr[2]);
		college.setFounder(arr[3]);
		college.setNumberOfDept(Integer.parseInt(arr[4]));
		college.setLocation(arr[5]);
		try {
			college.setStartingDate(sdf.parse(arr[6]));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return college;
	}
	
	
}
