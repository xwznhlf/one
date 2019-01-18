package com.atguigu.java.sort;

/**
 * 快速排序
 * @author shkstart
 * 2013-11-27
 */
public class QuickSort {
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	private static void subSort(int[] data, int start, int end) {
		if (start < end) {
			int base = data[start];
			int i = start;
			int j = end + 1;
			while (true) {
				while (i < end && data[++i] - base <= 0)
					;
				while (j > start && data[--j] - base >= 0)
					;
				if (i < j) {
					swap(data, i, j);
				} else {
					break;
				}
			}
			swap(data, start, j);
			subSort(data, start, j - 1);//递归调用
			subSort(data, j + 1, end);
		}
	}
	public static void quickSort(int[] data){
		subSort(data,0,data.length-1);
	}
	public static void main(String[] args) {
		int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
		System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
	}
}
