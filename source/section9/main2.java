package section9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class main2 {
	
	//�޼ҵ� ����
	public static JSONObject k36_oneRec(String k36_name, int k36_studentid, int k36_kor, int k36_eng, int k36_mat) {
		JSONObject k36_dataObject = new JSONObject();//json����
		k36_dataObject.put("name", k36_name);//�̸��� �̸����� �־��ش�
		k36_dataObject.put("studentid", k36_studentid);//�й��� �ѹ����� �־��ش�
		JSONArray k36_score =new JSONArray();//json�迭�� score�̶�� ��������
		k36_score.add(k36_kor);//�����
		k36_score.add(k36_eng);//�����
		k36_score.add(k36_mat);//���м���
		k36_dataObject.put("score", k36_score);//�������� �ִ´�.
		
		return k36_dataObject;//���ϰ��� dataObject�� �ִ´�
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject k36_jsonObject = new JSONObject();//json����
		JSONArray k36_datasArray = new JSONArray();//json�迭 ����
		
		JSONObject k36_dataObject = new JSONObject();//json����
		//"����"�� �������� �ֱ� ���� �������� �ϳ��� �־��ش�
		k36_dataObject.put("name", "����");
		k36_dataObject.put("studentid", "209901");
		JSONArray k36_score = new JSONArray();
		k36_score.add(90);
		k36_score.add(100);
		k36_score.add(95);
		k36_dataObject.put("score", k36_score);
		k36_datasArray.add(k36_dataObject);
		//�ݺ��Ǳ� ������ �޼ҵ带 ����Ͽ� �ѹ��� �����Ѵ�.
		k36_datasArray.add(k36_oneRec("����", 209902,100,85,75));
		k36_datasArray.add(k36_oneRec("���", 209903,90,75,85));
		k36_datasArray.add(k36_oneRec("�糪", 209904,90,85,75));
		k36_datasArray.add(k36_oneRec("��ȿ", 209905,80,75,85));
		k36_datasArray.add(k36_oneRec("�̳�", 209906,90,85,55));
		k36_datasArray.add(k36_oneRec("�ٿ�", 209907,70,75,65));
		k36_datasArray.add(k36_oneRec("ä��", 209908,100,75,95));
		k36_datasArray.add(k36_oneRec("����", 209909,80,65,95));
		
		try {
			FileWriter k36_file = new FileWriter("C:\\Users\\kopo\\Desktop\\test.json");//test.json������ ����� ���� fileWriter�� �����Ѵ�.
			k36_file.write(k36_datasArray.toJSONString());//k36_datasArray�� ���� ������ json���Ŀ� ���� ���ڿ��� �����Ͽ� ���Ͽ� ����
			k36_file.flush();//���Ͼ��°��� ���߰�
			k36_file.close();//������ �ݴ´�
			
		}catch(IOException k36_e) {
			k36_e.printStackTrace();//�������� ���� ��������� �˷��ش�
		}
		System.out.println("JSON ����� : "+k36_datasArray);//������� Ȯ���ϱ� ���� �ܼ�â�� json���Ͽ� �� ������ ����Ѵ�
	}

}
