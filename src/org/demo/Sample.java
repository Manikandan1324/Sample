package org.demo;

public class Sample {
	
	
	public static void main(String[] args) {
		
		
	String s="madam";
	String s1="";
	
	for (int i = s.length() - 1; i >= 0; i--) {
		char a = s.charAt(i);
	s1 = s1 + a;

	}
	System.out.println("reverse String :"+s1);
	
	
	if(s1.equals(s)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}

}

}
