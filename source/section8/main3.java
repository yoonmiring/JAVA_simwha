package java220421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main3 {
//실제파일에 응용
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File k36_f = new File("C:\\Users\\kopo\\Desktop\\12_04_07_E_무료와이파이정보_경기도.csv");//파일을 읽을 csv위치와 이름을 정한다.
		BufferedReader k36_br = new BufferedReader(new FileReader(k36_f));//파일을 읽는 버퍼를 선언한다.

		String k36_readtxt;//문자열을 선언한다.
		
		if((k36_readtxt = k36_br.readLine())== null) {//파일을 읽는 문자열이 null값일 경우
			System.out.println("빈파일입니다");//빈파일이라고 출력한다.
			return;
		}
		String[] k36_field_name = k36_readtxt.split(",");//읽어오는 문자열을 쉼표로 나누어 배열에 저장한다.(필드명)
		
		int k36_LineCnt =1; //정수형을 1로 초기화한다
		while((k36_readtxt = k36_br.readLine()) != null) {//파일을 읽어오는 값이 null값이 아닐때까지 반복한다.
			String[] k36_field = k36_readtxt.split(",");//읽어오는 문자열을 쉼표로 나누어 필드에 저장한다(데이터값)
			System.out.printf("********[%d번째 항목] ***********\n",k36_LineCnt);//1부터 null값 이전까지 출력한다.
			for(int j=0;j<k36_field_name.length;j++) {//필드명의 길이까지 반복하여
				System.out.printf("%s : %s\n",k36_field_name[j],k36_field[j]);//필드명과 필드에 들어간 값을 순서대로 읽는다
			}
			System.out.printf("*****************************\n");
			if(k36_LineCnt == 100) {//100번째까지 읽으면
				break;//반복문을 빠져나온다
			}
			k36_LineCnt++;
		}
		k36_br.close();//파일 읽는것을 닫는다
		
	}

}
