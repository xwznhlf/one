package com.cslb.arraydemo;

public class demo5 {

	public static void main(String[] args) {
		/*
		 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数， 然后求出所有元素的最大值，最小值，平均值，和值，查找 并输出出来
		 */

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 90 + 10);
		}

		// 查看数组元素
		System.out.print("数组心中的元素是：");
		for (int a : arr) {

			System.out.print(a + "  ");
		}

		// 最大值

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {

				max = arr[i];

			}

		}

		System.out.println("\n\n最大值是：" + max);

		// 最小值

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {

				min = arr[i];
			}

		}

		System.out.println("\n最小值是：" + min);

		// 求和

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i]; // sum = sum + arr[i]

		}
		System.out.println("\n和是：" + sum);

		// 求平均值

		double avg = sum / arr.length;

		System.out.println("\n平均值是：" + avg);

		// 倒置 1 2 3 4 4 3 2 1 63 67 22 89 32 54321
		// 0 1 2 3 0 1 2 3 4
		// 0 5-1

		for (int i = 0; i <= arr.length / 2 - 1; i++) {

			int temp = arr[i];

			arr[i] = arr[arr.length - 1 - i];

			arr[arr.length - 1 - i] = temp;

		}

		System.out.print("\n倒置之后的数组：");
		for (int b : arr) {

			System.out.print(b + "  ");

		}

	}
}
