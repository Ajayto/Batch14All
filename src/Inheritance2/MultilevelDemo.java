package Inheritance2;

public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C objC = new C();
		objC.printData();
		objC.showData();
		objC.displayData();
		System.out.println("a="+objC.a+" b="+objC.b+" c="+objC.c);
		

	}

}

class A{
	int a=10;
	void printData() {
		System.out.println("a="+a);
	}
}

class B extends A{
	int b=20;
	void showData() {
		System.out.println("b="+b);
	}
}

class C extends B{
	int c=30;
	void displayData() {
		System.out.println("c="+c);
	}
}

class D extends A {
	
}

class E extends D{
	
}
