package string_programming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program23 {
	public static void main(String[] args) {
		String s = "loveleetcode";
		String s1 = printFreq(s);
		System.out.println(s1);
		
//		Second logic
		/*
		for(int i=0; i<s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				System.out.println("First Non - Repeating Char : " + s.charAt(i));
				break;
			}
		}*/
		
	}
	
	public static String printFreq(String s) {
		Map<Character , Integer> m1 = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(m1.containsKey(c)) {
				m1.put(c, m1.get(c)+1);
			}
			else {
				m1.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> es = m1.entrySet();
		for(Map.Entry<Character, Integer> p: es) {
			if(p.getValue()==1)
				return p.getKey() +" is at index " +p.getValue();
		}
		return "-1";
	}

}
