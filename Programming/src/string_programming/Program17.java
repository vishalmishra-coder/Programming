package string_programming;
import java.util.Scanner;
public class Program17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		if(checkPanagram(s))
			System.out.println("Panagram String!!");
		else
			System.out.println("Not an Panagram String!!");
	}
	public static boolean checkPanagram(String s) {
		int [] freq1 = printFrequency(s);
		for(int i=0; i<freq1.length; i++) {
			if(freq1[i]==0)
				return false;
		}
		return true;
	}
	public static int[] printFrequency(String s) {
		int freq[] = new int[26];
		for(int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			if(c>=65 && c<=90)
				freq[c-65]++;
			else if (c>=97 && c<=122)
				freq[c-97]++;
			
		}
		return freq;
	}

}
