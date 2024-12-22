package string_programming;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		printIndexSpace(s);
	}
	
	public static void printIndexSpace(String s) {
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c==' ') {
				System.out.println("Index of space Character is : " + i);
			}
		}
	}

}
