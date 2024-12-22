package string_programming;
import java.util.Scanner;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.nextLine();
		countVowel(s1);
	}
	
	public static void countVowel(String s) {
		s = s.toLowerCase();
		int count =0;
		for(int i=0; i<s.length(); i++) {
			
			char c= s.charAt(i);
			if(c!=' ')
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				count++;
			}
		}
		System.out.println("Total Vowel Characeter are : " + count );
	}

}
