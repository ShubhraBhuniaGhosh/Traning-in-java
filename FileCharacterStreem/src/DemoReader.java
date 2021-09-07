import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class DemoReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\tells\\eclipse-workspace\\FileCharacterStreem\\about.txt"));
			System.out.println(reader.readLine());
			System.err.println("Hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (reader !=null) {
					reader.close();
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
