package com.cslb.morearraydemo;

public class ErWerDemo {

	public static void main(String[] args) {
		// 动态创建 ， 代表 有3个 一维数组， 每个一维数组中 有 两个 元素
		int[][] arr = new int[3][2];

		// 第一个 【】 写的值 是 代表 里面有几个 一维数组
		// 第二个 【】 写的值 是 每一个一维数组中 有几个 元素

		// 二维数组中第一个小数组中插入第一个数据
		arr[0][0] = 1;
		arr[0][1] = 5;
		// 二维数组中第二个小数组中插入第一个数据
		arr[1][0] = 99;
		arr[1][1] = 7;

		System.out.println(arr.length);

		
		//遍历二维数组
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);
				

			}

		}

	}

}
