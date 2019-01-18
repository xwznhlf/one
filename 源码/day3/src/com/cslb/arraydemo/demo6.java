package com.cslb.arraydemo;

public class demo6 {

	public static void main(String[] args) {

		int a = 9;

		int b = 3;
		
		System.out.println("a,b的值为" +a +"," + b);
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a,b的值为" +a +"," + b);
	}

}
