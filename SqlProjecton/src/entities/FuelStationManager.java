package entities;

import enums.Affiliation;

public class FuelStationManager extends Employee{
	private String phoneNo;
	
	public FuelStationManager(String username, String password,
			boolean connected, String firstName, String surname,
			String email, String employeeID, String role, Affiliation affiliation,
			String phoneNo) {
		super(username, password, connected, firstName, surname, email, employeeID, role, affiliation);
		// TODO Auto-generated constructor stub
		this.phoneNo = phoneNo;
	}
}
