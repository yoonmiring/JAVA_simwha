package java220414;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #3. 정수형 연산

		int k36_ii; // k36_ii로 정수 선언
		k36_ii = 1000 / 3; // 1000을 3으로 나눈 정수
		System.out.printf("#3-1 : %d\n", k36_ii);
		k36_ii = 1000 % 3;// 1000을 3으로 나누었을때 나오는 나머지
		System.out.printf("#3-2 : %d\n", k36_ii);

		// 나머지 연산자 응용
		for (int i = 0; i < 20; i++) {// 0부터 19까지 증감한다.
			System.out.printf("#3-3 : %d ", i);// 0부터 19까지 순서대로 출력한다.

			if (((i + 1) % 5) == 0) {// 0부터 19까지는 +1로 하여 1부터 20까지 5로 나누어 나머지가 0일 경우
				System.out.println("\n"); // 한줄 띄운다.
			}
		}
	}

}
