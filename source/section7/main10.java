package section7;

import java.util.ArrayList;

public class main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		
		arr.add("abc");
		arr.add("abcd");
		arr.add("efgh");
		arr.add("������0");
		arr.add("1234");
		arr.add("12k34");
		
		System.out.printf("*************************\n");
		System.out.printf(" ���� ArraySize %d \n",arr.size());
		for(int i=0;i<arr.size();i++) {
			System.out.printf(" ArrayList %d =%s\n",i,arr.get(i));	
		}
		arr.set(3, "������");
		System.out.printf("*************************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n",arr.size());
		for(int i=0;i<arr.size();i++) {
			System.out.printf(" ArrayList %d =%s\n",i,arr.get(i));	
		}
		arr.remove(4);
		System.out.printf("*************************\n");
		System.out.printf(" ���뺯�� ArraySize %d \n",arr.size());
		for(int i=0;i<arr.size();i++) {
			System.out.printf(" ArrayList %d =%s\n",i,arr.get(i));	
		}
		arr.sort(null);
		System.out.printf("*************************\n");
		System.out.printf(" ����Ʈsort ArraySize %d \n",arr.size());
		for(int i=0;i<arr.size();i++) {
			System.out.printf(" ArrayList %d =%s\n",i,arr.get(i));	
		}
		arr.clear();
		System.out.printf("*************************\n");
		System.out.printf(" ���� ���� ArraySize %d \n",arr.size());
		for(int i=0;i<arr.size();i++) {
			System.out.printf(" ArrayList %d =%s\n",i,arr.get(i));	
		}
	
	}

}
