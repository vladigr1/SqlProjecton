
package entities;

import java.util.ArrayList;
import java.util.List;

import enums.ShipmentType;

public class ShipmentMethod {
	
	//connections
	
	//fields
	private ShipmentType shipmentType;
	private double shipmentPrice;
	private double shipmentMultiplier;
	
	public ShipmentMethod(ShipmentType shipmentType, double shipmentPrice, double shipmentMultiplier) {
		super();
		this.shipmentType = shipmentType;
		this.shipmentPrice = shipmentPrice;
		this.shipmentMultiplier = shipmentMultiplier;
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
	@Override
	public String toString() {
		return "ShipmentMethod [homeFuelOrderList=" + ", shipmentType=" + shipmentType
				+ ", shipmentPrice=" + shipmentPrice + ", shipmentMultiplier=" + shipmentMultiplier + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ShipmentMethod))
			return false;
		ShipmentMethod other = (ShipmentMethod) obj;
		return this.shipmentType.equals(other.getShipmentType());
	}
	
	
	
	
	


}