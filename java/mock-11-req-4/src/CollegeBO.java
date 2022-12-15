import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollegeBO {
	
	public List<College> findCollege(List<College> collegeList,List<String> nameList)
	{
		List<College> result=new ArrayList<>();
		//loop the nameList and for every name, loop the collegeList and find that name
		//if a college is found for that name, then add that college to the result
		for(String name:nameList)
		{
			for(College college:collegeList)
			{
				if(college.getName().equals(name))
				{
					result.add(college);
				}
			}
		}
		return result;
	}
	public List<College> findCollege(List<College> collegeList,Date startingDate)
	{
		List<College> result=new ArrayList<>();
		for(College c:collegeList)
		{
			if(c.getStartingDate().equals(startingDate))
			{
				result.add(c);
			}
		}
		return result;
	}
	public List<College> findCollege(List<College> collegeList, String location)
	{
		List<College> result=new ArrayList<>();
		for(College c:collegeList)
		{
			if(c.getLocation().equals(location))
				result.add(c);
		}
		return result;
	}

}
