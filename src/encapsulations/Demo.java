package encapsulations;

public class Demo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		a.setData(10, 20);
		a.getData();
	}

}

class A{
	
	private int a;
	private int b;
	
	void setData(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	void getData() {
	System.out.println("a="+a+"b="+b);	
	}
	
}

class B{
	void m() {
		System.out.println("this is to test git account");
	}
	
}
