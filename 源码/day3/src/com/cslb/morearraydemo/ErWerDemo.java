package com.cslb.morearraydemo;

public class ErWerDemo {

	public static void main(String[] args) {
		// ��̬���� �� ���� ��3�� һά���飬 ÿ��һά������ �� ���� Ԫ��
		int[][] arr = new int[3][2];

		// ��һ�� ���� д��ֵ �� ���� �����м��� һά����
		// �ڶ��� ���� д��ֵ �� ÿһ��һά������ �м��� Ԫ��

		// ��ά�����е�һ��С�����в����һ������
		arr[0][0] = 1;
		arr[0][1] = 5;
		// ��ά�����еڶ���С�����в����һ������
		arr[1][0] = 99;
		arr[1][1] = 7;

		System.out.println(arr.length);

		
		//������ά����
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);
				

			}

		}

	}

}
