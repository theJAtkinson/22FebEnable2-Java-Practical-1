package com.qa.main.morsetranslator;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
	private Map<String, String> m = new HashMap<>();
	
	public MorseTranslator() {
		m.put(".-", "A");
		m.put("-..", "B");
		m.put("-.-.", "C");
		m.put("-..", "D");
		m.put(".", "E");
		m.put("..-.", "F");
		m.put("--.", "G");
		m.put("....", "H");
		m.put("..", "I");
		m.put(".---", "J");
		m.put("-.-", "K");
		m.put(".-..", "L");
		m.put("--", "M");
		m.put("-.", "N");
		m.put("---", "O");
		m.put(".--.", "P");
		m.put("--.-", "Q");
		m.put(".-.", "R");
		m.put("...", "S");
		m.put("-", "T");
		m.put("..-", "U");
		m.put("...-", "V");
		m.put(".--", "W");
		m.put("-..-", "X");
		m.put("-.--", "Y");
		m.put("--..", "Z");
		m.put("/", " ");
	}
	
	public String translate(String morsecode) {
		String[] s = morsecode.split(" ");
		String out = "";
		for(String x : s) {
			out += m.get(x);
		}
		return out;
	}

}
