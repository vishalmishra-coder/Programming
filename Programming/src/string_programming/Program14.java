package string_programming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		System.out.println("String with Unique Elements : " + removeDuplicates(s) );
	}
	public static String removeDuplicates(String s) {
		String res = "";
		Set<Character> s1 = new LinkedHashSet<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			s1.add(c);
		}
		for(Character c : s1) {
			res = res + c;
		}
		return res;
		
	}

}
