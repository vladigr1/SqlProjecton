package entities;

public class Car {
	//connections
	private Customer customer;
	private Product product;
	
	//fields
	private String registrationPlate;
	private String ownerName;
	public Car(Customer customer, Product product, String registrationPlate, String ownerName) {
		super();
		this.customer = customer;
		this.product = product;
		this.registrationPlate = registrationPlate;
		this.ownerName = ownerName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
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
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
			return false;
		Car car = (Car) obj;
		return this.registrationPlate == car.getRegistrationPlate();
	}
	
	@Override
	public String toString() {
		return "Car [customer=" + customer + ", product=" + product + ", registrationPlate=" + registrationPlate
				+ ", ownerName=" + ownerName + "]";
	}
	
}
