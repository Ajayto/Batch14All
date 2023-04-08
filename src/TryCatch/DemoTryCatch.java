package TryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start program");
		int a=10;
		System.out.println("befor exception");
		try {
		int b=a/0;
		}
		catch(Exception e) {
			System.out.println("got exception");
			//e.printStackTrace();
			
			System.out.println(e.getMessage());	
		}
		finally {
			System.out.println("this is finally block");
		}
		
		System.out.println("after exception");
		System.out.println("end program");
	}

}
