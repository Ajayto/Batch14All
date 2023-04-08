package Exception;

import java.io.File;
import java.io.FileInputStream;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		File f=new File("D:\\test\\testFile.txt");
//		FileInputStream fs= new FileInputStream(f);
		
		int a=20;
		int c=a/0;
		System.out.println(c);

	}

}
