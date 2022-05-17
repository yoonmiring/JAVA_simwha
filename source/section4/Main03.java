package java220415;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k36_n, k36_m;//k36_n, k36_m에 정수형 선언
		k36_m = 20;//k36_m에 20을 선언
		k36_n = 1;//k36_n에 1을 선언
		while (true) {//while문을 무한으로 반복한다.
			for (int k36_i = 0; k36_i < k36_m; k36_i++) {//for반복문으로 k36_i의 값이 k36_m값 까지 도달할때까지
				System.out.printf(" ");//띄어쓰기를 실행한다.(즉 20부터 1씩 감소하는 형태로 진행)
			}
			for (int k36_i = 0; k36_i < k36_n; k36_i++) {//for 반복문으로 k36_i의 값이 k36_n값 까지 도달할때까지
				System.out.printf("*");//별을 찍어준다.(즉 1부터 2씩 증가하는 형태로 진행)
			}
			System.out.printf("\n");//for문이 끝나면 한줄띄운다

			k36_m = k36_m - 1;//k36_m의 값은 1씩 줄어들고
			k36_n = k36_n + 2;//k36_n의 값은 2씩 증가한다.

			if (k36_m < 0) {//k36_m의 값이 0 이하면
				break;//while반복문을 빠져나온다.
			}
		}
	}

}
