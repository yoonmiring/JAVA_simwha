package section9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class main2 {
	
	//메소드 생성
	public static JSONObject k36_oneRec(String k36_name, int k36_studentid, int k36_kor, int k36_eng, int k36_mat) {
		JSONObject k36_dataObject = new JSONObject();//json선언
		k36_dataObject.put("name", k36_name);//이름에 이름값을 넣어준다
		k36_dataObject.put("studentid", k36_studentid);//학번에 한번값을 넣어준다
		JSONArray k36_score =new JSONArray();//json배열에 score이라는 변수선언
		k36_score.add(k36_kor);//국어성적
		k36_score.add(k36_eng);//영어성적
		k36_score.add(k36_mat);//수학성적
		k36_dataObject.put("score", k36_score);//성적값을 넣는다.
		
		return k36_dataObject;//리턴값은 dataObject에 넣는다
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject k36_jsonObject = new JSONObject();//json선언
		JSONArray k36_datasArray = new JSONArray();//json배열 선언
		
		JSONObject k36_dataObject = new JSONObject();//json선언
		//"나연"의 정보값을 넣기 위해 정보값을 하나씩 넣어준다
		k36_dataObject.put("name", "나연");
		k36_dataObject.put("studentid", "209901");
		JSONArray k36_score = new JSONArray();
		k36_score.add(90);
		k36_score.add(100);
		k36_score.add(95);
		k36_dataObject.put("score", k36_score);
		k36_datasArray.add(k36_dataObject);
		//반복되기 때문에 메소드를 사용하여 한번에 저장한다.
		k36_datasArray.add(k36_oneRec("정연", 209902,100,85,75));
		k36_datasArray.add(k36_oneRec("모모", 209903,90,75,85));
		k36_datasArray.add(k36_oneRec("사나", 209904,90,85,75));
		k36_datasArray.add(k36_oneRec("지효", 209905,80,75,85));
		k36_datasArray.add(k36_oneRec("미나", 209906,90,85,55));
		k36_datasArray.add(k36_oneRec("다연", 209907,70,75,65));
		k36_datasArray.add(k36_oneRec("채영", 209908,100,75,95));
		k36_datasArray.add(k36_oneRec("쯔위", 209909,80,65,95));
		
		try {
			FileWriter k36_file = new FileWriter("C:\\Users\\kopo\\Desktop\\test.json");//test.json파일을 만들기 위해 fileWriter을 선언한다.
			k36_file.write(k36_datasArray.toJSONString());//k36_datasArray에 넣은 값들을 json형식에 맞춘 문자열로 변경하여 파일에 쓴다
			k36_file.flush();//파일쓰는것을 멈추고
			k36_file.close();//파일을 닫는다
			
		}catch(IOException k36_e) {
			k36_e.printStackTrace();//오류값이 나면 오류결과를 알려준다
		}
		System.out.println("JSON 만든거 : "+k36_datasArray);//결과값을 확인하기 위해 콘솔창에 json파일에 들어갈 내용을 출력한다
	}

}
