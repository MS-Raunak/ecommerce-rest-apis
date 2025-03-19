package com.ecom.request;

import java.util.HashSet;
import java.util.Set;

import com.ecom.model.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateProductRequest {
	private String title;
	private String description;
	private Double price;
	private Double discountedPrice;
	private Double getDiscountPercent;
	private int quantity;
	private String brand;
	private String color;
	private Set<Size> sizes = new HashSet<>(); 
	private String imageUrl;

	
	/**
	 * Suppose a product Shirt
	 * Top catgory for Shirt => Men
	 * Second level category => clothing
	 * Third Level Category => Men's Shirt
	 */
	private String topLevelCategory;
	private String secLevelCategory;
	private String thirdLevelCategory;



}
