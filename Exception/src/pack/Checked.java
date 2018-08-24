package pack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Checked {
	public void sample() throws IOException {
		// FileReader is a Resources (must be close after the program ends)
		// must be implement AutoCloseAble interface to use try-with-resource
		FileReader file = new FileReader("C:\\Users\\Ricko_DA508\\Desktop\\urls.txt");
        BufferedReader fileInput = new BufferedReader(file);
         
        for (int counter = 0; counter < 2; counter++) 
            System.out.println(fileInput.readLine());
        
        fileInput.close(); // use try with resources for implicitly using close function
        
        System.out.println("finish");
	}
}
