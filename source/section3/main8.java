package java220414;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���� ȯ�� ���(1)
		int k36_MyWon = 1000000; // ȯ���ؾ� �� ��ȭ
		double k36_MoneyEx = 1238.21;// �޷�ȯ��
		double k36_commission = 0.003;// ȯ�� ������ 0.3%

		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);// ȯ�� ���� �޷����� ����(������)

		double k36_ComPerOne = k36_MoneyEx * k36_commission;// �޷� ȯ���� ȯ�� ������ ���� ���ϸ� �޷��� ������ ��(�Ǽ���)�� ���´�.
		double k36_totalcom = k36_usd * k36_ComPerOne;// ȯ�� ���� �޷����� ������ ���� ���ϸ� �� �������� ���� ���´�.(�Ǽ���)
		System.out.printf("*********************************************************************\n");
		System.out.printf("*                             ������ ���                           *\n");
		System.out.printf("�� ������ :%f�� => ��ȭ : %d�޷�, �޷��� ������:%f��\n", k36_totalcom, k36_usd, k36_ComPerOne);// �� ������� ��ȭ,
																											// �޷��� ��������
																											// ���� ��µȴ�.
		System.out.printf("*********************************************************************\n");

	}

}
