package ThisInJava;

public class ThisForVariable {
	int a;
	int b;
	
	void setData(int a,int b) {
		
		this.a=a;
		this.b=b;
		
	}
	
    void getData() {
    	this.setData(30, 50);
    	System.out.println("a="+a+" b="+b);
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisForVariable t= new ThisForVariable();
		t.getData();
		//t.getData();

	}

}
