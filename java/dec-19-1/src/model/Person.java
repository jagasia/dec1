package model;
//is it a functional interface
public interface Person {
	public void speak();
	public static void walk()
	{
		System.out.println("Person walks");
	}

	public default void run()
	{
		System.out.println("Person runs");
	}
}
