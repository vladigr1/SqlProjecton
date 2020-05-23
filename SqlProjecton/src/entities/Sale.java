package entities;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	//connections
	private SalesPattern salesPattern;
	private List<SaleCommentsReport> saleCommentReportList= new ArrayList<>();
	private List<Customer> saleCustomerList= new ArrayList<>();
	
	//fields
	private int saleID;
	private boolean active;
	public Sale(SalesPattern salesPattern, List<SaleCommentsReport> saleCommentReportList,
			List<Customer> saleCustomerList, int saleID, boolean active) {
		super();
		this.salesPattern = salesPattern;
		this.saleCommentReportList = saleCommentReportList;
		this.saleCustomerList = saleCustomerList;
		this.saleID = saleID;
		this.active = active;
	}
	public SalesPattern getSalesPattern() {
		return salesPattern;
	}
	public void setSalesPattern(SalesPattern salesPattern) {
		this.salesPattern = salesPattern;
	}
	public List<SaleCommentsReport> getSaleCommentReportList() {
		return saleCommentReportList;
	}
	public void setSaleCommentReportList(List<SaleCommentsReport> saleCommentReportList) {
		this.saleCommentReportList = saleCommentReportList;
	}
	public List<Customer> getSaleCustomerList() {
		return saleCustomerList;
	}
	public void setSaleCustomerList(List<Customer> saleCustomerList) {
		this.saleCustomerList = saleCustomerList;
	}
	public int getSaleID() {
		return saleID;
	}
//	public void setSaleID(int saleID) {
//		this.saleID = saleID;
//	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
    public boolean equals(Object obj) {
		if(!(obj instanceof Sale))
			return false;
		Sale sale = (Sale)obj;
		return this.saleID==sale.getSaleID();
	}

	
	@Override
	public String toString() {
		return "Sale [saleID=" + saleID + ", active=" + active + "]";
	}
	
	
	
	
	
	
}
