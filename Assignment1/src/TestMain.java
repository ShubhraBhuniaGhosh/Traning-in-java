import java.util.List;

import com.productstore.employeemanagement.entity.Product;
import com.productstore.productmanagement.dao.impl.ProductDBDaoImpl;
import com.productstore.productmanagement.exception.ProductAlreadyExistsException;
import com.productstore.productmanagement.exception.ProductsNotAddedException;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDBDaoImpl dao = new ProductDBDaoImpl();
		Product p1 = new Product(11, "pen", "pen", 10);
		Product p2 = new Product(12, "book", "book", 10);
		Product p3 = new Product(13, "copy", "copy", 10);
		
		try {
			dao.addProduct(p1);
		} catch (ProductAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("Product Already Exists");
			e.printStackTrace();
		}
		try {
			dao.addTwoProducts(p2, p3);
		} catch (ProductsNotAddedException e) {
			// TODO Auto-generated catch block
			System.out.println("Products Not Added. Please try again!");
			e.printStackTrace();
		}
		try {
			dao.addProduct(p1);
		} catch (ProductAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("Product Already Exists");
			e.printStackTrace();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("completed");
		List<Product> list = dao.getAllProducts();
		System.out.println(list);

	}


}
