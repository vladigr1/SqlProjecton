package entities;

import java.util.Date;

public abstract class Orders {

	private int orderID;
	private Date orderTime;
	private double amountBought;
	private double finalPrice;
	private String address;

	public Orders(int orderID, Date orderTime, double amountBought, double finalPrice, String address) {
		super();
		this.orderID = orderID;
		this.orderTime = orderTime;
		this.amountBought = amountBought;
		this.finalPrice = finalPrice;
		this.address = address;
	}

	public int getOrderID() {
		return orderID;
	}

//	public void setOrderID(int orderID) {
//		this.orderID = orderID;
//	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Orders [orderID=" + orderID + ", orderTime=" + orderTime + ", amountBought=" + amountBought
				+ ", finalPrice=" + finalPrice + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Orders))
			return false;
		Orders other = (Orders) obj;
		return this.orderID == other.getOrderID();
	}

}