package string_programming;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		int second_largest = secondLargest(s);
		System.out.println("Second Largest number is : " + second_largest);

	}

	public static int secondLargest(String s) {
		int largest = -1;  int second_largest = -1;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>=48 && c<=57) {
				if((c-48)>largest) {
					second_largest = largest;
					largest = c-48;
				}
				else if((c-48)>second_largest && (c-48)!=largest) {
			    	second_largest = c-48;
			    }
			}
		}
		return second_largest;
	
			
	}

}
