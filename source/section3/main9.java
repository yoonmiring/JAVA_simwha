package java220414;

public class main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수수료 포함 환전 계산(2)
		int k36_MyWon = 1000000; // 환전해야 할 원화
		double k36_MoneyEx = 1238.21;// 달러환율
		double k36_commission = 0.003;// 환전 수수료 0.3%

		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);// 환전 받을 달러값을 정수형으로 저장

		double k36_ComPerOne = k36_MoneyEx * k36_commission;// 달러당 수수료의 값을 실수형으로 저장
		double k36_totalcom = k36_usd * k36_ComPerOne;// 총 수수료의 값을 실수형으로 저장

		int k36_i_totalcom; // 총 수수료의 값을 int값으로 저장하기 위해 선언

		if (k36_totalcom != (double) ((int) k36_totalcom)) {// 수수료 실수형의 값과 수수료 정수형으로 변환 후 다시 실수형으로 변환했을때의 값이 같지 않으면
			k36_i_totalcom = (int) k36_totalcom + 1; // 수수료값(정수형) 에 1을 더하여 총 수수료의 값을 저장한다.
		} else {// 수수료 실수형의 값과 수수료 정수형으로 변환 후 실수형으로 다시 변환했을때의 값이 같을 경우
			k36_i_totalcom = (int) k36_totalcom;// 수수료 값(정수형)은 그대로 총 수수료 값으로 저장이 된다.
		}
		System.out.printf("******************************************************************************\n");
		System.out.printf("*                              수수료 적용환전                               *\n");
		System.out.printf("총 수수료 : %d원 => 미화 : %d달러, 달러당 수수료: %f원\n", k36_i_totalcom, k36_usd, k36_ComPerOne);// 계산된 총
																												// 수수료값과
																												// 미화는
																												// 정수형으로
																												// 달러당
																												// 수수료는
																												// 실수형으로
																												// 출력한다.

		int k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx - k36_i_totalcom);// 잔돈값을 계산한다. 잔돈은 정수형으로 출력되야 하기 때문에
																					// 정수형을 선언한다.
																					// 환전해야할 원화에서 미화와 달러환율을 곱한 값을 빼주고 또
																					// 거기서 총 수수료 값을 빼준다.
		System.out.printf("총 한화환전금액 : %d원 => 미화: %d 달러, 수수료징구:%d원 잔돈:%d원\n", k36_MyWon, k36_usd, k36_i_totalcom,
				k36_remain);// 환전금액과 미화,총 수수료, 잔돈값을 출력한다.
		System.out.printf("******************************************************************************\n");
	}

}
