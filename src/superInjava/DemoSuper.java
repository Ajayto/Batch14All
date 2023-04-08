package superInjava;

public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B(10,20);
	

	}

}

class A{  ///parent base and super class 
  
}
class B extends A{ // child derived subclass class 
  B(int a,int b){
	  super();
	  System.out.println("child class 2 arg constructor");
  } 

}
