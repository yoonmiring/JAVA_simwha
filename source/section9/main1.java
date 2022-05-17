package section9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class main1 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub
		DocumentBuilder k36_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //xml파싱을 위해 선언한다.

		Document k36_doc = k36_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\testdata.xml"));//xml파일을 가져와서 파일을 읽는다.
		Element k36_root = k36_doc.getDocumentElement();//엘리먼트 요소를 읽기위해 선언한다.

		//각항목의 노드 리스트 값을 읽어오기 위해 항목을 읽어온다.
		NodeList k36_tag_name = k36_doc.getElementsByTagName("name");
		NodeList k36_tag_studentid = k36_doc.getElementsByTagName("studentid");
		NodeList k36_tag_kor = k36_doc.getElementsByTagName("kor");
		NodeList k36_tag_eng = k36_doc.getElementsByTagName("eng");
		NodeList k36_tag_mat = k36_doc.getElementsByTagName("mat");

		System.out.println("**********************************************");
		//반복문을 사용하여 각 노드리스트 값을 불러와 읽는다
		for (int i = 0; i < k36_tag_name.getLength(); i++) {
			System.out.printf("이름 : %s\n", k36_tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", k36_tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", k36_tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", k36_tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", k36_tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.println("**********************************************");
		}

	}

}
