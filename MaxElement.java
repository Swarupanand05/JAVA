package com.dkte;

public class MaxElement {

	public static void main(String[] args) {
		int [] arr= {10,20,5,3};
		int i;
		int max=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[0]<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum element in array is:"+max);

	}

}
