package java220415;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비정형비교 2,3
		for (int k36_i = 1; k36_i < 13; k36_i++) {// 1부터 12까지 반복문을 실행한다.
			System.out.printf("%d월 =>", k36_i);// 반복문을 실행하여 1월부터 12월까지의 값을 출력한다.
			for (int k36_j = 1; k36_j < 32; k36_j++) {// 1부터 31까지의 반복문을 실행한다.
				System.out.printf("%d, ", k36_j);// 반복문을 수행하여 쉼표를 찍고 반복한다.

				if (k36_i == 4 | k36_i == 6 | k36_i == 9 | k36_i == 11) {// 1부터 12까지의 반복문에 4,6,9,11에 해당되고
					if (k36_j == 30) {// 1부터 31까지의 반복문에서 30에 도달하면
						break;// 반복문에서 빠져나온다
					}
				}
				if (k36_i == 2) {// 1부터 12까지의 반복문에 2에 해당되고
					if (k36_j == 28) {// 1부터 31까지의 반복문에서 28에 도달하면
						break;// 반복문에서 빠져나온다
					}
				}

			}
			System.out.printf("\n");
		}
	}
}