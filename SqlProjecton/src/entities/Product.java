package entities;

import java.util.ArrayList;
import java.util.List;

import enums.ProductName;

public class Product {
	// create hash code and equals after have sale form eldad

	// connections

	// fields
	private ProductName productName;
	private double maxPrice;
	private double currentPrice;

	public Product(ProductName productName, double maxPrice, double currentPrice) {
		super();
		this.productName = productName;
		this.maxPrice = maxPrice;
		this.currentPrice = currentPrice;
	}

	public ProductName getProductName() {
		return productName;
	}

//	public void setProductName(ProductName productName) {
//		this.productName = productName;
//	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", maxPrice=" + maxPrice + ", currentPrice=" + currentPrice
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return this.productName == other.getProductName();
	}

}
