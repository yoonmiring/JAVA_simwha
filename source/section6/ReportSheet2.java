package java220419;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReportSheet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar k36_cal = Calendar.getInstance();// 캘린더 라이브러리 설정
		SimpleDateFormat k36_sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");// 현재 일자 출력 포맷 설정
		int k36_iPerson = 30;// k36_iPerson에 값을 주는 만큼 저장소를 생성한다.
		InputData k36_inData = new InputData(k36_iPerson);// 생성자의 숫자를 준 만큼 배열을 생성한다.
		int k36_korSum = 0;
		int k36_engSum = 0;
		int k36_matSum = 0;
		int k36_sumSum = 0;
		int k36_aveSum = 0;
		// 입력데이터 생성
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			String k36_name = String.format("홍길%02d", k36_i);// 이름생성
			int k36_kor = (int) (Math.random() * 100);// 국어점수 생성
			int k36_eng = (int) (Math.random() * 100);// 영어점수 생성
			int k36_mat = (int) (Math.random() * 100);// 수학점수 생성
			k36_inData.SetData(k36_i, k36_name, k36_kor, k36_eng, k36_mat);// 클래스 내 값 입력
		}
		//출력부
		System.out.printf("%23s\n","성적집계표");
		System.out.printf("%21s %s\n","출력일자 :",k36_sdt.format(k36_cal.getTime()));//출력일자를 출력하기위해 현재시간을 불러온다
		System.out.println("==============================================");
		System.out.printf("%-3s %4s %4s %4s %3s %3s %3s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.println("==============================================");
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {
			System.out.printf("%03d %7s %5d %5d %5d %5d %5d\n", k36_i, k36_inData.k36_name[k36_i],
					k36_inData.k36_kor[k36_i], k36_inData.k36_eng[k36_i], k36_inData.k36_mat[k36_i],
					k36_inData.k36_sum[k36_i], (int)k36_inData.k36_ave[k36_i]);
		}
		System.out.println("==============================================");
		System.out.printf("%-14s","합계");//합계를 구하기 위해 배열의 값을 다 더하여 누적한다.
		for (int k36_i = 0; k36_i < k36_iPerson; k36_i++) {			
			k36_korSum += k36_inData.k36_kor[k36_i];		
			k36_engSum += k36_inData.k36_eng[k36_i];		
			k36_matSum += k36_inData.k36_mat[k36_i];		
			k36_sumSum += k36_inData.k36_sum[k36_i];		
			k36_aveSum += k36_inData.k36_ave[k36_i];		
		}
		System.out.printf("%5d %5d %5d %5d %5d \n",k36_korSum,k36_engSum,k36_matSum,k36_sumSum,k36_aveSum);//전체 합계 출력
		//합계를 구한 값에서 입력값만큼 나누어 평균을 구한다
		int k36_korAve = k36_korSum/k36_iPerson; 
		int k36_engAve = k36_engSum/k36_iPerson; 
		int k36_matAve = k36_matSum/k36_iPerson; 
		int k36_sumAve = k36_sumSum/k36_iPerson; 
		int k36_aveAve = k36_sumSum/k36_iPerson; 
		System.out.printf("%-14s %4d %5d %5d %5d %5d \n","평균",k36_korAve,k36_engAve,k36_matAve,k36_sumAve,k36_aveAve); //전체 평균 출력
	
	}

}
