package ThisInJava;

public class ThisForConstructor {
	
	ThisForConstructor(){
		this(10);
		System.out.println("this is 0 arg constructor");
		this.m();
	}
	
	ThisForConstructor(int a){
		System.out.println("this is 1 arg constructor");
		
	}
	
	ThisForConstructor(int a,int b){
		this(10,20,30);
		System.out.println("this is 2 arg constructor");
	}
	
	ThisForConstructor(int a,int b,int c){
		
		System.out.println("this is 3 arg constructor");
	}
	
	void m() {
		System.out.println("m");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisForConstructor t= new ThisForConstructor();
		System.out.println("main end");

	}

}
