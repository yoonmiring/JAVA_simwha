package java220419;

public class remoconTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRemocon3 remo3;//TvRemocon3 Ŭ������ �ҷ��´�.
		remo3 = new TvRemocon3();
		for (int i = 0; i < 5; i++) {//������ �ø��� �ݺ��� ����
			remo3.k36_Volup();
			System.out.printf("MSG elev3[%s]\n", remo3.k36_help);
		}
		for (int i = 0; i < 5; i++) {//������ ������ �ݺ��� ����
			remo3.k36_Voldown();
			System.out.printf("MSG elev3[%s]\n", remo3.k36_help);
		}
		remo3.k36_check();//������ üũ�ϴ� �Լ� ����
		System.out.printf("MSG elev3[%s]\n", remo3.k36_help);
	}

}
