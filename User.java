package com.dkte;

import java.util.Scanner;
public class User
{
	
	public static void main(String[] args)
	{	
		String name;
		int rollnum;
		double marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		 name=sc.nextLine();
		System.out.println("Enter roll number");
		 rollnum=sc.nextInt();
		System.out.println("Enter marks");
		 marks=sc.nextDouble();
		System.out.println("Name : "+name);
		System.out.println("Roll : "+rollnum);
		System.out.println("Marks : "+marks);
			
	}
}