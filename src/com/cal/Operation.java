package com.cal;

import java.util.Scanner;

public class Operation 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a");
	int a=sc.nextInt();
	System.out.println("enter b");
	int b=sc.nextInt();
	System.out.println("Addition of A+b");
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
}
}
