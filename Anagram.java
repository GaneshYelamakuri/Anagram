package com.jsp.Stringpack;

public class Anagram {
	

	public static void main(String[] args) {
		
	  System.out.println( checkAnagram("dad","add"));

	}
	public static boolean checkAnagram(String s1,String s2) {
		
		while(true) {
			if(s1.length()==0 && s2.length()==0) return true;
			if(s1.length()!=s2.length()) return false;
			
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
//			System.out.println(s1);
			s2=s2.replace(c+"", "");
//			System.out.println(s2);
			
			
		}
	}

}
