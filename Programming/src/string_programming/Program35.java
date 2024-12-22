package string_programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program35{
	public static void main(String[] args) {
		String s = "aa bdca ddacdc";
		char c = printFreq(s);
		System.out.println("Biggest Maximum Character is : " + c);
	}
	
	public static char printFreq(String s) {
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
		int max =0; char max_char =' ';
		Set<Map.Entry<Character , Integer>> es = m1.entrySet();
		for(Map.Entry<Character, Integer> k : es) {
			int c_value = k.getValue();
			char c_char = k.getKey();
			if(c_value>max || (c_value==max)&& c_char>max_char) {
				max = c_value;
				max_char = c_char;
			}
		}
		return max_char;
	}

}
