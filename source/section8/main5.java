package java220421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main5 {
//�Ÿ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\12_04_01_E_����ȭ�������.csv");// �о�� ������ �ҷ��´�
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// ������ �д� ���۸� �����Ѵ�

		String k36_readtxt;// ���ڿ��� �����Ѵ�

		if ((k36_readtxt = k36_br.readLine()) == null) {// ������ �д� ���� null���� ���
			System.out.println("�������Դϴ�");// �� �����̶�� ����Ѵ�.
			return;
		}
		String[] k36_field_name = k36_readtxt.split(",");// �ʵ���� ��ǥ�� �и��Ͽ� �ʵ�� �迭�� �����Ѵ�.

		double k36_lat = 37.3858;// ������ġ�� ������ �����Ѵ�.
		double k36_lng = 127.1213;// ������ġ�� �浵�� �����Ѵ�.

		double k36_min = 100; // �ּҰ��� ū ������ �����Ѵ�.
		double k36_max = 0; // �ִ밪�� ���� �������� 0���� �����Ѵ�.
		int k36_LineCnt = 1;// ���������� 1�� �����Ѵ�.
		String k36_maxAdd = "";// ���� �� �Ÿ��� ���� �ּҸ� ���� ���������� ����
		String k36_minAdd = "";// ���� ����� �Ÿ��� ���� �ּҸ� ���� ���������� ����

		while ((k36_readtxt = k36_br.readLine()) != null) {// null���� ������ �������� ������ �о� �ݺ����� �����Ѵ�.
			String[] k36_field = k36_readtxt.split(",");// ���� ������ ��ǥ�� �и��Ͽ� �ʵ�迭�� �����Ѵ�.
			System.out.printf("********[%d��° �׸�] ***********\n", k36_LineCnt);
			System.out.printf("%s : %s\n", k36_field_name[3], k36_field[3]);// ���θ� �ּҸ� ���
			System.out.printf("%s : %s\n", k36_field_name[19], k36_field[19]);// ���� ���
			System.out.printf("%s : %s\n", k36_field_name[20], k36_field[20]);// �浵 ���
			double k36_dist = 0;

			k36_dist = Math.sqrt(Math.pow(Double.parseDouble(k36_field[19]) - k36_lat, 2)
					+ Math.pow(Double.parseDouble(k36_field[20]) - k36_lng, 2));

			// ������ġ�� �迭�� �ִ� ���� ��ġ�� ���� �Ÿ��� ����Ѵ�.
			System.out.printf("���������� �Ÿ� :%f\n", k36_dist);// ���� �Ÿ��� ����Ѵ�.
			System.out.printf("*****************************\n");
			if (k36_max < k36_dist) {// ���� �� �Ÿ��� ���� ���Ѵ�
				k36_max = k36_dist;
				k36_maxAdd = k36_field[3];
			}
			if (k36_min > k36_dist) {// ���� ����� �Ÿ��� ���� ���Ѵ�.
				k36_min = k36_dist;
				k36_minAdd = k36_field[3];
			}
			k36_LineCnt++;// ���������� ������ ���� ��� 1�� ������Ų��

		}
		// ��º�
		System.out.println("���� �� �Ÿ� �� : " + k36_max + "\n���� �� ���θ� �ּ� : " + k36_maxAdd);
		System.out.println("���� ����� �Ÿ� �� " + k36_min + "\n���� ����� ���θ� �ּ� : " + k36_minAdd);
		k36_br.close();// ���� �д°��� �ݴ´�

	}

}
