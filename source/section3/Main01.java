package java220414;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܼ� ���� ���
		int k36_val = 271; // ������ ���� ��
		int k36_rate = 3; // ���� 3%

		int k36_tax = taxcal(k36_val, k36_rate); // taxcal�� �Լ��� �ҷ��� k36_tax������ ������ �ִ´�.

		System.out.printf("*****************************************\n");
		System.out.printf("*            �ܼ� ���� ���             *\n");
		System.out.printf("���� ���ݰ��: %f\n", k36_val * k36_rate / 100.0);// ������ ���� ���� ������ ���ϰ� 100�� ������ �Ǽ������� ����Ѵ�.
		System.out.printf("���� ����: %d ���� : %d �����԰���: %d\n", k36_val, k36_tax, k36_val + k36_tax);// ��������, ����, �������԰�����
																								// ����Ѵ�.
		System.out.printf("*****************************************\n");
	}

	public static int taxcal(int k36_val, int k36_rate) {
		int k36_ret; // ������k36_ret�� �����Ѵ�.
		if (((double) k36_val * (double) k36_rate / 100.0) == k36_val * k36_rate / 100) {// ������ ���ǰ��� ������ ���� �� 100����
																							// ���������� ������ �������� �Ǽ������� ����
																							// ���� ���´ٸ�
			k36_ret = k36_val * k36_rate / 100;// ������ ���ǰ��� ������ ���� �� 100���� ���� ���� ret���� ����ϰ�
		} else {// �������� �Ǽ����� ���� �ٸ��ٸ�
			k36_ret = k36_val * k36_rate / 100 + 1; // ������ ���ǰ��� ������ ���� �� 100���� �������� 1�� ���Ͽ� ����� ��
		}
		return k36_ret; // k36_ret���� ���ϰ��� �ش�

	}
}
