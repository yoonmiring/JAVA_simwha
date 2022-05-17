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

		DocumentBuilder k36_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); // xml파싱을 위해 선언한다.
		//파일 불러오기
		Document doc = k36_docBuilder.parse(new File("C:\\Users\\kopo\\Desktop\\queryDFS.xml"));
		Element root = doc.getDocumentElement();
		NodeList tag_001 = doc.getElementsByTagName("data"); 

		for (int i = 0; i < tag_001.getLength(); i++) {//반복문으로 xml길이 만큼 반복이 가능하게 해준다			
			Element elmt = (Element) tag_001.item(i);
			//각 항목의 값들을 가져오기 위해 선언
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
			
			//출력부
			System.out.printf("%s 번재***********************************************\n", k36_seq );
			System.out.printf("동네예보 3시간 단위: %s\n", k36_hour );
			System.out.printf("1번째날 (0: 오늘/1: 내일/2: 모레): %s\n", k36_day );
			System.out.printf("현재시간 온도 : %s\n", k36_temp );
			System.out.printf("최고 온도 : %s\n", k36_tmx );
			System.out.printf("최저 온도: %s\n", k36_tmn );
			System.out.printf("하늘 상태 코드 (1: 맑음, 2: 구름조금 , 3: 구름 많음 4: 흐림): %s \n", k36_sky );
			System.out.printf("강수 상태 코드 (0: 없음, 1: 비 ,2: 비/눈, 3: 눈/비 4: 눈): %s\n", k36_pty );
			System.out.printf("날씨 한국어 : %s\n", k36_wfKor );
			System.out.printf("날씨 영어 : %s\n", k36_wfEn );
			System.out.printf("강수 확률 : %s\n", k36_pop );
			System.out.printf("12시간 예상 강수량 : %s\n", k36_r12 );
			System.out.printf("12시간 예상 적설량 : %s\n", k36_s12 );
			System.out.printf("풍속 : %s(ms/)\n", k36_ws );
			System.out.printf("풍향 (0: 북, 1: 북동 ,2: 동, 3: 남동, 4: 남, 5: 남서 ,6: 서, 7: 북서): %s\n", k36_wd );
			System.out.printf("풍향 한국어 : %s\n", k36_wdKor );
			System.out.printf("풍향 영어 : %s\n", k36_wdEn );
			System.out.printf("습도 : %s\n", k36_reh );
			System.out.printf("6시간 예상 강수량 : %s\n", k36_r06 );
			System.out.printf("6시간 예상 적설량 : %s\n", k36_s06 );
			System.out.printf("*********************************************************\n" );
		}

		
	}

}
