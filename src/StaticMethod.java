
public class StaticMethod {
	
	int a=30;
	static int b=40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);
		StaticMethod sm= new StaticMethod();
		System.out.println(sm.a);
		sm.m();
		m1();
	
	}
	
	void m() {
		this.m1();
		System.out.println("this is m");
	}
	static void m1() {
		this.m();
		System.out.println("this is m1");
	}
}
