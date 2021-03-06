package com.capgemini.service;

import java.util.ArrayList;

public interface CartService {

	public Cart getAllCart();

	public ArrayList<Catalog> getDetails();

	public UseDetails getAllDetails();
	
	public ArrayList<ProductList> getAllProduct();
	
	public ArrayList<Order> getAllOrder();
	
	public ArrayList<ProductList> getAllAdminProduct();
	
	/*public Cart getAllProduct();
	
	public Cart getAllOrder();*/
}
