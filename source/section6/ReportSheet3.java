package java220419;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet3 {
	static int i;
	static int k36_iPerson = 20 + 1;// k36_iPerson에 값을 주는 만큼 저장소를 생성한다.
	static InputData k36_inData = new InputData(k36_iPerson);// 생성자의 숫자를 준 만큼 배열을 생성한다.
	static int k36_korSum;
	static int k36_engSum;
	static int k36_matSum;
	static int k36_sumSum;
	static int k36_aveSum;

	public static void main(String[] args) {
		int k36_korSumAc = 0;
		int k36_engSumAc = 0;
		int k36_matSumAc = 0;
		int k36_sumSumAc = 0;
		int k36_aveSumAc = 0;
		InputData k36_inData = new InputData(k36_iPerson);
		// 입력데이터 생성
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("홍길%02d", k36_i);// 이름생성
			int k36_kor = (int) (Math.random() * 100);// 국어점수 생성
			int k36_eng = (int) (Math.random() * 100);// 영어점수 생성
			int k36_mat = (int) (Math.random() * 100);// 수학점수 생성
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// 클래스 내 값 입력
		}
		// 출력부

		headPrint();
		
		//입력값만큼 출력하겠다.
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("%03d %7s %5d %5d %5d %5d %5d\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], (int) k36_inData.k36_ave[k36_i]);
			
				//누적페이지합계
				for (int k36_j = 0; k36_j < k36_iPerson; k36_j++) {
					k36_korSum += k36_inData.k36_kor[k36_j];
					k36_engSum += k36_inData.k36_eng[k36_j];
					k36_matSum += k36_inData.k36_mat[k36_j];
					k36_sumSum += k36_inData.k36_sum[k36_j];
					k36_aveSum += k36_inData.k36_ave[k36_j];
				}
				// 현재페이지 합계
				for (int k36_j = 0; k36_j < k36_iPerson; k36_j++) { // 1 + (1+2) + (1+2+3) 식으로 늘어나서 숫자가 크게나옴
					k36_korSumAc += k36_inData.k36_kor[k36_j];
					k36_engSumAc += k36_inData.k36_eng[k36_j];
					k36_matSumAc += k36_inData.k36_mat[k36_j];
					k36_sumSumAc += k36_inData.k36_sum[k36_j];
					k36_aveSumAc += k36_inData.k36_ave[k36_j];
				}
				// 누적페이지 평균
				int k36_korAve = k36_korSum / k36_iPerson;
				int k36_engAve = k36_engSum / k36_iPerson;
				int k36_matAve = k36_matSum / k36_iPerson;
				int k36_sumAve = k36_sumSum / k36_iPerson;
				int k36_aveAve = k36_sumSum / k36_iPerson;
				// 현재페이지 평균
				int k36_korAveAc = k36_korSumAc / k36_iPerson;
				int k36_engAveAc = k36_engSumAc / k36_iPerson;
				int k36_matAveAc = k36_matSumAc / k36_iPerson;
				int k36_sumAveAc = k36_sumSumAc / k36_iPerson;
				int k36_aveAveAc = k36_aveSumAc / k36_iPerson;
				// 메서드 호출 후 사람 수 만큼 배열값에 저장

				// System.out.println("==============================================");
				// 10줄마다 자르겠다.
			if (k36_i % 10 == 0) {
				System.out.println("==============================================");

				System.out.println("현재페이지");
				System.out.printf("%-14s", "합계");// 현재페이지의 합계를 구하기 위해 배열의 값을 다 더하여 누적한다.
				System.out.printf("%5d %5d %5d %5d %5d \n", k36_korSumAc, k36_engSumAc, k36_matSumAc, k36_sumSumAc,
						k36_aveSumAc);// 현재 페이지 합계 출력
				// 합계를 구한 값에서 입력값만큼 나누어 현제 페이지의 평균을 구한다
				System.out.printf("%-14s %4d %5d %5d %5d %5d \n\n", "평균", k36_korAveAc, k36_engAveAc, k36_matAveAc,
						k36_sumAveAc, k36_aveAveAc); // 현재페이지 평균 출력
				k36_korSumAc = 0;
				k36_engSumAc = 0;
				k36_matSumAc = 0;
				k36_sumSumAc = 0;
				k36_aveSumAc = 0;
				k36_korAveAc = 0;
				k36_engAveAc = 0;
				k36_matAveAc = 0;
				k36_sumAveAc = 0;
				k36_aveAveAc = 0;

				System.out.println("==============================================");
				System.out.println("누적페이지");
				System.out.printf("%-14s", "합계");// 누적페이지의 합계를 구하기 위해 배열의 값을 다 더하여 누적한다.
				System.out.printf("%5d %5d %5d %5d %5d \n", k36_korSum, k36_engSum, k36_matSum, k36_sumSum, k36_aveSum);// 누적
																														// 페이지
																														// 합계
																														// 출력
				// 합계를 구한 값에서 입력값만큼 나누어 누적 페이지의 평균을 구한다
				System.out.printf("%-14s %4d %5d %5d %5d %5d \n\n", "평균", k36_korAve, k36_engAve, k36_matAve,
						k36_sumAve, k36_aveAve); // 누적페이지 평균 출력
			}
		}

	}

	public static void headPrint() {
		Calendar k36_cal = Calendar.getInstance();// 캘린더 라이브러리 설정
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// 현재 일자 출력 포맷 설정
		System.out.printf("%23s\n", "성적집계표");
		System.out.printf("%-5s%d %14s %s\n", "PAGE: ", i, "출력일자 :", k36_sdt.format(k36_cal.getTime()));// 출력일자를 출력하기위해
																										// 현재시간을 불러온다
		System.out.println("==============================================");
		System.out.printf("%-3s %4s %4s %4s %3s %3s %3s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("==============================================");

	}
}
