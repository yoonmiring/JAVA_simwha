package java220414;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #5.�Ҽ��� �ڸ��� �ݿø� ���� ó��

		int k36_MyVal = 14 / 5; //������ k36_MyVal�� ���� �� 14������ 5�� �Ѵ�.
		System.out.printf("#5-1 : %d\n", k36_MyVal);

		double k36_MyValF; //�Ǽ��� k36_MyValF�� ���� �Ѵ�.
		k36_MyValF = 14 / 5; //�Ǽ������� 14/5���Ѵ�
		System.out.printf("#5-2 : %f\n", k36_MyValF);

		k36_MyValF = 14.0 / 5; //�Ǽ������� 14.0���� ��Ÿ���� �Ǽ�������� ��µȴ�.
		System.out.printf("#5-3 : %f\n", k36_MyValF);

		k36_MyValF = (14.0) / 5 + 0.5; //�Ǽ��� ��꿡�� +0.5�� �Ѵ�
		System.out.printf("#5-4 : %f\n", k36_MyValF);

		k36_MyVal = (int) ((14.0) / 5 + 0.5);//�Ǽ��� ����� �� �� 0.5�� ���� ������ ���������� ��ȯ�� �Ͽ� ������ ��Ÿ����
		System.out.printf("#5-5 : %d\n", k36_MyVal);

	}

}
