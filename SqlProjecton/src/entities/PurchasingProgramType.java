package entities;

import java.util.ArrayList;
import java.util.List;

import enums.PurchasingProgramName;

public class PurchasingProgramType {
	
	//connections
	
	//fields
	private PurchasingProgramName purchasingProgramName;
	private String description;
	private double monthlyPrice;
	public PurchasingProgramType(PurchasingProgramName purchasingProgramName, String description, double monthlyPrice) {
		super();
		this.purchasingProgramName = purchasingProgramName;
		this.description = description;
		this.monthlyPrice = monthlyPrice;
	}
	
	
	public PurchasingProgramName getPurchasingProgramName() {
		return purchasingProgramName;
	}
//	public void setPurchasingProgramName(PurchasingProgramName purchasingProgramName) {
//		this.purchasingProgramName = purchasingProgramName;
//	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	@Override
	public String toString() {
		return "PurchasingProgramType [purchasingProgramList="  + ", purchasingProgramName="
				+ purchasingProgramName + ", description=" + description + ", monthlyPrice=" + monthlyPrice + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PurchasingProgramType))
			return false;
		PurchasingProgramType other = (PurchasingProgramType) obj;
		return this.purchasingProgramName.equals(other.getPurchasingProgramName());
	}
	
	

}