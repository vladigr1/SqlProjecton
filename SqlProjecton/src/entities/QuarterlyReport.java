package entities;

import java.util.Date;

public class QuarterlyReport {
	// create hash code and equals after have sale form eldad

	// connections
	private int fuelStationID;

	// fields
	private int repQuareter;
	private String year;
	private Date dateCreated;

	public QuarterlyReport(int fuelStationID, int repQuareter, String year, Date dateCreated) {
		super();
		this.fuelStationID = fuelStationID;
		this.repQuareter = repQuareter;
		this.year = year;
		this.dateCreated = dateCreated;
	}

	public int getFuelStationID() {
		return fuelStationID;
	}

	public void setFuelStationID(int fuelStationID) {
		this.fuelStationID = fuelStationID;
	}

	public int getRepQuareter() {
		return repQuareter;
	}

//	public void setRepQuareter(int repQuareter) {
//		this.repQuareter = repQuareter;
//	}

	public String getYear() {
		return year;
	}

//	public void setYear(String year) {
//		this.year = year;
//	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "QuarterlyReport [fuelStationID=" + fuelStationID + ", repQuareter=" + repQuareter + ", year=" + year
				+ ", dateCreated=" + dateCreated + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof QuarterlyReport))
			return false;
		QuarterlyReport report = (QuarterlyReport) obj;
		return this.repQuareter == report.getRepQuareter();
	}
}
