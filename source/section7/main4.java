package section7;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] OneRec = {
				"사고유형대분류,사고유형중분류,사고유형,사고건수,사망자수,중상자수,경상자수,부상신고자수",
				"차대사람,횡단중,횡단중,13147,520,6417,6617,517",
				"차대사람,차도통행중,차도통행중,3702,195,1423,2022,209",
				"차대사람,길가장자리구역통행중,길가장자리구역통행중,2079,40,591,1371,160",
				"차대사람,보도통행중,보도통행중,2015,26,707,1260,129",
				"차대사람,기타,기타,15278,288,5195,9290,1272",
				"차대차,정면충돌,정면충돌,7494,181,3657,8468,677",
				"차대차,측면충돌,측면충돌,74742,441,19893,88838,6945",
				"차대차,후진중충돌,후진중충돌,3253,4,297,4003,154",
				"차대차,추돌,추돌,32993,370,7924,48345,3172",
				"차대차,기타,기타,46070,303,11000,50973,4764",
				"차량단독,전도,전도,1108,90,412,466,281",
				"차량단독,전복,전복,178,26,81,98,32",
				"차량단독,공작물충돌,공작물충돌,3233,340,1376,1745,668",
				"차량단독,주/정차차량 충돌,주/정차차량 충돌,19,4,8,8,1",
				"차량단독,도로이탈,도로이탈 추락,413,92,185,203,46",
				"차량단독,도로이탈,도로이탈 기타,199,30,113,113,24",
				"차량단독,기타,기타,3728,130,1285,2213,543",
				"철길건널목,철길건널목,철길건널목,3,1,0,3,0"

		};

		String[] field_name = OneRec[0].split(",");
		for (int i = 1; i < OneRec.length; i++) {
			
			String[] field = OneRec[i].split(",");
			System.out.println("*********************");
			System.out.printf(" %s : %s\n", field_name[0], 	field[0]);	
			
			for (int j = 3; j < field_name.length; j++) {

				System.out.printf(" %s : %s\n", field_name[j], 	k37_numberRead(field[j]));
			}
			
			System.out.println("*********************");
		}
		
	}
	
	public static String k37_numberRead (String k37_text) {
		String[] k37_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 문자열 배열 units 선언 및 초기화
		String[] k37_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 문자열 배열 unitX 선언 및 초기화
		String k37_sNumVoice = "";
		int k37_i = 0; // 변수 i를 0으로 초기화
		int k37_j = k37_text.length() - 1; // 변수 j를 sNumVal의 길이 - 1로 초기화 > 배열은 0번째부터 시작하기 때문
		
		while (true) { // 무한 반복문
			if (k37_i >= k37_text.length()) // 변수 i가 sNumVal.length()보다 같거나 클 때
				break; // 반복문을 중단하고 다음으로 넘어간다
			
			if (k37_text.substring(k37_i, k37_i + 1).equals("0")) { // sNumVal을 i에서 i+1만큼 자른 수가 0일 때 (if문) (.equals > 문자열 같은 것 비교 확인시 사용)
				if (k37_text.length() <= 8) {
					k37_sNumVoice = k37_sNumVoice // sNumVoice에 sNumVoice +
							+ k37_units[Integer.parseInt(k37_text.substring(k37_i, k37_i + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
							+ k37_unitX[k37_j]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
				} else {
					if (k37_text.substring(k37_text.length() - 8, k37_text.length() - 4).equals("0000")
							&& k37_unitX[k37_j].equals("만")) {
						// sNumVal의 길이-8 부터 sNumVal의 길이-4까지를 sNumVal에서 자르고 그것이 0000이고 배열 unitX[j] 가 "만"이면 아무 것도 하지 않는다.
					} else if (k37_unitX[k37_j].equals("만") || k37_unitX[k37_j].equals("억")) { // 위의 조건이 false이고 unitX[j]가 "만" 또는 "억"이면 (||는 또는 의미)
						k37_sNumVoice = k37_sNumVoice + "" + k37_unitX[k37_j]; // sNumVoice에 sNumVoice + "" + unitX[j]를 대입
					}
				}

			} else { // sNumVal을 i에서 i+1만큼 자른 수가 0이 아니면
				k37_sNumVoice = k37_sNumVoice // sNumVoice에 sNumVoice +
						+ k37_units[Integer.parseInt(k37_text.substring(k37_i, k37_i + 1))] // sNumVal을 i에서 i+1만큰 자른 문자열을 정수로 변환 후(Integer.parseInt()활용)																								
						+ k37_unitX[k37_j]; // + unitX[j]를 대입한다 // String 배열 units의 위치에 있는 문자를 출력
			}
			k37_i++; // 변수 i를 1만큼 증가
			k37_j--; // 변수 j를 1만큼 감소

		}
		
		
		return k37_sNumVoice;
	}
	
}
