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
		JSONParser k36_parser = new JSONParser();//json������ ���ڿ��� ����� ���� �����Ѵ�.

		Object k36_obj = k36_parser.parse(new FileReader("C:\\Users\\kopo\\Desktop\\test.json"));//������ �о�� ��ġ�� ������ �����Ͽ� json������ ���� json object�� �����Ѵ�.

		JSONArray k36_array = (JSONArray) k36_obj;//k36_obj������ �������� json�迭�� �����Ѵ�

		//��º�
		System.out.println("*************************");
		for (int k36_i = 0; k36_i < k36_array.size(); k36_i++) {//�迭�� ũ�⸸ŭ �ݺ��ϴ� �ݺ��� ����
			JSONObject k36_result = (JSONObject) k36_array.get(k36_i);//jsonobject���� �̸��� �й��� �����ϱ� ���� �ϳ��� ������
			System.out.println("�̸� : " + k36_result.get("name"));//�̸� ���
			System.out.println("�й� : " + k36_result.get("studentid"));//�й����

			JSONArray k36_score = (JSONArray) k36_result.get("score");//jsonarray���� ������ �迭�� �����ϱ� ���� �ϳ��� �����Ѵ�.
			long k36_kor = (long) k36_score.get(0);//�迭�� 0��° ���� ���� ����
			long k36_eng = (long) k36_score.get(1);//�迭�� 1��° ���� ���� ����
			long k36_mat = (long) k36_score.get(2);//�迭�� 2��° ���� ���м������� �־��ش�
			System.out.println("���� : " + k36_kor);
			System.out.println("���� : " + k36_eng);
			System.out.println("���� : " + k36_mat);
			System.out.println("���� : " + (k36_kor + k36_eng + k36_mat));//������ ���ϱ� ���� ����,����,���� ������ ��ģ��.
			System.out.println("��� : " + ((k36_kor + k36_eng + k36_mat) / 3.0));//����,����,������ ��ģ �� 3���� ������ ��������� ���Ѵ�.
			System.out.println("*************************");
		}

	}

}
