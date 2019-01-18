package com.cslb.arraydemo;

public class demo4 {

	public static void main(String[] args) {
		/* 练习二
		 *  创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,
		 *   后10个元素放置'0'-'9‘。
		 * 使用for循环访问所有元素并打印出来。
         */
		char [] arr = new char [36] ; 
		
		arr[0]= 'A'; 
		
		for (int i = 1; i < 26; i++) {
			
	        arr[i]=(char) (arr[i-1]+1);
			
		}
		for (int i = 0; i <= 9; i++) {
			  arr[(i+26)]= (char) (i+'0') ;
		}                      
		                
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

}
