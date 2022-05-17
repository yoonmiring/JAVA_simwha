package java220419;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main7 {

	public static void main(String[] args) {
		int k36_iPerson = 200 + 1;// k36_iPerson에 값을 주는 만큼 저장소를 생성한다.
		int pageCnt = 1;
		int cnt = 1;

		InputData k36_inData = new InputData(k36_iPerson);

		int k36_korSum = 0, k36_engSum = 0, k36_matSum = 0, k36_sumSum = 0, k36_aveSum = 0;
		int k36_korSumAc = 0, k36_engSumAc = 0, k36_matSumAc = 0, k36_sumSumAc = 0, k36_aveSumAc = 0;
		int k36_korAveAc = 0, k36_engAveAc = 0, k36_matAveAc = 0, k36_sumAveAc = 0, k36_aveAveAc = 0;
		int k36_korAve = 0, k36_engAve = 0, k36_matAve = 0, k36_sumAve = 0, k36_aveAve = 0;
		// 입력데이터 생성
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("홍길%02d", k36_i);// 이름생성
			int k36_kor = (int) (Math.random() * 100);// 국어점수 생성
			int k36_eng = (int) (Math.random() * 100);// 영어점수 생성
			int k36_mat = (int) (Math.random() * 100);// 수학점수 생성
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// 클래스 내 값 입력
		}
		// 출력부

		headPrint(pageCnt);

		// 입력값만큼 출력하겠다.
		for (int k36_i = 1; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("%03d %7s %5d %5d %5d %5d %5d\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], (int) k36_inData.k36_ave[k36_i]);

			// 현재페이지 각 과목별 합계
			k36_korSumAc += k36_inData.k36_kor[k36_i];
			k36_engSumAc += k36_inData.k36_eng[k36_i];
			k36_matSumAc += k36_inData.k36_mat[k36_i];
			k36_sumSumAc += k36_inData.k36_sum[k36_i];
			k36_aveSumAc += k36_inData.k36_ave[k36_i];
			// 현재페이지 각 과목별 평균(합계에서 학생수(cnt)로 나누어준다)
			k36_korAveAc = k36_korSumAc / cnt;
			k36_engAveAc = k36_engSumAc / cnt;
			k36_matAveAc = k36_matSumAc / cnt;
			k36_sumAveAc = k36_sumSumAc / cnt;
			k36_aveAveAc = k36_aveSumAc / cnt;

			// 누적 페이지 각 과목별 합계
			k36_korSum += k36_inData.k36_kor[k36_i];
			k36_engSum += k36_inData.k36_eng[k36_i];
			k36_matSum += k36_inData.k36_mat[k36_i];
			k36_sumSum += k36_inData.k36_sum[k36_i];
			k36_aveSum += k36_inData.k36_ave[k36_i];
			// 누적페이지 각 과목별 평균
			k36_korAve = k36_korSum / k36_i;
			k36_engAve = k36_engSum / k36_i;
			k36_matAve = k36_matSum / k36_i;
			k36_sumAve = k36_sumSum / k36_i;
			k36_aveAve = k36_aveSum / k36_i;

			cnt++;

			if (k36_i % 30 == 0 && k36_i < k36_iPerson) {
				System.out.println("==============================================");
				System.out.printf("현재페이지\n%-10s %5d %5d %5d %5d %5d\n","합계", k36_korSumAc, k36_engSumAc, k36_matSumAc, k36_sumSumAc,
						k36_aveSumAc);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","평균", k36_korAveAc, k36_engAveAc, k36_matAveAc, k36_sumAveAc,
						k36_korAveAc);
				System.out.println("==============================================");
				System.out.printf("누적페이지\n%-10s %5d %5d %5d %5d %5d\n", "합계",k36_korSum, k36_engSum, k36_matSum, k36_sumSum, k36_aveSum);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","평균", k36_korAve, k36_engAve, k36_matAve, k36_matAve, k36_aveAve);
				pageCnt++;
				headPrint(pageCnt);
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
				cnt = 1;
			}
			if (k36_i + 1 == k36_iPerson) {
				System.out.println("==============================================");
				System.out.printf("현재페이지\n%-10s %5d %5d %5d %5d %5d\n","합계", k36_korSumAc, k36_engSumAc, k36_matSumAc, k36_sumSumAc,
						k36_aveSumAc);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","평균", k36_korAveAc, k36_engAveAc, k36_matAveAc, k36_sumAveAc,
						k36_korAveAc);
				System.out.println("==============================================");
				System.out.printf("누적페이지\n%-10s %5d %5d %5d %5d %5d\n", "합계",k36_korSum, k36_engSum, k36_matSum, k36_sumSum, k36_aveSum);
				System.out.printf("%-10s %5d %5d %5d %5d %5d\n","평균", k36_korAve, k36_engAve, k36_matAve, k36_matAve, k36_aveAve);
				System.out.println("\nEnd\n");
			}
		}
	}

	public static void headPrint(int pageCnt) {
		Calendar k36_cal = Calendar.getInstance();// 캘린더 라이브러리 설정
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// 현재 일자 출력 포맷 설정
		System.out.printf("%23s\n", "성적집계표");
		System.out.printf("%-5s%d %14s %s\n", "PAGE: ", pageCnt, "출력일자 :", k36_sdt.format(k36_cal.getTime()));// 출력일자를
																												// 출력하기위해
		// 현재시간을 불러온다
		System.out.println("==============================================");
		System.out.printf("%-3s %4s %4s %4s %3s %3s %3s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("==============================================");

	}
}