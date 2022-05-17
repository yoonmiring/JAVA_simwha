package java220415;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단순 비교
		int k36_iA, k36_iB;// 정수형 k36_iA, k36_iB을 선언한다.

		k36_iA = 0; // k36_iA을 0으로 초기화 해준다.
		while (true) {// 무한으로 A반복문을 수행해라
			k36_iB = 0; // k36_iB을 0으로 초기화 해준다.
			while (true) {// 무한으로 B반복문을 수행해라
				System.out.printf("*");// 무한으로 반복문을 수행 할때 *을 한개 찍어라

				if (k36_iA == k36_iB) { // k36_iA와 k36_iB의 값이 같을때
					break;// 반복문을 빠져나와라
				}
				k36_iB++;// k36_iB의 값은 계속 1씩 증가한다.
			}
			System.out.println("\n");//B반복문을 빠져나오면 줄바꿈을 실행해라 
			k36_iA++;// k36_iA의 값은 계속 1씩 증가한다.
			if (k36_iA == 30) {//만약  k36_iA의 값이 30에 도달한다면
				break;//반복문을 빠져나와라
			}
		}
	}

}
