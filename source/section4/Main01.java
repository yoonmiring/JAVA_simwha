package java220415;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k36_i = 0; k36_i < 10; k36_i++) {// 반복문을 0부터 9까지 반복한다.
			for (int k36_j = 0; k36_j < k36_i; k36_j++) {// 두번째 반복문은 0부터 첫번째 반복문까지 반복한다.
				System.out.printf(" ");// 도달한 숫자만큼 띄운다.
			}
			System.out.printf("%d\n", k36_i);// 도달한 숫자를 출력후 한줄 띄운다
		}
	}

}
