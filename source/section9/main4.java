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

public class main4 {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// TODO Auto-generated method stub

		String k36_seq = "";		String k36_hour = "";		String k36_day = "";		String k36_temp = "";
		String k36_tmx = "";		String k36_tmn = "";		String k36_sky = "";		String k36_pty = "";
		String k36_wfKor = "";		String k36_wfEn = "";		String k36_pop = "";		String k36_r12 = "";
		String k36_s12 = "";		String k36_ws = "";			String k36_wd = "";			String k36_wdKor = "";		
		String k36_wdEn = "";		String k36_reh = "";		String k36_r06 = "";		String k36_s06 = "";

		DocumentBuilder k36_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); // xml�Ľ��� ���� �����Ѵ�.
		//���� �ҷ�����
		Document doc = k36_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\queryDFS.xml"));
		Element root = doc.getDocumentElement();
		NodeList tag_001 = doc.getElementsByTagName("data"); 

		for (int i = 0; i < tag_001.getLength(); i++) {//�ݺ������� xml���� ��ŭ �ݺ��� �����ϰ� ���ش�			
			Element elmt = (Element) tag_001.item(i);
			//�� �׸��� ������ �������� ���� ����
			k36_seq = tag_001.item(i).getAttributes().getNamedItem("seq").getNodeValue();			
			k36_hour = elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k36_day = elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k36_temp = elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k36_tmx = elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k36_tmn = elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k36_sky = elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k36_pty = elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k36_wfKor = elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k36_wfEn = elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k36_pop = elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k36_r12 = elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k36_s12 = elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k36_ws = elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k36_wd = elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k36_wdKor = elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k36_wdEn = elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k36_reh = elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k36_r06 = elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k36_s06 = elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			
			//��º�
			System.out.printf("%s ����***********************************************\n", k36_seq );
			System.out.printf("���׿��� 3�ð� ����: %s\n", k36_hour );
			System.out.printf("1��°�� (0: ����/1: ����/2: ��): %s\n", k36_day );
			System.out.printf("����ð� �µ� : %s\n", k36_temp );
			System.out.printf("�ְ� �µ� : %s\n", k36_tmx );
			System.out.printf("���� �µ�: %s\n", k36_tmn );
			System.out.printf("�ϴ� ���� �ڵ� (1: ����, 2: �������� , 3: ���� ���� 4: �帲): %s \n", k36_sky );
			System.out.printf("���� ���� �ڵ� (0: ����, 1: �� ,2: ��/��, 3: ��/�� 4: ��): %s\n", k36_pty );
			System.out.printf("���� �ѱ��� : %s\n", k36_wfKor );
			System.out.printf("���� ���� : %s\n", k36_wfEn );
			System.out.printf("���� Ȯ�� : %s\n", k36_pop );
			System.out.printf("12�ð� ���� ������ : %s\n", k36_r12 );
			System.out.printf("12�ð� ���� ������ : %s\n", k36_s12 );
			System.out.printf("ǳ�� : %s(ms/)\n", k36_ws );
			System.out.printf("ǳ�� (0: ��, 1: �ϵ� ,2: ��, 3: ����, 4: ��, 5: ���� ,6: ��, 7: �ϼ�): %s\n", k36_wd );
			System.out.printf("ǳ�� �ѱ��� : %s\n", k36_wdKor );
			System.out.printf("ǳ�� ���� : %s\n", k36_wdEn );
			System.out.printf("���� : %s\n", k36_reh );
			System.out.printf("6�ð� ���� ������ : %s\n", k36_r06 );
			System.out.printf("6�ð� ���� ������ : %s\n", k36_s06 );
			System.out.printf("*********************************************************\n" );
		}

		
	}

}
