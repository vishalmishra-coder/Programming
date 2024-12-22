package string_programming;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 num : ");
		int n1 = sc.nextInt();
		System.out.println("Enter 2 num : ");
		int n2 = sc.nextInt();
		System.out.println("Enter 3 num : ");
		int n3 = sc.nextInt();
		int big = (n1>n2)?(n1>n3)?n1:n3:(n2>n3)?n2:n3;	    
		System.out.println(big);
	
	}	
}
