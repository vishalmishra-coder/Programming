package string_programming;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		printReverse(s);
		System.out.println("Reverse of String is : " + printReverse(s));
		
	}
	
	public static String printReverse(String s) {
		String rev = "";
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			rev = c + rev;
		}
		return rev;
	}
	

}
