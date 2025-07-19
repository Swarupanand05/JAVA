package com.dkte;
import java.util.Scanner;
public class MinElement {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of an array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The minimum element in an array is:"+min);

	}

}
