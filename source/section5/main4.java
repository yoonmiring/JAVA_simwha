package java220418;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k36_iPrice = 33000;// �ֹ��հ� �� ���������� ����
		double k36_taxRate = 0.1;// ���� ������ ���� �Ǽ��� ����
		int k36_netPrice = (int) (k36_iPrice / (1 + k36_taxRate) + 0.5);// ������ �����ؼ� ���� �հ踦 ���� 0.5�� ���� �ݿø� ��Ŵ
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###");// �ݾ׿� �޸��� ������� ���� ����
		Calendar k36_cal = Calendar.getInstance();// ���� ��¥�� ��� ���� Ķ���� ����
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// ���� ��¥�� �ð��� ������ ��������
		System.out.printf("�ſ����\n");
		System.out.printf("�ܸ��� : 2N68665898          ��ǥ��ȣ : 041218\n");
		System.out.printf("������ : �Ѿ��ġ�\n");
		System.out.printf("��  �� : ��� ������ �д籸 Ȳ�����351���� 10,\n1��\n");
		System.out.printf("��ǥ�� : ��â��\n");
		System.out.printf("����� : 752-53-00558            TEL : 7055695\n");
		System.out.printf("-----------------------------------------------\n");
		// ���� �޸� ���� ���� �� ���� �հ� �ݾ��� ���
		System.out.printf("��  ��                                 %s��\n", k36_df.format(k36_netPrice));
		// ���� �޸� ���� ���� �� �� �հ迡�� ���� �հ踦 �� �ΰ����� ���
		System.out.printf("�ΰ���                                  %s��\n", k36_df.format(k36_iPrice - k36_netPrice));
		System.out.printf("��  ��                                 %s��\n", k36_df.format(k36_iPrice));// �� �հ踦 ����
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S)       �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", k36_sdt.format(k36_cal.getTime()));// ���� �ð��� ����
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī���      ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("               * �����մϴ� *\n");
		System.out.printf("                             ǥ��v2.08-20200212\n");

	}

}
