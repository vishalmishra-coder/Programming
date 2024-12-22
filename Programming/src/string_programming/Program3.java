package string_programming;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.nextLine();
		removeSpaces(s1);
	}
	
	public static void removeSpaces(String s1) {
		int count =0;
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(c!=' ') {
				count++;
			}
		}
		System.out.println("Count of String Characters is : " + count);
	}

}
