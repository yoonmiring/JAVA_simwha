package java220419;

public class k36_Elevater3 extends k36_Elevater2 {

	void k36_Repair() {
		k36_help=String.format("�������Դϴ�.");
	}
	void k36_up() {
		if(k36_floor >= k36_limit_up_floor) {
			k36_help="���������Դϴ�.";
		}else {
			k36_floor= k36_floor+2;
			k36_help=String.format("%d���Դϴ�.", k36_floor);
		}
		this.k36_down();
	}
	void k36_down() {
		super.k36_down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n",this.k36_help);
	}
}
