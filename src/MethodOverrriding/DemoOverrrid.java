package MethodOverrriding;

public class DemoOverrrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Login sbi= new Login();
//		sbi.loginForm();
		
		newLogin hdfc=new newLogin();
		hdfc.loginForm();
	}

}

class Login {
 void loginForm(){
		System.out.println(" user name");
		System.out.println("user password");
		System.out.println("sumitButton");
		
	}
}
class newLogin extends Login{
	public void loginForm() {
		System.out.println(" user name");
		System.out.println("user password");
		System.out.println("mobile number");
		System.out.println("sumitButton");
	}
}
