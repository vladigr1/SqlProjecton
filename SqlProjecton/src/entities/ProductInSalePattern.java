package entities;

import enums.ProductName;

public class ProductInSalePattern {
	// create hash code and equals after have sale form eldad

	// connections
	private int salesPatternID;
	private ProductName productName;

	// fields
	private double saleDiscount;

	public ProductInSalePattern(int salesPatternID, ProductName productName, double saleDiscount) {
		super();
		this.salesPatternID = salesPatternID;
		this.productName = productName;
		this.saleDiscount = saleDiscount;
	}

	public int getSalesPatternID() {
		return salesPatternID;
	}

//	public void setSalesPatternID(int salesPatternID) {
//		this.salesPatternID = salesPatternID;
//	}

	public ProductName getProductName() {
		return productName;
	}

//	public void setProductName(ProductName productName) {
//		this.productName = productName;
//	}

	public double getSaleDiscount() {
		return saleDiscount;
	}

	public void setSaleDiscount(double saleDiscount) {
		this.saleDiscount = saleDiscount;
	}

	@Override
	public String toString() {
		return "ProductInSalePattern [salesPatternID=" + salesPatternID + ", productName=" + productName
				+ ", saleDiscount=" + saleDiscount + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInSalePattern))
			return false;
		ProductInSalePattern other = (ProductInSalePattern) obj;
		return this.productName.equals(other.getProductName()) && this.salesPatternID==other.getSalesPatternID();
	}

}
