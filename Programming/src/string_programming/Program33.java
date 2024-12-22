package string_programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Program33 {
	public static void main(String[] args) {
		String s = "aaaa becbcc dcc";
		printFreq(s);
	}

	public static void printFreq(String s) {
		Map<Character, Integer> m1 = new LinkedHashMap<>();
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
		int max =0;
		char max_key=' ';

		Set<Map.Entry<Character, Integer>> es = m1.entrySet();
		for (Map.Entry<Character, Integer> k : es) {
			if (k.getValue() > max) {
				max = k.getValue();
				max_key = k.getKey();
			}
			}
		System.out.println(max_key + " is " + max + " times");
	}


}
