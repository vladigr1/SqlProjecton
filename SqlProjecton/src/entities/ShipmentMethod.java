
package entities;

import java.util.ArrayList;
import java.util.List;

import enums.ShipmentType;

public class ShipmentMethod {

	// connections

	// fields
	private ShipmentType shipmentType;
	private double shipmentPrice;
	private double shipmentMultiplier;
	private String deliveryTime;

	public ShipmentMethod(ShipmentType shipmentType, double shipmentPrice, double shipmentMultiplier,
			String deliveryTime) {
		super();
		this.shipmentType = shipmentType;
		this.shipmentPrice = shipmentPrice;
		this.shipmentMultiplier = shipmentMultiplier;
		this.deliveryTime = deliveryTime;
	}

	public ShipmentType getShipmentType() {
		return shipmentType;
	}

//	public void setShipmentType(ShipmentType shipmentType) {
//		this.shipmentType = shipmentType;
//	}

	public double getShipmentPrice() {
		return shipmentPrice;
	}

	public void setShipmentPrice(double shipmentPrice) {
		this.shipmentPrice = shipmentPrice;
	}

	public double getShipmentMultiplier() {
		return shipmentMultiplier;
	}

	public void setShipmentMultiplier(double shipmentMultiplier) {
		this.shipmentMultiplier = shipmentMultiplier;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	@Override
	public String toString() {
		return "ShipmentMethod [shipmentType=" + shipmentType + ", shipmentPrice=" + shipmentPrice
				+ ", shipmentMultiplier=" + shipmentMultiplier + ", deliveryTime=" + deliveryTime + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ShipmentMethod))
			return false;
		ShipmentMethod other = (ShipmentMethod) obj;
		return this.shipmentType.equals(other.getShipmentType());
	}

}