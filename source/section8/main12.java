package java220421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// ������ ������ �ҷ��´�
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// ���۸����� �����Ͽ� ������ �д´�
		File k36_f1 = new File("C:\\Users\\kopo\\Desktop\\day_data\\StockDailyPrice_Samsung.csv");// ������ csv������ �������ش�.
		BufferedWriter k36_bw1 = new BufferedWriter(new FileWriter(k36_f1));// ������ ������ ���� ���� bufferesWriter�� ����Ѵ�.

		String k36_readtxt;// ���ڿ��� �����Ѵ�.

		int k36_cnt = 0;// cnt���� 0���� �ʱ�ȭ�Ͽ� ���������� �����Ѵ�.
		int k36_wcnt = 0;// wcnt���� 0���� �ʱ�ȭ�Ͽ� ���������� �����Ѵ�.

		while ((k36_readtxt = k36_br.readLine()) != null) {// null���� ������ ������ �ݺ����� �����Ѵ�.
			StringBuffer k36_s = new StringBuffer();// ���ڿ��� �����ϱ����� �����Ѵ�.
			String[] field = k36_readtxt.split("%_%");// %_%�� �������� ���ڿ��� ���� �� field �迭�� �����Ѵ�.
			// field���̰� 2 �ʰ��̰�, field�� 3��° ���� "^"���� ��ĭ���� ó���ϸ鼭 �翷�� ��ĭ�� �����ϰ� ù��° ���ڿ� A�� ��
			// ���
			if (field.length > 2 && field[2].replace("^", "").trim().equals("A005930")) {
				k36_s.append(field[0].replace("^", "").trim());// field�� ù��° ���� ^"���� ��ĭ���� ó���ϸ鼭 �翷�� ��ĭ�� �����Ͽ� �����Ѵ�.
				for (int j = 1; j < field.length; j++) {// field�� ���̸�ŭ �ݺ��Ͽ�
					k36_s.append("." + field[j].replace("^", "").trim());// ���� ^"���� ��ĭ���� ó���ϸ鼭 �翷�� ��ĭ�� �����Ͽ� ����
				}
				k36_bw1.write(k36_s.toString());// ������ s�� ������ ������ ���Ͽ� �ۼ��Ѵ�.
				k36_bw1.newLine();// �ۼ� �� ������ ����
				k36_wcnt++;// ��� 1�پ� �����ϸ� ������ �����Ѵ�..
			}

			k36_cnt++;// ��� 1�پ� �����Ͽ� �ݺ��س�����.
		}

		k36_br.close();// �д� ������ �ݴ´�
		k36_bw1.close();// ���� ������ �ݴ´�

		System.out.printf("Program End[%d][%d]records\n", k36_cnt, k36_wcnt);// �������� ������ ���α׷��� �����ٰ� �˷��ָ� ������ ���� �Էµ� ���� ���ڸ�
																		// ����Ѵ�.
	}

}
