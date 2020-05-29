package entities;

import enums.ProductName;

public class ProductInRequest {
	// create hash code and equals after have sale form eldad

	// connections
	private ProductName productName;
	private int productRatesUpdateRequestID;

	// fields
	private double currentRate;
	private double requestedRate;

	public ProductInRequest(ProductName productName, int productRatesUpdateRequestID, double currentRate,
			double requestedRate) {
		super();
		this.productName = productName;
		this.productRatesUpdateRequestID = productRatesUpdateRequestID;
		this.currentRate = currentRate;
		this.requestedRate = requestedRate;
	}

	public ProductName getProductName() {
		return productName;
	}

//	public void setProductName(ProductName productName) {
//		this.productName = productName;
//	}

	public int getProductRatesUpdateRequestID() {
		return productRatesUpdateRequestID;
	}

//	public void setProductRatesUpdateRequestID(int productRatesUpdateRequestID) {
//		this.productRatesUpdateRequestID = productRatesUpdateRequestID;
//	}

	public double getCurrentRate() {
		return currentRate;
	}

	public void setCurrentRate(double currentRate) {
		this.currentRate = currentRate;
	}

	public double getRequestedRate() {
		return requestedRate;
	}

	public void setRequestedRate(double requestedRate) {
		this.requestedRate = requestedRate;
	}

	
	
	@Override
	public String toString() {
		return "ProductInRequest [productName=" + productName + ", productRatesUpdateRequestID="
				+ productRatesUpdateRequestID + ", currentRate=" + currentRate + ", requestedRate=" + requestedRate
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInRequest))
			return false;
		ProductInRequest other = (ProductInRequest) obj;
		return this.productName.equals(other.getProductName()) && this.productRatesUpdateRequestID == other.getProductRatesUpdateRequestID();
	}

}
