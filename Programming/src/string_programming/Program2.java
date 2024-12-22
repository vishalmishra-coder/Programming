package string_programming;

import java.util.Scanner;
//Find Numeric Character in a string.
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.nextLine();
		countNumeric(s1);
	}
	
	public static void countNumeric(String s1) {
		int count =0;
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(c>=48 && c<='9') {
				count++;
			}
		}
		System.out.println("All Numeric Characters are : " + count);
	}

}
