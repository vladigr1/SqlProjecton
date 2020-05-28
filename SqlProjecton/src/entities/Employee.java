package entities;

import java.util.ArrayList;
import java.util.List;

import enums.Affiliation;

@SuppressWarnings("serial")
public class Employee extends User {

	// connections
	private FuelCompany fuelCompany;
	// fields
	private int employeeID;
	private String role;
	private Affiliation affiliation;

	public Employee(String username, String password, boolean connected, String firstName, String surname, String email,
			int employeeID, String role, Affiliation affiliation) {
		super(username, password, connected, firstName, surname, email);
		this.employeeID = employeeID;
		this.role = role;
		this.affiliation = affiliation;
	}

	public FuelCompany getFuelCompany() {
		return fuelCompany;
	}

	public void setFuelCompany(FuelCompany fuelCompany) {
		this.fuelCompany = fuelCompany;
	}

	public int getEmployeeID() {
		return employeeID;
	}
//
//	public void setEmployeeID(int employeeID) {
//		this.employeeID = employeeID;
//	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Affiliation getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(Affiliation affiliation) {
		this.affiliation = affiliation;
	}
	
	@Override
	public String toString() {
		return "Employee [fuelCompany=" + fuelCompany + ", employeeID=" + employeeID + ", role=" + role
				+ ", affiliation=" + affiliation + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return this.employeeID == other.getEmployeeID();
	}

}
