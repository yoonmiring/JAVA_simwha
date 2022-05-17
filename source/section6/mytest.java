package java220419;

public class mytest {

	static k36_Elevater2 k36_elev1;
	static k36_Elevater2 k36_elev2;
	static k36_Elevater2 k36_elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_elev1 = new k36_Elevater2();
		k36_elev2 = new k36_Elevater2(20, 1, 8);
		k36_elev3 = new k36_Elevater2(50, -3, 5);

		for (int k36_i = 0; k36_i < 20; k36_i++) {
//			k36_elev1.k36_up();
//			k36_elev1.k36_msg("1¹ø ¿¤º£ ÇÑÃþ¿À¸£±â");
			k36_elev2.k36_up();
			k36_elev2.k36_msg("2¹ø ¿¤º£ ÇÑÃþ¿À¸£±â");
//			k36_elev3.k36_up();
//			k36_elev3.k36_msg("3¹ø ¿¤º£ ÇÑÃþ¿À¸£±â");
		}
		for (int k36_i = 0; k36_i < 20; k36_i++) {
//			k36_elev1.k36_up(2);
//			k36_elev1.k36_msg("1¹ø ¿¤º£ 2Ãþ¾¿ ¿À¸£±â");
			k36_elev2.k36_up(2);
			k36_elev2.k36_msg("2¹ø ¿¤º£ 2Ãþ¾¿ ¿À¸£±â");
//			k36_elev3.k36_up(2);
//			k36_elev3.k36_msg("3¹ø ¿¤º£ 2Ãþ¾¿ ¿À¸£±â");
		}
		for (int k36_i = 0; k36_i < 20; k36_i++) {
//			k36_elev1.k36_down(3);
//			k36_elev1.msg("1¹ø ¿¤º£ 3Ãþ¾¿ ³»¸®±â");
			k36_elev2.k36_down(3);
			k36_elev2.k36_msg("2¹ø ¿¤º£ 3Ãþ¾¿ ³»¸®±â");
//			k36_elev3.k36_down(3);
//			k36_elev3.k36_msg("3¹ø ¿¤º£ 3Ãþ¾¿ ³»¸®±â");
		}
	}

}
