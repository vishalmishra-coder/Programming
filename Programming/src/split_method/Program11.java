package split_method;

public class Program11 {
	public static void main(String[] args) {
		String s1 = "mo@h5a!ni123s@!$h3e#re";
		String [] p = s1.split("[0123456789]+");
//		String [] p = s1.split("[0-9]");
		System.out.println(p.length);
		for(String k : p)
			System.out.println(k);
	}

}
