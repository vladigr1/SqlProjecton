package entities;

import enums.ProductName;

public class Car {
	// connections
	private String customerID;
	private ProductName productName;

	// fields
	private String registrationPlate;
	private String ownerName;
	private boolean deleted;

	public Car(String customerID, ProductName productName, String registrationPlate, String ownerName,
			boolean deleted) {
		super();
		this.customerID = customerID;
		this.productName = productName;
		this.registrationPlate = registrationPlate;
		this.ownerName = ownerName;
		this.deleted = deleted;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public ProductName getProductName() {
		return productName;
	}

	public void setProductName(ProductName productName) {
		this.productName = productName;
	}

	public String getRegistrationPlate() {
		return registrationPlate;
	}

//	public void setRegistrationPlate(String registrationPlate) {
//		this.registrationPlate = registrationPlate;
//	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
			return false;
		Car car = (Car) obj;
		return this.registrationPlate.equals(car.getRegistrationPlate());
	}

}
