package com.cslb.arraydemo;

public class demo3 {

	public static void main(String[] args) {

		/*
		 * ��ϰһ ����һ��char���͵�26��Ԫ�ص����飬�ֱ� ����'A'-'Z���� ʹ��forѭ����������Ԫ�ز���ӡ������
		 * ��ʾ��char������������ 'A'+1 -> 'B'��'0'+1 -> '1��
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
