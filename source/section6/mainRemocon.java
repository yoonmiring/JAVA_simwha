package java220419;

public class mainRemocon {
	private static int k36_inVal;//기본값설정

	public static void volup() {
		k36_inVal++;//기본값을 계속 증가시킴
		System.out.printf("[볼륨은 %d입니다]\n", k36_inVal);//출력
	}
	public static void chaup() {
		k36_inVal = 0;//기본값을 0으로 초기화
		k36_inVal++;//계속 증가시킴
		System.out.printf("[채널은 %d입니다]\n", k36_inVal);//출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_inVal = 0;//기본값을 0으로 초기화 후
		k36_TvRemocon k36_tvremo;//리모콘 클래스를 호출
		k36_tvremo = new k36_TvRemocon();

		volup();//메소드 호출
		for (int i = 0; i < 5; i++) {//5회 반복문 작성
			k36_tvremo.k36_VolUp();//리모콘클래스의 k36_VolUp을 호출함
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//출력
		}
		for (int i = 0; i < 5; i++) {//5회 반복문 작성
			k36_tvremo.k36_VolDn();//리모콘클래스의 k36_VolDn을 호출함
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//출력
		}

		chaup();
		for (int i = 0; i < 10; i++) {//10회 반복문 작성
			k36_tvremo.k36_ChannelUp();//리모콘클래스의 k36_ChannelUp을 호출함
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//출력
		}
		for (int i = 0; i < 10; i++) {//10회 반복문 작성
			k36_tvremo.k36_ChannelDn();//리모콘클래스의 k36_ChannelDn을 호출함
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//출력
		}
	}

}
