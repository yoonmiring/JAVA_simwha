package section7;

import java.util.ArrayList;

public class main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testMax = 1000000;
		ArrayList arr = new ArrayList();
		
		for(int i=0;i<testMax;i++) {
			arr.add((int)(Math.random()*1000000));
		}
		for(int i=0;i<arr.size();i++) {
			System.out.printf(" ArrayList %d = %d\n", i , arr.get(i));
		}
		System.out.println("******************************\n");
		arr.sort(null);
		
		for(int i=0;i <arr.size();i++) {
			System.out.printf(" ArrayList %d = %d\n",i,arr.get(i));
		}
	}

}
