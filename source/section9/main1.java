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
		DocumentBuilder k36_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //xml�Ľ��� ���� �����Ѵ�.

		Document k36_doc = k36_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\testdata.xml"));//xml������ �����ͼ� ������ �д´�.
		Element k36_root = k36_doc.getDocumentElement();//������Ʈ ��Ҹ� �б����� �����Ѵ�.

		//���׸��� ��� ����Ʈ ���� �о���� ���� �׸��� �о�´�.
		NodeList k36_tag_name = k36_doc.getElementsByTagName("name");
		NodeList k36_tag_studentid = k36_doc.getElementsByTagName("studentid");
		NodeList k36_tag_kor = k36_doc.getElementsByTagName("kor");
		NodeList k36_tag_eng = k36_doc.getElementsByTagName("eng");
		NodeList k36_tag_mat = k36_doc.getElementsByTagName("mat");

		System.out.println("**********************************************");
		//�ݺ����� ����Ͽ� �� ��帮��Ʈ ���� �ҷ��� �д´�
		for (int i = 0; i < k36_tag_name.getLength(); i++) {
			System.out.printf("�̸� : %s\n", k36_tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", k36_tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k36_tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k36_tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k36_tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.println("**********************************************");
		}

	}

}
