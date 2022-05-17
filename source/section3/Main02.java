package java220414;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 소비자 세금계산
		String[] k36_item = { "커피땅콩", "매운새우깡", "홈런볼", "허니버터칩", "꼬깔콘" }; // 구매할 과자 이름을 k36_item 배열에 넣는다.
		int[] k36_price = { 1000, 2000, 3000, 2400, 1450 }; // 구매 과자의 가격을 k36_price배열에 넣는다
		int[] k36_amount = { 3, 2, 1, 5, 6 };// 구매할 과자의 갯수를 k36_amount배열에 넣는다.
		double k36_tax_rate = 0.1;// 세금의 비율을 실수값으로 설정해준다.
		int k36_total_sum = 0;// 지불해야 할 금액을 정수값으로 설정 후 초기화 시켜준다.

		System.out.printf("***************************************************\n");
		System.out.printf("                원 할 인 마 트               \n");// 우리집앞 슈퍼 이름
		System.out.printf("%7s\t%7s\t%2s\t%9s\n", "항목", "단가", "수량", "합계");// 영수증에 찍힐 목록의 이름을 적어준다.
		System.out.printf("===================================================\n");
		for (int i = 0; i < k36_item.length; i++) {// 구매할과자의 종류만큼 반복문을 설정한다.
			int sum = k36_price[i] * k36_amount[i];// 각 과자의 가격과 갯수만큼 곱하여 합계값에 넣어준다.
			k36_total_sum = k36_total_sum + sum;// 합계의 값을 과자의 종류만큼 돌려 총 합계를 구한다.
			System.out.printf("%7s\t %7d\t %2d\t %9d\n", k36_item[i], k36_price[i], k36_amount[i], sum);
		}
		System.out.printf("===================================================\n");
		System.out.printf("지불 금액 :%39d\n", k36_total_sum);//총 합계의 값을 출력한다.

		int k36_total_net_price = (int) (k36_total_sum / (1 + k36_tax_rate));//과세 금액을 정수값으로 설정한다. 총합계에서 세금의비율에 +1을 한 값을 나누어준다.
		System.out.printf("과세 금액 :%39d\n", k36_total_net_price); //과세 금액을 출력한다.
		int k36_tax = k36_total_sum - k36_total_net_price;//총 합계에서 과세 금액을 빼 세금의 가격을 구한다.
		System.out.printf("세     금 :%39d\n", k36_tax);//세금의 가격을 출력한다.
	}

}
