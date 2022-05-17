package java220418;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat K36_df = new DecimalFormat("###,###,###,###");// 숫자에 콤마를 찍기 위해 포맷 선언
		Calendar K36_cal = Calendar.getInstance();// 캘린더 라이브러리 설정
		SimpleDateFormat K36_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// 현재 일자 출력 포맷 설정

		String K36_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";// 보기에 있는 항목을 아이템네임1 문자열로 설정
		String K36_itemcode1 = "1031615";// 보기에 있는 항목의 코드를 아이템코드1 문자열로 설정
		int K36_price1 = 3000;// 아이템 1의 가격을 정수형으로 설정
		int K36_amount1 = 2;// 아이템 1의 구매 갯수를 정수형으로 설정
		String K36_itemname2 = "슬라이드식명찰(가로형)(100호)";// 보기에 있는 항목을 아이템네임2 문자열로 설정
		String K36_itemcode2 = "1008152";// 보기에 있는 항목의 코드를 아이템코드2 문자열로 설정
		int K36_price2 = 1000;// 아이템 2의 가격을 정수형으로 설정
		int K36_amount2 = 1;// 아이템 2의 구매 갯수를 정수형으로 설정
		String K36_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";// 보기에 있는 항목을 아이템네임3 문자열로 설정
		String K36_itemcode3 = "1020800";// 보기에 있는 항목의 코드를 아이템코드3 문자열로 설정
		int K36_price3 = 1000;// 아이템3의 가격을 정수형으로 설정
		int K36_amount3 = 1;// 아이템3의 구매 갯수를 정수형으로 설정

		// 각 아이템별 가격과 갯수를 곱한 후 더하여 가격의 총 합을 구함
		int K36_iPrice = K36_price1 * K36_amount1 + K36_price2 * K36_amount2 + K36_price3 * K36_amount3;
		double K36_taxRate = 0.1;// 세금을 실수형으로 선언
		int K36_netPrice = (int) (K36_iPrice / (1 + K36_taxRate) + 0.5);// 과세 합계를 구하기 위해 총 가격에서 세금을 나누어 계산

		System.out.printf("%12s %-20s\n", " ", "\"국민가게, 다이소\"");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화: 031-702-6016\n");
		System.out.printf("본사: 서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표: 박정부,신호섭 213-81-52063\n");
		System.out.printf("%s\n", "매장: 경기 성남시 분당구 분당로 53번길 11 (서현");
		System.out.printf("%s\n", "동)");
		System.out.printf("================================================\n");
		System.out.printf("%8s %s", " ", "소비자중심경영(CCM)인증기업\n");
		System.out.printf("%5s %s", " ", "ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("================================================\n");
		System.out.printf("%8s %s", " ", "교환/환불 14일(03월12일)이내,\n");
		System.out.printf("%s", "(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("%6s %s", " ", "포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("%8s %s", " ", "체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("================================================\n");
		System.out.printf("%-28s %s\n", "[POS 1058231]", K36_sdt.format(K36_cal.getTime()));// 현재시간을 포맷에 맞춰 출력
		System.out.printf("================================================\n");
		System.out.printf("%s %7s %3d %8s\n", k36_subStrByte(K36_itemname1, 26), K36_df.format(K36_price1), K36_amount1,
				K36_df.format(K36_price1*K36_amount1));// 설정된 아이템1 이름을 일정크기만큼 자른후 가격과 갯수 가격을 출력
		System.out.printf("[%s]\n", K36_itemcode1);// 코드도 출력
		System.out.printf("%s %7s %3d %8s\n", k36_subStrByte(K36_itemname2, 26), K36_df.format(K36_price2), K36_amount2,
				K36_df.format(K36_price2*K36_amount2));// 설정된 아이템2 이름을 일정크기만큼 자른후 가격과 갯수 가격을 출력
		System.out.printf("[%s]\n", K36_itemcode2);// 코드도 출력
		System.out.printf("%s %7s %3d %8s\n", k36_subStrByte(K36_itemname3, 26), K36_df.format(K36_price3), K36_amount3,
				K36_df.format(K36_price3*K36_amount3));// 설정된 아이템3 이름을 일정크기만큼 자른후 가격과 갯수 가격을 출력
		System.out.printf("[%s]\n", K36_itemcode3);// 코드도 출력
		System.out.printf("%10s %8s %24s\n", "", "과세합계", K36_df.format(K36_netPrice));// 계산된 과세합계를 불러와 출력한다.
		System.out.printf("%11s %8s %24s\n", "", "부가세", K36_df.format(K36_iPrice - K36_netPrice));// 전체금액에서 과세금액을 뺀 부가세를
																									// 출력한다.
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%-10s %8s %24s\n", "판매합계", "", K36_df.format(K36_iPrice));// 총 가격을 출력한다.
		System.out.printf("================================================\n");
		System.out.printf("%-10s %8s %24s\n", "신용카드", "", K36_df.format(K36_iPrice));// 카드를 결제한 총 가격을 출력한다.
		System.out.printf("------------------------------------------------\n");
		System.out.printf("%-10s %9s %24s", "우리카드", "", "538720**********\n");
		System.out.printf("%-10s %6s %10s %s\n", "승인번호 70404427(0)", "", "승인금액", K36_df.format(K36_iPrice));// 승인금액을 총
																											// 가격을 출력한다.
		System.out.printf("================================================\n");
		System.out.printf("%8s %s 분당서현점\n", " ", K36_sdt.format(K36_cal.getTime()));// 현재날짜를 출력한다.
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의:1599-2211\n");
		System.out.printf("%10s %s", " ", "│││││ ││││ │││││ │││││\n");
		System.out.printf("%10s %s", " ", "│││││ ││││ │││││ │││││\n");
		System.out.printf("%12s %s", " ", "2112820610158231\n");
		System.out.printf("-------------------------------------------------\n");
		System.out.printf("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서 \n  회원가입 후 다양한 혜택을 누려보세요! ◈\n");
	}

	// 원하는 한글 바이트 크기를 잘라주는 메서드 함수를 지정
	public static String k36_subStrByte(String k36_source, int k36_cutLength) {
		if (!k36_source.isEmpty()) {// 문자열의 값이 비어있지 않고
			k36_source = k36_source.trim();// 문자열의 좌우에 있는 빈칸을 제거해줌(가운데 공백은 제거하지않음)
			if (k36_source.getBytes().length < k36_cutLength) {// 설정한 값 만큼 설정한 문자열을 바이트로 받아서 길이보다 적을경우.
				for (int k36_i = k36_cutLength - k36_source.getBytes().length; k36_i > 0; k36_i--) {// 설정한 값에서 바이트의 길이를
																									// 뺀 값 만큼 반복문을 돌린다.
					k36_source += " ";// 반복문만큼 출력한다.
				}
				return k36_source;// 리턴값을 k36_source로 준다.
			} else {// 설정한 값 만큼 설정한 문자열을 바이트로 받아서 길이보다 적지 않을 경우
				StringBuffer k36_sb = new StringBuffer(k36_cutLength);// 문자열을 추가하는 포맷을 설정한다.
				int k36_cnt = 0;// 정수형을 0으로 초기화 하여
				for (char k36_ch : k36_source.toCharArray()) {// for-each문을 사용하여 반복문을 설정하여 k36_source에 있는 값을 char값으로 바꾼
																// 후 반복한다.
					k36_cnt += String.valueOf(k36_ch).getBytes().length;// k36_ch을 바이트 값으로 받으면서 길이만큼 누적하여 넣어둔다
					if (k36_cnt > k36_cutLength) {// 만약k36_cnt값이 설정한 k36_cutLength보다 크다면
						break;// 반복문을 빠져나온다.
					}
					k36_sb.append(k36_ch);// k36_sb에서 k36_ch를 추가하여 뒤에 붙인다.
				}

				if (k36_sb.toString().getBytes().length == 26) {// 만약 k36_sb의 문자열로 변경후 바이트 값의 길이가 26일 경우
					k36_sb.append(" ");// 공백을 붙인다.
				}

				return k36_sb.toString();// k36_sb를 문자열을 리턴값으로 준다
			}
		} else {// 문자열의 값이 비어져있으면
			return "";// 리턴값을 공백으로 보내준다.
		}
	}

}
