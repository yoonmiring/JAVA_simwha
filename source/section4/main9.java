package java220415;

public class main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k36_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// 달의 마지막날을 배열에 넣는다.
		for (int k36_i = 1; k36_i < 13; k36_i++) {// 1부터 12까지의 반복문을 실행해하여
			System.out.printf("%d월 =>", k36_i);// 월의 값을 출력한다.
			for (int k36_j = 1; k36_j < 32; k36_j++) {// 1부터 31까지 반복문을 실행하여
				System.out.printf("%d", k36_j);// 출력한다.
				// 배열의 값에서 월의 값과 배열의 위치가 일치할 경우 반복문을 빠져나오는 코드를 짠다.
				// 배열은 0부터 시작하고 i의 값은 1부터 시작하기 때문에 -1을 해준다.
				if (k36_iLMD[k36_i - 1] == k36_j) {
					break;
				}
				System.out.printf(",");// 마지막날은 쉼표를 생략하기위해 if문의 바깥쪽에 선언한다.

			}
			System.out.printf("\n");
		}
	}

}
