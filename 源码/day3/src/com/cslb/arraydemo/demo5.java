package com.cslb.arraydemo;

public class demo5 {

	public static void main(String[] args) {
		/*
		 * ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ��������� Ȼ���������Ԫ�ص����ֵ����Сֵ��ƽ��ֵ����ֵ������ ���������
		 */

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 90 + 10);
		}

		// �鿴����Ԫ��
		System.out.print("�������е�Ԫ���ǣ�");
		for (int a : arr) {

			System.out.print(a + "  ");
		}

		// ���ֵ

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {

				max = arr[i];

			}

		}

		System.out.println("\n\n���ֵ�ǣ�" + max);

		// ��Сֵ

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {

				min = arr[i];
			}

		}

		System.out.println("\n��Сֵ�ǣ�" + min);

		// ���

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i]; // sum = sum + arr[i]

		}
		System.out.println("\n���ǣ�" + sum);

		// ��ƽ��ֵ

		double avg = sum / arr.length;

		System.out.println("\nƽ��ֵ�ǣ�" + avg);

		// ���� 1 2 3 4 4 3 2 1 63 67 22 89 32 54321
		// 0 1 2 3 0 1 2 3 4
		// 0 5-1

		for (int i = 0; i <= arr.length / 2 - 1; i++) {

			int temp = arr[i];

			arr[i] = arr[arr.length - 1 - i];

			arr[arr.length - 1 - i] = temp;

		}

		System.out.print("\n����֮������飺");
		for (int b : arr) {

			System.out.print(b + "  ");

		}

	}
}
