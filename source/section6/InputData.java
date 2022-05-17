package java220419;

public class InputData {// inputData 클래스를 생성한다.
	// 배열 생성
	int[] k36_i;
	String[] k36_name;
	int[] k36_kor;
	int[] k36_mat;
	int[] k36_eng;
	int[] k36_sum;
	double[] k36_ave;

	public InputData(int k36_iPerson) {
		// TODO Auto-generated constructor stub
		// 배열에 들어가는 변수선언
		k36_i = new int[k36_iPerson];
		k36_name = new String[k36_iPerson];
		k36_mat = new int[k36_iPerson];
		k36_kor = new int[k36_iPerson];
		k36_eng = new int[k36_iPerson];
		k36_sum = new int[k36_iPerson];
		k36_ave = new double[k36_iPerson];

	}

	public void SetData(int i, String k36_name2, int k36_kor2, int k36_eng2, int k36_mat2) {
		// TODO Auto-generated method stub
		// setDate 함수를 생성하여 입력값들을 계산한다.
		k36_i[i] = i;
		k36_name[i] = k36_name2;
		k36_kor[i] = k36_kor2;
		k36_mat[i] = k36_mat2;
		k36_eng[i] = k36_eng2;
		k36_sum[i] = k36_kor2 + k36_kor2 + k36_eng2;
		k36_ave[i] = (k36_kor2 + k36_kor2 + k36_eng2) / 3;

	}

}
