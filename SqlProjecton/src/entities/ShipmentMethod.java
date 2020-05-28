
package entities;

import java.util.ArrayList;
import java.util.List;

import enums.ShipmentType;

public class ShipmentMethod {
	
	//connections
	private List<HomeFuelOrder> homeFuelOrderList = new ArrayList<>();
	
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
	
	public List<HomeFuelOrder> getHomeFuelOrderList() {
		return homeFuelOrderList;
	}
	public void setHomeFuelOrderList(List<HomeFuelOrder> homeFuelOrderList) {
		this.homeFuelOrderList = homeFuelOrderList;
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
		return "ShipmentMethod [homeFuelOrderList=" + homeFuelOrderList + ", shipmentType=" + shipmentType
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