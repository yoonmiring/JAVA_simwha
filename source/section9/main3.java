package section9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class main3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser k36_parser = new JSONParser();//json형식의 문자열을 만들기 위해 선언한다.

		Object k36_obj = k36_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\test.json"));//파일을 읽어올 위치와 파일을 지정하여 json파일을 열어 json object로 선언한다.

		JSONArray k36_array = (JSONArray) k36_obj;//k36_obj에담은 오브젝을 json배열을 추출한다

		//출력부
		System.out.println("*************************");
		for (int k36_i = 0; k36_i < k36_array.size(); k36_i++) {//배열의 크기만큼 반복하는 반복문 실행
			JSONObject k36_result = (JSONObject) k36_array.get(k36_i);//jsonobject에서 이름과 학번을 추출하기 위해 하나씩 꺼낸다
			System.out.println("이름 : " + k36_result.get("name"));//이름 출력
			System.out.println("학번 : " + k36_result.get("studentid"));//학번출력

			JSONArray k36_score = (JSONArray) k36_result.get("score");//jsonarray에서 성적의 배열을 추출하기 위해 하나씩 실행한다.
			long k36_kor = (long) k36_score.get(0);//배열의 0번째 값은 국어 성적
			long k36_eng = (long) k36_score.get(1);//배열의 1번째 값은 영어 성적
			long k36_mat = (long) k36_score.get(2);//배열의 2번째 값은 수학성적으로 넣어준다
			System.out.println("국어 : " + k36_kor);
			System.out.println("영어 : " + k36_eng);
			System.out.println("수학 : " + k36_mat);
			System.out.println("총점 : " + (k36_kor + k36_eng + k36_mat));//총점을 구하기 위해 국어,영어,수학 점수를 합친다.
			System.out.println("평균 : " + ((k36_kor + k36_eng + k36_mat) / 3.0));//국어,영어,수학을 합친 후 3으로 나누어 평균점수를 구한다.
			System.out.println("*************************");
		}

	}

}
