
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option=1;
		int a=20;
		int b=10;
		switch(option) {
		
		case 1:
			System.out.println("Add"+(a+b));
			break;
		case 2:
			System.out.println("sub"+(a-b));
			break;
			
		case 3:
			System.out.println("mult"+(a*b));
			break;	
		case 4:
			System.out.println("div"+(a/b));
			break;		
		default: System.out.println("Enter option from 1 to 4");	
		
		
		}

	}

}
