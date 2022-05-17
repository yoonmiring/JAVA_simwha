package java220418;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iWeekday = 5;
		int startDay = 0;
		int monStart = 0;
		int[] iEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int iMon = 0; iMon < 12; iMon++) {
			System.out.printf("\n\n         %d월     \n", iMon + 1);
			System.out.printf("======================\n");
			System.out.printf("%2s%2s%2s%2s%2s%2s%2s\n", "일", "월", "화", "수", "목", "금", "토");
			for (int i = 0; i < 12; i++) {
				startDay += iEnd[i];
				monStart = (startDay+5)  % 7;
			}
			if(iMon == 1) {
				for (int j = 0; j <5; j++) {
					System.out.printf("%2s ", " ");
				}
			}else {
			for (int j = 0; j < monStart; j++) {
				System.out.printf("%2s ", " ");
			}
			}

			for (int i = 1; i <= iEnd[iMon]; i++) {
				iWeekday++;
				int first = iWeekday % 7;
				System.out.printf("%2d ", i);
				if (iWeekday % 7 == 0) {
					System.out.printf("\n");
				}
			}

		}
	}

}
