package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryReport extends QuarterlyReport {
	// create hash code and equals after have sale form eldad

	// connections
	private List<ProductInStation> productInStationList = new ArrayList<>();
	// must include at least 1

	public InventoryReport(FuelStation fuelStation, int repQuareter, int year, Date dateCreated) {
		super(fuelStation, repQuareter, year, dateCreated);
		// TODO Auto-generated constructor stub
	}

	public List<ProductInStation> getProductInStationList() {
		return productInStationList;
	}

	public void setProductInStationList(List<ProductInStation> productInStationList) {
		this.productInStationList = productInStationList;
	}

	@Override
	public String toString() {
		return "InventoryReport [productInStationList=" + productInStationList + "]";
	}

	

}
