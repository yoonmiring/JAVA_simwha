package java220421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();//시작한 시간 값을 얻기 위해 srart시간 선언
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// 지정된 파일을 불러온다
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// 버퍼리더를 선언하여 파일을 읽는다
		File k36_f1 = new File("C:\\Users\\kopo\\Desktop\\day_data\\StockDailyPrice.csv");// 저장할 csv파일을 지정해준다.
		BufferedWriter k36_bw1 = new BufferedWriter(new FileWriter(k36_f1));// 지정된 파일을 쓰기 위해 bufferesWriter을 사용한다.

		String k36_readtxt;// 문자열을 선언한다.

		int k36_cnt = 0;// cnt값을 0으로 초기화하여 정수형으로 선언한다.
		int k36_wcnt = 0;// wcnt값을 0으로 초기화하여 정수형으로 선언한다.

		while ((k36_readtxt = k36_br.readLine()) != null) {// null값이 나오기 전까지 반복문을 실행한다.
			StringBuffer k36_s = new StringBuffer();// 문자열을 수정하기위해 선언한다.
			String[] field = k36_readtxt.split("%_%");// %_%을 기준으로 문자열을 나눈 후 field 배열에 저장한다.
			// field길이가 2 초과이고, field의 3번째 열에 "^"값을 빈칸으로 처리하면서 양옆에 빈칸은 무시하고 첫번째 글자에 A가 들어갈
			// 경우
			if (field.length > 2 && field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				k36_s.append(field[0].replace("^", "").trim());// field의 첫번째 열에 ^"값을 빈칸으로 처리하면서 양옆에 빈칸은 삭제하여 수정한다.
				for (int j = 1; j < field.length; j++) {// field의 길이만큼 반복하여
					k36_s.append("." + field[j].replace("^", "").trim());// 열에 ^"값을 빈칸으로 처리하면서 양옆에 빈칸은 삭제하여 수정
				}
				k36_bw1.write(k36_s.toString());// 수정된 s의 값들을 지정된 파일에 작성한다.
				k36_bw1.newLine();// 작성 후 한줄을 띄운다
				k36_wcnt++;// 계속 1줄씩 증가하며 값들을 수정한다..
			}

			k36_cnt++;// 계속 1줄씩 증가하여 반복해나간다.
		}

		k36_br.close();// 읽는 파일을 닫는다
		k36_bw1.close();// 쓰는 파일을 닫는다

		System.out.printf("Program End[%d][%d]records\n", k36_cnt, k36_wcnt);// 모든과정이 끝나면 프로그램이 끝났다고 알려주며 수정된 값과 입력된 값의 숫자를
																		// 출력한다.
		long end = System.currentTimeMillis();//끝난 시간값을 얻기 위해 end 시간 선언
		System.out.println("Start : " +start);//처음 시작한 시간 출력
		System.out.println("End : " + end);//끝난 시간 출력
		System.out.println("실행시간 : " + (end - start)/1000.0 + "초");//실행시간이 얼마나 걸렸는지 출력 
	}

}
