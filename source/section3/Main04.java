package java220414;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���糯¥, �ð� ���

		Calendar k36_calt = Calendar.getInstance(); // ���� �ð��� ����ִ� ������ ����ϱ� ����
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// ���� �������� �ְ� ������ �����Ѵ�.
		int k36_MyWon = 1000000; // ȯ���ؾ� �� ��ȭ
		double k36_MoneyEx = 1238.21;// �޷�ȯ��
		double k36_commission = 0.003;// ȯ�� ������ 0.3%

		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);// ȯ�� ���� �޷����� ���������� ����

		double k36_ComPerOne = k36_MoneyEx * k36_commission;// �޷��� �������� ���� �Ǽ������� ����

		int k36_i_totalcom;// �� �������� �� �Ǽ����� ���������� �����ϱ� ���� ����
		k36_usd = (int) (k36_MyWon / (k36_MoneyEx + k36_ComPerOne));// ȯ���ؾ� �� �޷� ���
		double k36_totalcom = k36_usd * k36_ComPerOne;// �޷��� �������� ���� �Ǽ������� ����

		if (k36_totalcom != (double) ((int) k36_totalcom)) {// ������ �Ǽ����� ���� ������ ���������� ��ȯ �� �ٽ� �Ǽ������� ��ȯ�������� ���� ���� ������
			k36_i_totalcom = (int) k36_totalcom + 1;// �����ᰪ(������) �� 1�� ���Ͽ� �� �������� ���� �����Ѵ�.
		} else {// �װ��� �ƴ϶��
			k36_i_totalcom = (int) k36_totalcom;// ������ ��(������)�� �״�� �� ������ ������ ����
		}
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###,###");// �޸� ���� ������ ���� ���� ����
		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                                 �޸����                                      *\n");
		System.out.printf("�� ������ : %s�� => ��ȭ:%s �޷�, �޷��� ������ : %f��\n", k36_df.format(k36_i_totalcom),
				k36_df.format(k36_usd), k36_ComPerOne);
		// ��� 1000���� �̻��� ���ڰ��� �޸��� �������� ����
		int k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx - k36_i_totalcom);// ȯ���ؾ��� ��ȭ���� ȯ���� ��ȭ�� �޷�ȯ���� ���ؼ� ���ְ�
																					// �������� ���� ���� ��Ű�� �ܵ��� ���� ��µȴ�.
		System.out.printf("�� ��ȭȯ���ݾ� : %s �� => ��ȭ: %s �޷�, ������¡��:%s�� �ܵ�:%s��\n", k36_df.format(k36_MyWon),
				k36_df.format(k36_usd), k36_df.format(k36_i_totalcom), k36_df.format(k36_remain));
		// ��� 1000���� �̻��� ���ڰ��� �޸��� �������� ����
		System.out.printf("��������ð� : %s \n", k36_sdt.format(k36_calt.getTime()));// ������ �ð����� �ִ� ������ �����Ͽ��� ������ ����ð��� ������ִ�
																				// ������ ���
		System.out.printf("*********************************************************************************\n");
	}

}
