package java220415;

public class main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 읽기 고급
		long k36_iNumVal = 3230056007l;// int로 선언하면 20억 이상의 숫자가 출력이 되지 않을 수 있기 때문에 long으로 선언 한다.
		String k36_sNumVal = String.valueOf(k36_iNumVal);//long으로 설정한 숫자값을 k36_sNumVal문자열로 변환한다
		String k36_sNumVoice = "";//k36_sNumVoice 문자열 선언한다.
		System.out.printf("==> %s [%d자리]\n", k36_sNumVal, k36_sNumVal.length());//
		int k36_i, k36_j;

		String[] k36_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };// units배열에 일의자리 숫자들을 넣어준다.
		String[] k36_unitX = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };// unitX배열에 각 자리의 단위들을 넣어준다.

		k36_i = 0;
		k36_j = k36_sNumVal.length() - 1;

		while (true) {
			if (k36_i >= k36_sNumVal.length()) {
				break;
			}
			System.out.printf("%s[%s]", k36_sNumVal.substring(k36_i, k36_i + 1),
					k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i + 1))]);

			if (k36_sNumVal.substring(k36_i, k36_i + 1).equals("0")) {
				if (k36_unitX[k36_j].equals("만") || k36_unitX[k36_j].equals("억")) {
					k36_sNumVoice = k36_sNumVoice + "" + k36_unitX[k36_j];
					if(k36_sNumVal.substring(k36_sNumVal.length()-8,k36_sNumVal.length()-4).equals("0000")) {
						k36_sNumVoice = k36_sNumVoice.replace("만", "");
					}
				} else {

				}
			} else {
				k36_sNumVoice = k36_sNumVoice + k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i + 1))]
						+ k36_unitX[k36_j];
			}
			k36_i++;
			k36_j--;
		}
		System.out.printf("\n %s[%s]\n", k36_sNumVal, k36_sNumVoice);
	}
}
