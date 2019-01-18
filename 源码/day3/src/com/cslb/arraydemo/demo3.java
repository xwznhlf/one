package com.cslb.arraydemo;

public class demo3 {

	public static void main(String[] args) {

		/*
		 * 练习一 创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。 使用for循环访问所有元素并打印出来。
		 * 提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1‘
		 * 
		 * 
	
		 */

		char[] arr = new char[26];
		arr[0] = 'A';
		for (int i = 1; i < arr.length; i++) {

			arr[i] = (char) (arr[i - 1] + 1);

		}
	     
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
