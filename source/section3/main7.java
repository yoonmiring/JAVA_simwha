package java220414;

public class main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܼ� ȯ�� ���
		int k36_MyWon = 1000000; // ȯ���ؾ� �� ��ȭ
		double k36_MoneyEx = 1238.21;// �޷�ȯ��
		double k36_commission = 0.003;// ȯ�� ������ 0.3%

		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);// ȯ���ؾ��� ��ȭ���� �޷�ȯ���� ������ ���������� �޾� ȯ������ �޷����� ���´�.
														// ���������� �޾ƾ� ������ �޷� ���󰪸� ����.
		int k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx); // ȯ������ �޷��� �޷�ȯ���� ���� �� ȯ���ؾ��� ��ȭ���� ���ָ� �ܵ��� ���� ���´�.

		System.out.printf("********************************************************\n");
		System.out.printf("*                    ������ ���� ���                  *\n");
		System.out.printf("�� ��ȭȯ���ݾ� :%d�� => ��ȭ : %d�޷�, �ܵ�:%d��\n", k36_MyWon, k36_usd, k36_remain);//ȯ�� ������ ���� ������ ȯ�� �ݾ�, ��ȭ, �ܵ��� ������� ���´�.
		System.out.printf("********************************************************\n");

	}

}