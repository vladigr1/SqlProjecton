package entities;

import java.util.ArrayList;
import java.util.List;

import enums.CustomerType;

@SuppressWarnings("serial")
public class Customer extends User {

	// connections
	private List<Car> carList = new ArrayList<>(); // must include 1 at least
	private List<RankingSheet> rankingSheetList = new ArrayList<>();
	private List<FuelCompany> fuelCompanyList = new ArrayList<>();
	private List<HomeFuelOrder> homeFuelOrderList = new ArrayList<>();
	private List<Sale> saleList = new ArrayList<>();
	private PurchasingProgram purchasingProgram;

	// fields
	private String customerID;
	private String creditCard;
	private CustomerType customerType;
	
	
	public Customer(String username, String password, boolean connected, String firstName, String surname, String email,
			PurchasingProgram purchasingProgram, String customerID, String creditCard, CustomerType customerType) {
		super(username, password, connected, firstName, surname, email);
		this.purchasingProgram = purchasingProgram;
		this.customerID = customerID;
		this.creditCard = creditCard;
		this.customerType = customerType;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public List<RankingSheet> getRankingSheetList() {
		return rankingSheetList;
	}

	public void setRankingSheetList(List<RankingSheet> rankingSheetList) {
		this.rankingSheetList = rankingSheetList;
	}

	public List<FuelCompany> getFuelCompanyList() {
		return fuelCompanyList;
	}

	public void setFuelCompanyList(List<FuelCompany> fuelCompanyList) {
		this.fuelCompanyList = fuelCompanyList;
	}

	public List<HomeFuelOrder> getHomeFuelOrderList() {
		return homeFuelOrderList;
	}

	public void setHomeFuelOrderList(List<HomeFuelOrder> homeFuelOrderList) {
		this.homeFuelOrderList = homeFuelOrderList;
	}

	public List<Sale> getSaleList() {
		return saleList;
	}

	public void setSaleList(List<Sale> saleList) {
		this.saleList = saleList;
	}

	public PurchasingProgram getPurchasingProgram() {
		return purchasingProgram;
	}

	public void setPurchasingProgram(PurchasingProgram purchasingProgram) {
		this.purchasingProgram = purchasingProgram;
	}

	public String getCustomerID() {
		return customerID;
	}

//	public void setCustomerID(String customerID) {
//		this.customerID = customerID;
//	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	@Override
	public String toString() {
		return "Customer [carList=" + carList + ", rankingSheetList=" + rankingSheetList + ", fuelCompanyList="
				+ fuelCompanyList + ", homeFuelOrderList=" + homeFuelOrderList + ", saleList=" + saleList
				+ ", purchasingProgram=" + purchasingProgram + ", customerID=" + customerID + ", creditCard="
				+ creditCard + ", customerType=" + customerType + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return this.customerID.equals(other.getCustomerID());
	}

}
