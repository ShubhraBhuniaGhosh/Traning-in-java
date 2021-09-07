package com.productstore.productmanagement.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.productstore.employeemanagement.entity.Product;
import com.productstore.productmanagement.dao.ProductDao;
import com.productstore.productmanagement.exception.ProductAlreadyExistsException;
import com.productstore.productmanagement.exception.ProductsNotAddedException;


public class ProductDBDaoImpl implements ProductDao {

	@Override
	public void addProduct(Product p) throws ProductAlreadyExistsException {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("connection established");
			System.out.println("---------------------------------------------------------------------");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_product_management","root","root");
			stmt = con.prepareStatement("INSERT INTO tbl_product VALUES (?,?,?,?)");
			stmt.setInt(1, p.getProductId());
			stmt.setString(2,p.getProductName());
			stmt.setString(3, p.getDescription());
			stmt.setInt(4, p.getPrice());
			
			int recordUpdated;
			try {
				recordUpdated = stmt.executeUpdate();
			}catch (Exception e) {
				throw new ProductAlreadyExistsException();
			}
			System.out.println("---------------------------------------------------------------------");
			System.out.println("done");
			System.out.println("---------------------------------------------------------------------");
			if(recordUpdated == 0) {
				throw new ProductAlreadyExistsException();
			}
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			try {
				stmt.close();
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("connection established");
			System.out.println("---------------------------------------------------------------------");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_product_management","root","root");
			stmt = con.prepareStatement("UPDATE tbl_product SET product_name = ?, description = ?, price = ? WHERE product_id  = ?");
			
			stmt.setString(1, p.getProductName());
			stmt.setString(2,p.getDescription());
			stmt.setInt(3, p.getPrice());
			stmt.setInt(4, p.getProductId());
			
			int recordUpdated = stmt.executeUpdate();
			System.out.println("---------------------------------------------------------------------");
			System.out.println("done");
			System.out.println("---------------------------------------------------------------------");

			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			try {
				stmt.close();
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> list = new ArrayList<Product>();
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_product_management","root","root");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("connection established");
			System.out.println("---------------------------------------------------------------------");
			
			stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_product");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("done");
			System.out.println("---------------------------------------------------------------------");

			while(rs.next()) {
				Product p = new Product(rs.getInt(1), rs.getString(1), rs.getString(1), rs.getInt(1));
				list.add(p);
			}
			
			// step 7
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("There were some problems. Please try again!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			e.printStackTrace();
			try {
				stmt.close();
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return list;
	
		
	}

	@Override
	public List<Product> getProductsByPrice(int price) {
		List<Product> list = new ArrayList<Product>();
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_product_management","root","root");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("connection established");
			System.out.println("---------------------------------------------------------------------");

			
			stmt = con.prepareStatement("SELECT * FROM tbl_product where price = ?");
			stmt.setInt(1, price);

			ResultSet rs = stmt.executeQuery();
			System.out.println("---------------------------------------------------------------------");
			System.out.println("done");
			System.out.println("---------------------------------------------------------------------");

			while(rs.next()) {
				Product p = new Product(rs.getInt(1), rs.getString(1), rs.getString(1), rs.getInt(1));
				list.add(p);
			}
			
			// step 7
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("There were some problems. Please try again!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			e.printStackTrace();
			try {
				stmt.close();
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void addTwoProducts(Product p1, Product p2) throws ProductsNotAddedException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("connection established");
			System.out.println("---------------------------------------------------------------------");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_product_management","root","root");
			stmt = con.prepareStatement("INSERT INTO tbl_product VALUES (?,?,?,?)");
			stmt.setInt(1, p1.getProductId());
			stmt.setString(2,p1.getProductName());
			stmt.setString(3, p1.getDescription());
			stmt.setInt(4, p1.getPrice());
			int recordUpdated = 0;
			try {
			recordUpdated = stmt.executeUpdate();
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("---------------------------------------------------------------------");
			System.out.println("done");
			System.out.println("---------------------------------------------------------------------");
			if(recordUpdated<1) {
				throw new ProductsNotAddedException();
			}
			
			
			stmt = con.prepareStatement("INSERT INTO tbl_product VALUES (?,?,?,?)");
			stmt.setInt(1, p2.getProductId());
			stmt.setString(2,p2.getProductName());
			stmt.setString(3, p2.getDescription());
			stmt.setInt(4, p2.getPrice());
			
			recordUpdated = stmt.executeUpdate();
			System.out.println("---------------------------------------------------------------------");
			System.out.println("done");
			System.out.println("---------------------------------------------------------------------");
			if(recordUpdated<2) {
				throw new ProductsNotAddedException();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("There were some problems. Please try again!");
			try {
				stmt.close();
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}
	
}
