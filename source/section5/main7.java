package java220418;

public class main7 {

	public static void main(String[] args) {

		int k36_iweekDay = 5; // 1�� 1���� �ݿ��Ͽ� ���߱� ���� ������ ��������
		// �Ͽ����� 0�̱� ������ �ݿ����� 5�� �����ؾ��Ѵ�.
		int[] k36_monthEndDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // ���� ���������ڸ� ���� ������ �迭�� �����Ѵ�.
		// ���� ���������ڸ� ���� �迭�ε��� Ȱ������ k36_month�� 0���� ����
		for (int k36_month = 0; k36_month < 12; k36_month++) {// 1������ 12������ �ݺ��ϱ� ���� for���� �����Ѵ�.
			System.out.printf("\n\n%10d��\n", k36_month + 1); // ���� ���� ����Ʈ, k36_month�� 0���� �����̶� k36_month + 1 �ؾ� 1���������
			System.out.printf("======================\n");
			System.out.printf("%2s%2s%2s%2s%2s%2s%2s\n", "��", "��", "ȭ", "��", "��", "��", "��"); // ���� ����� ������ ���� 2s�� ����

			for (int k36_i = 1; k36_i <= k36_iweekDay; k36_i++) { // 1�� 1���� �ݿ��� => ���� "��" �ձ���
				System.out.printf("%3s", " "); // ��ĭ ����ؼ� ���� �����ġ �����ϱ� ���� 3 * 5 = 15ĭ ������ ����
			}

			for (int k36_i = 1; k36_i <= k36_monthEndDay[k36_month]; k36_i++) { // 1���� �� ���� ������ ���ڱ��� �ݺ��ϱ� ���� �ݺ��� ����
				System.out.printf("%3d", k36_i); // 1���� ������ ���ڱ��� ���(������ ���� 3ĭ���� ����)

				k36_iweekDay++; // ���� ��� �� + 1 => ���� ���������� + 1 = ������ ù��° ����
				if (k36_iweekDay % 7 == 0) { // �ٹٲ��� ���� 7�� ���� �� �������� 0�� ��
					System.out.printf("\n"); // �ٹٲ� ���
				}
			}
			k36_iweekDay %= 7; // ������ k36_iweekDay�� 7�� ���� ���������� ������ ���� k36_iweekDay�� �ǰ� �ʱ�ȭ�Ѵ�.
			// k36_iweekDay�� 7�� �ʰ��� �� ������ ����
		}
	}
}