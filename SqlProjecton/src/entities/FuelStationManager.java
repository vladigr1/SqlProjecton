package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Affiliation;

public class FuelStationManager extends Employee{

	//connections
	private FuelStation fuelStation;
	private List<Notification> notificationList = new ArrayList<>();
	 
	//fields
	private String phoneNo;

	public FuelStationManager(String username, String password, boolean connected, String firstName, String surname,
			String email, int employeeID, String role, Affiliation affiliation, FuelStation fuelStation,
			String phoneNumber) {
		super(username, password, connected, firstName, surname, email, employeeID, role, affiliation);
		this.fuelStation = fuelStation;
		this.phoneNo = phoneNumber;
	}

	public FuelStation getFuelStation() {
		return fuelStation;
	}

	public void setFuelStation(FuelStation fuelStation) {
		this.fuelStation = fuelStation;
	}

	public List<Notification> getNotificationList() {
		return notificationList;
	}

	public void setNotificationList(List<Notification> notificationList) {
		this.notificationList = notificationList;
	}

	public String getPhoneNumber() {
		return phoneNo;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNo = phoneNumber;
	}

	@Override
	public String toString() {
		return "FuelStationManager [fuelStation=" + fuelStation + ", notificationList=" + notificationList
				+ ", phoneNumber=" + phoneNo + "]";
	}
		
	
}
