import java.util.Scanner;

public class RunLength4 {

	public static void main(String[] args) {
		int runLength = 0;
		int maxRunLength = 0;
		int startIndex=-1;
		int maxStartIndex=-1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		// get n inputs from the user and assign them to the array
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// display
//		System.out.println("Displaying the array elements");
		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
			if (arr[i] % 2 == 0) {
				
				runLength++;
				if(runLength==1)
				{
					startIndex=i;
//					System.out.println("StartIndex="+startIndex);
				}
				if (runLength > maxRunLength) {
					maxRunLength = runLength;
					maxStartIndex=startIndex;
//					System.out.println("MaxStartIndex="+maxStartIndex);
				}
//				System.out.printf("RunLength=%d\tMaxRunLength=%d\n",runLength,maxRunLength);
			} else {
				runLength = 0;
			}
		}

		System.out.println(maxRunLength);
		System.out.println(maxStartIndex);
	}

}


/* this is multiple lines of code to comment */
 
