package com.cslb.arraydemo;

public class demo7 {

	public static void main(String[] args) {

		/*
		 * �������������һ���������飬��������10��Ԫ�أ� ÿ��Ԫ�ص�ֵ����1-30֮�䣬��Ҫ�������ֵ������ͬ����ӡ�����顣
		 */

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {

			int a = (int) (Math.random() * 30 + 1);

			for (int j = 0; j <= i; j++) {

				if (a!= arr[j]) {

					arr[i] = a;

				}
			}

		}
		System.out.println();
		for (int b : arr) {

			System.out.print(b + " ");

		}

	}

}
