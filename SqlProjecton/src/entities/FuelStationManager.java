package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Affiliation;

public class FuelStationManager extends Employee{

	//connections
	private int fuelStationID;
	 
	//fields
	private String phoneNo;

	public FuelStationManager(String username, String password, boolean connected, String firstName, String surname,
			String email, int employeeID, String role, Affiliation affiliation, int fuelStationID, String phoneNo) {
		super(username, password, connected, firstName, surname, email, employeeID, role, affiliation);
		this.fuelStationID = fuelStationID;
		this.phoneNo = phoneNo;
	}

	public int getFuelStationID() {
		return fuelStationID;
	}

	public void setFuelStationID(int fuelStationID) {
		this.fuelStationID = fuelStationID;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "FuelStationManager [fuelStationID=" + fuelStationID + ", phoneNo=" + phoneNo + "]";
	}

	
		
	
}
