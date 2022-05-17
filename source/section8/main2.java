package java220421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main2 {
//buffered 읽고 쓰기
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		k36_FileWrite();//파일 쓰는 함수를 불러온다
		k36_FileRead();//파일 읽는 함수를 불러온다.
	}

	private static void k36_FileRead() throws IOException {//파일을 읽는 함수를 만들어준다
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");//파일을 읽을 위치와 파일을 지정한다.
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));//파일을 읽는 버퍼를 선언
		String k36_readtxt;//문자열을 지정한다.

		while ((k36_readtxt = k36_br.readLine()) != null) {//null값이 나오기 전까지 계속 반복한다.
			System.out.printf("%s\n", k36_readtxt);//문자열로 받아 읽어온다.
		}
	}

	private static void k36_FileWrite() throws IOException {//파일을 쓰는 함수를 만들어준다.
		// TODO Auto-generated method stub
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\Mytest.txt");//파일을 쓸 위치와 이름을 설정한다.
		BufferedWriter k36_bw = new BufferedWriter(new FileWriter(k36_f));//파일을 쓰는 버퍼를 선언

		k36_bw.write("안녕 파일");//파일을 쓰고
		k36_bw.newLine();//새로운 줄을 생성하여
		k36_bw.write("헬로hello");//파일을 또 쓴다
		k36_bw.newLine();

		k36_bw.close();//파일쓰는 행위를 닫는다
	}

}
