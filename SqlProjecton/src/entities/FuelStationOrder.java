package entities;

import java.util.Date;

public class FuelStationOrder extends Orders {

	// connections
	private int productInStaionID;

	// fields
	private boolean assessed;
	private boolean approved;
	private String reasonDismissal;
	private boolean supplied;
	private Date timeSupplied;
	
	public FuelStationOrder(int orderID, Date orderTime, double amountBought, double finalPrice, String address,
			int productInStaionID, boolean assessed, boolean approved, String reasonDismissal) {
		super(orderID, orderTime, amountBought, finalPrice, address);
		this.productInStaionID = productInStaionID;
		this.assessed = assessed;
		this.approved = approved;
		this.reasonDismissal = reasonDismissal;
		this.supplied = false;
	}
	public int getProductInStaionID() {
		return productInStaionID;
	}
	public void setProductInStaionID(int productInStaionID) {
		this.productInStaionID = productInStaionID;
	}
	public boolean isAssessed() {
		return assessed;
	}
	public void setAssessed(boolean assessed) {
		this.assessed = assessed;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public String getReasonDismissal() {
		return reasonDismissal;
	}
	public void setReasonDismissal(String reasonDismissal) {
		this.reasonDismissal = reasonDismissal;
	}
	public boolean isSupplied() {
		return supplied;
	}
	public void setSupplied(boolean supplied) {
		this.supplied = supplied;
	}
	public Date getTimeSupplied() {
		return timeSupplied;
	}
	public void setTimeSupplied(Date timeSupplied) {
		this.timeSupplied = timeSupplied;
	}
	@Override
	public String toString() {
		return "FuelStationOrder [productInStaionID=" + productInStaionID + ", assessed=" + assessed + ", approved="
				+ approved + ", reasonDismissal=" + reasonDismissal + ", supplied=" + supplied + ", timeSupplied="
				+ timeSupplied + "]";
	}

	
	

}
