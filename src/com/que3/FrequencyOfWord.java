package com.que3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeMap;
import java.util.Scanner;

public class FrequencyOfWord {
	private TreeMap<String, Integer> map = null;
	private String filename;

	public FrequencyOfWord(String filename) {
		this.filename = filename;
		map = new TreeMap<String, Integer>();
	}

	public TreeMap<String, Integer> getWordCount() throws FileNotFoundException {
		if (map.isEmpty()) {

			parseWord();
		}
		return map;
	}

	private void parseWord() throws FileNotFoundException {
		Scanner sc = new Scanner(new File(filename));
		while (sc.hasNext()) {
			String word = sc.next();
			int count = 1;
			// if word already exist in the map, increase count by 1
			if (map.containsKey(word)) {
				count = map.get(word) + 1;

			}
			map.put(word, count);
		}
		sc.close();
	}
}