
public class MethodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInJava mj= new MethodInJava();
		int result=mj.sum(30, 40)+100;
		System.out.println("Result="+result);
		
		
		//System.out.println(mj.sum(20, 30));
		//mj.sum(100, 200);
		//mj.sum(122, 132);
		

	}
	
	int sum(int a,int b) {
		int c=a+b;
		return c;	
	}

}
