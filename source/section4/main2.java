package java220415;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܼ� ��
		int k36_iA, k36_iB;// ������ k36_iA, k36_iB�� �����Ѵ�.

		k36_iA = 0; // k36_iA�� 0���� �ʱ�ȭ ���ش�.
		while (true) {// �������� A�ݺ����� �����ض�
			k36_iB = 0; // k36_iB�� 0���� �ʱ�ȭ ���ش�.
			while (true) {// �������� B�ݺ����� �����ض�
				System.out.printf("*");// �������� �ݺ����� ���� �Ҷ� *�� �Ѱ� ����

				if (k36_iA == k36_iB) { // k36_iA�� k36_iB�� ���� ������
					break;// �ݺ����� �������Ͷ�
				}
				k36_iB++;// k36_iB�� ���� ��� 1�� �����Ѵ�.
			}
			System.out.println("\n");//B�ݺ����� ���������� �ٹٲ��� �����ض� 
			k36_iA++;// k36_iA�� ���� ��� 1�� �����Ѵ�.
			if (k36_iA == 30) {//����  k36_iA�� ���� 30�� �����Ѵٸ�
				break;//�ݺ����� �������Ͷ�
			}
		}
	}

}
