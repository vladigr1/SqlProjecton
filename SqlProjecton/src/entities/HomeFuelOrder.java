package entities;

import java.util.Date;

public class HomeFuelOrder extends Orders{
	
	//connections
	private ShipmentMethod shipmentMethod;
	private Product product;
	private Customer customerID;
	
	//fields
	private Date dueTime;

	public HomeFuelOrder(int orderID, Date orderTime, double amountBought, double finalPrice, String address,
			boolean supplied, Date timeSupplied, ShipmentMethod shipmentMethod, Product product, Customer customerID,
			Date dueTime) {
		super(orderID, orderTime, amountBought, finalPrice, address, supplied, timeSupplied);
		this.shipmentMethod = shipmentMethod;
		this.product = product;
		this.customerID = customerID;
		this.dueTime = dueTime;
	}

	public ShipmentMethod getShipmentMethod() {
		return shipmentMethod;
	}

	public void setShipmentMethod(ShipmentMethod shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Customer customerID) {
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
		return "HomeFuelOrder [shipmentMethod=" + shipmentMethod + ", product=" + product + ", customerID=" + customerID
				+ ", dueTime=" + dueTime + "]";
	}
	
	
	
}
