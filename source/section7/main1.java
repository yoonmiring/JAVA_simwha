package section7;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("한글한글aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("한글aa", 15));
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%d] 개\n", HanCount("한글한글aa"));
	}

	private static int HanCount(String string) {
		// TODO Auto-generated method stub
		int num=string.getBytes().length-string.length();
		return num;
	}

	private static String HanBlankBackword(String string, int i) {

		for (int k36_i = i - string.getBytes().length; k36_i > 0; k36_i--) {// 설정한 값에서 바이트의 길이를
																			// 뺀 값 만큼 반복문을 돌린다.
			string += " ";// 반복문만큼 출력한다.
		}
		return string;

	}

	private static Object HanBlankForeword(String string, int i) {
		// TODO Auto-generated method stub
		for (int k36_i = i - string.getBytes().length; k36_i > 0; k36_i--) {// 설정한 값에서 바이트의 길이를
			// 뺀 값 만큼 반복문을 돌린다.
			string = " " + string;// 반복문만큼 출력한다.
		}
		return string;

	}

}
