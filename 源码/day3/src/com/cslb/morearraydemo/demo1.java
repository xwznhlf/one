package com.cslb.morearraydemo;

public class demo1 {

	public static void main(String[] args) {
		/*
		 * �����ά���飬���ڱ��������࣬ÿ��������ͬѧ�ɼ��� �����ÿ���༶ƽ���֡��Լ����а༶ƽ����
		 */

		double[][] score = new double[3][5];

		// ʹ������� �� ��ά���� ��ֵ
		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score[i].length; j++) {

				score[i][j] = Math.round((Math.random() * 100));

				// �ֱ��ӡ ������� ÿһ���˵ĳɼ�
				if (i == 0) {

					System.out.println("�����1��ĳɼ�" + score[i][j]);

				} else if (i == 1) {

					System.out.println("�����2��ĳɼ�" + score[i][j]);
				} else if (i == 2) {

					System.out.println("�����3��ĳɼ�" + score[i][j]);
				}

			}

		}

		double onesum = 0;
		double twosum = 0;
		double threesum = 0;

		// ������� ������ĳɼ�
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {

				// �õ� 1��ĳɼ��ܷ�
				if (i == 0) {

					onesum = onesum + score[i][j];
					// �õ�2��ĳɼ��ܷ�
				} else if (i == 1) {

					twosum = twosum + score[i][j];
					// �õ� 3��ĳɼ��ܷ�
				} else if (i == 2) {

					threesum = threesum + score[i][j];
				}
			}
		}

		// �õ� ������ܳɼ� �� �� ƽ��
		System.out.println("1��ƽ���ɼ�" + onesum / 5);
		System.out.println("2��ƽ���ɼ�" + twosum / 5);
		System.out.println("3��ƽ���ɼ�" + threesum / 5);
		double sum = 0;

		// �õ�������� ÿ���˵ĳɼ��ܺ�
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {

				sum = sum + score[i][j];

			}

		}
		// �������˵� ƽ����
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
