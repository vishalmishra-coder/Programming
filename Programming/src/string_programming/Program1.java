package string_programming;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		
//		Step One By using toCharArray() method.
		char[]a = s1.toCharArray();
		System.out.println("Length of string is : " +  a.length);
		System.out.println("========================================");
		length(s1);
		System.out.println("========================================");
		length2(s1);
	}
	
	public static void length(String s1) {
//		By Using Exception Handling 
		int length = 0;
		try {
			for(int i=0; ; i++) {
				char c = s1.charAt(i);
				length++;
				
			}
			
		}catch(Exception e) {
			
		}
		
		System.out.println("Length of String is : " + length);
	}
	
	
	public static void length2(String s1) {
//		By using indexOf method
	    s1 = s1 + '\0';
		System.out.println("Length of String is : " +  s1.indexOf('\0'));
	}

}
