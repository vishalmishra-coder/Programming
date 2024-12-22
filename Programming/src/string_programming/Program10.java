package string_programming;

import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		printSum(s);
	}
	
	public static void printSum(String s) {
		int sum =0;
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') {
				sum = sum + (c-48);
			}
		}
		System.out.println("Sum is : " + sum);
	}

}
