package java220421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// ���� �ҷ�����
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// ���۷� �о�������� ����

		String k36_readtxt;// ���ڿ��� �޾Ƴ���
		int k36_LineCnt = 0;// ������ ������ �ʱ�ȭ���ش�
		int k36_n = -1;// ������ -1�� �������ش�
		StringBuffer k36_s = new StringBuffer();// ���ڿ��� �����ϱ� ���� �����Ѵ�.

		while (true) {// �������� �ݺ����� �����Ѵ�.
			char[] k36_ch = new char[1000];// 1000����Ʈ�� ���ڸ� �迭�� �����Ѵ�
			k36_n = k36_br.read(k36_ch);// �迭�� �о� n������ �����Ѵ�.
			if (k36_n == -1) {// n�� -1�϶�
				break;// �ݺ����� �������´�.
			}
			for (char k36_c : k36_ch) {// ch�迭�� �� ��Ұ��� ���������� c�� �����Ѵ�.
				if (k36_c == '\n') {// c�� ����Ǿ�����
					System.out.printf("[%s]***\n", k36_s.toString());// ���ڿ��� �����Ͽ� ����Ѵ�.
					k36_s.delete(0, k36_s.length());// ���ڿ��� ���̰� 0�ϰ�� ���ڿ��� �����Ѵ�.
				} else {// ������ ���� ���� ��쿡��
					k36_s.append(k36_c);// c���� �߰��Ѵ�.
				}
			}

			k36_LineCnt++;// 1�� �����Ѵ�
		}
		System.out.printf("[%s]***\n", k36_s.toString());// s���ڿ��� ����Ѵ�.
		k36_br.close();// �����б⸦ �����.

	}

}
