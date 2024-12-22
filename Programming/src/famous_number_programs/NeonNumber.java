package famous_number_programs;
import java.util.Scanner;
public class NeonNumber
{
	//Neon Number = Sum of digits of its square of a number is equals to number itself.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(checkNeonNumber(n))
			System.out.println(n + " is a Neon Number");
		else
			System.out.println(n + " is not a Neon Number");
		
		}
	
	public static boolean checkNeonNumber(int n) {
		int sq = n*n;
		int sum =0;
		while (sq>0) 
		{
			sum += sq%10;
			sq=sq/10;
			
		}
		
		return sum==n;
		
	
	
	}
	
	
	
	

}
