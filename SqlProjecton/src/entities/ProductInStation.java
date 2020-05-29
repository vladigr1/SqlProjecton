package entities;

import java.util.ArrayList;
import java.util.List;

import enums.ProductName;

public class ProductInStation extends Product {

	// create hash code and equals after have sale form eldad

	// connections
	private int fuelStationID;

	// fields
	private int productInStaionID;
	private int capacity;
	private int thresholdLevel;

	public ProductInStation(ProductName productName, double maxPrice, double currentPrice, int fuelStationID,
			int productInStaionID, int capacity, int thresholdLevel) {
		super(productName, maxPrice, currentPrice);
		this.fuelStationID = fuelStationID;
		this.productInStaionID = productInStaionID;
		this.capacity = capacity;
		this.thresholdLevel = thresholdLevel;
	}

	public int getFuelStationID() {
		return fuelStationID;
	}

	public void setFuelStationID(int fuelStationID) {
		this.fuelStationID = fuelStationID;
	}

	public int getProductInStaionID() {
		return productInStaionID;
	}

	public void setProductInStaionID(int productInStaionID) {
		this.productInStaionID = productInStaionID;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getThresholdLevel() {
		return thresholdLevel;
	}

	public void setThresholdLevel(int thresholdLevel) {
		this.thresholdLevel = thresholdLevel;
	}

	@Override
	public String toString() {
		return "ProductInStation [fuelStationID=" + fuelStationID + ", productInStaionID=" + productInStaionID
				+ ", capacity=" + capacity + ", thresholdLevel=" + thresholdLevel + ", supplierPrice=" 
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInStation))
			return false;
		ProductInStation product = (ProductInStation) obj;
		return this.productInStaionID == product.getProductInStaionID();
	}

}
