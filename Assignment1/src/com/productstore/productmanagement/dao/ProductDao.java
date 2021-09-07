package com.productstore.productmanagement.dao;

import java.util.List;

import com.productstore.employeemanagement.entity.Product;
import com.productstore.productmanagement.exception.ProductAlreadyExistsException;
import com.productstore.productmanagement.exception.ProductsNotAddedException;

public interface ProductDao {
	public void addProduct(Product p) throws ProductAlreadyExistsException;
	public void updateProduct( Product p);
	public List<Product> getAllProducts();
	public List<Product> getProductsByPrice(int price);
	public void addTwoProducts (Product p1, Product p2) throws ProductsNotAddedException;
}
