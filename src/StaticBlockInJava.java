
public class StaticBlockInJava {
	
	{
	System.out.println("this is instance block");		
	}
	
	
	static {
		System.out.println("this is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		StaticBlockInJava obj1= new StaticBlockInJava();
		System.out.println("main end");

	}

}
