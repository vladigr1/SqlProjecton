package entities;

import java.util.ArrayList;
import java.util.List;

public class FuelCompany {

	// connections
	private List<FuelStation> fuelStationList = new ArrayList<>(); // must include 1 at least
	private Employee supplier;
	private List<Customer> customerList = new ArrayList<>();
	private List<PurchasingProgram> purchasingProgramList = new ArrayList<>(); // must include 1 at least

	// fields
	private String fuelCompanyName;

	public FuelCompany(Employee supplier, String fuelCompanyName) {
		this.supplier = supplier;
		this.fuelCompanyName = fuelCompanyName;
	}

	public List<FuelStation> getFuelStationList() {
		return fuelStationList;
	}

	public void setFuelStationList(List<FuelStation> fuelStationList) {
		this.fuelStationList = fuelStationList;
	}

	public Employee getSupplier() {
		return supplier;
	}

	public void setSupplier(Employee supplier) {
		this.supplier = supplier;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public List<PurchasingProgram> getPurchasingProgramList() {
		return purchasingProgramList;
	}

	public void setPurchasingProgramList(List<PurchasingProgram> purchasingProgramList) {
		this.purchasingProgramList = purchasingProgramList;
	}

	public String getFuelCompanyName() {
		return fuelCompanyName;
	}
	
//	public void setFuelCompanyName(String fuelCompanyName) {
//	this.fuelCompanyName = fuelCompanyName;
//}

	@Override
	public String toString() {
		return "FuelCompany [fuelStationList=" + fuelStationList + ", supplier=" + supplier + ", customerList="
				+ customerList + ", purchasingProgramList=" + purchasingProgramList + ", fuelCompanyName="
				+ fuelCompanyName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FuelCompany))
			return false;
		FuelCompany other = (FuelCompany) obj;
		return this.fuelCompanyName.equals(other.getFuelCompanyName());
	}

	
	

}