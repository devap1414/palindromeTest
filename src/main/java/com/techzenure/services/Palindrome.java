package com.techzenure.services;

public class Palindrome {
	public boolean isPalindrome(String str) {
		/*
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String strRev = sb.toString();
		return(strRev.equalsIgnoreCase(str));
		*/
		int a = 0;
		int start = 0;
		int end = str.length()-1;
		while(start < end) {
			if(str.charAt(start) != str.charAt(end))
			  return false;
			
			 start++;
			 end--;			
		}
		return true;
	}
}
