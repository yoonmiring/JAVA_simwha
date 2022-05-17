package java220414;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #5.소수점 자리의 반올림 버림 처리

		int k36_MyVal = 14 / 5; //정수형 k36_MyVal을 선언 후 14나누기 5를 한다.
		System.out.printf("#5-1 : %d\n", k36_MyVal);

		double k36_MyValF; //실수형 k36_MyValF을 선언 한다.
		k36_MyValF = 14 / 5; //실수형으러 14/5를한다
		System.out.printf("#5-2 : %f\n", k36_MyValF);

		k36_MyValF = 14.0 / 5; //실수형으로 14.0으로 나타내야 실수형결과가 출력된다.
		System.out.printf("#5-3 : %f\n", k36_MyValF);

		k36_MyValF = (14.0) / 5 + 0.5; //실수형 계산에서 +0.5를 한다
		System.out.printf("#5-4 : %f\n", k36_MyValF);

		k36_MyVal = (int) ((14.0) / 5 + 0.5);//실수형 계산을 한 후 0.5를 더한 값에서 정수형으로 변환을 하여 정수로 나타낸다
		System.out.printf("#5-5 : %d\n", k36_MyVal);

	}

}
