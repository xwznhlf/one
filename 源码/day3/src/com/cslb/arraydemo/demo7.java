package com.cslb.arraydemo;

public class demo7 {

	public static void main(String[] args) {

		/*
		 * 利用随机数生成一个整数数组，数组中有10个元素， 每个元素的值都在1-30之间，且要求各个数值不能相同。打印该数组。
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
