package entities;

import enums.PricingModelName;

public class PricingModel {
	// connections
	private PricingModelName pricingModelName;
	private String customerID;

	// fields
	private double currentDiscount;

	public PricingModel(PricingModelName pricingModelName, String customerID, double currentDiscount) {
		super();
		this.pricingModelName = pricingModelName;
		this.customerID = customerID;
		this.currentDiscount = currentDiscount;
	}

	public PricingModelName getPricingModelName() {
		return pricingModelName;
	}

	public void setPricingModelName(PricingModelName pricingModelName) {
		this.pricingModelName = pricingModelName;
	}

	public String getCustomerID() {
		return customerID;
	}

//	public void setCustomerID(String customerID) {
//		this.customerID = customerID;
//	}

	public double getCurrentDiscount() {
		return currentDiscount;
	}

	public void setCurrentDiscount(double currentDiscount) {
		this.currentDiscount = currentDiscount;
	}
	
	

	@Override
	public String toString() {
		return "PricingModel [pricingModelName=" + pricingModelName + ", customerID=" + customerID
				+ ", currentDiscount=" + currentDiscount + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PricingModel))
			return false;
		PricingModel other = (PricingModel) obj;
		return this.customerID.equals(other.getCustomerID());
	}

}
