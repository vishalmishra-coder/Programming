package string_programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program34 {
	public static void main(String[] args) {
		String s = "aa bbcd cca";
		char c = printMaxChar(s);
		System.out.println("Smallest Max Character : " + c);
	}
	
	public static char printMaxChar(String s) {
		Map<Character,Integer> m1 = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(m1.containsKey(c)) {
				m1.put(c, m1.get(c)+1);
			}
			else {
				m1.put(c, 1);
			}
		}
		int max_count = 0; char max_char = ' ';
		Set<Map.Entry<Character , Integer>> es = m1.entrySet();
		for(Map.Entry<Character, Integer> k : es) {
			if(k.getValue()>max_count  || (k.getValue()==max_count) && k.getKey()<max_char) {
				max_count = k.getValue();
				max_char = k.getKey();
			}
		}
		return max_char;
	}
	
}
