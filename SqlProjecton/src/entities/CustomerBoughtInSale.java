package entities;

public class CustomerBoughtInSale {
	
	//connections
	private Sale sale;
	private Customer customer;
	
	//fields
	private double amountPaid;

	public CustomerBoughtInSale(Sale sale, Customer customer, double amountPaid) {
		this.sale = sale;
		this.customer = customer;
		this.amountPaid = amountPaid;
	}

	public Sale getSale() {
		return sale;
	}

//	public void setSale(Sale sale) {
//		this.sale = sale;
//	}

	public Customer getCustomer() {
		return customer;
	}

//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof CustomerBoughtInSale))
			return false;
		CustomerBoughtInSale customerBought = (CustomerBoughtInSale)obj;
		return this.sale==customerBought.getSale() && this.customer==customerBought.getCustomer();
	}
	
	

	@Override
	public String toString() {
		return "CustomerBoughtInSale [sale=" + sale + ", customer=" + customer + ", amountPaid=" + amountPaid + "]";
	}
	
	
	
	
	

}
