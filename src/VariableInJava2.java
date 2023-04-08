
public class VariableInJava2 {
	int b=15;  //instance variable 
	
	static int c=40;  //static variable

	public static void main(String[] args) {
		//className objName= new className();
		
		VariableInJava2 obj=new VariableInJava2();
	//	System.out.println(obj.b);
		//System.out.println(b);
		

	}
	
	
	public void display() {
	int a=30;	//local variable  // 4byte
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}

}
