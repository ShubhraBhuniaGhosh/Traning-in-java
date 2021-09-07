import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DemoReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Anything stored in RAM or Primary Memory is temporary
		 * Java allows you to talk to underline file systems 
		 * To do  that java has given a lot of classes 
		 * these classes are available in java.io package
		 * 2 Operations : Read or Write
		 * For read operation we have to use InputStream (abstract class)
		 * For write operation we have to use OutputStream (abstract class)
		 */
		
		try {
			InputStream is  = new FileInputStream("C:\\Users\\tells\\eclipse-workspace\\FileIO\\src\\DemoReadFile.java");
			/* read() method
			 * The methods returns the next byte of data, or -1 if the end of the file is reached.
			 */
			int i = is.read();
			while(i!= -1){
				/*
				 * printing character on console
				 * reading the next character in the file
				 */
				System.out.print((char)i); 
				i = is.read();
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
