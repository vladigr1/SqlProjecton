package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerBoughtFromCompany {
	
	//connections
	private Customer customer;
	private FuelCompany fuelCompany;
	private List<PeriodicCustomersReport> periodicCustomersReportList = new ArrayList<>();
	
	//fields
	private double amountBoughtFromCompany;
	private double amountPaidCompany;
	private Date dateOfPurchase;
	
	public CustomerBoughtFromCompany(Customer customer, FuelCompany fuelCompany, double amountBoughtFromCompany,
			double amountPaidCompany, Date dateOfPurchase) {
		super();
		this.customer = customer;
		this.fuelCompany = fuelCompany;
		this.amountBoughtFromCompany = amountBoughtFromCompany;
		this.amountPaidCompany = amountPaidCompany;
		this.dateOfPurchase = dateOfPurchase;
	}
	
	public Customer getCustomer() {
		return customer;
	}
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
	public FuelCompany getFuelCompany() {
		return fuelCompany;
	}
//	public void setFuelCompany(FuelCompany fuelCompany) {
//		this.fuelCompany = fuelCompany;
//	}
	public List<PeriodicCustomersReport> getPeriodicCustomersReportList() {
		return periodicCustomersReportList;
	}
	public void setPeriodicCustomersReportList(List<PeriodicCustomersReport> periodicCustomersReportList) {
		this.periodicCustomersReportList = periodicCustomersReportList;
	}
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
		return "CustomerBoughtFromCompany [customer=" + customer + ", fuelCompany=" + fuelCompany
				+ ", periodicCustomersReportList=" + periodicCustomersReportList + ", amountBoughtFromCompany="
				+ amountBoughtFromCompany + ", amountPaidCompany=" + amountPaidCompany + ", dateOfPurchase="
				+ dateOfPurchase + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Sale))
			return false;
		CustomerBoughtFromCompany other = (CustomerBoughtFromCompany) obj;
		return this.customer.equals(other.getCustomer()) && this.fuelCompany.equals(other.getFuelCompany());
	}
	

}