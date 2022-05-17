package java220419;

public class k36_Elevater3 extends k36_Elevater2 {

	void k36_Repair() {
		k36_help=String.format("수리중입니다.");
	}
	void k36_up() {
		if(k36_floor >= k36_limit_up_floor) {
			k36_help="마지막층입니다.";
		}else {
			k36_floor= k36_floor+2;
			k36_help=String.format("%d층입니다.", k36_floor);
		}
		this.k36_down();
	}
	void k36_down() {
		super.k36_down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n",this.k36_help);
	}
}
