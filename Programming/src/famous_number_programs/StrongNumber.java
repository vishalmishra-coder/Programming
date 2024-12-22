package famous_number_programs;
import java.util.Scanner;
public class StrongNumber 
{
	//Strong Number = sum of factorials of each digit of a number is equal to number itself then it is called Strong Number.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(checkStrongNumber(n))
			System.out.println(n + " is a Strong Number");
		else
			System.out.println(n + " is not a Strong Number");
		
	}
	public static boolean checkStrongNumber(int n) {
		int sum = sum(n);
		return sum==n;
		
	}
	public static int sum(int n)
	{
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			int fact =1;
			for(int i=1; i<=rem; i++) {
				fact=fact*i;
			}
			sum = sum+fact;
			n = n/10;
		}
		
		return sum;
	}
	

}
