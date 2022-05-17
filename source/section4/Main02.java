package java220415;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sin 함수 그래프 그리기

		// sin 값 출력하기
		double k36_fSin;// k36_fSin의 값을 실수형 double로 선언한다.

		for (int k36_i = 0; k36_i < 360; k36_i++) {// 반복문을 0부터 359(한바퀴)까지 실행한다.
			// 180도는 1파이 라디언 // 원은 2파이 라디언
			k36_fSin = Math.sin(k36_i * 3.141592 / 180);// 라디언 값을 출력하기 위해 일반 각도 * 파이 나누기 180을 한다.
														// 라디언 값을 math함수를 사용해서 sin값으로 변환한다.
			System.out.printf("%d sin ===>%f\n", k36_i, k36_fSin);// 0부터 360까지의 각도를 sin값으로 변환한것을 출력한다.
		}
		// sin그래프 출력하기
		for (int k36_i = 0; k36_i < 360; k36_i++) {// 반복문을 0부터 359까지(한바퀴)를 실행한다
			k36_fSin = Math.sin(k36_i * 3.141542 / 180);// 라디언 값을 math함수를 사용해서 sin값으로 변환한다.
			// 1에서 sin값을 빼는 이유는 sin값은 -1에서 1까지의 값이 나오기 때문에 양수화 하여 0에서 2까지의 값이 나올 수 있도록 한다.
			// *50을 하는 이유는 양수화된 숫자를 0에서 100까지의 숫자로 표현하기 위함이다.
			int k36_iSpace = (int) ((1.0 - k36_fSin) * 50);// 1에서 sin 값을 빼고 50을 곱해준 값을 정수형으로 변환하여 k36_iSpace에 저장한다.
			for (int k36_j = 0; k36_j < k36_iSpace; k36_j++) {// 반복문을 실행한다
				System.out.printf(" ");// k36_iSpace값만큼 도달한 만큼 띄어쓰기를 실행한다
			}
			System.out.printf("*[%f][%d]\n", k36_fSin, k36_iSpace);// 0부터 359까지 실행하는 반복문을 출력하면서 sin의 값과 계산된 0부터 100까지의
																	// 숫자의 값도 출력한다.
		}
	}

}
