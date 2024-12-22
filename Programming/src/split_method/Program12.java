package split_method;

public class Program12 {
	public static void main(String[] args) {
		String s = "23a34P3qR30T5";
//		String[] p =s.split("[a-zA-z]");
		String[] p =s.split("[a-zA-Z]+");
		System.out.println(p.length);
		for(String s1 : p)
			System.out.println(s1);
	}

}
