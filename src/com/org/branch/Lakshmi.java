package com.org.branch;

public class Lakshmi {
public static void main(String[] args) {
	int n=141;
	int i=0,j=0,a;
	a=n;
	while(a>0)
	{
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		}
	if(n==j)
		System.out.println("Palindrome");
	
}
}
