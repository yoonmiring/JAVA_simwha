package java220419;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet3 {
	static int i;
	static int k36_iPerson = 20 + 1;// k36_iPerson�� ���� �ִ� ��ŭ ����Ҹ� �����Ѵ�.
	static InputData k36_inData = new InputData(k36_iPerson);// �������� ���ڸ� �� ��ŭ �迭�� �����Ѵ�.
	static int k36_korSum;
	static int k36_engSum;
	static int k36_matSum;
	static int k36_sumSum;
	static int k36_aveSum;

	public static void main(String[] args) {
		int k36_korSumAc = 0;
		int k36_engSumAc = 0;
		int k36_matSumAc = 0;
		int k36_sumSumAc = 0;
		int k36_aveSumAc = 0;
		InputData k36_inData = new InputData(k36_iPerson);
		// �Էµ����� ����
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("ȫ��%02d", k36_i);// �̸�����
			int k36_kor = (int) (Math.random() * 100);// �������� ����
			int k36_eng = (int) (Math.random() * 100);// �������� ����
			int k36_mat = (int) (Math.random() * 100);// �������� ����
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// Ŭ���� �� �� �Է�
		}
		// ��º�

		headPrint();
		
		//�Է°���ŭ ����ϰڴ�.
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("%03d %7s %5d %5d %5d %5d %5d\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], (int) k36_inData.k36_ave[k36_i]);
			
				//�����������հ�
				for (int k36_j = 0; k36_j < k36_iPerson; k36_j++) {
					k36_korSum += k36_inData.k36_kor[k36_j];
					k36_engSum += k36_inData.k36_eng[k36_j];
					k36_matSum += k36_inData.k36_mat[k36_j];
					k36_sumSum += k36_inData.k36_sum[k36_j];
					k36_aveSum += k36_inData.k36_ave[k36_j];
				}
				// ���������� �հ�
				for (int k36_j = 0; k36_j < k36_iPerson; k36_j++) { // 1 + (1+2) + (1+2+3) ������ �þ�� ���ڰ� ũ�Գ���
					k36_korSumAc += k36_inData.k36_kor[k36_j];
					k36_engSumAc += k36_inData.k36_eng[k36_j];
					k36_matSumAc += k36_inData.k36_mat[k36_j];
					k36_sumSumAc += k36_inData.k36_sum[k36_j];
					k36_aveSumAc += k36_inData.k36_ave[k36_j];
				}
				// ���������� ���
				int k36_korAve = k36_korSum / k36_iPerson;
				int k36_engAve = k36_engSum / k36_iPerson;
				int k36_matAve = k36_matSum / k36_iPerson;
				int k36_sumAve = k36_sumSum / k36_iPerson;
				int k36_aveAve = k36_sumSum / k36_iPerson;
				// ���������� ���
				int k36_korAveAc = k36_korSumAc / k36_iPerson;
				int k36_engAveAc = k36_engSumAc / k36_iPerson;
				int k36_matAveAc = k36_matSumAc / k36_iPerson;
				int k36_sumAveAc = k36_sumSumAc / k36_iPerson;
				int k36_aveAveAc = k36_aveSumAc / k36_iPerson;
				// �޼��� ȣ�� �� ��� �� ��ŭ �迭���� ����

				// System.out.println("==============================================");
				// 10�ٸ��� �ڸ��ڴ�.
			if (k36_i % 10 == 0) {
				System.out.println("==============================================");

				System.out.println("����������");
				System.out.printf("%-14s", "�հ�");// ������������ �հ踦 ���ϱ� ���� �迭�� ���� �� ���Ͽ� �����Ѵ�.
				System.out.printf("%5d %5d %5d %5d %5d \n", k36_korSumAc, k36_engSumAc, k36_matSumAc, k36_sumSumAc,
						k36_aveSumAc);// ���� ������ �հ� ���
				// �հ踦 ���� ������ �Է°���ŭ ������ ���� �������� ����� ���Ѵ�
				System.out.printf("%-14s %4d %5d %5d %5d %5d \n\n", "���", k36_korAveAc, k36_engAveAc, k36_matAveAc,
						k36_sumAveAc, k36_aveAveAc); // ���������� ��� ���
				k36_korSumAc = 0;
				k36_engSumAc = 0;
				k36_matSumAc = 0;
				k36_sumSumAc = 0;
				k36_aveSumAc = 0;
				k36_korAveAc = 0;
				k36_engAveAc = 0;
				k36_matAveAc = 0;
				k36_sumAveAc = 0;
				k36_aveAveAc = 0;

				System.out.println("==============================================");
				System.out.println("����������");
				System.out.printf("%-14s", "�հ�");// ������������ �հ踦 ���ϱ� ���� �迭�� ���� �� ���Ͽ� �����Ѵ�.
				System.out.printf("%5d %5d %5d %5d %5d \n", k36_korSum, k36_engSum, k36_matSum, k36_sumSum, k36_aveSum);// ����
																														// ������
																														// �հ�
																														// ���
				// �հ踦 ���� ������ �Է°���ŭ ������ ���� �������� ����� ���Ѵ�
				System.out.printf("%-14s %4d %5d %5d %5d %5d \n\n", "���", k36_korAve, k36_engAve, k36_matAve,
						k36_sumAve, k36_aveAve); // ���������� ��� ���
			}
		}

	}

	public static void headPrint() {
		Calendar k36_cal = Calendar.getInstance();// Ķ���� ���̺귯�� ����
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// ���� ���� ��� ���� ����
		System.out.printf("%23s\n", "��������ǥ");
		System.out.printf("%-5s%d %14s %s\n", "PAGE: ", i, "������� :", k36_sdt.format(k36_cal.getTime()));// ������ڸ� ����ϱ�����
																										// ����ð��� �ҷ��´�
		System.out.println("==============================================");
		System.out.printf("%-3s %4s %4s %4s %3s %3s %3s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("==============================================");

	}
}
