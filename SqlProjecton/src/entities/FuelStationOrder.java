package entities;

import java.util.Date;

public class FuelStationOrder extends Order{
	
	//connections
	private ProductInStation productInStation;
	
	//fields
	private boolean assessed;
	private boolean approved;
	private boolean supplied;
	private Date timeSupplied;
	public FuelStationOrder(ProductInStation productInStation, boolean assessed, boolean approved, boolean supplied,
			Date timeSupplied) {
		super();
		this.productInStation = productInStation;
		this.assessed = assessed;
		this.approved = approved;
		this.supplied = supplied;
		this.timeSupplied = timeSupplied;
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
	
//	@Override
//    public boolean equals(Object obj) {
//		if(!(obj instanceof FuelStationOrder))
//			return false;
//		FuelStationOrder order = (FuelStationOrder)obj;
//		return super.orderID==order.getOrderID();
//	}

	
	
	
	@Override
	public String toString() {
		return "FuelStationOrder [productInStation=" + productInStation + ", assessed=" + assessed + ", approved="
				+ approved + ", supplied=" + supplied + ", timeSupplied=" + timeSupplied + "]";
	}
	
	
	
}
