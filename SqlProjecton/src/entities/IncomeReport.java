package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeReport extends QuarterlyReport {

	// create hash code and equals after have sale form eldad

	// connections
	private List<ProductInStation> productInStationList = new ArrayList<>(); // must include at least 1


	// fields
	private double totalAllIncome;

	

	public IncomeReport(FuelStation fuelStation, int repQuareter, String year, Date dateCreated,
			double totalAllIncome) {
		super(fuelStation, repQuareter, year, dateCreated);
		this.totalAllIncome = totalAllIncome;
	}

	public List<ProductInStation> getProductInStationList() {
		return productInStationList;
	}

	public void setProductInStationList(List<ProductInStation> productInStationList) {
		this.productInStationList = productInStationList;
	}

	public double getTotalAllIncome() {
		return totalAllIncome;
	}

	public void setTotalAllIncome(double totalAllIncome) {
		this.totalAllIncome = totalAllIncome;
	}

	@Override
	public String toString() {
		return "IncomeReport [productInStationList=" + productInStationList + ", totalAllIncome=" + totalAllIncome
				+ "]";
	}

}
