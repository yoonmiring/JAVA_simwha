package java220415;

public class main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k36_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// ���� ���������� �迭�� �ִ´�.
		for (int k36_i = 1; k36_i < 13; k36_i++) {// 1���� 12������ �ݺ����� �������Ͽ�
			System.out.printf("%d�� =>", k36_i);// ���� ���� ����Ѵ�.
			for (int k36_j = 1; k36_j < 32; k36_j++) {// 1���� 31���� �ݺ����� �����Ͽ�
				System.out.printf("%d", k36_j);// ����Ѵ�.
				// �迭�� ������ ���� ���� �迭�� ��ġ�� ��ġ�� ��� �ݺ����� ���������� �ڵ带 §��.
				// �迭�� 0���� �����ϰ� i�� ���� 1���� �����ϱ� ������ -1�� ���ش�.
				if (k36_iLMD[k36_i - 1] == k36_j) {
					break;
				}
				System.out.printf(",");// ���������� ��ǥ�� �����ϱ����� if���� �ٱ��ʿ� �����Ѵ�.

			}
			System.out.printf("\n");
		}
	}

}
