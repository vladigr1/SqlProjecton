package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutcomeReport extends QuarterlyReport {
	// create hash code and equals after have sale form eldad

	// connections
	private List<ProductInStation> productInStationList = new ArrayList<>();
	// must include at least 1

	// fields
	private double totalOutCome;

	public OutcomeReport(FuelStation fuelStation, int repQuareter, int year, Date dateCreated,
			List<ProductInStation> productInStationList, double totalOutCome) {
		super(fuelStation, repQuareter, year, dateCreated);
		this.productInStationList = productInStationList;
		this.totalOutCome = totalOutCome;
	}

	public List<ProductInStation> getProductInStationList() {
		return productInStationList;
	}

	public void setProductInStationList(List<ProductInStation> productInStationList) {
		this.productInStationList = productInStationList;
	}

	public double getTotalOutCome() {
		return totalOutCome;
	}

	public void setTotalOutCome(double totalOutCome) {
		this.totalOutCome = totalOutCome;
	}

	@Override
	public String toString() {
		return "OutcomeReport [productInStationList=" + productInStationList + ", totalOutCome=" + totalOutCome + "]";
	}

	

}
