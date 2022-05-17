package section7;

import java.text.DecimalFormat;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k36_df = new DecimalFormat("###,###,###"); //���ڰ��� ǥ���ϱ� ���� ���� ����
		String[] OneRec = { //�迭�� �����Ѵ�.
				"01	EF�����ʹ�          4,900  1      4,900", "02* ������������       350  10      3,600",
				"03 ����ũ ���캺       7,980  22    175,560", "04	���̺�Ƹ����      1,950  5      9,650",
				"05	TOP���ڷ���ī2        970  42     40,740", "06	�ƽ�TOP����2        970  10      9,700",
				"07	����)���ġ       4,580  12     54,960", "08	��)�Ʊ�Ҿ��       4,580  5     22,900",
				"09	���ϴ� ��Ż ��      1,200  27     32,400", "10	��ä����캺��      5,060  1      5,060",
				"11	���� �������7      1,580  1      1,580", "12	ũ��� ��äŸ       1,180  27     31,860",
				"13	ũ��� �ɰԶ�         980  6      5,880", "14	��� ��¡����       1,110  9      9,990",
				"15	ũ��ġ������L      12,500  10    125,000", "16	�Ե� ����īī       4,780  10     47,800",
				"17	�հ��人��56        980  50     49,000", "18	��귣��������      1,080  20     21,600",
				"19	��귣�����      1,080  10     10,800", "20	��귣����ɹ�      1,080  5      5,400",
				"21	�ϳ� �����30g      4,980  10     49,800", "22	���� ���ܿ��       2,650  10     26,500",
				"23	�������ڳӹ�ũ      3,330  1      3,330", "24	s�����̿�����       1,810  2      3,620",
				"25* ���������տ�     2,900  20     58,000", "26* ��Ͻ����� 900     4,280  10     42,800",
				"27* �������մٸ�      34,810  3    104,430", "28	�����Ұ�����      1,980  10     19,800",
				"29	�����Ұ��ڴ�      1,980  10     19,800", "30	�����Ұ�����      1,980  2      3,960" };
		
		for (int i = 0; i < OneRec.length; i++) {
			int countKorean = OneRec[i].getBytes().length - OneRec[i].length();	//�迭���� �޾ƿ� String���� �ѱ��� ������ �����Ѵ�.
			// ���ڿ����� ����, ����, �հ踦 �����ؼ� ���� * ���� != �հ� ���  ������ �����Ѵ�.
			if ( Integer.parseInt(k36_firstPrice(OneRec[i],countKorean)) *  Integer.parseInt(k36_productNumber(OneRec[i],countKorean)) != Integer.parseInt(k36_lastPrice(OneRec[i],countKorean))) {
			
				System.out.println("**********************************************************");
				System.out.printf("����[%s]\n",OneRec[i]);	//���� ���ڿ� ���
				// string.replace(�հ�, ����*����) �� ������
				// �հ�� ���� ������ �κ��� substring���� �ڸ��� trim�� ����Ͽ� ������ �����Ѵ�. �׷��� 10,000,000 / 75,900 ... �̷������� �߸���.
				// int ������ �ٲ� ���ݰ� ������ ���ѵ� DeciamlFormat���� 3�ڸ����� �޸� ���� String ������ �ٲ㼭 replace�� �ִ´�. 
				String k36_modified = OneRec[i].replace(OneRec[i].substring(OneRec[i].length() - OneRec[i].substring(32 - countKorean).trim().length()),
						k36_df.format(Integer.parseInt(k36_firstPrice(OneRec[i],countKorean)) * Integer.parseInt(k36_productNumber(OneRec[i],countKorean))));
				// ������ ��Ʈ�� ���
				System.out.printf("����[%s]\n",k36_modified);
				
				System.out.println("**********************************************************");
			}
		}
	}

	public static String k36_firstPrice(String k36_price, int k36_kNum) {
		// ������ ���� 19 ~ 30 (�ѱ۷� ���� 1�� 2�� ������ �κ��� �����ϱ� ����, - �ѱۼ��� �Ѵ�), ���� �޸� ����(replace),
		// ���� ����(trim)
		String k36_onlynumber = k36_price.substring(19 - k36_kNum, 30 - k36_kNum).replace(",", "").trim();
		return k36_onlynumber; // �� ����
	}

	// ������ ���� 30 ~ 32 (�ѱ۷� ���� 1�� 2�� ������ �κ��� �����ϱ� ����, - �ѱۼ��� �Ѵ�), ���� ���� ����(trim)
	public static String k36_productNumber(String k36_price, int k36_kNum) {
		String k36_onlynumber = k36_price.substring(30 - k36_kNum, 32 - k36_kNum).trim();
		return k36_onlynumber;
	}

	// ������ ���� 32 ���� (�ѱ۷� ���� 1�� 2�� ������ �κ��� �����ϱ� ����, - �ѱۼ��� �Ѵ�), ���� �޸� ����(replace), ����
	// ����(trim)
	public static String k36_lastPrice(String k36_price, int k36_kNum) {
		String k36_onlynumber = k36_price.substring(32 - k36_kNum).replace(",", "").trim();
		return k36_onlynumber;
	}
}
