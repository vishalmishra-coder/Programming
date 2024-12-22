package string_programming;

public class Program26 {
	public static void main(String[] args) {
		String s = "12345";
		if(checkString(s))
			System.out.println("String Has only digits");
		else
			System.out.println("String has not only digits");
	}
	public static boolean checkString(String s) {
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!(c>=48 && c<=57)){
				return false;
			}
			
		}
		return true;
	}
}
