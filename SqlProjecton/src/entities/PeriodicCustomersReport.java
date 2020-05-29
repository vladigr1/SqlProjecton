package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeriodicCustomersReport {
	// connections
	// fields
	private Date dateFrom;
	private Date dateTo;
	private Date dateCreated;

	public PeriodicCustomersReport(Date dateFrom, Date dateTo, Date dateCreated) {
		super();
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.dateCreated = dateCreated;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

//	public void setDateFrom(Date dateFrom) {
//		this.dateFrom = dateFrom;
//	}

	public Date getDateTo() {
		return dateTo;
	}

//	public void setDateTo(Date dateTo) {
//		this.dateTo = dateTo;
//	}

	public Date getDateCreated() {
		return dateCreated;
	}

//	public void setDateCreated(Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PeriodicCustomersReport))
			return false;
		PeriodicCustomersReport other = (PeriodicCustomersReport) obj;
		return this.dateFrom.equals(other.getDateFrom()) && this.dateTo.equals(other.getDateTo());
	}
	

	@Override
	public String toString() {
		return "PeriodicCustomersReport [dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", dateCreated=" + dateCreated
				+ "]";
	}

}
