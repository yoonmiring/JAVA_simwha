package java220419;

public class MethodTest {

	static int k36_iStatic;

	public static void add(int k36_i) {
		k36_iStatic++;
		k36_i++;
		System.out.printf("add�޼ҵ忡��->iStaic=[%d]\n", k36_iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", k36_i);
	}

	public static int add2(int k36_i) {
		k36_iStatic++;
		k36_i++;
		System.out.printf("add2�޼ҵ忡��->iStaic=[%d]\n", k36_iStatic);
		System.out.printf("add2�޼ҵ忡��->i=[%d]\n", k36_i);
		return k36_i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k36_iMain;

		k36_iMain = 1;
		k36_iStatic = 1;

		System.out.printf("**********************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStaic=[%d]\n", k36_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k36_iMain);
		System.out.printf("**********************************\n");

		add(k36_iMain);

		System.out.printf("**********************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStaic=[%d]\n", k36_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k36_iMain);
		System.out.printf("**********************************\n");

		k36_iMain = add2(k36_iMain);

		System.out.printf("**********************************\n");
		System.out.printf("add2ȣ���� ���ο���->iStaic=[%d]\n", k36_iStatic);
		System.out.printf("add2ȣ���� ���ο���->iMain=[%d]\n", k36_iMain);
		System.out.printf("**********************************\n");

	}

}
