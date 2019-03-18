package com.org.branch;

public class Deepika_03 {
public static void main(String[] args) {
	int a=153,i=0,j=0,temp=0;
	temp=a;
	while(a>0)
	{
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	System.out.println(j);
	if(temp==j)
	{
		System.out.println(j +"armstrong number");
	}
	else
	{
		System.out.println(j +"not a armstrong number");
	}
}
}
