package java220421;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File k36_f = new File("C:\\Users\\kopo\\Desktop\\test.txt"); //������ ���� ������ ��ġ�� �̸��� �����Ѵ�
			FileWriter k36_fw = new FileWriter(k36_f);//������ ���� ���� ���˼���

			k36_fw.write("�ȳ� ����\n");//���˼����� ���Ͽ� �� ������ �߰��Ѵ�.
			k36_fw.write("hello ���\n");

			k36_fw.close();//���Ͼ��� ���� �ݴ´�.

			FileReader k36_fr = new FileReader(k36_f);//������ �б� ���� ���˼���

			int k36_n = -1;//k36_n�ǰ��� -1�� ���������� �����Ѵ�
			char[] k36_ch;//�迭�� ���� ���ڸ� �����Ѵ�.

			while (true) {//�������� �ݺ��Ѵ�
				k36_ch = new char[100];//�迭�� ���̴� 100���� �����Ѵ�.
				k36_n = k36_fr.read(k36_ch);//�迭�� �д´�

				if (k36_n == -1) {//���� k36_n�ǰ��� -1�϶� 
					break;//�ݺ����� �������´�.
				}
				for (int k36_i = 0; k36_i < k36_n; k36_i++) {//n�� �����Ҷ� ����
					System.out.printf("%c", k36_ch[k36_i]);//�ܼ�â�� k36_ch�� ���� ����Ѵ�
				}
			}
			k36_fr.close();//���� �д� ���� �ݴ´�
			System.out.printf("\n FILE READ END");//������ �� �о��ٰ� ����Ѵ�.
		} catch (Exception k36_e) {
			System.out.printf("�� ���� [%s]\n", k36_e);//������ ���� ��� � �������� ������.
		}
	}

}
