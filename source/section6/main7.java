package java220419;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main7 {

	public static void main(String[] args) {
		int k36_iPerson = 200 + 1;// k36_iPerson�� ���� �ִ� ��ŭ ����Ҹ� �����Ѵ�.
		int pageCnt = 1;
		int cnt = 1;

		InputData k36_inData = new InputData(k36_iPerson);

		int k36_korSum = 0, k36_engSum = 0, k36_matSum = 0, k36_sumSum = 0, k36_aveSum = 0;
		int k36_korSumAc = 0, k36_engSumAc = 0, k36_matSumAc = 0, k36_sumSumAc = 0, k36_aveSumAc = 0;
		int k36_korAveAc = 0, k36_engAveAc = 0, k36_matAveAc = 0, k36_sumAveAc = 0, k36_aveAveAc = 0;
		int k36_korAve = 0, k36_engAve = 0, k36_matAve = 0, k36_sumAve = 0, k36_aveAve = 0;
		// �Էµ����� ����
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("ȫ��%02d", k36_i);// �̸�����
			int k36_kor = (int) (Math.random() * 100);// �������� ����
			int k36_eng = (int) (Math.random() * 100);// �������� ����
			int k36_mat = (int) (Math.random() * 100);// �������� ����
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// Ŭ���� �� �� �Է�
		}
		// ��º�

		headPrint(pageCnt);

		// �Է°���ŭ ����ϰڴ�.
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("%03d %7s %5d %5d %5d %5d %5d\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], (int) k36_inData.k36_ave[k36_i]);

			// ���������� �� ���� �հ�
			k36_korSumAc += k36_inData.k36_kor[k36_i];
			k36_engSumAc += k36_inData.k36_eng[k36_i];
			k36_matSumAc += k36_inData.k36_mat[k36_i];
			k36_sumSumAc += k36_inData.k36_sum[k36_i];
			k36_aveSumAc += k36_inData.k36_ave[k36_i];
			// ���������� �� ���� ���(�հ迡�� �л���(cnt)�� �������ش�)
			k36_korAveAc = k36_korSumAc / cnt;
			k36_engAveAc = k36_engSumAc / cnt;
			k36_matAveAc = k36_matSumAc / cnt;
			k36_sumAveAc = k36_sumSumAc / cnt;
			k36_aveAveAc = k36_aveSumAc / cnt;

			// ���� ������ �� ���� �հ�
			k36_korSum += k36_inData.k36_kor[k36_i];
			k36_engSum += k36_inData.k36_eng[k36_i];
			k36_matSum += k36_inData.k36_mat[k36_i];
			k36_sumSum += k36_inData.k36_sum[k36_i];
			k36_aveSum += k36_inData.k36_ave[k36_i];
			// ���������� �� ���� ���
			k36_korAve = k36_korSum / k36_i;
			k36_engAve = k36_engSum / k36_i;
			k36_matAve = k36_matSum / k36_i;
			k36_sumAve = k36_sumSum / k36_i;
			k36_aveAve = k36_aveSum / k36_i;

			cnt++;

			if (k36_i % 30 == 0 && k36_i < k36_iPerson) {
				System.out.println("==============================================");
				System.out.printf("����������\n%-10s %5d %5d %5d %5d %5d\n","�հ�", k36_korSumAc, k36_engSumAc, k36_matSumAc, k36_sumSumAc,
						k36_aveSumAc);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","���", k36_korAveAc, k36_engAveAc, k36_matAveAc, k36_sumAveAc,
						k36_korAveAc);
				System.out.println("==============================================");
				System.out.printf("����������\n%-10s %5d %5d %5d %5d %5d\n", "�հ�",k36_korSum, k36_engSum, k36_matSum, k36_sumSum, k36_aveSum);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","���", k36_korAve, k36_engAve, k36_matAve, k36_matAve, k36_aveAve);
				pageCnt++;
				headPrint(pageCnt);
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
				cnt = 1;
			}
			if (k36_i + 1 == k36_iPerson) {
				System.out.println("==============================================");
				System.out.printf("����������\n%-10s %5d %5d %5d %5d %5d\n","�հ�", k36_korSumAc, k36_engSumAc, k36_matSumAc, k36_sumSumAc,
						k36_aveSumAc);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","���", k36_korAveAc, k36_engAveAc, k36_matAveAc, k36_sumAveAc,
						k36_korAveAc);
				System.out.println("==============================================");
				System.out.printf("����������\n%-10s %5d %5d %5d %5d %5d\n", "�հ�",k36_korSum, k36_engSum, k36_matSum, k36_sumSum, k36_aveSum);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","���", k36_korAve, k36_engAve, k36_matAve, k36_matAve, k36_aveAve);
				System.out.println("\nEnd\n");
			}
		}
	}

	public static void headPrint(int pageCnt) {
		Calendar k36_cal = Calendar.getInstance();// Ķ���� ���̺귯�� ����
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// ���� ���� ��� ���� ����
		System.out.printf("%23s\n", "��������ǥ");
		System.out.printf("%-5s%d %14s %s\n", "PAGE: ", pageCnt, "������� :", k36_sdt.format(k36_cal.getTime()));// ������ڸ�
																												// ����ϱ�����
		// ����ð��� �ҷ��´�
		System.out.println("==============================================");
		System.out.printf("%-3s %4s %4s %4s %3s %3s %3s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("==============================================");

	}
}