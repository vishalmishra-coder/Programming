package string_programming;

public class Program19 {
	public static void main(String[] args) {
		String s = "mohan and sohan are here";
		reverseWord(s);
	}
	
	public static void reverseWord(String s) {
		String[] s1 = s.split("\s+");
		String word ="";
		for(String k : s1) {
			word = k + ' ' + word;
		}
		System.out.println(word);
		
	}

}
