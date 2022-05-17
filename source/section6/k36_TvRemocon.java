package java220419;

public class k36_TvRemocon {// 리모콘 클래스 생성
	int k36_limit_up_vol = 5;// 최대 볼륨크기 5로 설정
	int k36_limit_down_vol = 0;// 최소 볼륨 크기 0으로 설정
	int k36_limit_up_cha = 10;// 최대 채널 크기 10으로 설정
	int k36_limit_down_cha = 0;// 최소 채널 크기 0으로 설정
	int k36_vol = 1;// 볼륨값을 1으로 설정하면서 정수형으로 선언
	int k36_cha = 1;// 채널을 1으로 설정하면서 정수형으로 선언
	String k36_help;// 도움말은 문자열로 선언

	void k36_VolUp() {// 볼륨을 올릴때의 함수
		if (k36_vol == k36_limit_up_vol) {// 볼륨값과 최소 볼륨값이 같을 경우
			k36_help = "더이상 볼륨을 올릴 수 없습니다.";// 출력
		} else {// 그 외의 경우
			k36_vol++;// 볼륨값을 계속 증가시킴
			k36_help = String.format("볼륨은 %d입니다", k36_vol);// 볼륨의 현재값 출력
		}
	}

	void k36_VolDn() {// 볼륨을 내릴때의 함수
		if (k36_vol == k36_limit_down_vol) {// 볼륨값과 최대값이 같을 경우
			k36_help = "더이상 볼륨을 내릴 수 없습니다.";// 출력
		} else {
			k36_vol--;// 볼륨값을 계속 감소시킴
			k36_help = String.format("볼륨은 %d입니다", k36_vol);// 볼륨의 현재값 출력
		}
	}

	void k36_ChannelUp() {// 채널을 올릴때의 함수
		if (k36_cha == k36_limit_up_cha) {// 채널값과 최소 채널값이 같을 경우
			k36_help = "더이상 채널을 올릴 수 없습니다.";// 출력
		} else {
			k36_cha++;// 채널값을 계속 증가시킴
			k36_help = String.format("채널은 %d입니다", k36_cha);// 채널의 현재값 출력
		}
	}

	void k36_ChannelDn() {// 채널을 내릴때의 함수
		if (k36_cha == k36_limit_down_cha) {// 채널값과 최대 채널값이 같을 경우
			k36_help = "더이상 채널을 내릴 수 없습니다.";// 출력
		} else {
			k36_cha--;// 채널값을 계속 감소시킴
			k36_help = String.format("채널은 %d입니다", k36_cha);// 채널의 현재값 출력
		}
	}

}
