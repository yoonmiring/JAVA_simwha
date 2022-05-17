package java220419;

public class k36_Elevater2 {
	protected int k36_limit_up_floor;
	private int k36_limit_down_floor;
	protected int k36_floor;
	protected String k36_help;

	k36_Elevater2() {
		k36_limit_up_floor = 10;
		k36_limit_down_floor = 1;
		k36_floor = 1;
		k36_help = "엘리베이터 기본 준공완료";
	}

	k36_Elevater2(int k36_up_floor, int k36_d_floor, int k36_in_floor) {
		k36_limit_up_floor = k36_up_floor;
		k36_limit_down_floor = k36_d_floor;
		k36_floor = k36_in_floor;
		k36_help = "엘리베이터 맞춤 준공완료";
	}

	void k36_up() {
		if (k36_floor == k36_limit_up_floor) {
			k36_help = "마지막층입니다";
		} else {
			k36_floor++;
			k36_help = String.format("%d층 입니다", k36_floor);
		}
	}

	void k36_down() {
		if (k36_floor == k36_limit_down_floor) {
			k36_help = "처음층입니다.";
		} else {
			k36_floor--;
			k36_help = String.format("%d층 입니다", k36_floor);
		}
	}

	void k36_up(int k36_u) {
		for (int k36_i = 0; k36_i < k36_u; k36_i++)
			this.k36_up();
	}

	void k36_down(int k36_u) {
		for (int k36_i = 0; k36_i < k36_u; k36_i++)
			k36_down();
	}

	void k36_msg(String k36_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", k36_id, 
				k36_help, k36_limit_up_floor, k36_limit_down_floor, k36_floor);
	}
}
