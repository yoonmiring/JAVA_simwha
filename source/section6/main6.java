package java220419;

public class main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person = 30 + 1;
		int sum = 0;
		int sumsum = 0;
		for (int i = 1; i < person; i++) {
			System.out.println(i);
			sum += i;
			sumsum += i;
			
			if (i % 10 == 0) {
				
				System.out.println("--³ª´«°Å--" + sumsum);
				System.out.println( "--´©Àû--" + sum);
				sumsum = 0;
			}
		}
	}
}
