package sql;

public class FieldIndicatorForInsert {
	public static String[] User() {
		return new String[] { "username", "password", "connected", "firstName", "surname", "email" };
	}

	public static String[] Employee() {
		return new String[] { "role", "affiliation", "fkUsername" };
	}

	public static String[] SalePattern() {
		return new String[] { "startTime", "endTime" }; // add saleID?
	}

	public static String[] Customer() {
		return new String[] { "customerID", "fkUsername", "creditCard" };
	}

	public static String[] Product() {
		return new String[] { "productName", "maxPrice", "currentPrice" };
	}

	public static String[] ProductInSalePattern() {
		return new String[] { "FK_productName", "FK_salesPatternID", "salesDiscount" };
	}

	public static String[] ProductRatesUpdateRequest() {
		return new String[] { "assessed", "approved" };
	}

	public static String[] ProductInRequest() {
		return new String[] { "FK_productName", "FK_updateRateRequestID", "currentRate", "requestedRate" };
	}

	public static String[] FuelStation() {
		return new String[] { "stationName", "address", "FK_employeeID_manager" }; // add here company name afterwards
	}

	public static String[] FastFuel() {
		return new String[] { "FK_productName", "FK_fuelStationID", "fastFuelTime", "amountBought", "finalPrice" };
	}

	public static String[] ProductInStation() {
		return new String[] { "FK_productName", "FK_fuelStationID", "capacity", "threshold", "supplierPrice" };
	}

	public static String[] QuarterlyReport() {
		return new String[] { "repYear", "fromDate", "toDate", "FK_fuelStationID" };
	}

	public static String[] IncomeReport() {
		return new String[] { "FK_repQuarter", "totalIncome" };
	}

	public static String[] OutcomeReport() {
		return new String[] { "FK_repQuarter", "totalOutcome" };
	}

	public static String[] InventroyReport() {
		return new String[] { "FK_repQuarter" };
	}

	public static String[] ProductInIncomeReport() {
		return new String[] { "FK_productInStationID", "FK_repQuarter_IncomeReport", "income" };
	}

	public static String[] ProductInOutcomeReport() {
		return new String[] { "FK_productInStationID", "FK_repQuarter_OutcomeReport", "outcome" };
	}

	public static String[] 	ProductInInventroyReport() {
		return new String[] { "FK_productInStationID", "FK_repQuarter_inventoryReport", "amountSold" };
	}

}
