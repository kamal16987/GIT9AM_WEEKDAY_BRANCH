package com.org.branch;

public class TC_01 {

	public static void main(String[] args) {
		String s="hello";
		String res="";
		for (int i = s.length()-1; i>=0; i--) {
			char ch=s.charAt(i);
			res=res+ch;
		}
System.out.println(res);
	}

}
