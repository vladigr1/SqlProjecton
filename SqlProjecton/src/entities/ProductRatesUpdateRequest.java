package entities;

import java.util.ArrayList;
import java.util.List;

public class ProductRatesUpdateRequest {
	// create hash code and equals after have sale form eldad
	
	//connections
	private List<Product> productList = new ArrayList<>();
	//must include 1 at least
	
	//fields
	private int updateRateRequestID;
	private boolean assessed;
	private boolean approved;
	
	public ProductRatesUpdateRequest(List<Product> productList, int updateRateRequestID, boolean assessed,
			boolean approved) {
		super();
		this.productList = productList;
		this.updateRateRequestID = updateRateRequestID;
		this.assessed = assessed;
		this.approved = approved;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public int getUpdateRateRequestID() {
		return updateRateRequestID;
	}
//	public void setUpdateRateRequestID(String updateRateRequestID) {
//		this.updateRateRequestID = updateRateRequestID;
//	}
	public boolean isAssessed() {
		return assessed;
	}
	public void setAssessed(boolean assessed) {
		this.assessed = assessed;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof ProductRatesUpdateRequest))
			return false;
		ProductRatesUpdateRequest pRateUpdateReq = (ProductRatesUpdateRequest)obj;
		return this.updateRateRequestID==pRateUpdateReq.getUpdateRateRequestID();
	}
	
	
	@Override
	public String toString() {
		return "ProductRatesUpdateRequest [productList=" + productList + ", updateRateRequestID=" + updateRateRequestID
				+ ", assessed=" + assessed + ", approved=" + approved + "]";
	}
	
	
	
	
	

}
