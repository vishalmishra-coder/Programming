package string_programming;

public class Program20 {
	public static void main(String[] args) {
		String s = "mohan and sohan are here";
		reverseWordCharacter(s);
		reverseWordCharacter1(s);
	}
	public static void reverseWordCharacter(String s) {
		String[] s1 = s.split("\s+");
		
		String word ="";
		for(String k : s1) {
			String rev = "";
			for(int i=0; i<k.length(); i++) {
				char c = k.charAt(i);
				rev = c + rev;
			}
			word = word + rev + ' ';
		}
		System.out.println(word);
	}
	public static void reverseWordCharacter1(String s) {
		String[] s1 = s.split("\s+");
		StringBuilder reverse_sentence = new StringBuilder();
		for(String k : s1) {
			StringBuilder reverse_word = new StringBuilder(k);
			reverse_word.reverse();
			reverse_sentence.append(reverse_word).append(' ');
		}
		System.out.println(reverse_sentence);
	}

}
