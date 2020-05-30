package entities;

public class ProductInOutcomeReport {
	// create hash code and equals after have sale form eldad

	// connections
	private int productInStationID;
	private int repQuareter;
	private String year;

	// fields
	private double amountBoughtFromSupplier;

	public ProductInOutcomeReport(int productInStationID, int repQuareter, String year,
			double amountBoughtFromSupplier) {
		super();
		this.productInStationID = productInStationID;
		this.repQuareter = repQuareter;
		this.year = year;
		this.amountBoughtFromSupplier = amountBoughtFromSupplier;
	}

	public int getProductInStationID() {
		return productInStationID;
	}
//
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

	public double getAmountBoughtFromSupplier() {
		return amountBoughtFromSupplier;
	}

	public void setAmountBoughtFromSupplier(double amountBoughtFromSupplier) {
		this.amountBoughtFromSupplier = amountBoughtFromSupplier;
	}
	
	

	@Override
	public String toString() {
		return "ProductInOutcomeReport [productInStationID=" + productInStationID + ", repQuareter=" + repQuareter
				+ ", year=" + year + ", amountBoughtFromSupplier=" + amountBoughtFromSupplier + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInOutcomeReport))
			return false;
		ProductInOutcomeReport other = (ProductInOutcomeReport) obj;
		return this.productInStationID==other.getProductInStationID() && this.repQuareter==other.getRepQuareter() && this.year.equals(other.getYear()); 
	}

}
