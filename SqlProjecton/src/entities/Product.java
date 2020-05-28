package entities;

import java.util.ArrayList;
import java.util.List;

import enums.ProductName;

public class Product {
	// create hash code and equals after have sale form eldad

	// connections
	private List<SalesPattern> salePatternList = new ArrayList<>();
	private List<ProductRatesUpdateRequest> productRatesUpdateRequesList = new ArrayList<>();
	private List<Car> carList = new ArrayList<>();
	private List<HomeFuelOrder> homeFuelOrderList = new ArrayList<>();
	private List<FastFuel> fastFuelList = new ArrayList<>();

	// fields
	private ProductName productName;
	private double maxPrice;
	private double currentPrice;

	

	public Product(ProductName productName, double maxPrice, double currentPrice) {
		super();
		this.productName = productName;
		this.maxPrice = maxPrice;
		this.currentPrice = currentPrice;
	}

	public List<SalesPattern> getSalePatternList() {
		return salePatternList;
	}

	public void setSalePatternList(List<SalesPattern> salePatternList) {
		this.salePatternList = salePatternList;
	}

	public List<ProductRatesUpdateRequest> getProductRatesUpdateRequesList() {
		return productRatesUpdateRequesList;
	}

	public void setProductRatesUpdateRequesList(List<ProductRatesUpdateRequest> productRatesUpdateRequesList) {
		this.productRatesUpdateRequesList = productRatesUpdateRequesList;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public List<HomeFuelOrder> getHomeFuelOrderList() {
		return homeFuelOrderList;
	}

	public void setHomeFuelOrderList(List<HomeFuelOrder> homeFuelOrderList) {
		this.homeFuelOrderList = homeFuelOrderList;
	}

	public List<FastFuel> getFastFuelList() {
		return fastFuelList;
	}

	public void setFastFuelList(List<FastFuel> fastFuelList) {
		this.fastFuelList = fastFuelList;
	}

	public ProductName getProductName() {
		return productName;
	}

//	public void setProductName(ProductName productName) {
//		this.productName = productName;
//	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof Product))
			return false;
		Product product = (Product)obj;
		return this.productName.equals(product.getProductName());
	}
	
	
	@Override
	public String toString() {
		return "Product [salePatternList=" + salePatternList + ", productRatesUpdateRequesList="
				+ productRatesUpdateRequesList + ", fastFuelList=" + fastFuelList + ", productName=" + productName
				+ ", maxPrice=" + maxPrice + ", currentPrice=" + currentPrice + "]";
	}
	
	

}
