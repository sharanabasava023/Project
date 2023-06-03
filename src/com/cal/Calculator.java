package com.cal;

public class Calculator {

	
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
       add(5,2);
       sub(6,3);
       div(10,2);


	}

}
