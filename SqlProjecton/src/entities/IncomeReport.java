package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeReport extends QuarterlyReport {

	// create hash code and equals after have sale form eldad

	// connections


	// fields
	private double totalIncome;

	public IncomeReport(int fuelStationID, int repQuareter, String year, Date dateCreated, double totalIncome) {
		super(fuelStationID, repQuareter, year, dateCreated);
		this.totalIncome = totalIncome;
	}

	public double getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}

	@Override
	public String toString() {
		return "IncomeReport [totalIncome=" + totalIncome + "]";
	}

	

}
