package section7;

import java220419.InputData;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iPerson=5;
		OneRec [] inData = new OneRec [iPerson];

		inData[0]= new OneRec("ȫ��01", 100, 100, 90);
		inData[1]= new OneRec("ȫ��02", 90, 90, 90);
		inData[2]= new OneRec("ȫ��03", 80, 70, 90);
		inData[3]= new OneRec("ȫ��04", 70, 60, 90);
		inData[4]= new OneRec("ȫ��05", 60, 100, 90);


		//��ȣ, �ٸ� Ŭ�������� ����� �迭���� �ʿ��� ��, ��Ŀ� ���缭 ���, �л��� ����, ���� ���
		for(int i=0; i<5;i++) {

		System.out.printf("��ȣ:%d, �̸�:%s, ����:%2d, ����:%2d, ����:%2d, ����:%3d, ���:%f\n", i,
				inData[i].name(),inData[i].kor(),inData[i].eng(),
				inData[i].mat(),inData[i].sum(), inData[i].ave());
		}

	}

}
