package entities;

import java.util.Date;

public class FuelStationOrder extends Orders {

	// connections
	private ProductInStation productInStation;

	// fields
	private boolean assessed;
	private boolean approved;
	private String reason;

	
	public FuelStationOrder(int orderID, Date orderTime, double amountBought, double finalPrice, String address,
			boolean supplied, Date timeSupplied, ProductInStation productInStation, boolean assessed, boolean approved,
			String reason) {
		super(orderID, orderTime, amountBought, finalPrice, address, supplied, timeSupplied);
		this.productInStation = productInStation;
		this.assessed = assessed;
		this.approved = approved;
		this.reason = reason;
	}

	public ProductInStation getProductInStation() {
		return productInStation;
	}

	public void setProductInStation(ProductInStation productInStation) {
		this.productInStation = productInStation;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

	@Override
	public String toString() {
		return "FuelStationOrder [productInStation=" + productInStation + ", assessed=" + assessed + ", approved="
				+ approved + ", reason=" + reason + "]";
	}

	

}
