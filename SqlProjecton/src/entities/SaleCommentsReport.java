package entities;

public class SaleCommentsReport {
	// connections
	private Sale sale;

	// fields
	private int saleCommentReportID;
	private int numberOfCustomersBoughtInSale;
	private double sumOfPurchases;

	public SaleCommentsReport(Sale sale, int saleCommentReportID, int numberOfCustomersBoughtInSale,
			double sumOfPurchases) {
		super();
		this.sale = sale;
		this.saleCommentReportID = saleCommentReportID;
		this.numberOfCustomersBoughtInSale = numberOfCustomersBoughtInSale;
		this.sumOfPurchases = sumOfPurchases;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public int getSaleCommentReportID() {
		return saleCommentReportID;
	}
//
//	public void setSaleCommentReportID(int saleCommentReportID) {
//		this.saleCommentReportID = saleCommentReportID;
//	}

	public int getNumberOfCustomersBoughtInSale() {
		return numberOfCustomersBoughtInSale;
	}

	public void setNumberOfCustomersBoughtInSale(int numberOfCustomersBoughtInSale) {
		this.numberOfCustomersBoughtInSale = numberOfCustomersBoughtInSale;
	}

	public double getSumOfPurchases() {
		return sumOfPurchases;
	}

	public void setSumOfPurchases(double sumOfPurchases) {
		this.sumOfPurchases = sumOfPurchases;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SaleCommentsReport))
			return false;
		SaleCommentsReport saleComment = (SaleCommentsReport) obj;
		return this.saleCommentReportID == saleComment.getSaleCommentReportID();
	}

	
	@Override
	public String toString() {
		return "SaleCommentsReport [sale=" + sale + ", saleCommentReportID=" + saleCommentReportID
				+ ", numberOfCustomersBoughtInSale=" + numberOfCustomersBoughtInSale + ", sumOfPurchases="
				+ sumOfPurchases + "]";
	}	

}
