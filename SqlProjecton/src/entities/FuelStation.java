package entities;

import java.util.ArrayList;
import java.util.List;

public class FuelStation {

	// connections
	private List<FastFuel> fastFuelList = new ArrayList<>(); 
	private FuelCompany fuelCompany;
	private FuelStationManager fuelStationManager;
	private List<QuarterlyReport> quarerlyReportList = new ArrayList<>();
	private List<ProductInStation> productInStationList = new ArrayList<>();// must include at least 1
	

	// fields
	private String stationName;
	private String address;

	public FuelStation(FuelCompany fuelCompany, FuelStationManager fuelStationManager, String stationName,
			String address) {
		super();
		this.fuelCompany = fuelCompany;
		this.fuelStationManager = fuelStationManager;
		this.stationName = stationName;
		this.address = address;
	}

	public List<FastFuel> getFastFuelList() {
		return fastFuelList;
	}

	public void setFastFuelList(List<FastFuel> fastFuelList) {
		this.fastFuelList = fastFuelList;
	}

	public FuelCompany getFuelCompanies() {
		return fuelCompany;
	}

	public void setFuelCompany(FuelCompany fuelCompany) {
		this.fuelCompany = fuelCompany;
	}

	public FuelStationManager getFuelStationManager() {
		return fuelStationManager;
	}

	public void setFuelStationManager(FuelStationManager fuelStationManager) {
		this.fuelStationManager = fuelStationManager;
	}

	public List<QuarterlyReport> getQuarerlyReportList() {
		return quarerlyReportList;
	}

	public void setQuarerlyReportList(List<QuarterlyReport> quarerlyReportList) {
		this.quarerlyReportList = quarerlyReportList;
	}

	public List<ProductInStation> getProductInStationList() {
		return productInStationList;
	}

	public void setProductInStationList(List<ProductInStation> productInStationList) {
		this.productInStationList = productInStationList;
	}


	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FuelStation))
			return false;
		FuelStation other = (FuelStation) obj;
		return this.fuelStationManager.equals(other.getFuelStationManager());
	}

	@Override
	public String toString() {
		return "FuelStaion [fastFuelList=" + fastFuelList + ", fuelCompanies=" + fuelCompany + ", fuelStationManager="
				+ fuelStationManager + ", quarerlyReportList=" + quarerlyReportList + ", productInStationList="
				+ productInStationList + ", fuelStationID=" + ", stationName=" + stationName
				+ ", address=" + address + "]";
	}

}
