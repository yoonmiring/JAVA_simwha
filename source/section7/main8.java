package section7;

import java220419.InputData;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iPerson=5;
		OneRec [] inData = new OneRec [iPerson];

		inData[0]= new OneRec("홍길01", 100, 100, 90);
		inData[1]= new OneRec("홍길02", 90, 90, 90);
		inData[2]= new OneRec("홍길03", 80, 70, 90);
		inData[3]= new OneRec("홍길04", 70, 60, 90);
		inData[4]= new OneRec("홍길05", 60, 100, 90);


		//번호, 다른 클래스에서 선언된 배열에서 필요한 값, 양식에 맞춰서 출력, 학생별 성적, 총점 평균
		for(int i=0; i<5;i++) {

		System.out.printf("번호:%d, 이름:%s, 국어:%2d, 영어:%2d, 수학:%2d, 총점:%3d, 평균:%f\n", i,
				inData[i].name(),inData[i].kor(),inData[i].eng(),
				inData[i].mat(),inData[i].sum(), inData[i].ave());
		}

	}

}
