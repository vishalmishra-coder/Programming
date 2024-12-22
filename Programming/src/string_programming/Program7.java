package string_programming;

import java.util.Scanner;

public class Program7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		printIndex(s);
	}
	
	public static void printIndex(String s) {
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') {
				System.out.println("Numeric  Character is present at index: " + i);
			}
		}
	}

}
