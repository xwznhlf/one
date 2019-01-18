package com.cslb.arraydemo;

public class maopaodemo7 {

	public static void main(String[] args) {
		
		
		int [] arr ={ 34,2,56,787,34,67,899,22,556,9 };
		
		System.out.print("排序之前的数组");
		for (int a : arr) {
			System.out.print(a+"  ");
		}
		
		
		int temp =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length-i-1; j++) {
				
				if (arr[j]<arr[j+1] ) {
					
					temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				
				
			}
			
		}
		
		System.out.print("\n排序之后的数组");
		for (int a : arr) {
			System.out.print(a+"  ");
		}
		
		
		

	}

}
