package section7;

import java.text.DecimalFormat;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k36_df = new DecimalFormat("###,###,###"); //숫자값을 표현하기 위해 포맷 선언
		String[] OneRec = { //배열을 선언한다.
				"01	EF낱개초밥          4,900  1      4,900", "02* 재사용종량제봉       350  10      3,600",
				"03 피코크 새우볶       7,980  22    175,560", "04	세이브아몬드콤      1,950  5      9,650",
				"05	TOP초코렛모카2        970  42     40,740", "06	맥심TOP블랜드2        970  10      9,700",
				"07	동원)어린이치       4,580  12     54,960", "08	덴)아기소얼룩       4,580  5     22,900",
				"09	말하는 메탈 경      1,200  27     32,400", "10	야채통새우볶음      5,060  1      5,060",
				"11	해태 계란과자7      1,580  1      1,580", "12	크라운 야채타       1,180  27     31,860",
				"13	크라운 꽃게랑         980  6      5,880", "14	농심 오징어집       1,110  9      9,990",
				"15	크림치즈피자L      12,500  10    125,000", "16	롯데 몽쉘카카       4,780  10     47,800",
				"17	왕고래밥볶음56        980  50     49,000", "18	노브랜드팬케익      1,080  20     21,600",
				"19	노브랜드브라우      1,080  10     10,800", "20	노브랜드머핀믹      1,080  5      5,400",
				"21	하나 가쯔오30g      4,980  10     49,800", "22	보겔 팝콘용옥       2,650  10     26,500",
				"23	세방코코넛밀크      3,330  1      3,330", "24	s남양이오베이       1,810  2      3,620",
				"25* 상하유기멸균우     2,900  20     58,000", "26* 대니쉬우유 900     4,280  10     42,800",
				"27* 날씬돈앞다리      34,810  3    104,430", "28	유기농쌀과자자      1,980  10     19,800",
				"29	유기농쌀과자단      1,980  10     19,800", "30	유기농쌀과자자      1,980  2      3,960" };
		
		for (int i = 0; i < OneRec.length; i++) {
			int countKorean = OneRec[i].getBytes().length - OneRec[i].length();	//배열에서 받아온 String에서 한글의 개수를 측정한다.
			// 문자열에서 가격, 수량, 합계를 추출해서 가격 * 수량 != 합계 라면  오류를 수정한다.
			if ( Integer.parseInt(k36_firstPrice(OneRec[i],countKorean)) *  Integer.parseInt(k36_productNumber(OneRec[i],countKorean)) != Integer.parseInt(k36_lastPrice(OneRec[i],countKorean))) {
			
				System.out.println("**********************************************************");
				System.out.printf("오류[%s]\n",OneRec[i]);	//오류 문자열 출력
				// string.replace(합계, 가격*개수) 의 구조로
				// 합계는 수량 이후의 부분을 substring으로 자르고 trim을 사용하여 공백을 제거한다. 그러면 10,000,000 / 75,900 ... 이런식으로 잘린다.
				// int 형으로 바꾼 가격과 개수를 곱한뒤 DeciamlFormat으로 3자리마다 콤마 넣은 String 형으로 바꿔서 replace에 넣는다. 
				String k36_modified = OneRec[i].replace(OneRec[i].substring(OneRec[i].length() - OneRec[i].substring(32 - countKorean).trim().length()),
						k36_df.format(Integer.parseInt(k36_firstPrice(OneRec[i],countKorean)) * Integer.parseInt(k36_productNumber(OneRec[i],countKorean))));
				// 수정한 스트링 출력
				System.out.printf("수정[%s]\n",k36_modified);
				
				System.out.println("**********************************************************");
			}
		}
	}

	public static String k36_firstPrice(String k36_price, int k36_kNum) {
		// 가격의 구간 19 ~ 30 (한글로 인해 1이 2로 측정된 부분을 제거하기 위해, - 한글수를 한다), 이후 콤마 제거(replace),
		// 공백 제거(trim)
		String k36_onlynumber = k36_price.substring(19 - k36_kNum, 30 - k36_kNum).replace(",", "").trim();
		return k36_onlynumber; // 값 리턴
	}

	// 개수의 구간 30 ~ 32 (한글로 인해 1이 2로 측정된 부분을 제거하기 위해, - 한글수를 한다), 이후 공백 제거(trim)
	public static String k36_productNumber(String k36_price, int k36_kNum) {
		String k36_onlynumber = k36_price.substring(30 - k36_kNum, 32 - k36_kNum).trim();
		return k36_onlynumber;
	}

	// 가격의 구간 32 이후 (한글로 인해 1이 2로 측정된 부분을 제거하기 위해, - 한글수를 한다), 이후 콤마 제거(replace), 공백
	// 제거(trim)
	public static String k36_lastPrice(String k36_price, int k36_kNum) {
		String k36_onlynumber = k36_price.substring(32 - k36_kNum).replace(",", "").trim();
		return k36_onlynumber;
	}
}
