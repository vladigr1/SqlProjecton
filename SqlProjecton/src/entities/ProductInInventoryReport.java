package entities;

public class ProductInInventoryReport {
	// create hash code and equals after have sale form eldad

	// connections
	private int productInStationID;
	private int repQuareter;
	private String year;

	// fields
	private double amountSold;
	private double amountBegin;
	private double amountEnd;

	public ProductInInventoryReport(int productInStationID, int repQuareter, String year, double amountSold,
			double amountBegin, double amountEnd) {
		super();
		this.productInStationID = productInStationID;
		this.repQuareter = repQuareter;
		this.year = year;
		this.amountSold = amountSold;
		this.amountBegin = amountBegin;
		this.amountEnd = amountEnd;
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

	public double getAmountSold() {
		return amountSold;
	}

	public void setAmountSold(double amountSold) {
		this.amountSold = amountSold;
	}

	public double getAmountBegin() {
		return amountBegin;
	}

	public void setAmountBegin(double amountBegin) {
		this.amountBegin = amountBegin;
	}

	public double getAmountEnd() {
		return amountEnd;
	}

	public void setAmountEnd(double amountEnd) {
		this.amountEnd = amountEnd;
	}

	@Override
	public String toString() {
		return "ProductInInventoryReport [productInStationID=" + productInStationID + ", repQuareter=" + repQuareter
				+ ", year=" + year + ", amountSold=" + amountSold + ", amountBegin=" + amountBegin + ", amountEnd="
				+ amountEnd + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInInventoryReport))
			return false;
		ProductInInventoryReport other = (ProductInInventoryReport) obj;
		return this.productInStationID == other.getProductInStationID() && this.repQuareter == other.getRepQuareter()
				&& this.year.equals(other.getYear());
	}

}
