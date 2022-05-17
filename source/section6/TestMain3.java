package java220419;

public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_Elevater3 k36_elev3;
		k36_elev3 = new k36_Elevater3();
		for (int k36_i = 0; k36_i < 10; k36_i++) {
			k36_elev3.k36_up();
			System.out.printf("MSG elev3[%s]\n", k36_elev3.k36_help);
		}
		for (int i = 0; i < 10; i++) {
			k36_elev3.k36_down();
			System.out.printf("MSG elev3[%s]\n", k36_elev3.k36_help);
		}
		k36_elev3.k36_Repair();
		System.out.printf("MSG elev3[%s]\n", k36_elev3.k36_help);
	}

}
