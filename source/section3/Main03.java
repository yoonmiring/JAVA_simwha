package java220414;

import java.text.DecimalFormat;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 콤마찍기
		int k36_MyWon = 1000000; // 환전해야 할 원화
		double k36_MoneyEx = 1238.21;// 달러환율
		double k36_commission = 0.003;// 환전 수수료 0.3%

		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);// 환전 받을 달러값을 정수형으로 저장

		double k36_ComPerOne = k36_MoneyEx * k36_commission;// 달러당 수수료의 값을 실수형으로 저장

		int k36_i_totalcom;// 총 수수료의 값 실수형을 정수형으로 저장하기 위해 선언
		k36_usd = (int) (k36_MyWon / (k36_MoneyEx + k36_ComPerOne));// 환전해야 할 달러 계산
		double k36_totalcom = k36_usd * k36_ComPerOne;// 달러당 수수료의 값을 실수형으로 받음

		if (k36_totalcom != (double) ((int) k36_totalcom)) {// 수수료 실수형의 값과 수수료 정수형으로 변환 후 다시 실수형으로 변환했을때의 값이 같지 않으면
			k36_i_totalcom = (int) k36_totalcom + 1;// 수수료값(정수형) 에 1을 더하여 총 수수료의 값을 저장한다.
		} else {// 그 것이 아니라면
			k36_i_totalcom = (int) k36_totalcom;// 수수료 값(정수형)은 그대로 총 수수료 값으로 저장이 된다.
		}
		DecimalFormat k36_df = new DecimalFormat("###,###,###,###,###");// 콤마 포맷을 이용하기 위해 변수 선언
		System.out.printf("*********************************************************************************\n");
		System.out.printf("*                                         콤마찍기                              *\n");
		System.out.printf("총 수수료 : %s원 => 미화:%s 달러, 달러당 수수료 : %f원\n", k36_df.format(k36_i_totalcom),
				k36_df.format(k36_usd), k36_ComPerOne);
		// 모든 1000단위 이상 수가 되면 콤마를 찍어내는 포맷을 이용
		int k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx - k36_i_totalcom);// 환전해야할 원화에서 환전할 미화와 달러환율을 곱해서 빼주고
																					// 수수료의 값을 제외 시키면 잔돈의 값이 출력된다.
		System.out.printf("총 한화환전금액 : %s 원 => 미화: %s 달러, 수수료징구:%s원 잔돈:%s원\n", k36_df.format(k36_MyWon),
				k36_df.format(k36_usd), k36_df.format(k36_i_totalcom), k36_df.format(k36_remain));
		// 모든 1000단위 이상 수가 되면 콤마를 찍어내는 포맷을 이용하여 출력
		System.out.printf("*********************************************************************************\n");
	}

}
