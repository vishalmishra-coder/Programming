package split_method;

public class Program8 {
	public static void main(String[] args) {
		String s1 = "mohanaaxyabdcab";
		String [] p = s1.split("a+");
		System.out.println(p.length);
		for(String k : p)
			System.out.println(k);
	}

}
