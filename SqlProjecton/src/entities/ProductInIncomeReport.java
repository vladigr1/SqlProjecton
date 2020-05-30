package entities;

public class ProductInIncomeReport {
	// create hash code and equals after have sale form eldad

	// connections
	private int productInStationID;
	private int repQuareter;
	private String year;

	// fields
	private double incomePerProduct;
	private double avgPrice;

	public ProductInIncomeReport(int productInStationID, int repQuareter, String year, double incomePerProduct,
			double avgPrice) {
		super();
		this.productInStationID = productInStationID;
		this.repQuareter = repQuareter;
		this.year = year;
		this.incomePerProduct = incomePerProduct;
		this.avgPrice = avgPrice;
	}

	public int getProductInStationID() {
		return productInStationID;
	}

//	public void setProductInStationID(int productInStationID) {
//		this.productInStationID = productInStationID;
//	}

	public int getRepQuareter() {
		return repQuareter;
	}

//	public void setRepQuareter(int repQuareter) {
//		this.repQuareter = repQuareter;
//	}

	public String getYear() {
		return year;
	}

//	public void setYear(String year) {
//		this.year = year;
//	}

	public double getIncomePerProduct() {
		return incomePerProduct;
	}

	public void setIncomePerProduct(double incomePerProduct) {
		this.incomePerProduct = incomePerProduct;
	}

	public double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}

	@Override
	public String toString() {
		return "ProductInIncomeReport [productInStationID=" + productInStationID + ", repQuareter=" + repQuareter
				+ ", year=" + year + ", incomePerProduct=" + incomePerProduct + ", avgPrice=" + avgPrice + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInIncomeReport))
			return false;
		ProductInIncomeReport other = (ProductInIncomeReport) obj;
		return this.productInStationID == other.getProductInStationID() && this.repQuareter == other.getRepQuareter()
				&& this.year.equals(other.getYear());
	}

}
