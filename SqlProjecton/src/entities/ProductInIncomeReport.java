package entities;

public class ProductInIncomeReport {
	// create hash code and equals after have sale form eldad
	
	//connections
	private ProductInStation productInStation;
	private IncomeReport incomeReport;
	
	//fields
	private double income;

	public ProductInIncomeReport(ProductInStation productInStation, IncomeReport incomeReport, double income) {
		super();
		this.productInStation = productInStation;
		this.incomeReport = incomeReport;
		this.income = income;
	}

	public ProductInStation getProductInStation() {
		return productInStation;
	}

//	public void setProductInStation(ProductInStation productInStation) {
//		this.productInStation = productInStation;
//	}

	public IncomeReport getIncomeReport() {
		return incomeReport;
	}

//	public void setIncomeReport(IncomeReport incomeReport) {
//		this.incomeReport = incomeReport;
//	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof ProductInIncomeReport))
			return false;
		ProductInIncomeReport report = (ProductInIncomeReport)obj;
		return this.productInStation.equals(report.getProductInStation()) && this.incomeReport.equals(report.getIncomeReport());
	}

	@Override
	public String toString() {
		return "ProductInIncomeReport [productInStation=" + productInStation + ", incomeReport=" + incomeReport
				+ ", income=" + income + "]";
	}
	
	
	
	
	
}
