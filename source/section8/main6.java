package java220421;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\day_data\\THTSKS010H00.dat");// 파일 불러오기
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));// 버퍼로 읽어오기위해 선언

		String k36_readtxt;// 문자열로 받아내고
		int k36_LineCnt = 0;// 정수형 선언후 초기화해준다
		int k36_n = -1;// 정수형 -1로 선언해준다
		StringBuffer k36_s = new StringBuffer();// 문자열을 변경하기 위해 선언한다.

		while (true) {// 무한으로 반복문을 실행한다.
			char[] k36_ch = new char[1000];// 1000바이트의 문자를 배열로 선언한다
			k36_n = k36_br.read(k36_ch);// 배열을 읽어 n값으로 저장한다.
			if (k36_n == -1) {// n이 -1일때
				break;// 반복문을 빠져나온다.
			}
			for (char k36_c : k36_ch) {// ch배열의 각 요소값을 순차적으로 c로 전달한다.
				if (k36_c == '\n') {// c가 개행되었을때
					System.out.printf("[%s]***\n", k36_s.toString());// 문자열로 변경하여 출력한다.
					k36_s.delete(0, k36_s.length());// 문자열의 길이가 0일경우 문자열은 삭제한다.
				} else {// 개행이 되지 않을 경우에는
					k36_s.append(k36_c);// c값을 추가한다.
				}
			}

			k36_LineCnt++;// 1씩 증가한다
		}
		System.out.printf("[%s]***\n", k36_s.toString());// s문자열을 출력한다.
		k36_br.close();// 파일읽기를 멈춘다.

	}

}
