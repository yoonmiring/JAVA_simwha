package java220421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main4 {
//거리계산
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보_경기도.csv");// 읽어올 파일을 불러온다
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// 파일을 읽는 버퍼를 선언한다

		String k36_readtxt;// 문자열을 선언한다

		if ((k36_readtxt = k36_br.readLine()) == null) {// 파일을 읽는 값이 null값일 경우
			System.out.println("빈파일입니다");// 빈 파일이라고 출력한다.
			return;
		}
		String[] k36_field_name = k36_readtxt.split(",");// 필드명을 쉼표로 분리하여 필드명 배열에 선언한다.

		double k36_lat = 37.3858;// 현재위치의 위도를 지정한다.
		double k36_lng = 127.1213;// 현재위치의 경도를 지정한다.

		int k36_LineCnt = 1;// 정수형으로 1을 선언한다.

		while ((k36_readtxt = k36_br.readLine()) != null) {// null값이 나오기 전까지는 파일을 읽어 반복문을 실행한다.
			String[] k36_field = k36_readtxt.split(",");// 읽은 파일을 쉼표로 분리하여 필드배열에 선언한다.
			System.out.printf("********[%d번째 항목] ***********\n", k36_LineCnt);
			System.out.printf("%s : %s\n", k36_field_name[9], k36_field[9]);// 도로명 주소를 출력
			System.out.printf("%s : %s\n", k36_field_name[13], k36_field[13]);// 위도 출력
			System.out.printf("%s : %s\n", k36_field_name[14], k36_field[14]);// 경도 출력
			double k36_dist = Math.sqrt(Math.pow(Double.parseDouble(k36_field[13]) - k36_lat, 2)
					+ Math.pow(Double.parseDouble(k36_field[14]) - k36_lng, 2));
			// 현재위치와 배열에 있는 값의 위치의 값의 거리를 계산한다.
			System.out.printf("현재지점과 거리 :%f\n", k36_dist);// 계산된 거리를 출력한다.
			System.out.printf("*****************************\n");

			k36_LineCnt++;// 정수형으로 선언한 값을 계속 1씩 증가시킨다
		}
		k36_br.close();// 파일 읽는것을 닫는다

	}

}
