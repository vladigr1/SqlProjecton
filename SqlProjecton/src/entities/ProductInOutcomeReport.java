package entities;

public class ProductInOutcomeReport {
	// create hash code and equals after have sale form eldad

	// connections
	private ProductInStation productInStation;
	private OutcomeReport outComeReport;

	// fields
	private double outcome;

	public ProductInOutcomeReport(ProductInStation productInStation, OutcomeReport outComeReport, double outcome) {
		super();
		this.productInStation = productInStation;
		this.outComeReport = outComeReport;
		this.outcome = outcome;
	}

	public ProductInStation getProductInStation() {
		return productInStation;
	}

//		public void setProductInStation(ProductInStation productInStation) {
//			this.productInStation = productInStation;
//		}

	public OutcomeReport getOutComeReport() {
		return outComeReport;
	}

//		public void setOutComeReport(OutcomeReport outComeReport) {
//			this.outComeReport = outComeReport;
//		}

	public double getOutcome() {
		return outcome;
	}

	public void setOutcome(double outcome) {
		this.outcome = outcome;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInOutcomeReport))
			return false;
		ProductInOutcomeReport report = (ProductInOutcomeReport) obj;
		return this.productInStation.equals(report.getProductInStation())
				&& this.outComeReport.equals(report.getOutComeReport());
	}

	@Override
	public String toString() {
		return "ProductInOutcomeReport [productInStation=" + productInStation + ", outComeReport=" + outComeReport
				+ ", outcome=" + outcome + "]";
	}

}
