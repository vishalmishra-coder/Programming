package string_bulider;

public class Program7 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());//default capacity =16
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append(" I am writing a java code.");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.charAt(5));	
		System.out.println(sb.length());
	}
}
