package java220419;

public class ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k36_iPerson = 30;// k36_iPerson�� ���� �ִ� ��ŭ ����Ҹ� �����Ѵ�.
		InputData k36_inData = new InputData(k36_iPerson);// �������� ���ڸ� �� ��ŭ �迭�� �����Ѵ�.

		// �Էµ����� ����
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("ȫ��%02d", k36_i);// �̸�����
			int k36_kor = (int) (Math.random() * 100);// �������� ����
			int k36_eng = (int) (Math.random() * 100);// �������� ����
			int k36_mat = (int) (Math.random() * 100);// �������� ����
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// Ŭ���� �� �� �Է�
		}
		// �Է� Ȯ���� ���� ���
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("��ȣ:%d, �̸�:%s,����:%d,����:%d,����:%d,����:%d,���:%f\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], k36_inData.k36_ave[k36_i]);
		}
	}

}
