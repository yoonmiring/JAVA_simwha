package java220415;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자형.문자형 비교
		int k36_iI; // k36_iI정수형 선언
		double k36_iD;// k36_iD에 실수형 선언

		k36_iI = 10 / 3; // k36_iI는 10/3을 한 값을 넣는다.(정수형이기 때문에 3이라는 결과가 나옴)
		k36_iD = 10 / 3.0;// k36_iD는 10/3.0을 한 값을 넣는다.(실수형이기때문에 3.3333333이라는 결과가 나옴)

		if (k36_iI == k36_iD) {// k36_iI와 k36_iD의 값이 같으면
			System.out.printf("equal\n");// equal의 값을 출력한다
		} else {//그렇지 않으면
			System.out.printf("Not equal[%f][%f]\n", (double) k36_iI, k36_iD);//not equal을 출력하고, k36_iI은 실수형으로 k36_iD의 값을 출력해라
		}//k36_iI와 k36_iD는 k36_iI의 값이 정수형이기 때문에 3.000000과 같은 값이 나와 같지 않다고 볼 수 있다.
		if (k36_iD == 3.333333) {//k36_iD의 값이 3.33333과 같다면
			System.out.printf("equal\n");//equal을 출력한다
		} else {//그렇지 않으면	
			System.out.printf("Not equal[3.333333][%f]\n", k36_iD);//not equal과 [3.333333]을 출력하고, k36_iD의 값도 출력한다.
		}//k36_iD와 3.333333과 같지 않다.k36_iD는 뒤에 무수한 .333333으로 끝나기 때문에 숫자값인 3.333333과는 다른 값이 나온다.
		
		k36_iD = (int) k36_iD;//k36_iD의 값을 정수형으로 입력한다.
		if (k36_iI == k36_iD) {//k36_iI와 k36_iD의 값이 같다면
			System.out.printf("equal\n");//equal의 값을 출력한다
		} else {//그렇지 않으면
			System.out.printf("Not equal[%f][%f]\n", (double) k36_iI, k36_iD);//not equal을 출력하고, k36_iI의 실수형과 , k36_iD의 값을 출력한다.
		}
		System.out.printf("int로 인쇄[%d][%f]\n", k36_iI, k36_iD);//두개의 값을 비교하기 위해 k36_iI와 k36_iD(는 25번줄에서 정수형으로 선언)를 출력해라
		System.out.printf("double로 인쇄[%f][%f]\n", (double) k36_iI, k36_iD);//k36_iI을 실수형으로 출력하고 k36_iD의 값도 출력해서 확인해라

		char k36_a = 'c'; //k36_a의 문자형에 'c'라는 문자를 넣는다.
		if (k36_a == 'b') {//k36_a와 b가 같으면
			System.out.printf("a는 b이다\n");//a는 b이다 라는 값을 출력한다.
		}
		if (k36_a == 'c') {//k36_a와 c가 같으면
			System.out.printf("a는 c이다\n");//a는 c이다 라는 값을 출력한다
		}
		if (k36_a == 'd') {//k36_a와 d와 같으면
			System.out.printf("a는 d이다\n");//a는 d이다 라는 값을 출력한다
		}

		String k36_aa = "abcd";//k36_aa의 문자열에 "abcd"라는 문자열을 넣는다.
		if (k36_aa.equals("abcd")) {//k36_aa의 문자열과 "abcd"라는 값이 같으면
			System.out.printf("aa는 abcd이다.\n");//aa는 abcd이다라고 출력하고
		} else {//같지 않다면
			System.out.printf("aa는 abcd이 아니다.\n");//aa는 abcd이 아니다라고 출력한다
		}

		boolean k36_bb = true;//k36_bb의 논리형에 참의 값을 넣는다.

		if (!!k36_bb) {//k36_bb의 값이 아니고 아니면(즉 참)
			System.out.printf("bb가 아니고 아니면 참이다.\n");//bb가 아니고 아니면 참이다.의 값을 출력한다
		} else {//그렇지 않으면
			System.out.printf("bb가 아니고 아니면 거짓이다.\n");//bb가 아니고 아니면 거짓이다.의 값을 출력한다
		}
	}

}
