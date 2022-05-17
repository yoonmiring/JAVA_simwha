package java220415;

import java.text.DecimalFormat;

public class Main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 칸 맞춰 인쇄
		String k36_item = "사과";//k36_item에 사과라는 문자열 삽입
		int k36_unit_price = 5000;//k36_unit_price에 5000 정수형 선언
		int k36_num = 500;//k36_num에 500 정수형 선언
		int k36_total = 0;//k36_total 은 정수형 선언 후 0으로 초기화

		DecimalFormat k36_df = new DecimalFormat("###,###,###,###,###"); //숫자의 온점찍는 포맷 선언

		System.out.printf("=============================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");//품목, 단가,수량, 합계 목록을 출력하기 위해 문자열을 지정
		System.out.printf("=============================================================\n");

		System.out.printf("%20.20s%10.10s%10.10s%15.15s\n", k36_item, k36_df.format(k36_unit_price), k36_df.format(k36_num),
				k36_df.format(k36_unit_price * k36_num));//품목,단가,합계목록의 값을 온점찍는 포맷을 적용하여 출력

		System.out.printf("=============================================================\n");
	}

}
