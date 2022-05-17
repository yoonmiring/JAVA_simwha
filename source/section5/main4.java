package java220418;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k36_iPrice = 33000;// 주문합계 액 정수값으로 설정
		double k36_taxRate = 0.1;// 세금 적용을 위해 실수값 설정
		int k36_netPrice = (int) (k36_iPrice / (1 + k36_taxRate) + 0.5);// 세금을 적용해서 과세 합계를 구함 0.5를 더해 반올림 시킴
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###");// 금액에 콤마를 찍기위해 포맷 선언
		Calendar k36_cal = Calendar.getInstance();// 현재 날짜를 찍기 위해 캘린더 선언
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// 현재 날짜와 시간을 포맷을 설정해줌
		System.out.printf("신용승인\n");
		System.out.printf("단말기 : 2N68665898          전표번호 : 041218\n");
		System.out.printf("가맹점 : 한양김치찌개\n");
		System.out.printf("주  소 : 경기 성남시 분당구 황새울로351번길 10,\n1층\n");
		System.out.printf("대표자 : 유창신\n");
		System.out.printf("사업자 : 752-53-00558            TEL : 7055695\n");
		System.out.printf("-----------------------------------------------\n");
		// 숫자 콤마 포맷 설정 후 과세 합계 금액을 출력
		System.out.printf("금  액                                 %s원\n", k36_df.format(k36_netPrice));
		// 숫자 콤마 포맷 설정 후 총 합계에서 과세 합계를 빼 부가세를 출력
		System.out.printf("부가세                                  %s원\n", k36_df.format(k36_iPrice - k36_netPrice));
		System.out.printf("합  계                                 %s원\n", k36_df.format(k36_iPrice));// 총 합계를 설정
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****-4613(S)       일시불\n");
		System.out.printf("거래일시 : %s\n", k36_sdt.format(k36_cal.getTime()));// 현재 시간을 찍음
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사      가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("               * 감사합니다 *\n");
		System.out.printf("                             표준v2.08-20200212\n");

	}

}
