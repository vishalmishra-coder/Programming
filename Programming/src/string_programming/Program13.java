package string_programming;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		if(checkPalindrome(s)) {
			System.out.println("It is a Palindrome String");
		}
		else {
			System.out.println("It is not a Palindrome String");
		}
	}
	
	public static boolean checkPalindrome(String s) {
		int len = s.length();
		for(int i=0; i<len/2; i++) {
			char c = s.charAt(i);
			if(s.charAt(i) != s.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}

}
