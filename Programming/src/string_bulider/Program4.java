package string_bulider;

public class Program4 {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb1 = new StringBuilder("My Name is Vishal");
		sb.replace(1, 3, " guys ");
		sb1.replace(0, 11, "Hello ");
		System.out.println(sb);
		System.out.println(sb1);
		
	}
	

}
