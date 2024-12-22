package string_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program31 {

	public static void main(String[] args) {
		String s = "swiss";
		char s1 = printFreq(s);
		System.out.println("The character is present only once : " + s1);
		
	}

	public static Character printFreq(String s) {
		Map<Character, Integer> m1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {

				if (m1.containsKey(c)) {
					m1.put(c, m1.get(c) + 1);
				} else {
					m1.put(c, 1);
				}
			}
		}
		Set<Map.Entry<Character, Integer>> es = m1.entrySet();
		for (Map.Entry<Character, Integer> m : es) {
			if (m.getValue() == 1)
				return m.getKey();
		}
		return '0';
	}
}
