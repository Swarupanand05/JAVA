package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Date myDate =new Date(5,9,2004);
		
		System.out.print("Initial Date : ");
		myDate.display();
		
		myDate.setDay(05);
		myDate.setMonth(06);
		myDate.setYear(2005);
		
		System.out.print("\nUpadated Date : ");
		myDate.display();
		
		System.out.println("\nDay :"+myDate.getDay());
		System.out.println("Month :"+myDate.getMonth());
		System.out.println("Year :"+myDate.getYear());
	}

}
