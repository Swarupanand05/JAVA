package com.dkte;
import java.util.Scanner;
public class Arrays_Integer {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4};
		int target,i;
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target value");
		target=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				found=true;
			}
			
		}
		if(found)
		{
			System.out.println("target is found");
		}
		else
		{
			System.out.println("target is not found");
		}
	}

}
