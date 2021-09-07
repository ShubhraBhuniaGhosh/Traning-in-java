import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DemoWriteFile {

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
			/*File which we are trying to write to right must be in existing otherwise FileNotFoundException to be thrown
			 * File which you 
			 */
			InputStream is  = new FileInputStream("C:\\Users\\tells\\eclipse-workspace\\FileIO\\src\\DemoReadFile.java");
			OutputStream os = new FileOutputStream("C:\\Users\\tells\\eclipse-workspace\\FileIO\\src\\CopyDemoReadFile.java");
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
				/*
				 * Write character in file associated with os reference
				 * reading the next character in the file
				 * 
				 * write() read() can throw IOException
				 */
				os.write(i);
				i = is.read();
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found sorry give right file name");
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
