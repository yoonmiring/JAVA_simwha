package java220415;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case�� ��
		for (int k36_i = 1; k36_i < 13; k36_i++) {// 1���� 12������ �ݺ����� �����Ѵ�
			System.out.printf("%d�� =>", k36_i);// �ݺ����� �����Ͽ� 1���� 12������ ���� ����Ѵ�.
			loop: for (int k36_j = 1; k36_j < 32; k36_j++) {// 1���� 31������ �ݺ����� �����ϸ鼭 loop�� ������ �ش�.
				System.out.printf("%d,", k36_j);// �ݺ����� �����Ͽ� ��ǥ�� ��� ����Ѵ�.

				switch (k36_i) {// 1���� 12������ �ݺ�������
				case 4:
				case 6:
				case 9:
				case 11:// 4,6,9,11�� �ش��ϰ�
					if (k36_j == 30) {// 1���� 31������ �ݺ������� 30�� �����ϸ�
						break loop; // �ݺ����� �������� loop�� �̵��Ѵ�
					}
				case 2:// 2�� �ش�Ǹ�
					if (k36_j == 28) {// 1���� 31������ �ݺ������� 28�� �����ϸ�
						break loop;// �ݺ����� �������� loop�� �̵��Ѵ�.
					}
				}

			}
			System.out.print("\n");

		}
	}
}
