package java220418;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k36_i = 1; k36_i < 10; k36_i = k36_i + 3) {// 1�ܺ��� 9�ܱ��� �ݺ����� ������ ����
			System.out.printf("***********\t***********\t***********\n");
			System.out.printf("������ %d ��\t������ %d ��\t������ %d ��\n", k36_i, k36_i + 1, k36_i + 2);// ���η� 1�������ϱ� ������ +1�� �Ѵ�.
			System.out.printf("***********\t***********\t***********\n");
			for (int k36_j = 1; k36_j < 10; k36_j++) {// �� �������� ����� ���� �ݺ����� �ѹ� �� �����ش�.
				int k36_sum = k36_i * k36_j;// ���� ���� ��� ����
				System.out.printf("%d * %d = %d\t", k36_i, k36_j, k36_sum);// ���� ���� ���� ���
				k36_sum = (k36_i + 1) * k36_j;// �߰� ��� ����
				System.out.printf("%d * %d = %d\t", k36_i + 1, k36_j, k36_sum);// �߰� ���� ���
				k36_sum = (k36_i + 2) * k36_j;// ���� ������ ��� ����
				System.out.printf("%d * %d = %d\n", k36_i + 2, k36_j, k36_sum);// ���� ������ ���� ���
			}
		}
	}

}
