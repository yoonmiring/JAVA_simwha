package java220421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main3 {
//�������Ͽ� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_���������������_��⵵.csv");//������ ���� csv��ġ�� �̸��� ���Ѵ�.
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));//������ �д� ���۸� �����Ѵ�.

		String k36_readtxt;//���ڿ��� �����Ѵ�.
		
		if((k36_readtxt = k36_br.readLine())== null) {//������ �д� ���ڿ��� null���� ���
			System.out.println("�������Դϴ�");//�������̶�� ����Ѵ�.
			return;
		}
		String[] k36_field_name = k36_readtxt.split(",");//�о���� ���ڿ��� ��ǥ�� ������ �迭�� �����Ѵ�.(�ʵ��)
		
		int k36_LineCnt =1; //�������� 1�� �ʱ�ȭ�Ѵ�
		while((k36_readtxt = k36_br.readLine()) != null) {//������ �о���� ���� null���� �ƴҶ����� �ݺ��Ѵ�.
			String[] k36_field = k36_readtxt.split(",");//�о���� ���ڿ��� ��ǥ�� ������ �ʵ忡 �����Ѵ�(�����Ͱ�)
			System.out.printf("********[%d��° �׸�] ***********\n",k36_LineCnt);//1���� null�� �������� ����Ѵ�.
			for(int j=0;j<k36_field_name.length;j++) {//�ʵ���� ���̱��� �ݺ��Ͽ�
				System.out.printf("%s : %s\n",k36_field_name[j],k36_field[j]);//�ʵ��� �ʵ忡 �� ���� ������� �д´�
			}
			System.out.printf("*****************************\n");
			if(k36_LineCnt == 100) {//100��°���� ������
				break;//�ݺ����� �������´�
			}
			k36_LineCnt++;
		}
		k36_br.close();//���� �д°��� �ݴ´�
		
	}

}
