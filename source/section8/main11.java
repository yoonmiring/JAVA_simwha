package java220421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 2015�⵵ �Ｚ���� ���� �ִ밪 �ּҰ�
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// ������ ������ �ҷ��´�
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// ���۸����� �����Ͽ� ������ �д´�
		File k36_f1 = new File("C:\\Users\\kopo\\Desktop\\day_data\\StockDailyPrice_sam2015.csv");// ������ csv������ �������ش�.
		BufferedWriter k36_bw1 = new BufferedWriter(new FileWriter(k36_f1));// ������ ������ ���� ���� bufferesWriter�� ����Ѵ�.

		String k36_readtxt;// ���ڿ��� �����Ѵ�.

		int k36_cnt = 0;// cnt���� 0���� �ʱ�ȭ�Ͽ� ���������� �����Ѵ�.
		int k36_wcnt = 0;// wcnt���� 0���� �ʱ�ȭ�Ͽ� ���������� �����Ѵ�.
		int k36_min = 100000000;
		int k36_max = 0;

		while ((k36_readtxt = k36_br.readLine()) != null) {// null���� ������ ������ �ݺ����� �����Ѵ�.
			StringBuffer k36_s = new StringBuffer();// ���ڿ��� �����ϱ����� �����Ѵ�.
			String[] k36_field = k36_readtxt.split("%_%");// %_%�� �������� ���ڿ��� ���� �� field �迭�� �����Ѵ�.
			// field���̰� 2 �ʰ��̰�, field�� 3��° ���� "^"���� ��ĭ���� ó���ϸ鼭 �翷�� ��ĭ�� �����ϰ� ù��° ���ڿ� A�� ��
			// ���
			if (k36_field.length > 2 && k36_field[2].replace("^", "").trim().equals("A005930")) {
				if (k36_field[1].replace("^", "").trim().contains("2015")) {
					k36_s.append(k36_field[0].replace("^", "").trim());// field�� ù��° ���� ^"���� ��ĭ���� ó���ϸ鼭 �翷�� ��ĭ�� �����Ͽ� �����Ѵ�.
					for (int j = 1; j < k36_field.length; j++) {// field�� ���̸�ŭ �ݺ��Ͽ�
						k36_s.append("." + k36_field[j].replace("^", "").trim());// ���� ^"���� ��ĭ���� ó���ϸ鼭 �翷�� ��ĭ�� �����Ͽ� ����
					}
					if (k36_max < Integer.parseInt(k36_field[3].replace("^","").trim())) {// ���� ū ���� ���� ���Ѵ�
						k36_max = Integer.parseInt(k36_field[3].replace("^","").trim());
					}
					if (k36_min > Integer.parseInt(k36_field[3].replace("^","").trim())) {// ���� ���� ���� ���� ���Ѵ�.
						k36_min = Integer.parseInt(k36_field[3].replace("^","").trim());

					}
					k36_bw1.write(k36_s.toString());// ������ s�� ������ ������ ���Ͽ� �ۼ��Ѵ�.
					k36_bw1.newLine();// �ۼ� �� ������ ����

					k36_wcnt++;// ��� 1�پ� �����ϸ� ������ �����Ѵ�..
				}
			}

			k36_cnt++;// ��� 1�پ� �����Ͽ� �ݺ��س�����.

		}

		k36_br.close();// �д� ������ �ݴ´�
		k36_bw1.close();// ���� ������ �ݴ´�

		System.out.printf("Program End\n �ִ밪 : [%d]\n �ּҰ� : [%d]\n", k36_max, k36_min);// �������� ������ ���α׷��� �����ٰ�
																								// �˷��ָ� ������ ���� �Էµ� ����
																								// ���ڸ�
		// ����Ѵ�.
	}

}
