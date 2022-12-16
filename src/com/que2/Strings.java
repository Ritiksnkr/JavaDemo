package com.que2;

public class Strings {
	public static void main(String[] args)
	{
		
		String str="A quick brown fox jumps over the lazy dog";
		System.out.println("Index of character d is = "+str.indexOf('d'));
		System.out.println("character at index twice the first instance of ‘w’="+str.charAt((str.indexOf('w'))*2));
		System.out.println("Substring from index 15-22 = "+str.substring(15,22));
		System.out.println("String into Uppercase = "+str.toUpperCase());
		System.out.println("Last Index of character u is = "+str.lastIndexOf('u'));
		System.out.println("Index of character d is = "+str.concat(" in the night"));

	}
}
