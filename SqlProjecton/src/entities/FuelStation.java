package entities;

import java.util.ArrayList;
import java.util.List;

import enums.FuelCompanyName;

public class FuelStation {

	// connections
	private FuelCompanyName fuelCompanyName;
	private int employeeID;

	// fields
	private int fuelStationID;
	private String stationName;
	private String address;

	public FuelStation(FuelCompanyName fuelCompanyName, int employeeID, int fuelStationID, String stationName,
			String address) {
		super();
		this.fuelCompanyName = fuelCompanyName;
		this.employeeID = employeeID;
		this.fuelStationID = fuelStationID;
		this.stationName = stationName;
		this.address = address;
	}

	public FuelCompanyName getFuelCompanyName() {
		return fuelCompanyName;
	}

	public void setFuelCompanyName(FuelCompanyName fuelCompanyName) {
		this.fuelCompanyName = fuelCompanyName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getFuelStationID() {
		return fuelStationID;
	}

//	public void setFuelStationID(int fuelStationID) {
//		this.fuelStationID = fuelStationID;
//	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "FuelStation [fuelCompanyName=" + fuelCompanyName + ", employeeID=" + employeeID + ", fuelStationID="
				+ fuelStationID + ", stationName=" + stationName + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FuelStation))
			return false;
		FuelStation other = (FuelStation) obj;
		return this.fuelStationID==other.getFuelStationID();
	}

}
