package java220418;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �μ�(2)
		for (int k36_i = 1; k36_i < 4; k36_i++) {// �������� ���η� ����ϱ� ���� 3���� �ݺ��Ѵ�.
			System.out.printf("************\t************\t************\n");
			// ������ ���ʿ��� ���������� 3�� �����ϱ� ������ 3�� �����ϵ��� ����Ѵ�.
			System.out.printf("������ %d ��\t������ %d ��\t������ %d ��\n", k36_i, k36_i + 3, k36_i + 6);
			System.out.printf("************\t************\t************\n");
			for (int k36_j = 1; k36_j < 10; k36_j++) { // ������ ����� ���� 1���� 9���� �ݺ��Ѵ�.
				int k36_sum = k36_i * k36_j;// ������ ����� ����
				System.out.printf("%d * %d = %d\t", k36_i, k36_j, k36_sum);
				k36_sum = (k36_i + 3) * k36_j;// ex)1�ܿ��� 4������ �������ؼ� 3�� ���ؾ� �Ѵ�.
				System.out.printf("%d * %d = %d\t", k36_i + 3, k36_j, k36_sum);// ������ ���
				k36_sum = (k36_i + 6) * k36_j;// ex)1�ܿ��� 7������ �������ؼ� 6�� ���ؾ� �Ѵ�.
				System.out.printf("%d * %d = %d\n", k36_i + 6, k36_j, k36_sum);// ������ ���
			}
		}
	}

}
