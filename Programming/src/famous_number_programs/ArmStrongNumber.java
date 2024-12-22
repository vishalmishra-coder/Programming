package famous_number_programs;
import java.util.Scanner;
public class ArmStrongNumber {
	
	//ArmStrong Number = An Armstrong number is a number that is equals to the sum of its own digits raised to the power
	//of the number of digits.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		//int res = checkArmStrongNumber(n);
		if(n==checkArmStrongNumber(n))
			System.out.println(n + " is ArmStrong Number");
		else
			System.out.println(n + " is not ArmStrong Number");
		
	}
	
	public static int count(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
			
		}
		return count;
	}
	public static int checkArmStrongNumber(int n) {
		int sum =0;
		
		while(n>0) {
			int rem = n%10;
			int pow=1;
			for(int i=1; i<=count(n); i++) {
				pow = pow*rem;
			}
			sum = sum + pow;
			n=n/10;
		}
		
		return sum;
	}
	
	
	


}
