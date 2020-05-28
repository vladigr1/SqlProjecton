package entities;

import java.util.Date;

public class SaleCommentsReport {
	// connections
	private Sale sale;

	// fields
	private int numberOfCustomersBoughtInSale;
	private double sumOfPurchases;
	private Date dateCreated;

	public SaleCommentsReport(Sale sale, int numberOfCustomersBoughtInSale,
			double sumOfPurchases,Date dateCreated) {
		super();
		this.sale = sale;
		this.numberOfCustomersBoughtInSale = numberOfCustomersBoughtInSale;
		this.sumOfPurchases = sumOfPurchases;
		this.dateCreated= dateCreated;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
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
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SaleCommentsReport))
			return false;
		SaleCommentsReport saleComment = (SaleCommentsReport) obj;
		return this.sale.equals(saleComment.getSale());
	}

	
	@Override
	public String toString() {
		return "SaleCommentsReport [sale=" + sale + ", saleCommentReportID=" 
				+ ", numberOfCustomersBoughtInSale=" + numberOfCustomersBoughtInSale + ", sumOfPurchases="
				+ sumOfPurchases +"dateCreated= "+dateCreated+"]";
	}

		

}
