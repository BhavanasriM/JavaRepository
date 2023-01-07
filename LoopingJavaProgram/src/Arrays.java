import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store:");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter the elements of the array:");
		int i, oddsum =0, evensum=0;
		for(i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		for(i=0;i<size;i++)
			if(arr[i]%2==0)
				evensum = evensum + arr[i];
			else
				oddsum = oddsum + arr[i];
		System.out.println("Sum of Even Numbers = :" + evensum );
		System.out.println("Sum of Odd Numbers = : " + oddsum );
		
	}

}
