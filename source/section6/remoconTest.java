package java220419;

public class remoconTest {

	static TvRemocon2 k36_remo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_remo = new TvRemocon2();// TvRemocon2의 클래스를 호출한다.

//볼륨은 5번을 반복하기 위한 반복문을 세운다.
		for (int i = 0; i < 5; i++) {
			k36_remo.k36_Volup();
			k36_remo.k36_msg("볼륨올리기");
		}
		for (int i = 5; i > 0; i--) {
			k36_remo.k36_Voldown();
			k36_remo.k36_msg("볼륨내리기");
		}
//채널은 10번을 반복하기 위한 반복문을 세운다.
		for (int i = 0; i < 10; i++) {
			k36_remo.k36_ChannelUp();
			k36_remo.k36_msg2("채널올리기");
		}
		for (int i = 10; i > 0; i--) {
			k36_remo.k36_ChannelDn();
			k36_remo.k36_msg2("채널내리기");
		}

	}

}
