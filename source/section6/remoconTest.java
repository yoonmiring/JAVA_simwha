package java220419;

public class remoconTest {

	static TvRemocon2 k36_remo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_remo = new TvRemocon2();// TvRemocon2�� Ŭ������ ȣ���Ѵ�.

//������ 5���� �ݺ��ϱ� ���� �ݺ����� �����.
		for (int i = 0; i < 5; i++) {
			k36_remo.k36_Volup();
			k36_remo.k36_msg("�����ø���");
		}
		for (int i = 5; i > 0; i--) {
			k36_remo.k36_Voldown();
			k36_remo.k36_msg("����������");
		}
//ä���� 10���� �ݺ��ϱ� ���� �ݺ����� �����.
		for (int i = 0; i < 10; i++) {
			k36_remo.k36_ChannelUp();
			k36_remo.k36_msg2("ä�οø���");
		}
		for (int i = 10; i > 0; i--) {
			k36_remo.k36_ChannelDn();
			k36_remo.k36_msg2("ä�γ�����");
		}

	}

}
