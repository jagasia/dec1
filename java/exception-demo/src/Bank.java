public class Bank {

	public void withdraw(Integer amount) 
	{
		if(amount>30000)
		{
			throw new RuntimeException("Amount "+amount+" is above the daily limit");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
