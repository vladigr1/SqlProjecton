package entities;

import java.util.ArrayList;
import java.util.List;

public class ProductRatesUpdateRequest {
	// create hash code and equals after have sale form eldad
	
	//connections

	
	//fields
	private int updateRateRequestID;
	private boolean assessed;
	private boolean approved;
	
	
	public ProductRatesUpdateRequest(int updateRateRequestID, boolean assessed, boolean approved) {
		super();
		this.updateRateRequestID = updateRateRequestID;
		this.assessed = assessed;
		this.approved = approved;
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
		return "ProductRatesUpdateRequest [productList="  + ", updateRateRequestID=" + updateRateRequestID
				+ ", assessed=" + assessed + ", approved=" + approved + "]";
	}
	
	
	
	
	

}
