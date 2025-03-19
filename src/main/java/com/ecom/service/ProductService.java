package com.ecom.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ecom.exception.ProductException;
import com.ecom.model.Product;
import com.ecom.request.CreateProductRequest;

public interface ProductService {
	public Product createProduct(CreateProductRequest req);
	public String deleteProduct(Long productid) throws ProductException;
	public Product updateProduct(Long productid, Product req) throws ProductException;
	public Product findProductById(Long productid) throws ProductException;	
	public List<Product> findProductByCategory(String category) throws ProductException;
	public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice, Integer maxPrice
										, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) throws ProductException;





}
