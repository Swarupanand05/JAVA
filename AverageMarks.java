package com.dkte;
import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		float [] marks= {60.0f,70.0f,90.0f};
		float sum=0;
		
		for(float element:marks)
		{
			sum=sum+element;
		}
		System.out.println("The average marks are:"+sum/marks.length);

	}

}
