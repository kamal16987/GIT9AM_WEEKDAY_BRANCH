package com.org.branch;

import java.util.Scanner;

public class D_Palindrome {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check weather it is palindrome or not");
	int n = sc.nextInt();
	int r=0;
	int p=0;
	int a=n;
	while(a>0) {
		r=a%10;
		p=(p*10)+r;
		a=a/10;
		}
		
		if (n==p) {
		System.out.println("Entered Number is a palindrome Number");
	} else {
		System.out.println("enterd number is not a palindrome");

	}
	
	
	
	
	
}



}
