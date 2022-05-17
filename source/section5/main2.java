package java220418;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 인쇄(2)
		for (int k36_i = 1; k36_i < 4; k36_i++) {// 구구단을 세로로 출력하기 위해 3번만 반복한다.
			System.out.printf("************\t************\t************\n");
			// 구구단 왼쪽에서 오른쪽으로 3씩 증가하기 때문에 3씩 증가하도록 출력한다.
			System.out.printf("구구단 %d 단\t구구단 %d 단\t구구단 %d 단\n", k36_i, k36_i + 3, k36_i + 6);
			System.out.printf("************\t************\t************\n");
			for (int k36_j = 1; k36_j < 10; k36_j++) { // 구구단 계산을 위해 1부터 9까지 반복한다.
				int k36_sum = k36_i * k36_j;// 구구단 계산을 구현
				System.out.printf("%d * %d = %d\t", k36_i, k36_j, k36_sum);
				k36_sum = (k36_i + 3) * k36_j;// ex)1단에서 4단으로 가기위해선 3을 더해야 한다.
				System.out.printf("%d * %d = %d\t", k36_i + 3, k36_j, k36_sum);// 구구단 출력
				k36_sum = (k36_i + 6) * k36_j;// ex)1단에서 7단으로 가기위해선 6을 더해야 한다.
				System.out.printf("%d * %d = %d\n", k36_i + 6, k36_j, k36_sum);// 구구단 출력
			}
		}
	}

}
