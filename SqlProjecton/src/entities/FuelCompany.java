
package entities;

import java.util.ArrayList;
import java.util.List;

import enums.FuelCompanyName;

public class FuelCompany {

	// connections
	private int employeeID; // supplier

	// fields
	private FuelCompanyName fuelCompanyName;

	public FuelCompany(int employeeID, FuelCompanyName fuelCompanyName) {
		super();
		this.employeeID = employeeID;
		this.fuelCompanyName = fuelCompanyName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public FuelCompanyName getFuelCompanyName() {
		return fuelCompanyName;
	}

//	public void setFuelCompanyName(FuelCompanyName fuelCompanyName) {
//		this.fuelCompanyName = fuelCompanyName;
//	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FuelCompany))
			return false;
		FuelCompany other = (FuelCompany) obj;
		return this.fuelCompanyName.equals(other.getFuelCompanyName());
	}

	@Override
	public String toString() {
		return "FuelCompany [employeeID=" + employeeID + ", fuelCompanyName=" + fuelCompanyName + "]";
	}

}