package java220419;

public class remoconTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRemocon3 remo3;//TvRemocon3 클레스를 불러온다.
		remo3 = new TvRemocon3();
		for (int i = 0; i < 5; i++) {//볼륨을 올리는 반복문 실행
			remo3.k36_Volup();
			System.out.printf("MSG elev3[%s]\n", remo3.k36_help);
		}
		for (int i = 0; i < 5; i++) {//볼륨을 내리는 반복문 실행
			remo3.k36_Voldown();
			System.out.printf("MSG elev3[%s]\n", remo3.k36_help);
		}
		remo3.k36_check();//건전지 체크하는 함수 선언
		System.out.printf("MSG elev3[%s]\n", remo3.k36_help);
	}

}
