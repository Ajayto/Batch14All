package Inheritance;

public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objB=new B();  //child class  object 
		objB.printData(); //parent class method 
		objB.showData();  //child
		objB.printMsg(); //parent class 
		System.out.println("a="+objB.a+" b="+objB.b); //variable from parent and child 

	}

}

class A{
	int a=20;
	void printMsg() {
		System.out.println("this is parent class");
	}
	void printData() {
		System.out.println("parent class print method  a="+a);
	}
}

class B extends A{
	int b=30;
	void showData() {
		System.out.println("child class show method b="+b);
	}
	
}
