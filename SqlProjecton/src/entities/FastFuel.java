package entities;

import java.util.Date;

public class FastFuel {

	// connections
	private int productInStaionID;
	private String customerID;
	// fields
	private int fastFuelID;
	private Date fastFuelTime;
	private double amountBought;
	private double finalPrice;

	public FastFuel(int productInStaionID, String customerID, int fastFuelID, Date fastFuelTime, double amountBought,
			double finalPrice) {
		super();
		this.productInStaionID = productInStaionID;
		this.customerID = customerID;
		this.fastFuelID = fastFuelID;
		this.fastFuelTime = fastFuelTime;
		this.amountBought = amountBought;
		this.finalPrice = finalPrice;
	}

	public int getProductInStaionID() {
		return productInStaionID;
	}

	public void setProductInStaionID(int productInStaionID) {
		this.productInStaionID = productInStaionID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getFastFuelID() {
		return fastFuelID;
	}

//	public void setFastFuelID(int fastFuelID) {
//		this.fastFuelID = fastFuelID;
//	}

	public Date getFastFuelTime() {
		return fastFuelTime;
	}

	public void setFastFuelTime(Date fastFuelTime) {
		this.fastFuelTime = fastFuelTime;
	}

	public double getAmountBought() {
		return amountBought;
	}

	public void setAmountBought(double amountBought) {
		this.amountBought = amountBought;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	
	@Override
	public String toString() {
		return "FastFuel [productInStaionID=" + productInStaionID + ", customerID=" + customerID + ", fastFuelID="
				+ fastFuelID + ", fastFuelTime=" + fastFuelTime + ", amountBought=" + amountBought + ", finalPrice="
				+ finalPrice + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FastFuel))
			return false;
		FastFuel fuel = (FastFuel) obj;
		return this.fastFuelID == fuel.getFastFuelID();
	}

}
