package string_programming;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		replaceCharacter(s);
		System.out.println("===================================");
		replaceCharacter1(s);
	}
	
	public static void replaceCharacter(String s) {
		String repl = s.replace(' ' , '_');
		System.out.println("New String is : " + repl);
	}
	
	public static void replaceCharacter1(String s) {
		String repl = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c ==' ') {
				repl = repl + '_';
			}
			else {
				repl = repl + c;
			}
		}
		System.out.println("New String is : " + repl);
	}

}
