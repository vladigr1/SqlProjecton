package entities;

public class PricingModel {
	//connections
	private PricingModelType pricingModeltype;
	private Customer customer;
	private Car car;
	
	//fields
	private double currentDiscount;

	public PricingModel(PricingModelType pricingModeltype, Customer customer, Car car, double currentDiscount) {
		super();
		this.pricingModeltype = pricingModeltype;
		this.customer = customer;
		this.car = car;
		this.currentDiscount = currentDiscount;
	}

	public PricingModelType getPricingModeltype() {
		return pricingModeltype;
	}

	public void setPricingModeltype(PricingModelType pricingModeltype) {
		this.pricingModeltype = pricingModeltype;
	}

	public Customer getCustomer() {
		return customer;
	}

//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public Car getCar() {
		return car;
	}

//	public void setCar(Car car) {
//		this.car = car;
//	}

	public double getCurrentDiscount() {
		return currentDiscount;
	}

	public void setCurrentDiscount(double currentDiscount) {
		this.currentDiscount = currentDiscount;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PricingModel))
			return false;
		PricingModel other = (PricingModel) obj;
		return (this.car.equals(other.getCar())) && (this.customer.equals(other.getCustomer()));
	}
	

	@Override
	public String toString() {
		return "PricingModel [pricingModeltype=" + pricingModeltype + ", customer=" + customer + ", car=" + car
				+ ", currentDiscount=" + currentDiscount + "]";
	}
	
	
	
	
	
	
	

}
