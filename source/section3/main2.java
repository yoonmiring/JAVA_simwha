package java220414;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #2. �����ϱ�, �ձ��ϱ�
		int k36_sum; // k36_sum���� ���������� ����
		k36_sum = 0;// 0���� �ʱ�ȭ

		for (int i = 1; i < 101; i++) {
			k36_sum = k36_sum + i;// 1���� 100���� 1�� �����Ͽ� ���ؼ� �����Ѵ�.
		}
		System.out.printf("#2 : %d\n", k36_sum);// �����ؼ� ���� ���� ����Ѵ�.
		System.out.printf("#2-2 : %d\n", k36_sum / 100);// �����ؼ� ���� ���� 100�� ������ ����Ѵ�.

		int[] k36_v = { 1, 2, 3, 4, 5 }; // k36_v�迭�� 1,2,3,4,5 ������ �ִ´�.
		int k36_vSum = 0;// 0���� �ʱ�ȭ
		for (int i = 0; i < 5; i++) {// 0���� 5���� �����Ѵ�
			k36_vSum = k36_vSum + k36_v[i]; // �迭�� �ִ� 0��ġ���� 5��ġ���� �����Ͽ� ���Ѵ�.
		}
		System.out.printf("#2-3 : %d\n", k36_vSum);// ������ �迭�� ���� ����Ѵ�.
	}

}
