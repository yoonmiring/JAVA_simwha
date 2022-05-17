package java220414;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단순 세금 계산
		int k36_val = 271; // 세전의 물건 값
		int k36_rate = 3; // 세금 3%

		int k36_tax = taxcal(k36_val, k36_rate); // taxcal의 함수를 불러와 k36_tax정수형 변수에 넣는다.

		System.out.printf("*****************************************\n");
		System.out.printf("*            단순 세금 계산             *\n");
		System.out.printf("실제 세금계산: %f\n", k36_val * k36_rate / 100.0);// 세전의 물건 값에 세금을 곱하고 100을 나누어 실수형으로 출력한다.
		System.out.printf("세전 가격: %d 세금 : %d 세포함가격: %d\n", k36_val, k36_tax, k36_val + k36_tax);// 세전가격, 세금, 세금포함가격을
																								// 출력한다.
		System.out.printf("*****************************************\n");
	}

	public static int taxcal(int k36_val, int k36_rate) {
		int k36_ret; // 정수형k36_ret을 선언한다.
		if (((double) k36_val * (double) k36_rate / 100.0) == k36_val * k36_rate / 100) {// 세전의 물건값과 세금을 곱한 후 100으로
																							// 나누엇을때 가격이 정수형과 실수형으로 같은
																							// 값이 나온다면
			k36_ret = k36_val * k36_rate / 100;// 세전의 물건값과 세금을 곱한 후 100으로 나눈 값을 ret으로 출력하고
		} else {// 정수형과 실수형이 값이 다르다면
			k36_ret = k36_val * k36_rate / 100 + 1; // 세전의 물건값과 세금을 곱한 후 100으로 나눈값에 1을 더하여 출력한 후
		}
		return k36_ret; // k36_ret으로 리턴값을 준다

	}
}
