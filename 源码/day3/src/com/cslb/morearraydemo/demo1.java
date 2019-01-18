package com.cslb.morearraydemo;

public class demo1 {

	public static void main(String[] args) {
		/*
		 * 定义二维数组，用于保存三个班，每个班五名同学成绩， 并求出每个班级平均分、以及所有班级平均分
		 */

		double[][] score = new double[3][5];

		// 使用随机数 给 二维数组 赋值
		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score[i].length; j++) {

				score[i][j] = Math.round((Math.random() * 100));

				// 分别打印 各个班的 每一个人的成绩
				if (i == 0) {

					System.out.println("这个是1班的成绩" + score[i][j]);

				} else if (i == 1) {

					System.out.println("这个是2班的成绩" + score[i][j]);
				} else if (i == 2) {

					System.out.println("这个是3班的成绩" + score[i][j]);
				}

			}

		}

		double onesum = 0;
		double twosum = 0;
		double threesum = 0;

		// 遍历输出 各个班的成绩
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {

				// 得到 1班的成绩总分
				if (i == 0) {

					onesum = onesum + score[i][j];
					// 得到2班的成绩总分
				} else if (i == 1) {

					twosum = twosum + score[i][j];
					// 得到 3班的成绩总分
				} else if (i == 2) {

					threesum = threesum + score[i][j];
				}
			}
		}

		// 得到 各班的总成绩 后 求 平均
		System.out.println("1班平均成绩" + onesum / 5);
		System.out.println("2班平均成绩" + twosum / 5);
		System.out.println("3班平均成绩" + threesum / 5);
		double sum = 0;

		// 得到各个班的 每个人的成绩总和
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {

				sum = sum + score[i][j];

			}

		}
		// 求所有人的 平均分
		System.out.println(sum / 15);

		boolean[] bar = new boolean[2];
		System.out.println(bar[0]);

		double f4[] = { 1, 3, 5 };
		System.out.println(f4[0]);

		
		System.out.println("----------------------------------");
		
		
		char[] arr = new char[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ('A' + i);
			System.out.print(arr[i]);
		}
		
		
	}

}
