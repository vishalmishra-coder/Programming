package split_method;

public class Program5 {
	public static void main(String[] args) {
		String s1 = "  Mohan  is  here";
		String [] p = s1.split("\s+");
		System.out.println(p.length);
		for(String s : p)
			System.out.println(s);
		
		}

}
