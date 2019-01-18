package com.cslb.arraydemo;

public class demo8 {

	public static void main(String[] args) {

		/*
		 * 利用随机数生成一个整数数组，数组中有10个元素， 每个元素的值都在1-30之间，且要求各个数值不能相同。打印该数组。
		 */

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {

			arr[i] = (int) (Math.random() * 30 + 1);
			for (int j = 0; j <= i; j++) {

				if (arr[i] == arr[j]) {

                      i--;
                      
				} else {
					arr[i] = arr[j];

				}

			}

		}
		System.out.println();
		for (int b : arr) {

			System.out.print(b + " ");

		}

	}
}
