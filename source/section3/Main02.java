package java220414;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Һ��� ���ݰ��
		String[] k36_item = { "Ŀ�Ƕ���", "�ſ�����", "Ȩ����", "��Ϲ���Ĩ", "������" }; // ������ ���� �̸��� k36_item �迭�� �ִ´�.
		int[] k36_price = { 1000, 2000, 3000, 2400, 1450 }; // ���� ������ ������ k36_price�迭�� �ִ´�
		int[] k36_amount = { 3, 2, 1, 5, 6 };// ������ ������ ������ k36_amount�迭�� �ִ´�.
		double k36_tax_rate = 0.1;// ������ ������ �Ǽ������� �������ش�.
		int k36_total_sum = 0;// �����ؾ� �� �ݾ��� ���������� ���� �� �ʱ�ȭ �����ش�.

		System.out.printf("***************************************************\n");
		System.out.printf("                �� �� �� �� Ʈ               \n");// �츮���� ���� �̸�
		System.out.printf("%7s\t%7s\t%2s\t%9s\n", "�׸�", "�ܰ�", "����", "�հ�");// �������� ���� ����� �̸��� �����ش�.
		System.out.printf("===================================================\n");
		for (int i = 0; i < k36_item.length; i++) {// �����Ұ����� ������ŭ �ݺ����� �����Ѵ�.
			int sum = k36_price[i] * k36_amount[i];// �� ������ ���ݰ� ������ŭ ���Ͽ� �հ谪�� �־��ش�.
			k36_total_sum = k36_total_sum + sum;// �հ��� ���� ������ ������ŭ ���� �� �հ踦 ���Ѵ�.
			System.out.printf("%7s\t %7d\t %2d\t %9d\n", k36_item[i], k36_price[i], k36_amount[i], sum);
		}
		System.out.printf("===================================================\n");
		System.out.printf("���� �ݾ� :%39d\n", k36_total_sum);//�� �հ��� ���� ����Ѵ�.

		int k36_total_net_price = (int) (k36_total_sum / (1 + k36_tax_rate));//���� �ݾ��� ���������� �����Ѵ�. ���հ迡�� �����Ǻ����� +1�� �� ���� �������ش�.
		System.out.printf("���� �ݾ� :%39d\n", k36_total_net_price); //���� �ݾ��� ����Ѵ�.
		int k36_tax = k36_total_sum - k36_total_net_price;//�� �հ迡�� ���� �ݾ��� �� ������ ������ ���Ѵ�.
		System.out.printf("��     �� :%39d\n", k36_tax);//������ ������ ����Ѵ�.
	}

}
