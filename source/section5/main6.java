package java220418;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###");// 숫자에 콤마를 찍기 위해 포맷 선언
		Calendar k36_cal = Calendar.getInstance();// 캘린더 라이브러리 설정
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");// 현재 일자 출력 포맷 설정
		SimpleDateFormat k36_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// 출차시간 출력 포맷 설정
		SimpleDateFormat k36_sdt3 = new SimpleDateFormat("YYYYMMdd");// 바코드 마지막 일자 출력 포맷설정
		String[] k36_itemname = { "EF낱개초밥", "재사용종량제봉투20L", "피코크 새우볶음밥840", "세이브아몬드콤보팝콘", "TOP초코렛모카275ml",
				"맥심TOP블랜드275ML", "동원)어린이치즈180g", "덴)아기소얼룩소Step2", "말하는 메탈 경찰차", "야채통새우볶음밥450g", "해태 계란과자70g",
				"크라운 야채타임 70g", "크라운 꽃게랑 70g", "농심 오징어집 83g", "크림치즈피자L", "롯데 몽쉘카카오374g", "왕고래밥볶음56g", "노브랜드팬케익180g",
				"노브랜드브라우니180g", "노브랜드머핀믹스180g", "하나 가쯔오30g", "보겔 팝콘용옥수수700g", "세방코코넛밀크400ml", "s남양이오베이비80ml*5",
				"상하유기멸균우유125ml", "대니쉬우유 900ml*2", "날씬돈앞다리", "유기농쌀과자자색고구마칩", "유기농쌀과자단호박", "유기농쌀과자자색고구마칩", "비비고물만두 370*2",
				"바삭한치킨너겟66", "iPad Air(4세대) 64GB 실버 와이파이(MYFN2KH/A)", "애플 Apple Pencil 2세대(MU8F2KH/A)",
				" iPad(7세대) 및 iPad Air(3세대)용 Smart Keyboard - 한국어(MX3L2KH/A)", "레고 71765 닌자 울트라 콤보 로봇 [닌자고] 레고 공식",
				"레고 10970 소방서와 헬리콥터 [듀플로] 레고 공식", "채스워스 경량 덕다운 이불 퀸 200x230cm 500g",
				"[스와치그룹코리아 정품] 바론첼리 레이디25 M0390071104600", "남성 골프웨어 윈드 보머재킷 12609",
				"미즈노 ST-z 페어웨이우드 (로프트조절 / 3 / 5 / 샤프트 R,SR,S선택)" };// 아이템 배열을 넣어준다*/
		int[] k36_price = { 4900, 350, 7980, 1950, 970, 970, 4580, 4580, 1200, 5060, 1580, 1180, 980, 1110, 12500,
				4780, 980, 1080, 1080, 1080, 4980, 2650, 3330, 1810, 2900, 4280, 34810, 1980, 1980, 1980, 8480, 5480,
				755630, 160050, 193030, 95900, 103900, 963000, 999000, 950000, 209000 };// 가격 배열을 넣어준다*/
		int[] k36_num = { 1,10, 22, 5, 42, 10, 12, 5, 27, 1, 1, 27, 6, 9, 10, 10, 50, 20, 10, 5, 10, 10, 1, 2, 20, 10,
				3, 10, 10, 2, 1, 3, 2, 1, 15, 1, 1, 1, 1, 3, 4 };// 주문 수량 갯수 배열을 넣어준다.*/
		boolean[] k36_taxfree = { false,true, false, false, false, false, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, true, true, true,
				false, false, false, false, false, false, false, false, false, false, false, false, false, false };// 면세유무
																													// 확인
																													// 배열을
																													// 넣어준다.*/

		double k36_taxfreeSum = 0;// 면세 물품의 합을 구하기 위해 실수형으로 선언한다.
		int k36_iPrice = 0;// 총 금액을 구하기 위한 정수형으로 선언한다.
		double k36_taxRate = 0.1;// 세금 비율을 실수형으로 선언하고 0.1으로 설정한다.
		int k36_sumiPrice = 0;// 면세 품목의 값을 정수형으로 선언한다
		int k36_point = 32500;// 포인트는 고정값으로 설정
		int k36_posNum1 = 11;// 포스 넘버 앞자리 부분을 정수형으로 설정
		int k36_posNum2 = 9861;// 포스 넘버 뒷자리 부분을 정수형으로 설정
		System.out.printf("%13s %-1s\n", " ", "이마트 죽전점 (031)688-1234");
		System.out.printf("%-10s %-1s\n", "이마트 ", "206-86-50913 강희석");
		System.out.printf("%13s %-1s\n", " ", "용인 수지구 포은대로 552");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참고)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
		System.out.printf("[구매]%s %9s%04d-%d\n", k36_sdt.format(k36_cal.getTime()), "POS:", k36_posNum1, k36_posNum2);// 현재시간과
																														// 포스넘버를
																														// 설정하여
																														// 출력한다.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%2s %7s %8s %3s %8s\n", " ", "상 품 명", "단 가", "수량", "금 액");

		System.out.printf("-----------------------------------------\n");
		for (int k36_i = 0; k36_i < k36_itemname.length; k36_i++) {// 배열의 값들을 꺼내기 위해 품목이름의 배열 만큼 반복문을 돌린다.
			if (k36_taxfree[k36_i] == true) {// 만약 면세 유무의 값이 true일 경우
				k36_taxfreeSum += k36_price[k36_i] * k36_num[k36_i];// 면세 물품의 합을 구한다.(면세의 가격*갯수)
				System.out.printf("%-2s", "*");// 물품앞에 *표시를 해준다.
			} else {// 면세 유무의 값이 false일 경우
				k36_sumiPrice += k36_price[k36_i] * k36_num[k36_i];// 면세품목이 아닌 가격의 합을 구한다.
				System.out.printf("%-2s", " ");// 물품 앞에 공백으로 표시해준다.
			}
			k36_iPrice += k36_price[k36_i] * k36_num[k36_i];// 총 금액은 가격*갯수의 누적 합을 구한다.

			System.out.printf("%s %s", k36_subStrByte(k36_itemname[k36_i], 14), "");// 물품의 길이를 14로 잘라 위치에 넣어준다.
			System.out.printf("%10s %2s %10s\n", k36_df.format(k36_price[k36_i]), k36_num[k36_i],
					k36_df.format(k36_price[k36_i] * k36_num[k36_i]));// 그 외의 단가 수량 금액의 값을 넣기 위해 자리를 배치해준다.

			if ((k36_i + 1) % 5 == 0) {// 만약 5번째 줄이 오면 밑에 줄을 넣어준다.
				System.out.printf("-----------------------------------------\n");
			}
		}
		int k36_sum = (int) (k36_iPrice - k36_taxfreeSum);// 총 금액에서 면세 물품의 합을 빼주어 과세물품(+부가세) 가격의 합을 정수형으로 구한다.
		int k36_netPrice = (int) (k36_sum / (1 + k36_taxRate));// 과세물품(+부가세)의 합에서 세금비율에 +1을 하여 나누어주면 과세 물품의 값이 나온다.
		System.out.printf("\n");
		System.out.printf("%14s %s %13s\n", " ", "총 품목 수량", k36_df.format(k36_itemname.length));// 총 품목의 수량을 구하기 위해
																								// 아이템배열의 길이를 넣어준다.
		System.out.printf("%11s %s %13s\n", " ", "(*)면 세  물 품", k36_df.format(k36_taxfreeSum));// 면세물품의 값을 콤마포맷을 넣어
																								// 출력한다.
		System.out.printf("%14s %s %13s\n", " ", "과 세  물 품", k36_df.format(k36_netPrice));// 과세물품의 값을 콤마포맷을 넣어 출력한다.
		System.out.printf("%14s %s %13s\n", " ", "부   가   세", k36_df.format(k36_sumiPrice - k36_netPrice));// 부가세의 값을
																											// 콤마포맷을 넣어
																											// 출력한다.
		System.out.printf("%14s %s %13s\n", " ", "합        계", k36_df.format(k36_iPrice));// 합계의 값을 콤마포맷을 넣어 출력한다.
		System.out.printf("%-1s %11s %11s\n", "결 제 대 상 금 액", " ", k36_df.format(k36_iPrice));// 합계의 값을 콤마포맷을 넣어 출력한다.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-15s %1s %12s\n", "0012 KEB 하나", "", "541707**0484/35860658");
		System.out.printf("%-18s일시불 /%11s\n", "카드결제(IC)", k36_df.format(k36_iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%9s %s \n", " ", "[신세계포인트 적립]");
		System.out.printf("정*민 고객님의 포인트 현황입니다. \n");
		System.out.printf("%-10s %15s %7s\n", "금회발생포인트", "9350**9995", k36_df.format(k36_iPrice / 1000));// 총 합계에서 1000을
																											// 나누어
																											// 포인트가격을
																											// 설정한다.
		System.out.printf("%-10s %14s( %6s)\n", "누계(가용)포인트", k36_df.format(k36_point), // 지정해준 포인트값과
				k36_df.format(k36_point - (k36_iPrice / 1000)));// 포인트에서 영수증에서 나온 합계의1000을 나눈 값을 빼 가용포인트를 출력한다.
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n ");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4s %s \n", " ", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s %21s %s\n", "차량번호 :", "", "52루****");
		k36_cal.add(Calendar.HOUR, -2);// 입차시간은 2시간 전으로 설정하여
		System.out.printf("%s %10s %s\n", "입차시간 :", "", k36_sdt2.format(k36_cal.getTime()));// 입차시간을 출력한다.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양OO                     1150\n");
		System.out.printf("%4s%-20s\n", "", "│││││ ││││ │││││ │││││ │││││ │││││");
		System.out.printf("%4s%-20s\n", "", "│││││ ││││ │││││ │││││ │││││ │││││");
		System.out.printf("%7s%-8s/%04d%4d/%08d/%2d\n", "", k36_sdt3.format(k36_cal.getTime()), k36_posNum1,
				k36_posNum2, k36_iPrice, k36_itemname.length);// 영수증 아래에 날짜와 포스넘버 결제금액 품목수량을 넣어 바코드 번호를 만들어준다.

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
