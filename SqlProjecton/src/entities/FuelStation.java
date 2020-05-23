package entities;

import java.util.ArrayList;
import java.util.List;

public class FuelStation {
	// create hash code and equals after have sale form eldad

	// connections
	private List<FastFuel> fastFuelList = new ArrayList<>();
	private FuelCompany fuelCompanies;
	private FuelStationManager fuelStationManager;
	private List<QuarterlyReport> quarerlyReportList = new ArrayList<>();
	private List<ProductInStation> productInStationList = new ArrayList<>();
	// must include at least 1

	// fields
	private int fuelStationID;
	private String stationName;
	private String address;

	public FuelStation(List<FastFuel> fastFuelList, FuelCompany fuelCompanies, FuelStationManager fuelStationManager,
			List<QuarterlyReport> quarerlyReportList, List<ProductInStation> productInStationList, int fuelStationID,
			String stationName, String address) {
		super();
		this.fastFuelList = fastFuelList;
		this.fuelCompanies = fuelCompanies;
		this.fuelStationManager = fuelStationManager;
		this.quarerlyReportList = quarerlyReportList;
		this.productInStationList = productInStationList;
		this.fuelStationID = fuelStationID;
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
		return fuelCompanies;
	}

	public void setFuelCompanies(FuelCompany fuelCompanies) {
		this.fuelCompanies = fuelCompanies;
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

	public int getFuelStationID() {
		return fuelStationID;
	}

//	public void setFuelStationID(int fuelStationID) {
//		this.fuelStationID = fuelStationID;
//	}

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
		FuelStation station = (FuelStation) obj;
		return this.fuelStationID == station.getFuelStationID();
	}

	@Override
	public String toString() {
		return "FuelStaion [fastFuelList=" + fastFuelList + ", fuelCompanies=" + fuelCompanies + ", fuelStationManager="
				+ fuelStationManager + ", quarerlyReportList=" + quarerlyReportList + ", productInStationList="
				+ productInStationList + ", fuelStationID=" + fuelStationID + ", stationName=" + stationName
				+ ", address=" + address + "]";
	}

}
