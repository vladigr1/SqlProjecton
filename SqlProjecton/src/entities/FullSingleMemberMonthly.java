package entities;

public class FullSingleMemberMonthly extends PricingModel{
	//fileds
	private double lastMonthUtillization;

	public FullSingleMemberMonthly(PricingModelType pricingModeltype, Customer customer, Car car,
			double currentDiscount, double lastMonthUtillization) {
		super(pricingModeltype, customer, car, currentDiscount);
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
