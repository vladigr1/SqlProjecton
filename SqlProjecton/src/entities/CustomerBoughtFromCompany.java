package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.FuelCompanyName;

public class CustomerBoughtFromCompany {

	// connections
	private String customerID;
	private FuelCompanyName fuelCompanyName;

	// fields
	private double amountBoughtFromCompany;
	private double amountPaidCompany;
	private Date dateOfPurchase;

	public CustomerBoughtFromCompany(String customerID, FuelCompanyName fuelCompanyName, double amountBoughtFromCompany,
			double amountPaidCompany, Date dateOfPurchase) {
		super();
		this.customerID = customerID;
		this.fuelCompanyName = fuelCompanyName;
		this.amountBoughtFromCompany = amountBoughtFromCompany;
		this.amountPaidCompany = amountPaidCompany;
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getCustomerID() {
		return customerID;
	}

//	public void setCustomerID(String customerID) {
//		this.customerID = customerID;
//	}

	public FuelCompanyName getFuelCompanyName() {
		return fuelCompanyName;
	}

//	public void setFuelCompanyName(FuelCompanyName fuelCompanyName) {
//		this.fuelCompanyName = fuelCompanyName;
//	}

	public double getAmountBoughtFromCompany() {
		return amountBoughtFromCompany;
	}

	public void setAmountBoughtFromCompany(double amountBoughtFromCompany) {
		this.amountBoughtFromCompany = amountBoughtFromCompany;
	}

	public double getAmountPaidCompany() {
		return amountPaidCompany;
	}

	public void setAmountPaidCompany(double amountPaidCompany) {
		this.amountPaidCompany = amountPaidCompany;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	@Override
	public String toString() {
		return "CustomerBoughtFromCompany [customerID=" + customerID + ", fuelCompanyName=" + fuelCompanyName
				+ ", amountBoughtFromCompany=" + amountBoughtFromCompany + ", amountPaidCompany=" + amountPaidCompany
				+ ", dateOfPurchase=" + dateOfPurchase + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Sale))
			return false;
		CustomerBoughtFromCompany other = (CustomerBoughtFromCompany) obj;
		return this.customerID.equals(other.getCustomerID()) && this.fuelCompanyName.equals(other.getFuelCompanyName());
	}

}