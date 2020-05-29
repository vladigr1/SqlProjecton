package entities;

public class CustomerBoughtInSale {

	// connections
	private int saleID;
	private String customerID;

	// fields
	private double amountPaid;

	public CustomerBoughtInSale(int saleID, String customerID, double amountPaid) {
		super();
		this.saleID = saleID;
		this.customerID = customerID;
		this.amountPaid = amountPaid;
	}

	public int getSaleID() {
		return saleID;
	}

//	public void setSaleID(int saleID) {
//		this.saleID = saleID;
//	}

	public String getCustomerID() {
		return customerID;
	}

//	public void setCustomerID(String customerID) {
//		this.customerID = customerID;
//	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	@Override
	public String toString() {
		return "CustomerBoughtInSale [saleID=" + saleID + ", customerID=" + customerID + ", amountPaid=" + amountPaid
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CustomerBoughtInSale))
			return false;
		CustomerBoughtInSale other = (CustomerBoughtInSale) obj;
		return this.customerID.equals(other.getCustomerID()) && this.saleID == other.getSaleID();
	}

}
