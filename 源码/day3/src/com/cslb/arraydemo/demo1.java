package com.cslb.arraydemo;

public class demo1 {

	public static void main(String[] args) {

		//int arr[] =   new int[30];
		int [] arr =   new int[30];
		
		arr[0]=454;
		arr[1]=34;
		arr[7]=9878;  // ������   ��9878������� ��ֵ��   �±�Ϊ7���������
		arr[29] = 999;
		
		
		int a = arr[1];// ȡ����     ���±�Ϊ1 �� ��������� ȡ���� �� ��ֵ�� ���� a ; 
		
//		System.out.println(a);
		
		for (int i = 0; i <= arr.length; i++) {
			
			System.out.println(arr[i] );
		}
		
		
		

		
	}

}
