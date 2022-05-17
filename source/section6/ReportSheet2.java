package java220419;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar k36_cal = Calendar.getInstance();// Ķ���� ���̺귯�� ����
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// ���� ���� ��� ���� ����
		int k36_iPerson = 30;// k36_iPerson�� ���� �ִ� ��ŭ ����Ҹ� �����Ѵ�.
		InputData k36_inData = new InputData(k36_iPerson);// �������� ���ڸ� �� ��ŭ �迭�� �����Ѵ�.
		int k36_korSum = 0;
		int k36_engSum = 0;
		int k36_matSum = 0;
		int k36_sumSum = 0;
		int k36_aveSum = 0;
		// �Էµ����� ����
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("ȫ��%02d", k36_i);// �̸�����
			int k36_kor = (int) (Math.random() * 100);// �������� ����
			int k36_eng = (int) (Math.random() * 100);// �������� ����
			int k36_mat = (int) (Math.random() * 100);// �������� ����
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// Ŭ���� �� �� �Է�
		}
		//��º�
		System.out.printf("%23s\n","��������ǥ");
		System.out.printf("%21s %s\n","������� :",k36_sdt.format(k36_cal.getTime()));//������ڸ� ����ϱ����� ����ð��� �ҷ��´�
		System.out.println("==============================================");
		System.out.printf("%-3s %4s %4s %4s %3s %3s %3s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
		System.out.println("==============================================");
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("%03d %7s %5d %5d %5d %5d %5d\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], (int)k36_inData.k36_ave[k36_i]);
		}
		System.out.println("==============================================");
		System.out.printf("%-14s","�հ�");//�հ踦 ���ϱ� ���� �迭�� ���� �� ���Ͽ� �����Ѵ�.
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {			
			k36_korSum += k36_inData.k36_kor[k36_i];		
			k36_engSum += k36_inData.k36_eng[k36_i];		
			k36_matSum += k36_inData.k36_mat[k36_i];		
			k36_sumSum += k36_inData.k36_sum[k36_i];		
			k36_aveSum += k36_inData.k36_ave[k36_i];		
		}
		System.out.printf("%5d %5d %5d %5d %5d \n",k36_korSum,k36_engSum,k36_matSum,k36_sumSum,k36_aveSum);//��ü �հ� ���
		//�հ踦 ���� ������ �Է°���ŭ ������ ����� ���Ѵ�
		int k36_korAve = k36_korSum/k36_iPerson; 
		int k36_engAve = k36_engSum/k36_iPerson; 
		int k36_matAve = k36_matSum/k36_iPerson; 
		int k36_sumAve = k36_sumSum/k36_iPerson; 
		int k36_aveAve = k36_sumSum/k36_iPerson; 
		System.out.printf("%-14s %4d %5d %5d %5d %5d \n","���",k36_korAve,k36_engAve,k36_matAve,k36_sumAve,k36_aveAve); //��ü ��� ���
	
	}

}
