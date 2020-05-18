package entities;

public class ProductInSalePattern {
	// create hash code and equals after have sale form eldad
	
	//connections
	private SalesPattern salesPattern;
	private Product product;
	
	//fields
	private double saleDiscount;

	public ProductInSalePattern(SalesPattern salesPattern, Product product, double saleDiscount) {
		super();
		this.salesPattern = salesPattern;
		this.product = product;
		this.saleDiscount = saleDiscount;
	}

	public SalesPattern getSalesPattern() {
		return salesPattern;
	}

//	public void setSalesPattern(SalesPattern salesPattern) {
//		this.salesPattern = salesPattern;
//	}

	public Product getProduct() {
		return product;
	}

//	public void setProduct(Product product) {
//		this.product = product;
//	}

	public double getSaleDiscount() {
		return saleDiscount;
	}

	public void setSaleDiscount(double saleDiscount) {
		this.saleDiscount = saleDiscount;
	}
	
	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof ProductInSalePattern))
			return false;
		ProductInSalePattern pInSalePat = (ProductInSalePattern)obj;
		return (this.product.equals(pInSalePat.getProduct()) && this.salesPattern.equals(pInSalePat.getSalesPattern()));
	}
	

	@Override
	public String toString() {
		return "ProductInSalePattern [salesPattern=" + salesPattern + ", product=" + product + ", saleDiscount="
				+ saleDiscount + "]";
	}
	
	

}
