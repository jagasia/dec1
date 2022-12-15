import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
	private String name;
	private List<College> collegeList;
	
	public University() {
		collegeList=new ArrayList<College>();
	}

	public University(String name, List<College> collegeList) {
		super();
		this.name = name;
		this.collegeList = collegeList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<College> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	public void addCollegeToUniversity(College college)
	{
		collegeList.add(college);
	}
	public Boolean removeCollege(String name)
	{
		//loop all colleges in the collegeList and check if current college has the name equal to argument
//		for(College c:collegeList)
//		{
//			if(c.getName().equals(name))
//			{
//				//found
//				collegeList.remove(c);		//this will give ConcurrentModificationException
//			}
//		}
		Boolean isFound=false;
		Iterator<College> it = collegeList.iterator();
		while(it.hasNext())
		{
			College c = it.next();
			if(c.getName().equals(name))
			{
				//found
				isFound=true;
				it.remove();
				break;
			}
		}
		
		return isFound;
	}
	public void displayColleges()
	{
//		if(collegeList.size()==0)
		if(collegeList.isEmpty())
		{
			System.out.println("No colleges to show");
		}else
		{
			System.out.println("Colleges in "+this.getName());
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
			for(College c:collegeList)
			{
				System.out.print(c);
			}
		}
	}

}
