package java220418;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat K36_df = new DecimalFormat("###,###,###,###");// ���ڿ� �޸��� ��� ���� ���� ����
		Calendar K36_cal = Calendar.getInstance();// Ķ���� ���̺귯�� ����
		SimpleDateFormat K36_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// ���� ���� ��� ���� ����

		String K36_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";// ���⿡ �ִ� �׸��� �����۳���1 ���ڿ��� ����
		String K36_itemcode1 = "1031615";// ���⿡ �ִ� �׸��� �ڵ带 �������ڵ�1 ���ڿ��� ����
		int K36_price1 = 3000;// ������ 1�� ������ ���������� ����
		int K36_amount1 = 2;// ������ 1�� ���� ������ ���������� ����
		String K36_itemname2 = "�����̵�ĸ���(������)(100ȣ)";// ���⿡ �ִ� �׸��� �����۳���2 ���ڿ��� ����
		String K36_itemcode2 = "1008152";// ���⿡ �ִ� �׸��� �ڵ带 �������ڵ�2 ���ڿ��� ����
		int K36_price2 = 1000;// ������ 2�� ������ ���������� ����
		int K36_amount2 = 1;// ������ 2�� ���� ������ ���������� ����
		String K36_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";// ���⿡ �ִ� �׸��� �����۳���3 ���ڿ��� ����
		String K36_itemcode3 = "1020800";// ���⿡ �ִ� �׸��� �ڵ带 �������ڵ�3 ���ڿ��� ����
		int K36_price3 = 1000;// ������3�� ������ ���������� ����
		int K36_amount3 = 1;// ������3�� ���� ������ ���������� ����

		// �� �����ۺ� ���ݰ� ������ ���� �� ���Ͽ� ������ �� ���� ����
		int K36_iPrice = K36_price1 * K36_amount1 + K36_price2 * K36_amount2 + K36_price3 * K36_amount3;
		double K36_taxRate = 0.1;// ������ �Ǽ������� ����
		int K36_netPrice = (int) (K36_iPrice / (1 + K36_taxRate) + 0.5);// ���� �հ踦 ���ϱ� ���� �� ���ݿ��� ������ ������ ���

		System.out.printf("%12s %-20s\n", " ", "\"���ΰ���, ���̼�\"");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ: 031-702-6016\n");
		System.out.printf("����: ���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ: ������,��ȣ�� 213-81-52063\n");
		System.out.printf("%s\n", "����: ��� ������ �д籸 �д�� 53���� 11 (����");
		System.out.printf("%s\n", "��)");
		System.out.printf("================================================\n");
		System.out.printf("%8s %s", " ", "�Һ����߽ɰ濵(CCM)�������\n");
		System.out.printf("%5s %s", " ", "ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("================================================\n");
		System.out.printf("%8s %s", " ", "��ȯ/ȯ�� 14��(03��12��)�̳�,\n");
		System.out.printf("%s", "(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("%6s %s", " ", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("%8s %s", " ", "üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("================================================\n");
		System.out.printf("%-28s %s\n", "[POS 1058231]", K36_sdt.format(K36_cal.getTime()));// ����ð��� ���˿� ���� ���
		System.out.printf("================================================\n");
		System.out.printf("%s %7s %3d %8s\n", k36_subStrByte(K36_itemname1, 26), K36_df.format(K36_price1), K36_amount1,
				K36_df.format(K36_price1*K36_amount1));// ������ ������1 �̸��� ����ũ�⸸ŭ �ڸ��� ���ݰ� ���� ������ ���
		System.out.printf("[%s]\n", K36_itemcode1);// �ڵ嵵 ���
		System.out.printf("%s %7s %3d %8s\n", k36_subStrByte(K36_itemname2, 26), K36_df.format(K36_price2), K36_amount2,
				K36_df.format(K36_price2*K36_amount2));// ������ ������2 �̸��� ����ũ�⸸ŭ �ڸ��� ���ݰ� ���� ������ ���
		System.out.printf("[%s]\n", K36_itemcode2);// �ڵ嵵 ���
		System.out.printf("%s %7s %3d %8s\n", k36_subStrByte(K36_itemname3, 26), K36_df.format(K36_price3), K36_amount3,
				K36_df.format(K36_price3*K36_amount3));// ������ ������3 �̸��� ����ũ�⸸ŭ �ڸ��� ���ݰ� ���� ������ ���
		System.out.printf("[%s]\n", K36_itemcode3);// �ڵ嵵 ���
		System.out.printf("%10s %8s %24s\n", "", "�����հ�", K36_df.format(K36_netPrice));// ���� �����հ踦 �ҷ��� ����Ѵ�.
		System.out.printf("%11s %8s %24s\n", "", "�ΰ���", K36_df.format(K36_iPrice - K36_netPrice));// ��ü�ݾ׿��� �����ݾ��� �� �ΰ�����
																									// ����Ѵ�.
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%-10s %8s %24s\n", "�Ǹ��հ�", "", K36_df.format(K36_iPrice));// �� ������ ����Ѵ�.
		System.out.printf("================================================\n");
		System.out.printf("%-10s %8s %24s\n", "�ſ�ī��", "", K36_df.format(K36_iPrice));// ī�带 ������ �� ������ ����Ѵ�.
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%-10s %9s %24s", "�츮ī��", "", "538720**********\n");
		System.out.printf("%-10s %6s %10s %s\n", "���ι�ȣ 70404427(0)", "", "���αݾ�", K36_df.format(K36_iPrice));// ���αݾ��� ��
																											// ������ ����Ѵ�.
		System.out.printf("================================================\n");
		System.out.printf("%8s %s �д缭����\n", " ", K36_sdt.format(K36_cal.getTime()));// ���糯¥�� ����Ѵ�.
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ����:1599-2211\n");
		System.out.printf("%10s %s", " ", "���������� �������� ���������� ����������\n");
		System.out.printf("%10s %s", " ", "���������� �������� ���������� ����������\n");
		System.out.printf("%12s %s", " ", "2112820610158231\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż� \n  ȸ������ �� �پ��� ������ ����������! ��\n");
	}

	// ���ϴ� �ѱ� ����Ʈ ũ�⸦ �߶��ִ� �޼��� �Լ��� ����
	public static String k36_subStrByte(String k36_source, int k36_cutLength) {
		if (!k36_source.isEmpty()) {// ���ڿ��� ���� ������� �ʰ�
			k36_source = k36_source.trim();// ���ڿ��� �¿쿡 �ִ� ��ĭ�� ��������(��� ������ ������������)
			if (k36_source.getBytes().length < k36_cutLength) {// ������ �� ��ŭ ������ ���ڿ��� ����Ʈ�� �޾Ƽ� ���̺��� �������.
				for (int k36_i = k36_cutLength - k36_source.getBytes().length; k36_i > 0; k36_i--) {// ������ ������ ����Ʈ�� ���̸�
																									// �� �� ��ŭ �ݺ����� ������.
					k36_source += " ";// �ݺ�����ŭ ����Ѵ�.
				}
				return k36_source;// ���ϰ��� k36_source�� �ش�.
			} else {// ������ �� ��ŭ ������ ���ڿ��� ����Ʈ�� �޾Ƽ� ���̺��� ���� ���� ���
				StringBuffer k36_sb = new StringBuffer(k36_cutLength);// ���ڿ��� �߰��ϴ� ������ �����Ѵ�.
				int k36_cnt = 0;// �������� 0���� �ʱ�ȭ �Ͽ�
				for (char k36_ch : k36_source.toCharArray()) {// for-each���� ����Ͽ� �ݺ����� �����Ͽ� k36_source�� �ִ� ���� char������ �ٲ�
																// �� �ݺ��Ѵ�.
					k36_cnt += String.valueOf(k36_ch).getBytes().length;// k36_ch�� ����Ʈ ������ �����鼭 ���̸�ŭ �����Ͽ� �־�д�
					if (k36_cnt > k36_cutLength) {// ����k36_cnt���� ������ k36_cutLength���� ũ�ٸ�
						break;// �ݺ����� �������´�.
					}
					k36_sb.append(k36_ch);// k36_sb���� k36_ch�� �߰��Ͽ� �ڿ� ���δ�.
				}

				if (k36_sb.toString().getBytes().length == 26) {// ���� k36_sb�� ���ڿ��� ������ ����Ʈ ���� ���̰� 26�� ���
					k36_sb.append(" ");// ������ ���δ�.
				}

				return k36_sb.toString();// k36_sb�� ���ڿ��� ���ϰ����� �ش�
			}
		} else {// ���ڿ��� ���� �����������
			return "";// ���ϰ��� �������� �����ش�.
		}
	}

}
