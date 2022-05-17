package java220421;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File k36_f = new File("C:\\Users\\kopo\\Desktop\\test.txt"); //파일을 새로 생성할 위치와 이름을 지정한다
			FileWriter k36_fw = new FileWriter(k36_f);//파일을 쓰기 위한 포맷설정

			k36_fw.write("안녕 파일\n");//포맷설정한 파일에 쓸 내용을 추가한다.
			k36_fw.write("hello 헬로\n");

			k36_fw.close();//파일쓰는 것을 닫는다.

			FileReader k36_fr = new FileReader(k36_f);//파일을 읽기 위한 포맷설정

			int k36_n = -1;//k36_n의값을 -1인 정수형으로 선언한다
			char[] k36_ch;//배열에 넣을 문자를 선언한다.

			while (true) {//무한으로 반복한다
				k36_ch = new char[100];//배열의 길이는 100으로 설정한다.
				k36_n = k36_fr.read(k36_ch);//배열을 읽는다

				if (k36_n == -1) {//만약 k36_n의값이 -1일때 
					break;//반복문을 빠져나온다.
				}
				for (int k36_i = 0; k36_i < k36_n; k36_i++) {//n에 도달할때 까지
					System.out.printf("%c", k36_ch[k36_i]);//콘솔창에 k36_ch의 값을 출력한다
				}
			}
			k36_fr.close();//파일 읽는 것을 닫는다
			System.out.printf("\n FILE READ END");//파일을 다 읽었다고 출력한다.
		} catch (Exception k36_e) {
			System.out.printf("나 에러 [%s]\n", k36_e);//에러가 났을 경우 어떤 에러인지 밝힌다.
		}
	}

}
