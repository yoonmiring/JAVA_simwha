package java220419;

public class TvRemocon2 {
	// 함수가 달라도 사용할 수 있도록 클래스 안에 private로 변수들을 선언한다.
	private int k36_limit_up_volum;// 최대 볼륨을 정수형으로 선언
	private int k36_limit_down_volum;// 최소 볼륨을 정수현으로 선언
	private int k36_limit_up_chan;// 최대 채널을 정수형으로 선언
	private int k36_limit_down_chan;// 최소 채널을 정수형으로 선언
	protected String k36_help;// 도움말은 문자열로 선언
	private int k36_vol;// 볼륨값을 정수형으로 선언
	private int k36_cha;// 채널을 정수형으로 선언

	TvRemocon2() {// 리모콘 2의 메소드를 설정
		k36_limit_up_volum = 5;// 볼륨의 최대값을 5로 설정
		k36_limit_down_volum = 1;// 볼륨의 최소값을 1로 설정
		k36_limit_up_chan = 10;// 채널의 최대값을 10으로 설정
		k36_limit_down_chan = 1;// 채널의 최소값을 1로 설정
		k36_vol = 1;// 기본값 볼륨은 1
		k36_cha = 1;// 기본값 채널은 1로 설정한다.
	}

	void k36_Volup() {// 볼륨올리는 함수
		if (k36_vol == k36_limit_up_volum) {// 볼륨값과 최소 볼륨값이 같을 경우
			k36_help = "더이상 볼륨을 올릴 수 없습니다.";// 출력
		} else {// 그 외의 경우
			k36_vol++;// 볼륨값을 계속 증가시킴
			k36_help = String.format("볼륨은 %d입니다", k36_vol);// 볼륨의 현재값 출력

		}
	}

	void k36_Voldown() {// 볼륨내리는 함수
		if (k36_vol == k36_limit_down_volum) {// 볼륨값과 최대값이 같을 경우
			k36_help = "더이상 볼륨을 내릴 수 없습니다.";// 출력
		} else {
			k36_vol--;// 볼륨값을 계속 감소시킴
			k36_help = String.format("볼륨은 %d입니다", k36_vol);// 볼륨의 현재값 출력
		}
	}

	void k36_ChannelUp() {// 채널을 올릴때의 함수
		if (k36_cha == k36_limit_up_chan) {// 채널값과 최소 채널값이 같을 경우
			k36_help = "더이상 채널을 올릴 수 없습니다.";// 출력
		} else {
			k36_cha++;// 채널값을 계속 증가시킴
			k36_help = String.format("채널은 %d입니다", k36_cha);// 채널의 현재값 출력
		}
	}

	void k36_ChannelDn() {// 채널을 내릴때의 함수
		if (k36_cha == k36_limit_down_chan) {// 채널값과 최대 채널값이 같을 경우
			k36_help = "더이상 채널을 내릴 수 없습니다.";// 출력
		} else {
			k36_cha--;// 채널값을 계속 감소시킴
			k36_help = String.format("채널은 %d입니다", k36_cha);// 채널의 현재값 출력
		}
	}

	void k36_msg(String id) {// 볼륨메세지 함수
		System.out.printf("%s=>[%s] 최대볼륨[%d] 최소볼륨[%d] 현재볼륨[%d]\n", id, k36_help, k36_limit_up_volum,
				k36_limit_down_volum, k36_vol);
	}

	void k36_msg2(String id) {// 채널 메세지 함수
		System.out.printf("%s=>[%s] 최대채널[%d] 최소채널[%d] 현재채널[%d]\n", id, k36_help, k36_limit_up_chan, k36_limit_down_chan,
				k36_cha);
	}
}
