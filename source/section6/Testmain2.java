package java220419;

public class Testmain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		k36_Calc1 k36_cc = new k36_Calc1();

		System.out.printf("3�� ����ǥ\n");
		System.out.printf("=================================================\n");
		System.out.printf("%-3s %3s %3s %-3s %-3s %-3s\n", "�̸�", "����", "����", "����", "����", "���");
		System.out.printf("=================================================\n");
		System.out.printf("%-3s %4d %4d %4d %5d %5d\n\n", "������", 100, 100, 100, k36_cc.k36_sum(100, 100, 100),
				k36_cc.k36_ave(100, 100, 100));
		System.out.printf("4�� ����ǥ\n");
		System.out.printf("=================================================\n");
		System.out.printf("%-3s %3s %3s %-3s %-3s %-3s %-3s\n", "�̸�", "����", "����", "����", "����", "����", "���");
		System.out.printf("=================================================\n");
		System.out.printf("%-3s %4d %4d %4d %5d %5d %5d\n\n", "������", 100, 100, 100, 100, k36_cc.k36_sum(100, 100, 100, 100),
				k36_cc.k36_ave(100, 100, 100, 100));
		System.out.printf("5�� ����ǥ\n");
		System.out.printf("=================================================\n");
		System.out.printf("%-3s %3s %3s %-3s %-3s %-3s %-3s %-3s\n", "�̸�", "����", "����", "����", "����", "��ȸ", "����", "���");
		System.out.printf("=================================================\n");
		System.out.printf("%-3s %4d %4d %4d %5d %5d %5d %5d\n\n", "������", 100, 100, 100, 100, 100,
				k36_cc.k36_sum(100, 100, 100, 100, 100), k36_cc.k36_ave(100, 100, 100, 100, 100));

	}

}
