package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeriodicCustomersReport {
	//connections
	private List<CustomerBoughtFromCompany> customerBoughtFromCompanyList = new ArrayList<>();
	//fields
	private int periodicCustomerReportID;
	private Date dateFrom;
	private Date dateTo;
	
	public PeriodicCustomersReport(int periodicCustomerReportID, Date dateFrom, Date dateTo) {
		super();
		this.periodicCustomerReportID = periodicCustomerReportID;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}
	public List<CustomerBoughtFromCompany> getCustomerBoughtFromCompanyList() {
		return customerBoughtFromCompanyList;
	}
	public void setCustomerBoughtFromCompanyList(List<CustomerBoughtFromCompany> customerBoughtFromCompanyList) {
		this.customerBoughtFromCompanyList = customerBoughtFromCompanyList;
	}
	public int getPeriodicCustomerReportID() {
		return periodicCustomerReportID;
	}
//	public void setPeriodicCustomerReportID(int periodicCustomerReportID) {
//		this.periodicCustomerReportID = periodicCustomerReportID;
//	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	@Override
	public String toString() {
		return "PeriodicCustomersReport [customerBoughtFromCompanyList=" + customerBoughtFromCompanyList
				+ ", periodicCustomerReportID=" + periodicCustomerReportID + ", dateFrom=" + dateFrom + ", dateTo="
				+ dateTo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PeriodicCustomersReport))
			return false;
		PeriodicCustomersReport other = (PeriodicCustomersReport) obj;
		return this.periodicCustomerReportID== other.getPeriodicCustomerReportID();
	}
	
}
