package entities;

import java.util.ArrayList;
import java.util.List;

public class SalesPattern {
	// create hash code after have sale form eldad
	
	//connections
	private List<Sale> saleList = new ArrayList<>();
	private List<Product> productList = new ArrayList<>();
	//must include 1 at least
	
	//fields
	private int salesPatternID;
	private String startTime;
	private String endTime;
	
	public SalesPattern(List<Sale> saleList, List<Product> productList, int salesPatternID, String startTime,
			String endTime) {
		super();
		this.saleList = saleList;
		this.productList = productList;
		this.salesPatternID = salesPatternID;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public List<Sale> getSaleList() {
		return saleList;
	}

	public void setSaleList(List<Sale> saleList) {
		this.saleList = saleList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public int getSalesPatternID() {
		return salesPatternID;
	}

//	public void setSalesPatternID(int salesPatternID) {
//		this.salesPatternID = salesPatternID;
//	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof SalesPattern))
			return false;
		SalesPattern sale = (SalesPattern)obj;
		return this.salesPatternID==sale.getSalesPatternID();
	}

	@Override
	public String toString() {
		return "SalesPattern [saleList=" + saleList + ", productList=" + productList + ", salesPatternID="
				+ salesPatternID + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
	
	
	
}
