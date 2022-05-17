package java220414;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 소비자가 세금 계산
		int k36_price = 1234; // 상품 가격을 정수형으로 받음
		double k36_tax_rate = 0.1;// 세금의 비율은 실수형으로 받음

		int k36_netprice = netprice(k36_price, k36_tax_rate);// netprice함수를 호출하여 정수형 k36_netprice로 받아준다.
		int k36_tax = k36_price - k36_netprice;// 세금은 상품 가격에서 세전가격을 뺀 값을 정수로 받아준다.

		System.out.printf("********************************************\n");
		System.out.printf("*   소비자가     세전가격     세금 계산    *\n");
		System.out.printf("소비자 가격:%d, 세전가격:%d, 세금 :%d\n", k36_price, k36_netprice, k36_tax);
		System.out.printf("********************************************\n");

	}

	public static int netprice(int k36_price, double k36_rate) {// 정수형으로 받기 때문에 정수형 함수를 호출한다.
		return (int) (k36_price / (1 + k36_rate));// 상품가격에서 세금의 비율에서 1을 더한 값을 나누어 세전 가격을 구한다.
	}
}
