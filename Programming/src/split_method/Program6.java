package split_method;

public class Program6 {
	public static void main(String[] args) {
		String s1 = "       Mohan    is        here        ";
		String [] p = s1.split(" ");
		System.out.println(p.length);
		for(String s : p)
			System.out.println(s);
		
		
		
		System.out.println("====================");
		System.out.println(s1.trim().split("\s+").length);
		
		}

}
