package java220415;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case문 비교
		for (int k36_i = 1; k36_i < 13; k36_i++) {// 1부터 12까지의 반복문을 실행한다
			System.out.printf("%d월 =>", k36_i);// 반복문을 실행하여 1부터 12까지의 값을 출력한다.
			loop: for (int k36_j = 1; k36_j < 32; k36_j++) {// 1부터 31까지의 반복문을 실행하면서 loop의 값으로 준다.
				System.out.printf("%d,", k36_j);// 반복문을 수행하여 쉼표를 찍고 출력한다.

				switch (k36_i) {// 1부터 12까지의 반복문에서
				case 4:
				case 6:
				case 9:
				case 11:// 4,6,9,11에 해당하고
					if (k36_j == 30) {// 1부터 31까지의 반복문에서 30에 도달하면
						break loop; // 반복문을 빠져나와 loop로 이동한다
					}
				case 2:// 2에 해당되면
					if (k36_j == 28) {// 1부터 31까지의 반복문에서 28에 도달하면
						break loop;// 반복문을 빠져나와 loop로 이동한다.
					}
				}

			}
			System.out.print("\n");

		}
	}
}
