package java220414;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #3. ������ ����

		int k36_ii; // k36_ii�� ���� ����
		k36_ii = 1000 / 3; // 1000�� 3���� ���� ����
		System.out.printf("#3-1 : %d\n", k36_ii);
		k36_ii = 1000 % 3;// 1000�� 3���� ���������� ������ ������
		System.out.printf("#3-2 : %d\n", k36_ii);

		// ������ ������ ����
		for (int i = 0; i < 20; i++) {// 0���� 19���� �����Ѵ�.
			System.out.printf("#3-3 : %d ", i);// 0���� 19���� ������� ����Ѵ�.

			if (((i + 1) % 5) == 0) {// 0���� 19������ +1�� �Ͽ� 1���� 20���� 5�� ������ �������� 0�� ���
				System.out.println("\n"); // ���� ����.
			}
		}
	}

}
