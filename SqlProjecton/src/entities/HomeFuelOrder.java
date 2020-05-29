package entities;

import java.util.Date;

import enums.ProductName;
import enums.ShipmentType;

public class HomeFuelOrder extends Orders{
	
	//connections
	private ShipmentType shipmentMethod;
	private ProductName productName;
	private String customerID;
	
	//fields
	private Date dueTime;

	public HomeFuelOrder(int orderID, Date orderTime, double amountBought, double finalPrice, String address,
			boolean supplied, Date timeSupplied, ShipmentType shipmentMethod, ProductName productName,
			String customerID, Date dueTime) {
		super(orderID, orderTime, amountBought, finalPrice, address, supplied, timeSupplied);
		this.shipmentMethod = shipmentMethod;
		this.productName = productName;
		this.customerID = customerID;
		this.dueTime = dueTime;
	}

	public ShipmentType getShipmentMethod() {
		return shipmentMethod;
	}

	public void setShipmentMethod(ShipmentType shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	public ProductName getProductName() {
		return productName;
	}

	public void setProductName(ProductName productName) {
		this.productName = productName;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public Date getDueTime() {
		return dueTime;
	}

	public void setDueTime(Date dueTime) {
		this.dueTime = dueTime;
	}

	@Override
	public String toString() {
		return "HomeFuelOrder [shipmentMethod=" + shipmentMethod + ", productName=" + productName + ", customerID="
				+ customerID + ", dueTime=" + dueTime + "]";
	}

	
	
	
	
}
