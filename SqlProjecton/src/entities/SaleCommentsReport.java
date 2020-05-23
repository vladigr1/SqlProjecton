package entities;

public class SaleCommentsReport {
	//connections
	private Sale sale;
	
	//fields
	private int numberOfCustomersBoughtInSale;
	private double sumOfPurchases;
	public SaleCommentsReport(Sale sale, int numberOfCustomersBoughtInSale, double sumOfPurchases) {
		super();
		this.sale = sale;
		this.numberOfCustomersBoughtInSale = numberOfCustomersBoughtInSale;
		this.sumOfPurchases = sumOfPurchases;
	}
	public Sale getSale() {
		return sale;
	}
//	public void setSale(Sale sale) {
//		this.sale = sale;
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
		if(!(obj instanceof SaleCommentsReport))
			return false;
		SaleCommentsReport saleComment = (SaleCommentsReport)obj;
		return this.sale==saleComment.getSale();
	}
	
	@Override
	public String toString() {
		return "SaleCommentsReport [sale=" + sale + ", numberOfCustomersBoughtInSale=" + numberOfCustomersBoughtInSale
				+ ", sumOfPurchases=" + sumOfPurchases + "]";
	}
	
	
	
	
	

}
