package java220419;

public class mainRemocon {
	private static int k36_inVal;//�⺻������

	public static void volup() {
		k36_inVal++;//�⺻���� ��� ������Ŵ
		System.out.printf("[������ %d�Դϴ�]\n", k36_inVal);//���
	}
	public static void chaup() {
		k36_inVal = 0;//�⺻���� 0���� �ʱ�ȭ
		k36_inVal++;//��� ������Ŵ
		System.out.printf("[ä���� %d�Դϴ�]\n", k36_inVal);//���
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_inVal = 0;//�⺻���� 0���� �ʱ�ȭ ��
		k36_TvRemocon k36_tvremo;//������ Ŭ������ ȣ��
		k36_tvremo = new k36_TvRemocon();

		volup();//�޼ҵ� ȣ��
		for (int i = 0; i < 5; i++) {//5ȸ �ݺ��� �ۼ�
			k36_tvremo.k36_VolUp();//������Ŭ������ k36_VolUp�� ȣ����
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//���
		}
		for (int i = 0; i < 5; i++) {//5ȸ �ݺ��� �ۼ�
			k36_tvremo.k36_VolDn();//������Ŭ������ k36_VolDn�� ȣ����
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//���
		}

		chaup();
		for (int i = 0; i < 10; i++) {//10ȸ �ݺ��� �ۼ�
			k36_tvremo.k36_ChannelUp();//������Ŭ������ k36_ChannelUp�� ȣ����
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//���
		}
		for (int i = 0; i < 10; i++) {//10ȸ �ݺ��� �ۼ�
			k36_tvremo.k36_ChannelDn();//������Ŭ������ k36_ChannelDn�� ȣ����
			System.out.printf("[%s]\n", k36_tvremo.k36_help);//���
		}
	}

}
