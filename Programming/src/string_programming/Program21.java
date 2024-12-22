package string_programming;

public class Program21 {
	public static void main(String[] args) {
		String s = "mohan and vishal ar here";
		countEvenWords(s);
	}
	
	public static void countEvenWords(String s) {
		String [] s1 = s.split("\s+");
		int count_even = 0;
		for(String k : s1) {
			if(k.length()%2==0)
				count_even++;
		}
		System.out.println("Even Words Count is : " + count_even);
	}

}
