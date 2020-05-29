package entities;

import enums.PricingModelName;

public class FullSingleMemberMonthly extends PricingModel{
	//fields
	private double lastMonthUtillization;

	public FullSingleMemberMonthly(PricingModelName pricingModelName, String customerID, double currentDiscount,
			double lastMonthUtillization) {
		super(pricingModelName, customerID, currentDiscount);
		this.lastMonthUtillization = lastMonthUtillization;
	}

	public double getLastMonthUtillization() {
		return lastMonthUtillization;
	}

	public void setLastMonthUtillization(double lastMonthUtillization) {
		this.lastMonthUtillization = lastMonthUtillization;
	}

	@Override
	public String toString() {
		return "FullSingleMemberMonthly [lastMonthUtillization=" + lastMonthUtillization + "]";
	}
	
	

}
