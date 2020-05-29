package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesPattern {
	// create hash code after have sale form eldad

	// fields
	private int salesPatternID;
	private int durationInMinutes; // minutes

	public SalesPattern(int salesPatternID, int durationInMinutes) {
		super();
		this.salesPatternID = salesPatternID;
		this.durationInMinutes = durationInMinutes;
	}

	public int getSalesPatternID() {
		return salesPatternID;
	}

//	public void setSalesPatternID(int salesPatternID) {
//		this.salesPatternID = salesPatternID;
//	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	@Override
	public String toString() {
		return "SalesPattern [salesPatternID=" + salesPatternID + ", durationInMinutes=" + durationInMinutes + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof SalesPattern))
			return false;
		SalesPattern sale = (SalesPattern) obj;
		return this.salesPatternID == sale.getSalesPatternID();
	}

}
