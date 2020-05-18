package entities;

public class ProductInRequest {
	// create hash code and equals after have sale form eldad

	// connections
	private Product product;
	private ProductRatesUpdateRequest productRatesUpdateRequest;

	// fields
	private double currentRate;
	private double requestedRate;

	public ProductInRequest(Product product, ProductRatesUpdateRequest productRatesUpdateRequest, double currentRate,
			double requestedRate) {
		super();
		this.product = product;
		this.productRatesUpdateRequest = productRatesUpdateRequest;
		this.currentRate = currentRate;
		this.requestedRate = requestedRate;
	}

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

	public Product getProduct() {
		return product;
	}

//	public void setProduct(Product product) {
//		this.product = product;
//	}
	public ProductRatesUpdateRequest getProductRatesUpdateRequest() {
		return productRatesUpdateRequest;
	}

//	public void setProductRatesUpdateRequest(ProductRatesUpdateRequest productRatesUpdateRequest) {
//		this.productRatesUpdateRequest = productRatesUpdateRequest;
//	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ProductInRequest))
			return false;
		ProductInRequest pInReq = (ProductInRequest) obj;
		return (this.product.equals(pInReq.getProduct())
				&& this.productRatesUpdateRequest.equals(pInReq.getProductRatesUpdateRequest()));
	}

	@Override
	public String toString() {
		return "ProductInRequest [product=" + product + ", productRatesUpdateRequest=" + productRatesUpdateRequest
				+ ", currentRate=" + currentRate + ", requestedRate=" + requestedRate + "]";
	}

}
