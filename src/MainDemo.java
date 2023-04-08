
public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerClass.innerClass obj=new outerClass.innerClass();
		obj.display();
		

	}

}

 class outerClass{
 static class innerClass{
	  void display() {
		 System.out.println("inner class display method");
	 }
		
	}
}
