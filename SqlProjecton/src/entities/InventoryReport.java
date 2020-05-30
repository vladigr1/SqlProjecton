package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventoryReport extends QuarterlyReport {


	public InventoryReport (int fuelStationID, int repQuareter, String year, Date dateCreated)
	{
		super(fuelStationID,repQuareter,year,dateCreated);
	}

}
