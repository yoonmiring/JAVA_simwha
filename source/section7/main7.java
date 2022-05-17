package section7;

public class main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] iArray= {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		
		for(int i=0;i<iArray.length;i++) {
			System.out.printf("iArray[%d] = %d\n" , i ,iArray[i]);
		}
		
		int iMin=iArray[0];
		int iMinPt=0;
		for (int i=0; i<iArray.length;i++) {
			if(iMin>iArray[i]) {
				iMin=iArray[i];
				iMinPt=i;
			}
		}
		System.out.printf("MIN : iArray[%d]=%d\n",iMinPt,iMin);
		
	}

}
