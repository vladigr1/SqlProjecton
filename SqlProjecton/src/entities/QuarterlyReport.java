package entities;

import java.util.Date;

public class QuarterlyReport {
	// create hash code and equals after have sale form eldad

	// connections
	private FuelStation fuelStation;

	// fields
	private int repQuareter;
	private int year;
	private Date dateCreated;

	public QuarterlyReport(FuelStation fuelStation, int repQuareter, int year, Date dateCreated) {
		super();
		this.fuelStation = fuelStation;
		this.repQuareter = repQuareter;
		this.year = year;
		this.dateCreated = dateCreated;
	}

	public FuelStation getFuelStation() {
		return fuelStation;
	}

	public void setFuelStation(FuelStation fuelStation) {
		this.fuelStation = fuelStation;
	}

	public int getRepQuareter() {
		return repQuareter;
	}

//	public void setRepQuareter(int repQuareter) {
//		this.repQuareter = repQuareter;
//	}

	public int getYear() {
		return year;
	}

//	public void setYear(int year) {
//		this.year = year;
//	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof QuarterlyReport))
			return false;
		QuarterlyReport report = (QuarterlyReport) obj;
		return this.repQuareter == report.getRepQuareter();
	}

	@Override
	public String toString() {
		return "QuarterlyReport [fuelStation=" + fuelStation + ", repQuareter=" + repQuareter + ", year=" + year
				+ ", dateCreated=" + dateCreated + "]";
	}

	
	
}
