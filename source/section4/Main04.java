package java220415;

import java.text.DecimalFormat;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ĭ ���� �μ�
		String k36_item = "���";//k36_item�� ������ ���ڿ� ����
		int k36_unit_price = 5000;//k36_unit_price�� 5000 ������ ����
		int k36_num = 500;//k36_num�� 500 ������ ����
		int k36_total = 0;//k36_total �� ������ ���� �� 0���� �ʱ�ȭ

		DecimalFormat k36_df = new DecimalFormat("###,###,###,###,###"); //������ ������� ���� ����

		System.out.printf("=============================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");//ǰ��, �ܰ�,����, �հ� ����� ����ϱ� ���� ���ڿ��� ����
		System.out.printf("=============================================================\n");

		System.out.printf("%20.20s%10.10s%10.10s%15.15s\n", k36_item, k36_df.format(k36_unit_price), k36_df.format(k36_num),
				k36_df.format(k36_unit_price * k36_num));//ǰ��,�ܰ�,�հ����� ���� ������� ������ �����Ͽ� ���

		System.out.printf("=============================================================\n");
	}

}
