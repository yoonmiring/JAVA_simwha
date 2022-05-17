package java220419;

public class TvRemocon2 {
	// �Լ��� �޶� ����� �� �ֵ��� Ŭ���� �ȿ� private�� �������� �����Ѵ�.
	private int k36_limit_up_volum;// �ִ� ������ ���������� ����
	private int k36_limit_down_volum;// �ּ� ������ ���������� ����
	private int k36_limit_up_chan;// �ִ� ä���� ���������� ����
	private int k36_limit_down_chan;// �ּ� ä���� ���������� ����
	protected String k36_help;// ������ ���ڿ��� ����
	private int k36_vol;// �������� ���������� ����
	private int k36_cha;// ä���� ���������� ����

	TvRemocon2() {// ������ 2�� �޼ҵ带 ����
		k36_limit_up_volum = 5;// ������ �ִ밪�� 5�� ����
		k36_limit_down_volum = 1;// ������ �ּҰ��� 1�� ����
		k36_limit_up_chan = 10;// ä���� �ִ밪�� 10���� ����
		k36_limit_down_chan = 1;// ä���� �ּҰ��� 1�� ����
		k36_vol = 1;// �⺻�� ������ 1
		k36_cha = 1;// �⺻�� ä���� 1�� �����Ѵ�.
	}

	void k36_Volup() {// �����ø��� �Լ�
		if (k36_vol == k36_limit_up_volum) {// �������� �ּ� �������� ���� ���
			k36_help = "���̻� ������ �ø� �� �����ϴ�.";// ���
		} else {// �� ���� ���
			k36_vol++;// �������� ��� ������Ŵ
			k36_help = String.format("������ %d�Դϴ�", k36_vol);// ������ ���簪 ���

		}
	}

	void k36_Voldown() {// ���������� �Լ�
		if (k36_vol == k36_limit_down_volum) {// �������� �ִ밪�� ���� ���
			k36_help = "���̻� ������ ���� �� �����ϴ�.";// ���
		} else {
			k36_vol--;// �������� ��� ���ҽ�Ŵ
			k36_help = String.format("������ %d�Դϴ�", k36_vol);// ������ ���簪 ���
		}
	}

	void k36_ChannelUp() {// ä���� �ø����� �Լ�
		if (k36_cha == k36_limit_up_chan) {// ä�ΰ��� �ּ� ä�ΰ��� ���� ���
			k36_help = "���̻� ä���� �ø� �� �����ϴ�.";// ���
		} else {
			k36_cha++;// ä�ΰ��� ��� ������Ŵ
			k36_help = String.format("ä���� %d�Դϴ�", k36_cha);// ä���� ���簪 ���
		}
	}

	void k36_ChannelDn() {// ä���� �������� �Լ�
		if (k36_cha == k36_limit_down_chan) {// ä�ΰ��� �ִ� ä�ΰ��� ���� ���
			k36_help = "���̻� ä���� ���� �� �����ϴ�.";// ���
		} else {
			k36_cha--;// ä�ΰ��� ��� ���ҽ�Ŵ
			k36_help = String.format("ä���� %d�Դϴ�", k36_cha);// ä���� ���簪 ���
		}
	}

	void k36_msg(String id) {// �����޼��� �Լ�
		System.out.printf("%s=>[%s] �ִ뺼��[%d] �ּҺ���[%d] ���纼��[%d]\n", id, k36_help, k36_limit_up_volum,
				k36_limit_down_volum, k36_vol);
	}

	void k36_msg2(String id) {// ä�� �޼��� �Լ�
		System.out.printf("%s=>[%s] �ִ�ä��[%d] �ּ�ä��[%d] ����ä��[%d]\n", id, k36_help, k36_limit_up_chan, k36_limit_down_chan,
				k36_cha);
	}
}
