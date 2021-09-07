import com.company.employeemanagement.entity.InvalidAgeException;
import com.company.employeemanagement.entity.WrongInputException;
import com.company.employeemanagement.entity.validate.AgeValidator;

public class LearnigModule {
	public String getLearningCode(String name, int age) throws WrongInputException{
		String ageCode = null;
		try {
			 ageCode = new AgeValidator().getAgeCode(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-	generated catch block
			e.printStackTrace();
			throw new WrongInputException();
		}
		return name+ageCode;
		
	}
}
