package java220414;

public class main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수수료 포함 환전 계산(1)
		int k36_MyWon = 1000000; // 환전해야 할 원화
		double k36_MoneyEx = 1238.21;// 달러환율
		double k36_commission = 0.003;// 환전 수수료 0.3%

		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);// 환전 받을 달러값이 나옴(정수형)

		double k36_ComPerOne = k36_MoneyEx * k36_commission;// 달러 환율에 환전 수수료 값을 곱하면 달러당 수수료 값(실수형)이 나온다.
		double k36_totalcom = k36_usd * k36_ComPerOne;// 환전 받을 달러값에 수수료 값을 곱하면 총 수수료의 값이 나온다.(실수형)
		System.out.printf("*********************************************************************\n");
		System.out.printf("*                             수수료 계산                           *\n");
		System.out.printf("총 수수료 :%f원 => 미화 : %d달러, 달러당 수수료:%f원\n", k36_totalcom, k36_usd, k36_ComPerOne);// 총 수수료와 미화,
																											// 달러당 수수료의
																											// 값이 출력된다.
		System.out.printf("*********************************************************************\n");

	}

}
