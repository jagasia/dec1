import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Mobile {
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;
	private Date launchedDate;
	
	public Mobile() {}

	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(Double displaySize) {
		this.displaySize = displaySize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}

	static Mobile createMobile(String detail)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");	
		String[] arr = detail.split(",");
		Mobile mobile=new Mobile();
		mobile.setReferenceId(arr[0]);
		mobile.setModelName(arr[1]);
		mobile.setDisplaySize(Double.parseDouble(arr[2]));
		mobile.setPrice(Double.parseDouble(arr[3]));
		try {
			mobile.setLaunchedDate(sdf.parse(arr[4]));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mobile;
	}
	public static Map<Date,Integer> yearWiseCount(List<Mobile> mobileList) throws ParseException
	{
		Map<Date,Integer> result=new TreeMap<Date, Integer>();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");

		for(Mobile mobile:mobileList)
		{
			Date date=mobile.getLaunchedDate();
			String year=sdf.format(date);
			date=sdf.parse(year);
			//now check if this date is found in the map or not
			Integer count = result.get(date);
			if(count==null)
			{
				count=0;
			}
			count++;
			result.put(date, count);
		}
		return result;
	}

}
