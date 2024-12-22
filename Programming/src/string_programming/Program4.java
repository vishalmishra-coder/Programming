package string_programming;

import java.util.Scanner;

//WAJP to take a String input and count all the
//characters(excluding any special characters).

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.nextLine();	
		removeSpecialCharacters(s1);
	}
	
	public static void removeSpecialCharacters(String s1) {
		int count =0;
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(c>='A' && c<='Z'  || c>='a' && c<='z' || c>='0' && c<='9' || c==' ') {
				count++;
			}
		}
		System.out.println("Total Characters are : " + count);
	}
	
	
	

}
