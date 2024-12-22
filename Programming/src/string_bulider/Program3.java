package string_bulider;

public class Program3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mohan here");
		System.out.println(sb);
		sb.insert(6, "is ");
		sb.insert(0, "! ");
		
		System.out.println(sb);
	}

}
