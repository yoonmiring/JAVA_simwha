package java220419;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class main8 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int k33_iPerson = 200;    // �л��� ����
      int k33_pageAmount = 30;    // �������� �Ҵ緮 ����
      int pageCnt = 1;      // ������ ī��Ʈ, �������� �Ѿ������ 1���� �����ϵ��� ����

      p16_InputData k33_inData = new p16_InputData(k33_iPerson); // Ŭ������ �޾� ��ü�� ����� �ν��Ͻ��� �����Ͽ� ��ü�� ����

      int cnt = 1; // ���� ������ ��� ���� �������� ī��Ʈ ����
      int k33_korSum = 0, k33_engSum = 0, k33_matSum = 0, k33_sumSum = 0, k33_aveSum = 0, // ���� ������ ���� �հ� ���� ���� ���� ���� ����
            k33_korAve = 0, k33_engAve = 0, k33_matAve = 0, k33_sumAve = 0, k33_aveAve = 0;   // ���� ������ ���� ��� ���� ���� ���� ���� ����
      int k33_korTotalSum = 0, k33_engTotalSum = 0, k33_matTotalSum = 0, k33_sumTotalSum = 0, k33_aveTotalSum = 0, // ���� ������ ���� �հ� �� ���� ����
            k33_korTotalAve = 0, k33_engTotalAve = 0, k33_matTotalAve = 0, k33_sumTotalAve = 0, k33_aveTotalAve = 0;   // ���� ������ ���� ��� �� ���� ����

      for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) { // ����� ��ŭ ���� ���
         String k33_name = String.format("ȫ��%03d", k33_i + 1); // �̸� ����
         int k33_kor = (int) (Math.random() * 100); // ���� ���� ����
         int k33_eng = (int) (Math.random() * 100); // ���� ���� ����
         int k33_mat = (int) (Math.random() * 100); // ���� ���� ����
         k33_inData.p16_InputData(k33_i, k33_name, k33_kor, k33_eng, k33_mat); // Ŭ���� p16_InputData�� ������ �� ������
      }

      firstPrint(pageCnt); // ù��° ��������ǥ ����� ���� �Լ� ��ȯ
      
      for (int k33_i = 1; k33_i <= k33_iPerson; k33_i++) { // k33_iPerson ũ�⸸ŭ ����Ǵ� for��
         // ��ȣ, �̸�, ����, ����, ����, ����, ��� ������� ����Ѵ� 
         System.out.printf("%03d%8s%7d%7d%7d%7d%7d\n", k33_i, k33_inData.k33_nameArr[k33_i - 1],
               k33_inData.k33_korArr[k33_i - 1], k33_inData.k33_engArr[k33_i - 1],
               k33_inData.k33_matArr[k33_i - 1], k33_inData.k33_sumArr[k33_i - 1],
               (int) (k33_inData.k33_aveArr[k33_i - 1]));
         
         // ���� �������� �� ���� �հ踦 ���ϱ� ���ؼ� ���� ������ �����Ѵ� 
         k33_korSum += k33_inData.k33_korArr[k33_i - 1]; k33_engSum += k33_inData.k33_engArr[k33_i - 1];
         k33_matSum += k33_inData.k33_matArr[k33_i - 1]; k33_sumSum += k33_inData.k33_sumArr[k33_i - 1];
         k33_aveSum += k33_inData.k33_aveArr[k33_i - 1];
         
         // ���� �������� �� ���� ����� ���ϱ� ���ؼ� ���� �հ������� ������������ �л���(cnt)�� ������.
         k33_korAve = k33_korSum / cnt; k33_engAve = k33_engSum / cnt;
         k33_matAve = k33_matSum / cnt; k33_sumAve = k33_sumSum / cnt;
         k33_aveAve = k33_aveSum / cnt;

         // ���� �������� �� ���� �հ��� ���ϱ� ���ؼ� ���� ������ ó������ ������ �����Ѵ�
         k33_korTotalSum += k33_inData.k33_korArr[k33_i - 1]; k33_engTotalSum += k33_inData.k33_engArr[k33_i - 1];
         k33_matTotalSum += k33_inData.k33_matArr[k33_i - 1]; k33_sumTotalSum += k33_inData.k33_sumArr[k33_i - 1];
         k33_aveTotalSum += k33_inData.k33_aveArr[k33_i - 1];

         // ���� �������� �� ���� ����� ���ϱ� ���ؼ� ���� �հ踦 �л����� ������.
         k33_korTotalAve = k33_korTotalSum / k33_i; k33_engTotalAve = k33_engTotalSum / k33_i;
         k33_matTotalAve = k33_matTotalSum / k33_i; k33_sumTotalAve = k33_sumTotalSum / k33_i;
         k33_aveTotalAve = k33_aveTotalSum / k33_i;
         
         cnt++;   // ���� ������ ����� ���ϱ� ���ؼ� ������ ������ �Ѹ�� ��µɶ����� cnt�� �ϳ��� ����
         
         if ((k33_i % k33_pageAmount) == 0 && k33_i < k33_iPerson) {   // ��µ� ���� �������ѵ����� ���޵Ǹ� ������������ �Ѿ�� 
            sumPrint(k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum);   // ���� �������� �հ� ����Լ��� �̵�~!
            avePrint(k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);   // ���� �������� ��� ����Լ��� �̵�~!
            sumTotalPrint(k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum);   // ������������ �հ� ����Լ��� �̵�!
            aveTotalPrint(k33_korTotalAve, k33_engTotalAve, k33_matTotalAve, k33_sumTotalAve, k33_aveTotalAve);   // ������������ ��� ����Լ��� �̵�!
            pageCnt++;   // �������� �Ѿ�Ƿ� 1�� ���������ش�
            firstPrint(pageCnt);   // �������� ����� �Ϸ�Ǿ����Ƿ� ������������ ù �κ��� ������ش�
            // ���� �������� ���� �հ�� ���������� ī��Ʈ�� �ʱ�ȭ �����ش�.
            k33_korSum = 0; k33_engSum = 0; k33_matSum = 0; k33_sumSum = 0; k33_aveSum = 0;
            k33_korAve = 0; k33_engAve = 0; k33_matAve = 0; k33_sumAve = 0; k33_aveAve = 0;
            cnt = 1;
         }
         if (k33_i == k33_iPerson) {   // k33_i�� ������ �л����� ��� �ٸ  
            sumPrint(k33_korSum, k33_engSum, k33_matSum, k33_sumSum, k33_aveSum);   // ������������ �հ踦 ����ϰ�
            avePrint(k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);   // ����� ����ϰ�
            sumTotalPrint(k33_korTotalSum, k33_engTotalSum, k33_matTotalSum, k33_sumTotalSum, k33_aveTotalSum);   // ������������ �հ踦 ����ϰ�
            aveTotalPrint(k33_korTotalAve, k33_engTotalAve, k33_matTotalAve, k33_sumTotalAve, k33_aveTotalAve);   // ������������ ����� ����ϰ�
            System.out.println("\nEND....."); // ����ǥ�ø� ���ش�
         }
      }
   }

   public static void firstPrint(int pageCnt) {   // ��������ǥ���� ���м����� ������ִ� �޼��� ����
      Calendar k33_calt = Calendar.getInstance(); // Calendar Ŭ������ ���� �ð��� �����´�.
      SimpleDateFormat k33_sdtA = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); // ��¥ ������ k33_sdtA�� ���Ѵ�.
      System.out.printf("%25s\n\n", "��������ǥ");
      System.out.printf("%s%s%17s%s\n", "PAGE : ", pageCnt, "������� : ", k33_sdtA.format(k33_calt.getTime())); // �������� ������ڸ� ���
      System.out.println("==================================================");
      System.out.printf("%s%6s%6s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
      System.out.println("==================================================");
   }

   public static void sumPrint(int k33_korTotal, int k33_engTotal, int k33_matTotal, int k33_sumTotal, int k33_aveTotal) {
      // ���� �������� �� ���� �հ� ������ �޾Ƽ� ����Ѵ�.
      System.out.println("==================================================");
      System.out.printf("%s\n", "����������");
      System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "�հ�", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal, k33_aveTotal);
   }

   public static void avePrint(int k33_korAve, int k33_engAve, int k33_matAve, int k33_sumAve, int k33_aveAve) {
      // ���� �������� �� ���� ��� ������ �޾Ƽ� ����Ѵ�.
      System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "���", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
   }

   public static void sumTotalPrint(int k33_korTotal, int k33_engTotal, int k33_matTotal, int k33_sumTotal, int k33_aveTotal) {
      // ���� �������� ����ϱ� ���ؼ� �� ���� �� ���������� ����Ѵ�
      System.out.println("==================================================");
      System.out.printf("%s\n", "����������");
      System.out.printf("%s%9s%7d%7d%7d%7d%7d\n", "�հ�", " ", k33_korTotal, k33_engTotal, k33_matTotal, k33_sumTotal, k33_aveTotal);
   }

   public static void aveTotalPrint(int k33_korAve, int k33_engAve, int k33_matAve, int k33_sumAve, int k33_aveAve) {
      // ���������� �κ��� �� ���� ����� ����Ѵ�.
      System.out.printf("%s%9s%7d%7d%7d%7d%7d\n\n", "���", " ", k33_korAve, k33_engAve, k33_matAve, k33_sumAve, k33_aveAve);
   }
}