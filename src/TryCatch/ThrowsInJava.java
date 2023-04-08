package TryCatch;

public class ThrowsInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThrowsInJava t= new ThrowsInJava();
		
		t.m();
		
		

	}
	
	void readData() throws InterruptedException {
		Thread.sleep(500);
	}
	
	void m() throws InterruptedException{
		readData();
	}

}
