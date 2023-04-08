
public class StaticVariable {
	int a=10;   //instance variable
	static int b=10; // static variable
	
	
	void increment() {
		a=a+1;
		b=b+1;
		System.out.println("a="+a+" b="+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s= new StaticVariable();
		s.increment(); //a=11 b=11
		StaticVariable s1= new StaticVariable();
		s1.increment();//a=11 b=12
		StaticVariable s2= new StaticVariable();
		s2.increment();//a=11 b=13
		s.increment();//a=11 b=14
	

	}

}
