
public class FinalInJava {
	
	static final int a; // blank final variable 
	
	static {
		a=30;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalInJava f= new FinalInJava();
		f.a=50;
		
		System.out.println(f.a);
	}

}

 class Login{
final void display() {
		System.out.println("login class display method");
	}
	
}

class NewLogin extends Login{
	void show() {
		display();
	}
}

