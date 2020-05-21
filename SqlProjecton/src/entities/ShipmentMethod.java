package entities;

import enums.ShipmentType;

public class ShipmentMethod {

	private double shipmentPrice;
	private double shipmentMultiplier;
	private ShipmentType shipmentType;
	
	public ShipmentMethod(double shipmentPrice, double shipmentMultiplier, ShipmentType shipmentType) {
		super();
		this.shipmentPrice = shipmentPrice;
		this.shipmentMultiplier = shipmentMultiplier;
		this.shipmentType = shipmentType;
	}
	
	

}