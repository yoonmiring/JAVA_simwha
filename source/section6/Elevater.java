package java220419;

public class Elevater {
	int k36_limit_up_floor=10;
	int k36_limit_down_floor=0;
	int k36_floor=1;
	String help;
	
	void k36_up() {
		if(k36_floor == k36_limit_up_floor) {
			help="���������Դϴ�";
		}else {
			k36_floor++;
			help=String.format("%d�Դϴ�", k36_floor);
		}
	}
	void k36_down() {
		if(k36_floor == k36_limit_down_floor) {
			help="ó�����Դϴ�.";
		}else {
			k36_floor--;
			help=String.format("%d�Դϴ�", k36_floor);
		}
	}

}
