package java220421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main2 {
//buffered �а� ����
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		k36_FileWrite();//���� ���� �Լ��� �ҷ��´�
		k36_FileRead();//���� �д� �Լ��� �ҷ��´�.
	}

	private static void k36_FileRead() throws IOException {//������ �д� �Լ��� ������ش�
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");//������ ���� ��ġ�� ������ �����Ѵ�.
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));//������ �д� ���۸� ����
		String k36_readtxt;//���ڿ��� �����Ѵ�.

		while ((k36_readtxt = k36_br.readLine()) != null) {//null���� ������ ������ ��� �ݺ��Ѵ�.
			System.out.printf("%s\n", k36_readtxt);//���ڿ��� �޾� �о�´�.
		}
	}

	private static void k36_FileWrite() throws IOException {//������ ���� �Լ��� ������ش�.
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");//������ �� ��ġ�� �̸��� �����Ѵ�.
		BufferedWriter k36_bw = new BufferedWriter(new FileWriter(k36_f));//������ ���� ���۸� ����

		k36_bw.write("�ȳ� ����");//������ ����
		k36_bw.newLine();//���ο� ���� �����Ͽ�
		k36_bw.write("���hello");//������ �� ����
		k36_bw.newLine();

		k36_bw.close();//���Ͼ��� ������ �ݴ´�
	}

}
