import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DemoWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Reader is an abstract super class for all Reader Class*/
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("C:\\Users\\tells\\eclipse-workspace\\FileCharacterStreem\\about.txt");
			pw.println("This is HSBC");
			pw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			pw.close();//This is must
		}
		

	}

}
