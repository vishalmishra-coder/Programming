package string_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program30 {
	public static void main(String[] args) {
		String s = "aafbb cec dd";
		Map<Character, Integer> m1 = printFreq(s);
		Set<Map.Entry<Character , Integer>> es = m1.entrySet();
		for(Map.Entry<Character , Integer> m : es) {
			if(m.getValue()==1)
				System.out.println(m.getKey() + " is " + m.getValue() + " times ");
		}
	}
	public static Map printFreq(String s) {
		Map<Character , Integer> m1 = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			if(c!=' ') {
				
			if(m1.containsKey(c)) {
				m1.put(c, m1.get(c)+1);
			}
			else {
				m1.put(c, 1);
			}
		}
		}
		return m1;
	}

}
