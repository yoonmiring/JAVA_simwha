package java220414;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Һ��ڰ� ���� ���
		int k36_price = 1234; // ��ǰ ������ ���������� ����
		double k36_tax_rate = 0.1;// ������ ������ �Ǽ������� ����

		int k36_netprice = netprice(k36_price, k36_tax_rate);// netprice�Լ��� ȣ���Ͽ� ������ k36_netprice�� �޾��ش�.
		int k36_tax = k36_price - k36_netprice;// ������ ��ǰ ���ݿ��� ���������� �� ���� ������ �޾��ش�.

		System.out.printf("********************************************\n");
		System.out.printf("*   �Һ��ڰ�     ��������     ���� ���    *\n");
		System.out.printf("�Һ��� ����:%d, ��������:%d, ���� :%d\n", k36_price, k36_netprice, k36_tax);
		System.out.printf("********************************************\n");

	}

	public static int netprice(int k36_price, double k36_rate) {// ���������� �ޱ� ������ ������ �Լ��� ȣ���Ѵ�.
		return (int) (k36_price / (1 + k36_rate));// ��ǰ���ݿ��� ������ �������� 1�� ���� ���� ������ ���� ������ ���Ѵ�.
	}
}
