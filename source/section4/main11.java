package java220415;

public class main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �б� ���
		long k36_iNumVal = 3230056007l;// int�� �����ϸ� 20�� �̻��� ���ڰ� ����� ���� ���� �� �ֱ� ������ long���� ���� �Ѵ�.
		String k36_sNumVal = String.valueOf(k36_iNumVal);//long���� ������ ���ڰ��� k36_sNumVal���ڿ��� ��ȯ�Ѵ�
		String k36_sNumVoice = "";//k36_sNumVoice ���ڿ� �����Ѵ�.
		System.out.printf("==> %s [%d�ڸ�]\n", k36_sNumVal, k36_sNumVal.length());//
		int k36_i, k36_j;

		String[] k36_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };// units�迭�� �����ڸ� ���ڵ��� �־��ش�.
		String[] k36_unitX = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };// unitX�迭�� �� �ڸ��� �������� �־��ش�.

		k36_i = 0;
		k36_j = k36_sNumVal.length() - 1;

		while (true) {
			if (k36_i >= k36_sNumVal.length()) {
				break;
			}
			System.out.printf("%s[%s]", k36_sNumVal.substring(k36_i, k36_i + 1),
					k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i + 1))]);

			if (k36_sNumVal.substring(k36_i, k36_i + 1).equals("0")) {
				if (k36_unitX[k36_j].equals("��") || k36_unitX[k36_j].equals("��")) {
					k36_sNumVoice = k36_sNumVoice + "" + k36_unitX[k36_j];
					if(k36_sNumVal.substring(k36_sNumVal.length()-8,k36_sNumVal.length()-4).equals("0000")) {
						k36_sNumVoice = k36_sNumVoice.replace("��", "");
					}
				} else {

				}
			} else {
				k36_sNumVoice = k36_sNumVoice + k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i + 1))]
						+ k36_unitX[k36_j];
			}
			k36_i++;
			k36_j--;
		}
		System.out.printf("\n %s[%s]\n", k36_sNumVal, k36_sNumVoice);
	}
}
