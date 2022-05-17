package section7;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] OneRec = {
				"���������з�,��������ߺз�,�������,���Ǽ�,����ڼ�,�߻��ڼ�,����ڼ�,�λ�Ű��ڼ�",
				"������,Ⱦ����,Ⱦ����,13147,520,6417,6617,517",
				"������,����������,����������,3702,195,1423,2022,209",
				"������,�氡���ڸ�����������,�氡���ڸ�����������,2079,40,591,1371,160",
				"������,����������,����������,2015,26,707,1260,129",
				"������,��Ÿ,��Ÿ,15278,288,5195,9290,1272",
				"������,�����浹,�����浹,7494,181,3657,8468,677",
				"������,�����浹,�����浹,74742,441,19893,88838,6945",
				"������,�������浹,�������浹,3253,4,297,4003,154",
				"������,�ߵ�,�ߵ�,32993,370,7924,48345,3172",
				"������,��Ÿ,��Ÿ,46070,303,11000,50973,4764",
				"�����ܵ�,����,����,1108,90,412,466,281",
				"�����ܵ�,����,����,178,26,81,98,32",
				"�����ܵ�,���۹��浹,���۹��浹,3233,340,1376,1745,668",
				"�����ܵ�,��/�������� �浹,��/�������� �浹,19,4,8,8,1",
				"�����ܵ�,������Ż,������Ż �߶�,413,92,185,203,46",
				"�����ܵ�,������Ż,������Ż ��Ÿ,199,30,113,113,24",
				"�����ܵ�,��Ÿ,��Ÿ,3728,130,1285,2213,543",
				"ö��ǳθ�,ö��ǳθ�,ö��ǳθ�,3,1,0,3,0"

		};

		String[] field_name = OneRec[0].split(",");
		for (int i = 1; i < OneRec.length; i++) {
			
			String[] field = OneRec[i].split(",");
			System.out.println("*********************");
			System.out.printf(" %s : %s\n", field_name[0], 	field[0]);	
			
			for (int j = 3; j < field_name.length; j++) {

				System.out.printf(" %s : %s\n", field_name[j], 	k37_numberRead(field[j]));
			}
			
			System.out.println("*********************");
		}
		
	}
	
	public static String k37_numberRead (String k37_text) {
		String[] k37_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // ���ڿ� �迭 units ���� �� �ʱ�ȭ
		String[] k37_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; // ���ڿ� �迭 unitX ���� �� �ʱ�ȭ
		String k37_sNumVoice = "";
		int k37_i = 0; // ���� i�� 0���� �ʱ�ȭ
		int k37_j = k37_text.length() - 1; // ���� j�� sNumVal�� ���� - 1�� �ʱ�ȭ > �迭�� 0��°���� �����ϱ� ����
		
		while (true) { // ���� �ݺ���
			if (k37_i >= k37_text.length()) // ���� i�� sNumVal.length()���� ���ų� Ŭ ��
				break; // �ݺ����� �ߴ��ϰ� �������� �Ѿ��
			
			if (k37_text.substring(k37_i, k37_i + 1).equals("0")) { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �� (if��) (.equals > ���ڿ� ���� �� �� Ȯ�ν� ���)
				if (k37_text.length() <= 8) {
					k37_sNumVoice = k37_sNumVoice // sNumVoice�� sNumVoice +
							+ k37_units[Integer.parseInt(k37_text.substring(k37_i, k37_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
							+ k37_unitX[k37_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
				} else {
					if (k37_text.substring(k37_text.length() - 8, k37_text.length() - 4).equals("0000")
							&& k37_unitX[k37_j].equals("��")) {
						// sNumVal�� ����-8 ���� sNumVal�� ����-4������ sNumVal���� �ڸ��� �װ��� 0000�̰� �迭 unitX[j] �� "��"�̸� �ƹ� �͵� ���� �ʴ´�.
					} else if (k37_unitX[k37_j].equals("��") || k37_unitX[k37_j].equals("��")) { // ���� ������ false�̰� unitX[j]�� "��" �Ǵ� "��"�̸� (||�� �Ǵ� �ǹ�)
						k37_sNumVoice = k37_sNumVoice + "" + k37_unitX[k37_j]; // sNumVoice�� sNumVoice + "" + unitX[j]�� ����
					}
				}

			} else { // sNumVal�� i���� i+1��ŭ �ڸ� ���� 0�� �ƴϸ�
				k37_sNumVoice = k37_sNumVoice // sNumVoice�� sNumVoice +
						+ k37_units[Integer.parseInt(k37_text.substring(k37_i, k37_i + 1))] // sNumVal�� i���� i+1��ū �ڸ� ���ڿ��� ������ ��ȯ ��(Integer.parseInt()Ȱ��)																								
						+ k37_unitX[k37_j]; // + unitX[j]�� �����Ѵ� // String �迭 units�� ��ġ�� �ִ� ���ڸ� ���
			}
			k37_i++; // ���� i�� 1��ŭ ����
			k37_j--; // ���� j�� 1��ŭ ����

		}
		
		
		return k37_sNumVoice;
	}
	
}
