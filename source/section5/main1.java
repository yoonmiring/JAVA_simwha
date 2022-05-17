package java220418;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int k36_i = 1; k36_i < 10; k36_i = k36_i + 3) {// 1단부터 9단까지 반복문을 돌리기 위함
			System.out.printf("***********\t***********\t***********\n");
			System.out.printf("구구단 %d 단\t구구단 %d 단\t구구단 %d 단\n", k36_i, k36_i + 1, k36_i + 2);// 가로로 1씩증가하기 때문에 +1을 한다.
			System.out.printf("***********\t***********\t***********\n");
			for (int k36_j = 1; k36_j < 10; k36_j++) {// 각 구구단의 계산을 위해 반복문을 한번 더 돌려준다.
				int k36_sum = k36_i * k36_j;// 가장 왼쪽 계산 구현
				System.out.printf("%d * %d = %d\t", k36_i, k36_j, k36_sum);// 가장 왼쪽 단의 출력
				k36_sum = (k36_i + 1) * k36_j;// 중간 계산 구현
				System.out.printf("%d * %d = %d\t", k36_i + 1, k36_j, k36_sum);// 중간 단의 출력
				k36_sum = (k36_i + 2) * k36_j;// 가장 오른쪽 계산 구현
				System.out.printf("%d * %d = %d\n", k36_i + 2, k36_j, k36_sum);// 가장 오른쪽 단의 출력
			}
		}
	}

}
