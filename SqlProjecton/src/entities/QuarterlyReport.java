package entities;

public class QuarterlyReport {
	// create hash code and equals after have sale form eldad

	// connections
	private FuelStation fuelStation;

	// fields
	private int repQuareter;// id?
	private int year;
	private String fromDate;
	private String toDate;

	public QuarterlyReport(FuelStation fuelStation, int repQuareter, int year, String fromDate, String toDate) {
		super();
		this.fuelStation = fuelStation;
		this.repQuareter = repQuareter;
		this.year = year;
		this.fromDate = fromDate;
		this.toDate = toDate;
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

	public void setYear(int year) {
		this.year = year;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
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
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}

}
