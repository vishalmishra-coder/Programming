package string_programming;

public class Program24 {
	public static void main(String[] args) {
		String s = "mohan and sohan are here";
		firstCharUpperCase(s);
	}
	public static void firstCharUpperCase(String s) {
		String[] s1 = s.split("\s+");
		StringBuilder upper_case = new StringBuilder();
		for(String k : s1) {
			if(k.length()>0) {
				upper_case.append(Character.toUpperCase(k.charAt(0))).append(k.substring(1)).append(' ');
			}    
		}
		System.out.println(upper_case);
	}

}
