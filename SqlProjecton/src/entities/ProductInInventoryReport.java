package entities;

public class ProductInInventoryReport {
	// create hash code and equals after have sale form eldad
	
	//connections
	private ProductInStation productInStation;
	private InventoryReport inventoryReport;
	
	//fields
	private double amountSold;

	public ProductInInventoryReport(ProductInStation productInStation, InventoryReport inventoryReport,
			double amountSold) {
		super();
		this.productInStation = productInStation;
		this.inventoryReport = inventoryReport;
		this.amountSold = amountSold;
	}

	public ProductInStation getProductInStation() {
		return productInStation;
	}

//	public void setProductInStation(ProductInStation productInStation) {
//		this.productInStation = productInStation;
//	}

	public InventoryReport getInventoryReport() {
		return inventoryReport;
	}

//	public void setInventoryReport(InventoryReport inventoryReport) {
//		this.inventoryReport = inventoryReport;
//	}

	public double getAmountSold() {
		return amountSold;
	}

	public void setAmountSold(double amountSold) {
		this.amountSold = amountSold;
	}
	
	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof ProductInInventoryReport))
			return false;
		ProductInInventoryReport report = (ProductInInventoryReport)obj;
		return this.productInStation.equals(report.getProductInStation()) && this.inventoryReport.equals(report.getInventoryReport());
	}

	@Override
	public String toString() {
		return "ProductInInventoryReport [productInStation=" + productInStation + ", inventoryReport=" + inventoryReport
				+ ", amountSold=" + amountSold + "]";
	}
	
	
	
	
	
}
