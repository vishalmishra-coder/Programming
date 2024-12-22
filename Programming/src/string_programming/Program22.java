package string_programming;

public class Program22 {
	public static void main(String[] args) {
		String s = "mohan and vishal are here";
		printLargestWord(s);
	}
	public static void printLargestWord(String s) {
		String[] s1 = s.split("\s+");
		String big = "";
		for(String k : s1) {
			if(k.length()>big.length())
				big = k;
		}
		System.out.println("Largest Word : " + big);
		
	}

}
