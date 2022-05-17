package java220419;

public class ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k36_iPerson = 30;// k36_iPerson에 값을 주는 만큼 저장소를 생성한다.
		InputData k36_inData = new InputData(k36_iPerson);// 생성자의 숫자를 준 만큼 배열을 생성한다.

		// 입력데이터 생성
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("홍길%02d", k36_i);// 이름생성
			int k36_kor = (int) (Math.random() * 100);// 국어점수 생성
			int k36_eng = (int) (Math.random() * 100);// 영어점수 생성
			int k36_mat = (int) (Math.random() * 100);// 수학점수 생성
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// 클래스 내 값 입력
		}
		// 입력 확인을 위한 출력
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("번호:%d, 이름:%s,국어:%d,영어:%d,수학:%d,총점:%d,평균:%f\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], k36_inData.k36_ave[k36_i]);
		}
	}

}
