package section7;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("�ѱ�aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d] ��\n", HanCount("�ѱ��ѱ�aa"));
	}

	private static int HanCount(String string) {
		// TODO Auto-generated method stub
		int num=string.getBytes().length-string.length();
		return num;
	}

	private static String HanBlankBackword(String string, int i) {

		for (int k36_i = i - string.getBytes().length; k36_i > 0; k36_i--) {// ������ ������ ����Ʈ�� ���̸�
																			// �� �� ��ŭ �ݺ����� ������.
			string += " ";// �ݺ�����ŭ ����Ѵ�.
		}
		return string;

	}

	private static Object HanBlankForeword(String string, int i) {
		// TODO Auto-generated method stub
		for (int k36_i = i - string.getBytes().length; k36_i > 0; k36_i--) {// ������ ������ ����Ʈ�� ���̸�
			// �� �� ��ŭ �ݺ����� ������.
			string = " " + string;// �ݺ�����ŭ ����Ѵ�.
		}
		return string;

	}

}
