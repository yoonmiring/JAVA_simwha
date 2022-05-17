package java220419;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int itemCount= 41;
		TitlePrint();
		TimeStemp();
		HeaderPrint();
		
		for(int i=0;i<itemCount;i++) {
			itemPrint(i);
		}
		
		TotalPrint();
	}

	private static void TotalPrint() {
		// TODO Auto-generated method stub
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###");
		String[] k36_itemname = { "EF낱개초밥", "재사용종량제봉투20L", "피코크 새우볶음밥840", "세이브아몬드콤보팝콘", "TOP초코렛모카275ml",
				"맥심TOP블랜드275ML", "동원)어린이치즈180g", "덴)아기소얼룩소Step2", "말하는 메탈 경찰차", "야채통새우볶음밥450g", "해태 계란과자70g",
				"크라운 야채타임 70g", "크라운 꽃게랑 70g", "농심 오징어집 83g", "크림치즈피자L", "롯데 몽쉘카카오374g", "왕고래밥볶음56g", "노브랜드팬케익180g",
				"노브랜드브라우니180g", "노브랜드머핀믹스180g", "하나 가쯔오30g", "보겔 팝콘용옥수수700g", "세방코코넛밀크400ml", "s남양이오베이비80ml*5",
				"상하유기멸균우유125ml", "대니쉬우유 900ml*2", "날씬돈앞다리", "유기농쌀과자자색고구마칩", "유기농쌀과자단호박", "유기농쌀과자자색고구마칩", "비비고물만두 370*2",
				"바삭한치킨너겟66", "iPad Air(4세대) 64GB 실버 와이파이(MYFN2KH/A)", "애플 Apple Pencil 2세대(MU8F2KH/A)",
				" iPad(7세대) 및 iPad Air(3세대)용 Smart Keyboard - 한국어(MX3L2KH/A)", "레고 71765 닌자 울트라 콤보 로봇 [닌자고] 레고 공식",
				"레고 10970 소방서와 헬리콥터 [듀플로] 레고 공식", "채스워스 경량 덕다운 이불 퀸 200x230cm 500g",
				"[스와치그룹코리아 정품] 바론첼리 레이디25 M0390071104600", "남성 골프웨어 윈드 보머재킷 12609",
				"미즈노 ST-z 페어웨이우드 (로프트조절 / 3 / 5 / 샤프트 R,SR,S선택)" };
		int[] k36_price = { 4900, 350, 7980, 1950, 970, 970, 4580, 4580, 1200, 5060, 1580, 1180, 980, 1110, 12500, 4780,
				980, 1080, 1080, 1080, 4980, 2650, 3330, 1810, 2900, 4280, 34810, 1980, 1980, 1980, 8480, 5480, 755630,
				160050, 193030, 95900, 103900, 963000, 999000, 950000, 209000 };
		int[] k36_num = { 1, 10, 22, 5, 42, 10, 12, 5, 27, 1, 1, 27, 6, 9, 10, 10, 50, 20, 10, 5, 10, 10, 1, 2, 20, 10,
				3, 10, 10, 2, 1, 3, 2, 1, 15, 1, 1, 1, 1, 3, 4 };
		boolean[] k36_taxfree = { false, true, false, false, false, false, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, true, true, true,
				false, false, false, false, false, false, false, false, false, false, false, false, false, false };// 면세유무*/
		double k36_taxfreeSum = 0;
		int k36_iPrice = 0;
		double k36_taxRate = 0.1;
		int k36_sumiPrice = 0;
		int k36_point = 32500;
		
		int k36_sum = (int) (k36_iPrice - k36_taxfreeSum);
		int k36_netPrice = (int) (k36_sum / (1 + k36_taxRate));
		
		Calendar k36_cal = Calendar.getInstance();
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat k36_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat k36_sdt3 = new SimpleDateFormat("YYYYMMdd");
		int k36_posNum1 = 11;
		int k36_posNum2 = 9861;
		System.out.printf("\n");
		System.out.printf("%14s %s %13s\n", " ", "총 품목 수량", k36_df.format(k36_itemname.length));
		System.out.printf("%11s %s %13s\n", " ", "(*)면 세  물 품", k36_df.format(k36_taxfreeSum));
		System.out.printf("%14s %s %13s\n", " ", "과 세  물 품", k36_df.format(k36_netPrice));
		System.out.printf("%14s %s %13s\n", " ", "부   가   세", k36_df.format(k36_sumiPrice - k36_netPrice));
		System.out.printf("%14s %s %13s\n", " ", "합        계", k36_df.format(k36_iPrice));
		System.out.printf("%-1s %11s %11s\n", "결 제 대 상 금 액", " ", k36_df.format(k36_iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-15s %1s %12s\n", "0012 KEB 하나", "", "541707**0484/35860658");
		// System.out.printf("%-21s일시불/%s%s", "카드결제(IC)", df.format(iPrice), "\n");
		System.out.printf("%-18s 일시불/%11s\n", "카드결제(IC)", k36_df.format(k36_iPrice));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%9s %s \n", " ", "[신세계포인트 적립]");
		System.out.printf("정*민 고객님의 포인트 현황입니다. \n");
		System.out.printf("%-10s %15s %7s\n", "금회발생포인트", "9350**9995", k36_df.format(k36_iPrice / 1000));
		System.out.printf("%-10s %14s( %6s)\n", "누계(가용)포인트", k36_df.format(k36_point),
				k36_df.format(k36_point - (k36_iPrice / 1000)));
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n ");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%4s %s \n", " ", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%s %21s %s\n", "차량번호 :", "", "52루****");
		k36_cal.add(Calendar.HOUR, -2);
		System.out.printf("%s %10s %s\n", "입차시간 :", "", k36_sdt2.format(k36_cal.getTime()));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양OO                     1150\n");
		System.out.printf("%4s%-20s\n", "", "│││││ ││││ │││││ │││││ │││││ │││││");
		System.out.printf("%4s%-20s\n", "", "│││││ ││││ │││││ │││││ │││││ │││││");
		System.out.printf("%7s%-8s/%04d%4d/%08d/%2d\n", "", k36_sdt3.format(k36_cal.getTime()), k36_posNum1,
				k36_posNum2, k36_iPrice, k36_itemname.length);
	}

	private static void itemPrint(int k36_i) {
		// TODO Auto-generated method stub
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###");
		String[] k36_itemname = { "EF낱개초밥", "재사용종량제봉투20L", "피코크 새우볶음밥840", "세이브아몬드콤보팝콘", "TOP초코렛모카275ml",
				"맥심TOP블랜드275ML", "동원)어린이치즈180g", "덴)아기소얼룩소Step2", "말하는 메탈 경찰차", "야채통새우볶음밥450g", "해태 계란과자70g",
				"크라운 야채타임 70g", "크라운 꽃게랑 70g", "농심 오징어집 83g", "크림치즈피자L", "롯데 몽쉘카카오374g", "왕고래밥볶음56g", "노브랜드팬케익180g",
				"노브랜드브라우니180g", "노브랜드머핀믹스180g", "하나 가쯔오30g", "보겔 팝콘용옥수수700g", "세방코코넛밀크400ml", "s남양이오베이비80ml*5",
				"상하유기멸균우유125ml", "대니쉬우유 900ml*2", "날씬돈앞다리", "유기농쌀과자자색고구마칩", "유기농쌀과자단호박", "유기농쌀과자자색고구마칩", "비비고물만두 370*2",
				"바삭한치킨너겟66", "iPad Air(4세대) 64GB 실버 와이파이(MYFN2KH/A)", "애플 Apple Pencil 2세대(MU8F2KH/A)",
				" iPad(7세대) 및 iPad Air(3세대)용 Smart Keyboard - 한국어(MX3L2KH/A)", "레고 71765 닌자 울트라 콤보 로봇 [닌자고] 레고 공식",
				"레고 10970 소방서와 헬리콥터 [듀플로] 레고 공식", "채스워스 경량 덕다운 이불 퀸 200x230cm 500g",
				"[스와치그룹코리아 정품] 바론첼리 레이디25 M0390071104600", "남성 골프웨어 윈드 보머재킷 12609",
				"미즈노 ST-z 페어웨이우드 (로프트조절 / 3 / 5 / 샤프트 R,SR,S선택)" };
		int[] k36_price = { 4900, 350, 7980, 1950, 970, 970, 4580, 4580, 1200, 5060, 1580, 1180, 980, 1110, 12500, 4780,
				980, 1080, 1080, 1080, 4980, 2650, 3330, 1810, 2900, 4280, 34810, 1980, 1980, 1980, 8480, 5480, 755630,
				160050, 193030, 95900, 103900, 963000, 999000, 950000, 209000 };
		int[] k36_num = { 1, 10, 22, 5, 42, 10, 12, 5, 27, 1, 1, 27, 6, 9, 10, 10, 50, 20, 10, 5, 10, 10, 1, 2, 20, 10,
				3, 10, 10, 2, 1, 3, 2, 1, 15, 1, 1, 1, 1, 3, 4 };
		boolean[] k36_taxfree = { false, true, false, false, false, false, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, true, true, true,
				false, false, false, false, false, false, false, false, false, false, false, false, false, false };// 면세유무*/
		double k36_taxfreeSum = 0;
		int k36_iPrice = 0;
		double k36_taxRate = 0.1;
		int k36_sumiPrice = 0;
		int k36_point = 32500;
		
			if (k36_taxfree[k36_i] == true) {
				k36_taxfreeSum += k36_price[k36_i] * k36_num[k36_i];
				System.out.printf("%-2s", "*");
			} else {
				k36_sumiPrice += k36_price[k36_i] * k36_num[k36_i];// 면세품목이 아닌 가격의 합
				System.out.printf("%-2s", " ");
			}
			k36_iPrice += k36_price[k36_i] * k36_num[k36_i];

			System.out.printf("%s %s", k36_subStrByte(k36_itemname[k36_i], 14), "");
			System.out.printf("%10s %2s %10s\n", k36_df.format(k36_price[k36_i]), k36_num[k36_i],
					k36_df.format(k36_price[k36_i] * k36_num[k36_i]));

			if ((k36_i + 1) % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
		
	}

	private static void HeaderPrint() {
		// TODO Auto-generated method stub
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%2s %7s %8s %3s %8s\n", " ", "상 품 명", "단 가", "수량", "금 액");
		System.out.printf("-----------------------------------------\n");
	}

	private static void TitlePrint() {
		// TODO Auto-generated method stub

		System.out.printf("%13s %-1s\n", " ", "이마트 죽전점 (031)688-1234");
		System.out.printf("%-10s %-1s\n", "이마트 ", "206-86-50913 강희석");
		System.out.printf("%13s %-1s\n", " ", "용인 수지구 포은대로 552");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참고)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");		
	}

	private static void TimeStemp() {
		// TODO Auto-generated method stub
		Calendar k36_cal = Calendar.getInstance();
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		SimpleDateFormat k36_sdt2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat k36_sdt3 = new SimpleDateFormat("YYYYMMdd");
		int k36_posNum1 = 11;
		int k36_posNum2 = 9861;
		System.out.printf("[구매]%s %9s%04d-%d\n", k36_sdt.format(k36_cal.getTime()), "POS:", k36_posNum1, k36_posNum2);
	}
	public static String k36_subStrByte(String k36_source, int k36_cutLength) {
		if (!k36_source.isEmpty()) {
			k36_source = k36_source.trim();
			if (k36_source.getBytes().length < k36_cutLength) {
				for (int k36_i = k36_cutLength - k36_source.getBytes().length; k36_i > 0; k36_i--) {
					k36_source += " ";
				}
				return k36_source;
			} else {
				StringBuffer k36_sb = new StringBuffer(k36_cutLength);
				int k36_cnt = 0;
				for (char k36_ch : k36_source.toCharArray()) {
					k36_cnt += String.valueOf(k36_ch).getBytes().length;
					if (k36_cnt > k36_cutLength)
						break;
					k36_sb.append(k36_ch);
				}

				if (k36_sb.toString().getBytes().length == 13) {
					k36_sb.append(" ");
				}

				return k36_sb.toString();
			}
		} else {
			return "";
		}
	}

}
