package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sale {
	// connections
	private int salesPatternID;

	// fields
	private int saleID;
	private boolean active;
	Date startTime;
	Date endTime;

	public Sale(int salesPatternID, int saleID, boolean active, Date startTime, Date endTime) {
		super();
		this.salesPatternID = salesPatternID;
		this.saleID = saleID;
		this.active = active;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getSalesPattern() {
		return salesPatternID;
	}

	public void setSalesPattern(int salesPatternID) {
		this.salesPatternID = salesPatternID;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Sale [salesPatternID=" + salesPatternID + ", saleID=" + saleID + ", active=" + active + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Sale))
			return false;
		Sale other = (Sale) obj;
		return this.saleID == other.getSaleID();
	}

}
