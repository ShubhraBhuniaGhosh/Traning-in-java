import com.company.employeemanagement.entity.Employee;
import com.company.employeemanagement.factory.EmployeeDaoFactory;
import com.company.employeemanagement.storage.Storage;
import com.company.employeemanagement.storage.StorageFactory;
import com.hsbc.employeepayroll.exception.EmployeeAlreadyExistsException;
import com.hsbc.employeepayroll.exception.InvalidStorageTypeException;
import com.productstore.employeemanagement.dao.EmployeeDao;

public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao= EmployeeDaoFactory.getEmployeeDao();
		try {
			Storage storage = StorageFactory.getStorage(1);
			Employee e1 = new Employee(1,"a", "a", "a", 100);
			dao.addEmployee(e1, storage);
			Employee e2 = new Employee(1,"b", "b", "b", 100);
			dao.addEmployee(e2, storage);
			Employee e3 = new Employee(1,"c", "c", "c", 100);
			dao.addEmployee(e3, storage);
			Employee e4 = new Employee(1,"d", "d", "d", 100);
			dao.addEmployee(e4, storage);
			Employee e5 = new Employee(1,"e", "e", "e", 100);
			dao.addEmployee(e5, storage);
			Employee e6 = new Employee(1,"f", "f", "f", 100);
			dao.addEmployee(e6, storage);
			Employee e7 = new Employee(1,"g", "g", "g", 100);
			dao.addEmployee(e7, storage);
			Employee e8 = new Employee(1,"h", "h", "h", 100);
			dao.addEmployee(e8, storage);
			Employee e9 = new Employee(1,"i", "i", "i", 100);
			dao.addEmployee(e9, storage);
			Employee e10 = new Employee(1,"j", "j", "j", 100);
			dao.addEmployee(e10, storage);
			Employee e11= new Employee(1,"k", "k", "k", 100);
			dao.addEmployee(e11, storage);
		} catch (InvalidStorageTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (EmployeeAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("The employee already exists!");
		} 
		
		

	}
}
