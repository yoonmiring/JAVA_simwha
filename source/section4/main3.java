package java220415;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������.������ ��
		int k36_iI; // k36_iI������ ����
		double k36_iD;// k36_iD�� �Ǽ��� ����

		k36_iI = 10 / 3; // k36_iI�� 10/3�� �� ���� �ִ´�.(�������̱� ������ 3�̶�� ����� ����)
		k36_iD = 10 / 3.0;// k36_iD�� 10/3.0�� �� ���� �ִ´�.(�Ǽ����̱⶧���� 3.3333333�̶�� ����� ����)

		if (k36_iI == k36_iD) {// k36_iI�� k36_iD�� ���� ������
			System.out.printf("equal\n");// equal�� ���� ����Ѵ�
		} else {//�׷��� ������
			System.out.printf("Not equal[%f][%f]\n", (double) k36_iI, k36_iD);//not equal�� ����ϰ�, k36_iI�� �Ǽ������� k36_iD�� ���� ����ض�
		}//k36_iI�� k36_iD�� k36_iI�� ���� �������̱� ������ 3.000000�� ���� ���� ���� ���� �ʴٰ� �� �� �ִ�.
		if (k36_iD == 3.333333) {//k36_iD�� ���� 3.33333�� ���ٸ�
			System.out.printf("equal\n");//equal�� ����Ѵ�
		} else {//�׷��� ������	
			System.out.printf("Not equal[3.333333][%f]\n", k36_iD);//not equal�� [3.333333]�� ����ϰ�, k36_iD�� ���� ����Ѵ�.
		}//k36_iD�� 3.333333�� ���� �ʴ�.k36_iD�� �ڿ� ������ .333333���� ������ ������ ���ڰ��� 3.333333���� �ٸ� ���� ���´�.
		
		k36_iD = (int) k36_iD;//k36_iD�� ���� ���������� �Է��Ѵ�.
		if (k36_iI == k36_iD) {//k36_iI�� k36_iD�� ���� ���ٸ�
			System.out.printf("equal\n");//equal�� ���� ����Ѵ�
		} else {//�׷��� ������
			System.out.printf("Not equal[%f][%f]\n", (double) k36_iI, k36_iD);//not equal�� ����ϰ�, k36_iI�� �Ǽ����� , k36_iD�� ���� ����Ѵ�.
		}
		System.out.printf("int�� �μ�[%d][%f]\n", k36_iI, k36_iD);//�ΰ��� ���� ���ϱ� ���� k36_iI�� k36_iD(�� 25���ٿ��� ���������� ����)�� ����ض�
		System.out.printf("double�� �μ�[%f][%f]\n", (double) k36_iI, k36_iD);//k36_iI�� �Ǽ������� ����ϰ� k36_iD�� ���� ����ؼ� Ȯ���ض�

		char k36_a = 'c'; //k36_a�� �������� 'c'��� ���ڸ� �ִ´�.
		if (k36_a == 'b') {//k36_a�� b�� ������
			System.out.printf("a�� b�̴�\n");//a�� b�̴� ��� ���� ����Ѵ�.
		}
		if (k36_a == 'c') {//k36_a�� c�� ������
			System.out.printf("a�� c�̴�\n");//a�� c�̴� ��� ���� ����Ѵ�
		}
		if (k36_a == 'd') {//k36_a�� d�� ������
			System.out.printf("a�� d�̴�\n");//a�� d�̴� ��� ���� ����Ѵ�
		}

		String k36_aa = "abcd";//k36_aa�� ���ڿ��� "abcd"��� ���ڿ��� �ִ´�.
		if (k36_aa.equals("abcd")) {//k36_aa�� ���ڿ��� "abcd"��� ���� ������
			System.out.printf("aa�� abcd�̴�.\n");//aa�� abcd�̴ٶ�� ����ϰ�
		} else {//���� �ʴٸ�
			System.out.printf("aa�� abcd�� �ƴϴ�.\n");//aa�� abcd�� �ƴϴٶ�� ����Ѵ�
		}

		boolean k36_bb = true;//k36_bb�� ������ ���� ���� �ִ´�.

		if (!!k36_bb) {//k36_bb�� ���� �ƴϰ� �ƴϸ�(�� ��)
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�.\n");//bb�� �ƴϰ� �ƴϸ� ���̴�.�� ���� ����Ѵ�
		} else {//�׷��� ������
			System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�.\n");//bb�� �ƴϰ� �ƴϸ� �����̴�.�� ���� ����Ѵ�
		}
	}

}
