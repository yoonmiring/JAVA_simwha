package java220415;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k36_n, k36_m;//k36_n, k36_m�� ������ ����
		k36_m = 20;//k36_m�� 20�� ����
		k36_n = 1;//k36_n�� 1�� ����
		while (true) {//while���� �������� �ݺ��Ѵ�.
			for (int k36_i = 0; k36_i < k36_m; k36_i++) {//for�ݺ������� k36_i�� ���� k36_m�� ���� �����Ҷ�����
				System.out.printf(" ");//���⸦ �����Ѵ�.(�� 20���� 1�� �����ϴ� ���·� ����)
			}
			for (int k36_i = 0; k36_i < k36_n; k36_i++) {//for �ݺ������� k36_i�� ���� k36_n�� ���� �����Ҷ�����
				System.out.printf("*");//���� ����ش�.(�� 1���� 2�� �����ϴ� ���·� ����)
			}
			System.out.printf("\n");//for���� ������ ���ٶ���

			k36_m = k36_m - 1;//k36_m�� ���� 1�� �پ���
			k36_n = k36_n + 2;//k36_n�� ���� 2�� �����Ѵ�.

			if (k36_m < 0) {//k36_m�� ���� 0 ���ϸ�
				break;//while�ݺ����� �������´�.
			}
		}
	}

}
