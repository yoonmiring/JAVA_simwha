package java220421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main4 {
//�Ÿ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_���������������_��⵵.csv");// �о�� ������ �ҷ��´�
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// ������ �д� ���۸� �����Ѵ�

		String k36_readtxt;// ���ڿ��� �����Ѵ�

		if ((k36_readtxt = k36_br.readLine()) == null) {// ������ �д� ���� null���� ���
			System.out.println("�������Դϴ�");// �� �����̶�� ����Ѵ�.
			return;
		}
		String[] k36_field_name = k36_readtxt.split(",");// �ʵ���� ��ǥ�� �и��Ͽ� �ʵ�� �迭�� �����Ѵ�.

		double k36_lat = 37.3858;// ������ġ�� ������ �����Ѵ�.
		double k36_lng = 127.1213;// ������ġ�� �浵�� �����Ѵ�.

		int k36_LineCnt = 1;// ���������� 1�� �����Ѵ�.

		while ((k36_readtxt = k36_br.readLine()) != null) {// null���� ������ �������� ������ �о� �ݺ����� �����Ѵ�.
			String[] k36_field = k36_readtxt.split(",");// ���� ������ ��ǥ�� �и��Ͽ� �ʵ�迭�� �����Ѵ�.
			System.out.printf("********[%d��° �׸�] ***********\n", k36_LineCnt);
			System.out.printf("%s : %s\n", k36_field_name[9], k36_field[9]);// ���θ� �ּҸ� ���
			System.out.printf("%s : %s\n", k36_field_name[13], k36_field[13]);// ���� ���
			System.out.printf("%s : %s\n", k36_field_name[14], k36_field[14]);// �浵 ���
			double k36_dist = Math.sqrt(Math.pow(Double.parseDouble(k36_field[13]) - k36_lat, 2)
					+ Math.pow(Double.parseDouble(k36_field[14]) - k36_lng, 2));
			// ������ġ�� �迭�� �ִ� ���� ��ġ�� ���� �Ÿ��� ����Ѵ�.
			System.out.printf("���������� �Ÿ� :%f\n", k36_dist);// ���� �Ÿ��� ����Ѵ�.
			System.out.printf("*****************************\n");

			k36_LineCnt++;// ���������� ������ ���� ��� 1�� ������Ų��
		}
		k36_br.close();// ���� �д°��� �ݴ´�

	}

}
