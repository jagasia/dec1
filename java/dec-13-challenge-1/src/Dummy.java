
public class Dummy {

	public static void main(String[] args) {
		int i=10;
		Object arr[]=new Object[i];
		arr[0]=new Integer(10);
		arr[1]=new Float(15.5f);
		arr[2]="Raja";
		
		System.out.println(arr.length);
		arr=new Object[20];
		System.out.println("After resize");
		System.out.println(arr.length);
		
		
		
	}

}
