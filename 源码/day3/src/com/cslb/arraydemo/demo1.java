package com.cslb.arraydemo;

public class demo1 {

	public static void main(String[] args) {

		//int arr[] =   new int[30];
		int [] arr =   new int[30];
		
		arr[0]=454;
		arr[1]=34;
		arr[7]=9878;  // 存数据   把9878这个数据 赋值给   下标为7的这个数组
		arr[29] = 999;
		
		
		int a = arr[1];// 取数据     把下标为1 的 数组的数据 取出来 ， 赋值给 变量 a ; 
		
//		System.out.println(a);
		
		for (int i = 0; i <= arr.length; i++) {
			
			System.out.println(arr[i] );
		}
		
		
		

		
	}

}
