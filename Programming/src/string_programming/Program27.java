package string_programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program27 {
	public static void main(String[] args) {
		String s = "aa bbcd eef bbcda";
		printFreq(s);
	}
	
	public static void printFreq(String s) {
		Map<Character , Integer> m1 = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				if(m1.containsKey(c)) {
				m1.put(c, m1.get(c)+1);
			}
			else {
				m1.put(c, 1);
			}
			}
		}
		
		Set<Map.Entry<Character,Integer>> es = m1.entrySet();
		for(Map.Entry<Character, Integer> p:es) {
			System.out.println(p.getKey()  + " is : " + p.getValue() + " times");
		}
	}

}
