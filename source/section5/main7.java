package java220418;

public class main7 {

	public static void main(String[] args) {

		int k36_iweekDay = 5; // 1월 1일을 금요일에 맞추기 위한 정수형 변수선언
		// 일요일이 0이기 때문에 금요일은 5로 설정해야한다.
		int[] k36_monthEndDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월별 마지막일자를 담은 정수형 배열을 선언한다.
		// 월별 마지막일자를 담은 배열인덱스 활용위해 k36_month는 0부터 시작
		for (int k36_month = 0; k36_month < 12; k36_month++) {// 1월부터 12월까지 반복하기 위해 for문을 선언한다.
			System.out.printf("\n\n%10d월\n", k36_month + 1); // 월별 제목 프린트, k36_month가 0부터 시작이라 k36_month + 1 해야 1월부터출력
			System.out.printf("======================\n");
			System.out.printf("%2s%2s%2s%2s%2s%2s%2s\n", "일", "월", "화", "수", "목", "금", "토"); // 요일 출력의 정렬을 위해 2s로 설정

			for (int k36_i = 1; k36_i <= k36_iweekDay; k36_i++) { // 1월 1일은 금요일 => 문자 "금" 앞까지
				System.out.printf("%3s", " "); // 빈칸 출력해서 일자 출력위치 조정하기 위해 3 * 5 = 15칸 여백을 설정
			}

			for (int k36_i = 1; k36_i <= k36_monthEndDay[k36_month]; k36_i++) { // 1부터 각 월의 마지막 일자까지 반복하기 위해 반복문 설정
				System.out.printf("%3d", k36_i); // 1부터 마지막 일자까지 출력(정렬을 위해 3칸으로 설정)

				k36_iweekDay++; // 일자 출력 후 + 1 => 전월 마지막요일 + 1 = 다음달 첫번째 요일
				if (k36_iweekDay % 7 == 0) { // 줄바꿈을 위해 7로 나눈 후 나머지가 0일 때
					System.out.printf("\n"); // 줄바꿈 출력
				}
			}
			k36_iweekDay %= 7; // 마지막 k36_iweekDay를 7로 나눈 나머지값이 다음달 시작 k36_iweekDay가 되게 초기화한다.
			// k36_iweekDay는 7을 초과할 수 없도록 설정
		}
	}
}