package entities;

import java.util.ArrayList;
import java.util.List;

public class ProductInStation extends Product {

	// create hash code and equals after have sale form eldad

	// connections
	private FuelStation fuelStation;
	private List<FuelStationOrder> fuelStationOrderList = new ArrayList<>();
	private List<IncomeReport> incomeReportList = new ArrayList<>();
	private List<InventoryReport> inventoryReportList = new ArrayList<>();
	private List<OutcomeReport> outComeReportList = new ArrayList<>();

	// fields
	private int productInStaionID;
	private int capacity;
	private int thresholdLevel;
	private double supplierPrice;

	public ProductInStation(List<SalesPattern> salePatternList,
			List<ProductRatesUpdateRequest> productRatesUpdateRequesList, List<Car> carList,
			List<HomeFuelOrder> homeFuelOrderList, List<FastFuel> fastFuelList, ProductName productName,
			double maxPrice, double currentPrice, FuelStation fuelStation, List<FuelStationOrder> fuelStationOrderList,
			List<IncomeReport> incomeReportList, List<InventoryReport> inventoryReportList,
			List<OutcomeReport> outComeReportList, int productInStaionID, int capacity, int thresholdLevel,
			double supplierPrice) {
		super(salePatternList, productRatesUpdateRequesList, carList, homeFuelOrderList, fastFuelList, productName,
				maxPrice, currentPrice);
		this.fuelStation = fuelStation;
		this.fuelStationOrderList = fuelStationOrderList;
		this.incomeReportList = incomeReportList;
		this.inventoryReportList = inventoryReportList;
		this.outComeReportList = outComeReportList;
		this.productInStaionID = productInStaionID;
		this.capacity = capacity;
		this.thresholdLevel = thresholdLevel;
		this.supplierPrice = supplierPrice;
	}

	public FuelStation getFuelStation() {
		return fuelStation;
	}

	public void setFuelStation(FuelStation fuelStation) {
		this.fuelStation = fuelStation;
	}

	public List<FuelStationOrder> getFuelStationOrderList() {
		return fuelStationOrderList;
	}

	public void setFuelStationOrderList(List<FuelStationOrder> fuelStationOrderList) {
		this.fuelStationOrderList = fuelStationOrderList;
	}

	public List<IncomeReport> getIncomeReportList() {
		return incomeReportList;
	}

	public void setIncomeReportList(List<IncomeReport> incomeReportList) {
		this.incomeReportList = incomeReportList;
	}

	public List<InventoryReport> getInventoryReportList() {
		return inventoryReportList;
	}

	public void setInventoryReportList(List<InventoryReport> inventoryReportList) {
		this.inventoryReportList = inventoryReportList;
	}

	public List<OutcomeReport> getOutComeReportList() {
		return outComeReportList;
	}

	public void setOutComeReportList(List<OutcomeReport> outComeReportList) {
		this.outComeReportList = outComeReportList;
	}

	public int getProductInStaionID() {
		return productInStaionID;
	}

//	public void setProductInStaionID(int productInStaionID) {
//		this.productInStaionID = productInStaionID;
//	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getThresholdLevel() {
		return thresholdLevel;
	}

	public void setThresholdLevel(int thresholdLevel) {
		this.thresholdLevel = thresholdLevel;
	}

	public double getSupplierPrice() {
		return supplierPrice;
	}

	public void setSupplierPrice(double supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInStation))
			return false;
		ProductInStation product = (ProductInStation) obj;
		return this.productInStaionID == product.getProductInStaionID();
	}

	@Override
	public String toString() {
		return "ProductInStation [fuelStation=" + fuelStation + ", fuelStationOrderList=" + fuelStationOrderList
				+ ", incomeReportList=" + incomeReportList + ", inventoryReportList=" + inventoryReportList
				+ ", outComeReportList=" + outComeReportList + ", productInStaionID=" + productInStaionID
				+ ", capacity=" + capacity + ", thresholdLevel=" + thresholdLevel + ", supplierPrice=" + supplierPrice
				+ "]";
	}

}
