import java.util.Scanner;
public class Calculator {
int num1, num2, result;
public void acceptDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
}
public void addition() {
	result=num1+num2;
	System.out.println("Addition = "+result);
}



	}
