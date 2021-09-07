import com.hsbc.usermanagement.entity.Address;
import com.hsbc.usermanagement.entity.User;

public class DemoObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address("Bikaner", 123456);
		Address a2 = new Address("Bikaner", 123456);
		Address a3 = new Address("Bikaner", 123456);
		User u1 = new User(10, "shubhu", a1);
		User u2 = new User(11, "ishika", a2);
		User u3 = new User(12, "Aliza", a3);

		User[] users = new User[3];   
		// because there are just 3 references and default value of references is null
		System.out.println(users[0]); // -> null
		System.out.println(users);  // -> [Lcom.hsbc.usermanagement.entity.User;@5acf9800
		users[0] = u1;
		users[1] = u2;
		users[2] = u3;
		
		for(User user: users) {
			System.out.println(user);
		}
		
	}

}
