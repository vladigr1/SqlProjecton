package entities;

import java.util.Date;

public class RankingSheet {
	// connections
	private Customer customer;

	// fields
	private double customerTypeRank;
	private double fuelingHoursRank;
	private double fuelTypessRank;
	private Date updatedForDate;

	public RankingSheet(Customer customer, double customerTypeRank, double fuelingHoursRank, double fuelTypessRank,
			Date updatedForDate) {
		super();
		this.customer = customer;
		this.customerTypeRank = customerTypeRank;
		this.fuelingHoursRank = fuelingHoursRank;
		this.fuelTypessRank = fuelTypessRank;
		this.updatedForDate = updatedForDate;
	}

	public Customer getCustomer() {
		return customer;
	}

//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	public double getCustomerTypeRank() {
		return customerTypeRank;
	}

	public void setCustomerTypeRank(double customerTypeRank) {
		this.customerTypeRank = customerTypeRank;
	}

	public double getFuelingHoursRank() {
		return fuelingHoursRank;
	}

	public void setFuelingHoursRank(double fuelingHoursRank) {
		this.fuelingHoursRank = fuelingHoursRank;
	}

	public double getFuelTypessRank() {
		return fuelTypessRank;
	}

	public void setFuelTypessRank(double fuelTypessRank) {
		this.fuelTypessRank = fuelTypessRank;
	}

	public Date getUpdatedForDate() {
		return updatedForDate;
	}

	public void setUpdatedForDate(Date updatedForDate) {
		this.updatedForDate = updatedForDate;
	}
	
	

	@Override
	public String toString() {
		return "RankingSheet [customer=" + customer + ", customerTypeRank=" + customerTypeRank + ", fuelingHoursRank="
				+ fuelingHoursRank + ", fuelTypessRank=" + fuelTypessRank + ", updatedForDate=" + updatedForDate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RankingSheet))
			return false;
		RankingSheet rank = (RankingSheet) obj;
		return this.customer.equals(rank.getCustomer());
	}

}
