package java220421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main5 {
//거리계산
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\12_04_01_E_공중화장실정보.csv");// 읽어올 파일을 불러온다
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// 파일을 읽는 버퍼를 선언한다

		String k36_readtxt;// 문자열을 선언한다

		if ((k36_readtxt = k36_br.readLine()) == null) {// 파일을 읽는 값이 null값일 경우
			System.out.println("빈파일입니다");// 빈 파일이라고 출력한다.
			return;
		}
		String[] k36_field_name = k36_readtxt.split(",");// 필드명을 쉼표로 분리하여 필드명 배열에 선언한다.

		double k36_lat = 37.3858;// 현재위치의 위도를 지정한다.
		double k36_lng = 127.1213;// 현재위치의 경도를 지정한다.

		double k36_min = 100; // 최소값을 큰 값으로 설정한다.
		double k36_max = 0; // 최대값을 가장 작은값인 0으로 설정한다.
		int k36_LineCnt = 1;// 정수형으로 1을 선언한다.
		String k36_maxAdd = "";// 가장 먼 거리의 값의 주소를 받을 정수형으로 지정
		String k36_minAdd = "";// 가장 가까운 거리의 값의 주소를 받을 정수형으로 지정

		while ((k36_readtxt = k36_br.readLine()) != null) {// null값이 나오기 전까지는 파일을 읽어 반복문을 실행한다.
			String[] k36_field = k36_readtxt.split(",");// 읽은 파일을 쉼표로 분리하여 필드배열에 선언한다.
			System.out.printf("********[%d번째 항목] ***********\n", k36_LineCnt);
			System.out.printf("%s : %s\n", k36_field_name[3], k36_field[3]);// 도로명 주소를 출력
			System.out.printf("%s : %s\n", k36_field_name[19], k36_field[19]);// 위도 출력
			System.out.printf("%s : %s\n", k36_field_name[20], k36_field[20]);// 경도 출력
			double k36_dist = 0;

			k36_dist = Math.sqrt(Math.pow(Double.parseDouble(k36_field[19]) - k36_lat, 2)
					+ Math.pow(Double.parseDouble(k36_field[20]) - k36_lng, 2));

			// 현재위치와 배열에 있는 값의 위치의 값의 거리를 계산한다.
			System.out.printf("현재지점과 거리 :%f\n", k36_dist);// 계산된 거리를 출력한다.
			System.out.printf("*****************************\n");
			if (k36_max < k36_dist) {// 가장 먼 거리의 값을 구한다
				k36_max = k36_dist;
				k36_maxAdd = k36_field[3];
			}
			if (k36_min > k36_dist) {// 가장 가까운 거리의 값을 구한다.
				k36_min = k36_dist;
				k36_minAdd = k36_field[3];
			}
			k36_LineCnt++;// 정수형으로 선언한 값을 계속 1씩 증가시킨다

		}
		// 출력부
		System.out.println("가장 먼 거리 값 : " + k36_max + "\n가장 먼 도로명 주소 : " + k36_maxAdd);
		System.out.println("가장 가까운 거리 값 " + k36_min + "\n가장 가까운 도로명 주소 : " + k36_minAdd);
		k36_br.close();// 파일 읽는것을 닫는다

	}

}
