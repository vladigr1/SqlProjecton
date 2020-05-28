package entities;

import java.util.Arrays;

public class PurchasingProgram {

	// connections
	private Customer customer;
	private FuelCompany[] fuelCompany = new FuelCompany[3]; // max 3
	private PurchasingProgramType purchasingProgramType;

	public PurchasingProgram(Customer customer, FuelCompany[] fuelCompany,
			PurchasingProgramType purchasingProgramType) {
		super();
		this.customer = customer;
		this.fuelCompany = fuelCompany;
		this.purchasingProgramType = purchasingProgramType;
	}

	public Customer getCustomer() {
		return customer;
	}

//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public FuelCompany[] getFuelCompany() {
		return fuelCompany;
	}

//	public void setFuelCompany(FuelCompany[] fuelCompany) {
//		this.fuelCompany = fuelCompany;
//	}

	public PurchasingProgramType getPurchasingProgramType() {
		return purchasingProgramType;
	}

	public void setPurchasingProgramType(PurchasingProgramType purchasingProgramType) {
		this.purchasingProgramType = purchasingProgramType;
	}

	
	@Override
	public String toString() {
		return "PurchasingProgram [customer=" + customer + ", fuelCompany=" + Arrays.toString(fuelCompany)
				+ ", purchasingProgramType=" + purchasingProgramType + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PurchasingProgram))
			return false;
		PurchasingProgram other = (PurchasingProgram) obj;
		return this.customer.equals(other.getCustomer());
	}

}