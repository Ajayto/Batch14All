
public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,10,11,15,50};
		int maxNumber=a[0];
		for(int i=0;i<a.length;i++) {
			if(maxNumber<a[i]) {
				maxNumber=a[i];
			}
		}
		System.out.println(maxNumber);
		
		
		
//	for(int i=0;i<a.length;i++) {
//		System.out.println("value="+a[i]+" index="+i);
//	}	
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<=3;i++) {
//			if(a[i]==20) {
//			System.out.println("value is 20 "+a[i]);	
//			}
//		}
		

	}

}
