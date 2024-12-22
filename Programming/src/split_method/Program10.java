package split_method;

public class Program10 {
	public static void main(String[] args) {
		String s = "mo@ha!nis@!$he#re";
		String [] p = s.split("[!$@#]+");
		System.out.println(p.length);
		for(String k : p)
			System.out.println(k);
	}

}
