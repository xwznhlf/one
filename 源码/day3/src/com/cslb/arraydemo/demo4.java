package com.cslb.arraydemo;

public class demo4 {

	public static void main(String[] args) {
		/* ��ϰ��
		 *  ����һ��char���͵�36��Ԫ�ص����飬ǰ26��Ԫ�ط���'A'-'Z��,
		 *   ��10��Ԫ�ط���'0'-'9����
		 * ʹ��forѭ����������Ԫ�ز���ӡ������
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
