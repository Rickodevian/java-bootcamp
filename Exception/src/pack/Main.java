package pack;

import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checked c = new Checked(); //compile time
		
		try {
			c.sample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("move to unchecked exception");
		}
		
		Unchecked u = new Unchecked(); //runtime
		try {
			u.sample();
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("jajal");
		}
	}

}
