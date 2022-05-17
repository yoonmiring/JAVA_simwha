package java220414;

public class main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단순 환전 계산
		int k36_MyWon = 1000000; // 환전해야 할 원화
		double k36_MoneyEx = 1238.21;// 달러환율
		double k36_commission = 0.003;// 환전 수수료 0.3%

		int k36_usd = (int) (k36_MyWon / k36_MoneyEx);// 환전해야할 원화에서 달러환율로 나누어 정수값으로 받아 환전받을 달러값이 나온다.
														// 정수형으로 받아야 나머지 달러 지폐값만 나옴.
		int k36_remain = (int) (k36_MyWon - k36_usd * k36_MoneyEx); // 환전받을 달러와 달러환율을 곱한 뒤 환전해야할 원화에서 빼주면 잔돈의 값이 나온다.

		System.out.printf("********************************************************\n");
		System.out.printf("*                    수수료 없이 계산                  *\n");
		System.out.printf("총 한화환전금액 :%d원 => 미화 : %d달러, 잔돈:%d원\n", k36_MyWon, k36_usd, k36_remain);//환전 수수료 값을 제외한 환전 금액, 미화, 잔돈의 결과값이 나온다.
		System.out.printf("********************************************************\n");

	}

}