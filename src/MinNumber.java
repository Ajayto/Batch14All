
public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,8,20,30,40,22,5};
		
		int minNumber=a[0];
		for(int i=0;i<a.length;i++) {
			if(minNumber>a[i]) {
				minNumber=a[i];
			}
		}
		
		System.out.println(minNumber);
		

	}

}
