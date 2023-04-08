package InterFace;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewUser u = new NewUser();
		u.addUser().deleteUser();
		u.deleteUser();
		u.editUser();

	}

}

interface user{
    int a=10;
    NewUser addUser()
	void deleteUser();
	void editUser();
}

class NewUser implements user{

	@Override
	public NewUser addUser() {
	   System.out.println("this is add user method ");
	   return this;
		
	}

	@Override
	public void deleteUser() {
		System.out.println("this is delete user method ");
		
	}

	@Override
	public void editUser() {
		System.out.println("this is edit user method ");
		
	}
	
}
