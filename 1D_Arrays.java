package com.dkte;

public class Arrays {

	public static void main(String[] args) {
		float [] arr= {(float) 10.0,(float) 20.0,(float) 30.0};
		float sum = 0;
		int i;
		for(i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
