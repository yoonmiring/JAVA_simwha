package java220415;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 범위를 주어 비교하기
		int k36_iVal; //k36_iVal에 정수형 선언
		for (int i = 0; i < 300; i++) {//0부터 300까지 1씩 증감하는 반복문 실행
			k36_iVal = 5 * i;//i에 5를 곱해서 k36_iVal에 실행해라
			if (k36_iVal >= 0 && k36_iVal < 10) {//k36_iVal이 0보다 크거나 같고 10보다 작으면
				System.out.printf("일 %d\n", k36_iVal);//일과 5의 배수인 k36_iVal의 숫자를 출력해라
			} else if (k36_iVal >= 10 && k36_iVal < 100) {//k36_iVal이 10보다 크거나 같고 100보다 작으면
				System.out.printf("십 %d\n", k36_iVal);//십과 5의 배수인 k36_iVal의 숫자를 출력해라
			} else if (k36_iVal >= 100 && k36_iVal < 1000) {//k36_iVal이 100보다 크거나 같고 1000보다 작으면
				System.out.printf("백 %d\n", k36_iVal);//백과 5의 배수인 k36_iVal의 숫자를 출력해라
			} else {//그 외의 값이 나오면
				System.out.printf("천 %d\n", k36_iVal);//천과 5의 배수인 k36_iVal의 숫자를 출력해라
			}
		}
	}

}
