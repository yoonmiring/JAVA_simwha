package java220418;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###");// ���ڿ� �޸��� ��� ���� ���� ����
		Calendar k36_cal = Calendar.getInstance();// Ķ���� ���̺귯�� ����
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");// ���� ���� ��� ���� ����
		SimpleDateFormat k36_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// �����ð� ��� ���� ����
		SimpleDateFormat k36_sdt3 = new SimpleDateFormat("YYYYMMdd");// ���ڵ� ������ ���� ��� ���˼���
		String[] k36_itemname = { "EF�����ʹ�", "��������������20L", "����ũ ���캺����840", "���̺�Ƹ���޺�����", "TOP���ڷ���ī275ml",
				"�ƽ�TOP������275ML", "����)���ġ��180g", "��)�Ʊ�Ҿ���Step2", "���ϴ� ��Ż ������", "��ä����캺����450g", "���� �������70g",
				"ũ��� ��äŸ�� 70g", "ũ��� �ɰԶ� 70g", "��� ��¡���� 83g", "ũ��ġ������L", "�Ե� ����īī��374g", "�հ����人��56g", "��귣��������180g",
				"��귣������180g", "��귣����ɹͽ�180g", "�ϳ� �����30g", "���� ���ܿ������700g", "�������ڳӹ�ũ400ml", "s�����̿����̺�80ml*5",
				"���������տ���125ml", "��Ͻ����� 900ml*2", "�������մٸ�", "�����Ұ����ڻ�������Ĩ", "�����Ұ��ڴ�ȣ��", "�����Ұ����ڻ�������Ĩ", "���������� 370*2",
				"�ٻ���ġŲ�ʰ�66", "iPad Air(4����) 64GB �ǹ� ��������(MYFN2KH/A)", "���� Apple Pencil 2����(MU8F2KH/A)",
				" iPad(7����) �� iPad Air(3����)�� Smart Keyboard - �ѱ���(MX3L2KH/A)", "���� 71765 ���� ��Ʈ�� �޺� �κ� [���ڰ�] ���� ����",
				"���� 10970 �ҹ漭�� �︮���� [���÷�] ���� ����", "ä������ �淮 ���ٿ� �̺� �� 200x230cm 500g",
				"[����ġ�׷��ڸ��� ��ǰ] �ٷ�ÿ�� ���̵�25 M0390071104600", "���� �������� ���� ������Ŷ 12609",
				"����� ST-z �����̿�� (����Ʈ���� / 3 / 5 / ����Ʈ R,SR,S����)" };// ������ �迭�� �־��ش�*/
		int[] k36_price = { 4900, 350, 7980, 1950, 970, 970, 4580, 4580, 1200, 5060, 1580, 1180, 980, 1110, 12500,
				4780, 980, 1080, 1080, 1080, 4980, 2650, 3330, 1810, 2900, 4280, 34810, 1980, 1980, 1980, 8480, 5480,
				755630, 160050, 193030, 95900, 103900, 963000, 999000, 950000, 209000 };// ���� �迭�� �־��ش�*/
		int[] k36_num = { 1,10, 22, 5, 42, 10, 12, 5, 27, 1, 1, 27, 6, 9, 10, 10, 50, 20, 10, 5, 10, 10, 1, 2, 20, 10,
				3, 10, 10, 2, 1, 3, 2, 1, 15, 1, 1, 1, 1, 3, 4 };// �ֹ� ���� ���� �迭�� �־��ش�.*/
		boolean[] k36_taxfree = { false,true, false, false, false, false, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, true, true, true,
				false, false, false, false, false, false, false, false, false, false, false, false, false, false };// �鼼����
																													// Ȯ��
																													// �迭��
																													// �־��ش�.*/

		double k36_taxfreeSum = 0;// �鼼 ��ǰ�� ���� ���ϱ� ���� �Ǽ������� �����Ѵ�.
		int k36_iPrice = 0;// �� �ݾ��� ���ϱ� ���� ���������� �����Ѵ�.
		double k36_taxRate = 0.1;// ���� ������ �Ǽ������� �����ϰ� 0.1���� �����Ѵ�.
		int k36_sumiPrice = 0;// �鼼 ǰ���� ���� ���������� �����Ѵ�
		int k36_point = 32500;// ����Ʈ�� ���������� ����
		int k36_posNum1 = 11;// ���� �ѹ� ���ڸ� �κ��� ���������� ����
		int k36_posNum2 = 9861;// ���� �ѹ� ���ڸ� �κ��� ���������� ����
		System.out.printf("%13s %-1s\n", " ", "�̸�Ʈ ������ (031)688-1234");
		System.out.printf("%-10s %-1s\n", "�̸�Ʈ ", "206-86-50913 ����");
		System.out.printf("%13s %-1s\n", " ", "���� ������ ������� 552");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż� 7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[����]%s %9s%04d-%d\n", k36_sdt.format(k36_cal.getTime()), "POS:", k36_posNum1, k36_posNum2);// ����ð���
																														// �����ѹ���
																														// �����Ͽ�
																														// ����Ѵ�.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%2s %7s %8s %3s %8s\n", " ", "�� ǰ ��", "�� ��", "����", "�� ��");

		System.out.printf("-----------------------------------------\n");
		for (int k36_i = 0; k36_i < k36_itemname.length; k36_i++) {// �迭�� ������ ������ ���� ǰ���̸��� �迭 ��ŭ �ݺ����� ������.
			if (k36_taxfree[k36_i] == true) {// ���� �鼼 ������ ���� true�� ���
				k36_taxfreeSum += k36_price[k36_i] * k36_num[k36_i];// �鼼 ��ǰ�� ���� ���Ѵ�.(�鼼�� ����*����)
				System.out.printf("%-2s", "*");// ��ǰ�տ� *ǥ�ø� ���ش�.
			} else {// �鼼 ������ ���� false�� ���
				k36_sumiPrice += k36_price[k36_i] * k36_num[k36_i];// �鼼ǰ���� �ƴ� ������ ���� ���Ѵ�.
				System.out.printf("%-2s", " ");// ��ǰ �տ� �������� ǥ�����ش�.
			}
			k36_iPrice += k36_price[k36_i] * k36_num[k36_i];// �� �ݾ��� ����*������ ���� ���� ���Ѵ�.

			System.out.printf("%s %s", k36_subStrByte(k36_itemname[k36_i], 14), "");// ��ǰ�� ���̸� 14�� �߶� ��ġ�� �־��ش�.
			System.out.printf("%10s %2s %10s\n", k36_df.format(k36_price[k36_i]), k36_num[k36_i],
					k36_df.format(k36_price[k36_i] * k36_num[k36_i]));// �� ���� �ܰ� ���� �ݾ��� ���� �ֱ� ���� �ڸ��� ��ġ���ش�.

			if ((k36_i + 1) % 5 == 0) {// ���� 5��° ���� ���� �ؿ� ���� �־��ش�.
				System.out.printf("-----------------------------------------\n");
			}
		}
		int k36_sum = (int) (k36_iPrice - k36_taxfreeSum);// �� �ݾ׿��� �鼼 ��ǰ�� ���� ���־� ������ǰ(+�ΰ���) ������ ���� ���������� ���Ѵ�.
		int k36_netPrice = (int) (k36_sum / (1 + k36_taxRate));// ������ǰ(+�ΰ���)�� �տ��� ���ݺ����� +1�� �Ͽ� �������ָ� ���� ��ǰ�� ���� ���´�.
		System.out.printf("\n");
		System.out.printf("%14s %s %13s\n", " ", "�� ǰ�� ����", k36_df.format(k36_itemname.length));// �� ǰ���� ������ ���ϱ� ����
																								// �����۹迭�� ���̸� �־��ش�.
		System.out.printf("%11s %s %13s\n", " ", "(*)�� ��  �� ǰ", k36_df.format(k36_taxfreeSum));// �鼼��ǰ�� ���� �޸������� �־�
																								// ����Ѵ�.
		System.out.printf("%14s %s %13s\n", " ", "�� ��  �� ǰ", k36_df.format(k36_netPrice));// ������ǰ�� ���� �޸������� �־� ����Ѵ�.
		System.out.printf("%14s %s %13s\n", " ", "��   ��   ��", k36_df.format(k36_sumiPrice - k36_netPrice));// �ΰ����� ����
																											// �޸������� �־�
																											// ����Ѵ�.
		System.out.printf("%14s %s %13s\n", " ", "��        ��", k36_df.format(k36_iPrice));// �հ��� ���� �޸������� �־� ����Ѵ�.
		System.out.printf("%-1s %11s %11s\n", "�� �� �� �� �� ��", " ", k36_df.format(k36_iPrice));// �հ��� ���� �޸������� �־� ����Ѵ�.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-15s %1s %12s\n", "0012 KEB �ϳ�", "", "541707**0484/35860658");
		System.out.printf("%-18s�Ͻú� /%11s\n", "ī�����(IC)", k36_df.format(k36_iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%9s %s \n", " ", "[�ż�������Ʈ ����]");
		System.out.printf("��*�� �������� ����Ʈ ��Ȳ�Դϴ�. \n");
		System.out.printf("%-10s %15s %7s\n", "��ȸ�߻�����Ʈ", "9350**9995", k36_df.format(k36_iPrice / 1000));// �� �հ迡�� 1000��
																											// ������
																											// ����Ʈ������
																											// �����Ѵ�.
		System.out.printf("%-10s %14s( %6s)\n", "����(����)����Ʈ", k36_df.format(k36_point), // �������� ����Ʈ����
				k36_df.format(k36_point - (k36_iPrice / 1000)));// ����Ʈ���� ���������� ���� �հ���1000�� ���� ���� �� ��������Ʈ�� ����Ѵ�.
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n ");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4s %s \n", " ", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%s %21s %s\n", "������ȣ :", "", "52��****");
		k36_cal.add(Calendar.HOUR, -2);// �����ð��� 2�ð� ������ �����Ͽ�
		System.out.printf("%s %10s %s\n", "�����ð� :", "", k36_sdt2.format(k36_cal.getTime()));// �����ð��� ����Ѵ�.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��OO                     1150\n");
		System.out.printf("%4s%-20s\n", "", "���������� �������� ���������� ���������� ���������� ����������");
		System.out.printf("%4s%-20s\n", "", "���������� �������� ���������� ���������� ���������� ����������");
		System.out.printf("%7s%-8s/%04d%4d/%08d/%2d\n", "", k36_sdt3.format(k36_cal.getTime()), k36_posNum1,
				k36_posNum2, k36_iPrice, k36_itemname.length);// ������ �Ʒ��� ��¥�� �����ѹ� �����ݾ� ǰ������� �־� ���ڵ� ��ȣ�� ������ش�.

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