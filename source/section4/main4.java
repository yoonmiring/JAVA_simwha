package java220415;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �־� ���ϱ�
		int k36_iVal; //k36_iVal�� ������ ����
		for (int i = 0; i < 300; i++) {//0���� 300���� 1�� �����ϴ� �ݺ��� ����
			k36_iVal = 5 * i;//i�� 5�� ���ؼ� k36_iVal�� �����ض�
			if (k36_iVal >= 0 && k36_iVal < 10) {//k36_iVal�� 0���� ũ�ų� ���� 10���� ������
				System.out.printf("�� %d\n", k36_iVal);//�ϰ� 5�� ����� k36_iVal�� ���ڸ� ����ض�
			} else if (k36_iVal >= 10 && k36_iVal < 100) {//k36_iVal�� 10���� ũ�ų� ���� 100���� ������
				System.out.printf("�� %d\n", k36_iVal);//�ʰ� 5�� ����� k36_iVal�� ���ڸ� ����ض�
			} else if (k36_iVal >= 100 && k36_iVal < 1000) {//k36_iVal�� 100���� ũ�ų� ���� 1000���� ������
				System.out.printf("�� %d\n", k36_iVal);//��� 5�� ����� k36_iVal�� ���ڸ� ����ض�
			} else {//�� ���� ���� ������
				System.out.printf("õ %d\n", k36_iVal);//õ�� 5�� ����� k36_iVal�� ���ڸ� ����ض�
			}
		}
	}

}
