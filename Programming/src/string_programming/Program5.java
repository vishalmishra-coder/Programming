package string_programming;
import java.util.Scanner;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.nextLine();
		countSpace(s1);	
	}
	public static void countSpace(String s) {
		int s_count =0; int u_count =0; int l_count=0; int n_count =0;
		int sp_count =0;
		for(int i =0; i<s.length(); i++) {
			char c= s.charAt(i);
			if(c==' ') 
				s_count++;
			
			else if(c>='A' && c<='Z')
				u_count++;
			
			else if(c>='a' && c<='z')
				l_count++;
			
			else if(c>='0' && c<='9')
				n_count++;
			
			else
				sp_count++;
		}
		System.out.println("Total Space character is : " + s_count);
		System.out.println("Total Space character is : " + u_count);
		System.out.println("Total Space character is : " + l_count);
		System.out.println("Total Space character is : " + n_count);
		System.out.println("Total Space character is : " + sp_count);
		
	}

}
