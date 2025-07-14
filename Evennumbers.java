package com.dkte;

public class Evennumbers {

	public static void main(String[] args) {
		int n=10,sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("The sum of first ten even numbers are:"+sum);
	}

}
