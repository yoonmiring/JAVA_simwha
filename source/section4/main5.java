package java220415;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비정형 비교1(깔끔코딩)
		for (int k36_i = 1; k36_i < 13; k36_i++) {// 1부터 12까지 반복문을 실행한다.
			System.out.printf("%d월 =>", k36_i);// 반복문을 실행하여 1월부터 12월까지의 값을 출력한다.
			for (int k36_j = 1; k36_j < 32; k36_j++) {// 1부터 31까지의 반복문을 실행한다.
				System.out.printf("%d, ", k36_j);// 반복문을 수행하여 쉼표를 찍고 반복한다.

				if (k36_i == 1 && k36_j == 31) {// 1부터 12까지의 반복문에 1에 해당되고 1부터 31까지의 반복문에 31이 도달하면
					break;// 반복문에서 빠져나온다.
				} else if (k36_i == 2 && k36_j == 28) {// 1부터 12까지의 반복문에 2에 해당되고 1부터 31까지의 반복문에 28에 도달하면
					break;
				} else if (k36_i == 3 && k36_j == 31) {// 1부터 12까지의 반복문에 3에 해당되고 1부터 31까지의 반복문에 31이 도달하면
					break;
				} else if (k36_i == 4 && k36_j == 30) {// 1부터 12까지의 반복문에 4에 해당되고 1부터 31까지의 반복문에 30이 도달하면
					break;
				} else if (k36_i == 5 && k36_j == 31) {// 1부터 12까지의 반복문에 5에 해당되고 1부터 31까지의 반복문에 31이 도달하면
					break;
				} else if (k36_i == 6 && k36_j == 30) {// 1부터 12까지의 반복문에 6에 해당되고 1부터 31까지의 반복문에 30이 도달하면
					break;
				} else if (k36_i == 7 && k36_j == 31) {// 1부터 12까지의 반복문에 7에 해당되고 1부터 31까지의 반복문에 31이 도달하면
					break;
				} else if (k36_i == 8 && k36_j == 31) {// 1부터 12까지의 반복문에 8에 해당되고 1부터 31까지의 반복문에 31이 도달하면
					break;
				} else if (k36_i == 9 && k36_j == 30) {// 1부터 12까지의 반복문에 9에 해당되고 1부터 31까지의 반복문에 30이 도달하면
					break;
				} else if (k36_i == 10 && k36_j == 31) {// 1부터 12까지의 반복문에 10에 해당되고 1부터 31까지의 반복문에 31이 도달하면
					break;
				} else if (k36_i == 11 && k36_j == 30) {// 1부터 12까지의 반복문에 11에 해당되고 1부터 31까지의 반복문에 30이 도달하면
					break;
				} else if (k36_i == 12 && k36_j == 31) {// 1부터 12까지의 반복문에 12에 해당되고 1부터 31까지의 반복문에 31이 도달하면
					break;
				}
			}
			System.out.printf("\n");// 1부터 12까지의 반복문 실행 후 한줄 띄운다.
		}
	}

}
