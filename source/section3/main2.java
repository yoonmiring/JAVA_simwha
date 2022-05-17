package java220414;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #2. 누적하기, 합구하기
		int k36_sum; // k36_sum값을 정수형으로 선언
		k36_sum = 0;// 0으로 초기화

		for (int i = 1; i < 101; i++) {
			k36_sum = k36_sum + i;// 1부터 100까지 1씩 증감하여 더해서 누적한다.
		}
		System.out.printf("#2 : %d\n", k36_sum);// 누적해서 더한 값을 출력한다.
		System.out.printf("#2-2 : %d\n", k36_sum / 100);// 누적해서 더한 값에 100을 나누어 출력한다.

		int[] k36_v = { 1, 2, 3, 4, 5 }; // k36_v배열에 1,2,3,4,5 정수를 넣는다.
		int k36_vSum = 0;// 0으로 초기화
		for (int i = 0; i < 5; i++) {// 0부터 5까지 증감한다
			k36_vSum = k36_vSum + k36_v[i]; // 배열에 있는 0위치부터 5위치까지 누적하여 더한다.
		}
		System.out.printf("#2-3 : %d\n", k36_vSum);// 누적한 배열의 값을 출력한다.
	}

}
