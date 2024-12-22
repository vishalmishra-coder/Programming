package string_programming;

import java.util.Scanner;

public class Program15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		countWords(s);
	}
	public static void countWords(String s) {
		int count =0;
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(i==0 && c!=' ' ||  c!=' ' && (s.charAt(i-1)==' ' )) {
				count++;
			}
		}
		System.out.println("Total Nunmber of Words : " + count);
	}

}
