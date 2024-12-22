package string_bulider;

public class Program5 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Lal Singh Chadda");
		StringBuilder sb1 = new StringBuilder("I am and here");
		sb.delete(4, 10);
		sb1.delete(5, 8);
		System.out.println(sb);
		System.out.println(sb1);
	}

}
