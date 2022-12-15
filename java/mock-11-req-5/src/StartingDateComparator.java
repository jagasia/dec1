import java.util.Comparator;

public class StartingDateComparator implements Comparator<College>
{

	@Override
	public int compare(College a, College b) {
		return a.getStartingDate().compareTo(b.getStartingDate());
	}

}
