package entities;

import java.util.ArrayList;
import java.util.List;

import enums.CustomerType;

@SuppressWarnings("serial")
public class Customer extends User {

	// connections

	// fields
	private String customerID;
	private String creditCard;
	private CustomerType customerType;
	private boolean deleted;

	public Customer(String username, String password, boolean connected, String firstName, String surname, String email,
			String customerID, String creditCard, CustomerType customerType, boolean deleted) {
		super(username, password, connected, firstName, surname, email);
		this.customerID = customerID;
		this.creditCard = creditCard;
		this.customerType = customerType;
		this.deleted = deleted;
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", creditCard=" + creditCard + ", customerType=" + customerType
				+ ", deleted=" + deleted + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return this.customerID.equals(other.getCustomerID());
	}

}
