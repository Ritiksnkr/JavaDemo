package com.que3;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		FrequencyOfWord fr=new FrequencyOfWord("C:\\Users\\ritiksonker\\Downloads\\data.txt");
		TreeMap<String, Integer> map=fr.getWordCount();
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry);
		}
	}

}