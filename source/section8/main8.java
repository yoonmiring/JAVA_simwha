package java220421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main8 {
//���� ����� ���� ���� �հ� ã��
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\kopo\\Desktop\\��⵵_���������������.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));

		String readtxt;

		if ((readtxt = br.readLine()) == null) {
			System.out.println("�������Դϴ�");
			return;
		}
		String[] field_name = readtxt.split(",");

		double lat = 37.3858;
		double lng = 127.1213;
		double dist = 0;
		int LineCnt = 1;
		
		double[]distArr = new double[LineCnt];
		int count =0;
		while ((readtxt = br.readLine()) != null) {
			String[] field = readtxt.split(",");
			System.out.printf("*******[%d��° �׸�] ********\n", LineCnt);
			System.out.printf("%s : %s\n", field_name[1], field[1]);
			System.out.printf("%s : %s\n", field_name[13], field[13]);
			System.out.printf("%s : %s\n", field_name[14], field[14]);
			dist = Math.sqrt(Math.pow(Double.parseDouble(field[13]) - lat, 2)
					+ Math.pow(Double.parseDouble(field[14]) - lng, 2));
			System.out.printf("���������� �Ÿ� :%f\n", dist);
			System.out.printf("*****************************\n");
			LineCnt++;
			distArr[LineCnt]= dist;
			
		}
	
		br.close();
	System.out.println(distArr[1]);
	System.out.println(distArr[2]);
	System.out.println(distArr[3]);
		
	}

}
