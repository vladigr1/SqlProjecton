package entities;

import java.util.Arrays;

import enums.PurchasingProgramName;

public class PurchasingProgram {

	// connections
	private String customerID;
	private FuelCompany[] fuelCompany = new FuelCompany[3]; // max 3
	private PurchasingProgramName purchasingProgramName;

	public PurchasingProgram(String customerID, FuelCompany[] fuelCompany,
			PurchasingProgramName purchasingProgramName) {
		super();
		this.customerID = customerID;
		this.fuelCompany = fuelCompany;
		this.purchasingProgramName = purchasingProgramName;
	}

	public String getCustomerID() {
		return customerID;
	}

//	public void setCustomerID(String customerID) {
//		this.customerID = customerID;
//	}

	public FuelCompany[] getFuelCompany() {
		return fuelCompany;
	}

	public void setFuelCompany(FuelCompany[] fuelCompany) {
		this.fuelCompany = fuelCompany;
	}

	public PurchasingProgramName getPurchasingProgramName() {
		return purchasingProgramName;
	}

	public void setPurchasingProgramName(PurchasingProgramName purchasingProgramName) {
		this.purchasingProgramName = purchasingProgramName;
	}

	@Override
	public String toString() {
		return "PurchasingProgram [customerID=" + customerID + ", fuelCompany=" + Arrays.toString(fuelCompany)
				+ ", purchasingProgramName=" + purchasingProgramName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PurchasingProgram))
			return false;
		PurchasingProgram other = (PurchasingProgram) obj;
		return this.customerID.equals(other.getCustomerID());
	}

}