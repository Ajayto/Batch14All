package MethodOveloading;

public class OverlodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverlodingDemo obj= new OverlodingDemo();
		
		System.out.println(obj.add(30.2f, 40));

	}
	
		int add(int a,int b) {
		return a+b;
	}

	float add(float a,int b) {
		return a+b;
	}
	
public float add(int a,float b) {
		return a+b;
	}
	
private	double add(double a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}

}
