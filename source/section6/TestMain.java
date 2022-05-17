package java220419;

public class TestMain {
	private static int k36_inVal;

	public static void k36_up() {
		k36_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", k36_inVal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_inVal = 0;
		Elevater k36_elev;
		k36_elev = new Elevater();

		k36_up();
		for (int i = 0; i < 10; i++) {
			k36_elev.k36_up();
			System.out.printf("MSG[%s]\n", k36_elev.help);
		}
		for (int i = 0; i < 10; i++) {
			k36_elev.k36_down();
			System.out.printf("MSG[%s]\n", k36_elev.help);
		}
	}

}
