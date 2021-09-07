import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		/*
		 * multicatch feature in jdk 7
		 */
		try {
			performIOoperation();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	static void performIOoperation() throws IOException, SQLException {
		/*
		 * code within this method might throw IOException
		 * so calling this method is risky
		 * because this method is not handling the exception which is getting generated within this method 
		 * so it is duty of this method to update callers that calling this method is risky
		 */
		throw new IOException();
	}

}
