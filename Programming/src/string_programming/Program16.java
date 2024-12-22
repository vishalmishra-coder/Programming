package string_programming;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the String 2 : ");
		String s2 = sc.nextLine();
		if (checkAnagram(s1, s2))
			System.out.println("Anagram String");
		else
			System.out.println("Not an Anagram String");
	}

	public static boolean checkAnagram(String s1, String s2) {
		int[] p = printFreq(s1);
		int[] q = printFreq(s2);
		for (int i = 0; i < p.length; i++) {
			if (p[i] != q[i])
				return false;
		}

		return true;

	}

	public static int[] printFreq(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90) {
				freq[c - 65]++;
			} else if (c >= 97 && c <= 122) {
				freq[c - 97]++;
			}

		}

		return freq;
	}

}
