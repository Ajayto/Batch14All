package abstractClass;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewUser u= new NewUser();

		NewUser u2= new NewUser();
		NewUser u4= new NewUser();
		
	}

}


abstract class  user{
	int a=20;
	user(int a){
		System.out.println("this is user class constructor");
	}
	abstract void addUser(String firstName,String lastName,int mobileNumber);
    void printData(){
    	System.out.println("a="+a);
    }
	
}
class NewUser extends user{
	NewUser(int a){
		super(a);
	}
	
	void addUser(String firstName,String lastName,int mobileNumber,String Address){
		
	}

	@Override
	void addUser(String firstName, String lastName, int mobileNumber) {
		// TODO Auto-generated method stub
		
	}
}
