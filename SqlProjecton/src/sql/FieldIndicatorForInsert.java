package sql;

public class FieldIndicatorForInsert {
	//elro addiotons
	
	public static String[] FullSingleMemberMonthly() {
		return new String[] { "FK_registrationPlate", "FK_customerID","lastMonthUtillization" };
	}
	
	public static String[] PricingModel() {
		return new String[] { "FK_pricingModelName", "FK_registrationPlate", "FK_customerID","currentDiscount" };
	}
	
	public static String[] PricingModelType() {
		return new String[] { "pricingModelName", "description", "defaultDiscount" };
	}
	
	public static String[] Car() {
		return new String[] { "registrationPlate", "ownerName", "FK_productName", "FK_customerID" };
	}

	public static String[] RankingSheet() {
		return new String[] { "customerTypeRank", "fuelingHoursRank", "fuelTypesRank", "FK_customerID","updatedForDate" };
	}

	
	
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
		return new String[] { "customerID", "fkUsername", "creditCard","customerType" };
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
		return new String[] { "stationName","FK_employeeID", "address","FK_fuel_Company_Name" }; // add here company name afterwards
	}

	public static String[] FastFuel() {
		return new String[] { "FK_productName", "FK_employeeID", "fastFuelTime", "amountBought", "finalPrice" };
	}

	public static String[] ProductInStation() {
		return new String[] { "FK_productName", "FK_employeeID", "capacity", "threshold", "supplierPrice" };
	}

	public static String[] QuarterlyReport() {
		return new String[] { "repQuarter","repYear", "dateCreated", "FK_employeeID" };
	}

	public static String[] IncomeReport() {
		return new String[] { "FK_repQuarter","FK_repYear","totalIncome" };
	}

	public static String[] OutcomeReport() {
		return new String[] { "FK_repQuarter","FK_repYear","totalOutcome" };
	}

	public static String[] InventroyReport() {
		return new String[] { "FK_repQuarter","FK_repYear" };
	}

	public static String[] ProductInIncomeReport() {
		return new String[] { "FK_productInStationID", "FK_repQuarter_IncomeReport","FK_repYear_IncomeReport", "income" };
	}

	public static String[] ProductInOutcomeReport() {
		return new String[] { "FK_productInStationID", "FK_repQuarter_OutcomeReport", "FK_repYear_OutcomeReport", "outcome" };
	}

	public static String[] 	ProductInInventroyReport() {
		return new String[] { "FK_productInStationID", "FK_repQuarter_inventoryReport","FK_repYear_inventoryReport", "amountSold" };
	}
	
	public static String[] FuelStationManager() {
		return new String[]{"phoneNo", "fkemployeeID" };
	}
	
	public static String[] Sale() {
		return new String[]{"fk_salesPatternID","active" };
	}
	
	public static String[] CustomerboughtInSale() {
		return new String[]{"FK_saleID","FK_customerID","amountPaid" };
	}
	
	public static String[] SaleCommentsReport() {
		return new String[]{"FK_saleID","numberOfCustomersBought","sumOfPurchases","dateCreated" };
	}
	
	public static String[] FuelStationOrder() {
		return new String[]{"FK_orders_ID","FK_productInStationID","assessed","approved","reason" };
	}
	//vlad added
	
	public static String[] Notification() {
		return new String[]{"dismissed", "message","fkemployeeID" };
	}
	
	public static String[] ShipmentMethod() {
		return new String[]{"shipmentPrice", "shipmentMultiplier","shipmentType" };
	}
	
	public static String[] Orders() {
		return new String[]{"order_time", "amount_bought","final_price","address","supplied","timeSupplied"};
	}
	
	public static String[] HomeFuelOrder() {
		return new String[]{"dutime", "fkcustomerID","fkshipmentType","fkorders_ID","fk_product_Name"};
	}
	
	public static String[] PurchasingProgramType() {
		return new String[]{"purchasing_program_Name","description", "monthly_price"};
	}
	
	public static String[] FuelCompany() {
		return new String[]{"fuel_Company_Name","fkemployeeID"};
	}
	
	public static String[] PurchasingProgram() {
		return new String[]{"fkcustomerID","fkpurchasingProgramType", "fkfuel_Company_Name"};
	}
	
	public static String[] CustomerBoughtFromCompany() {
		return new String[]{"fkcustomerID","fkfuel_Company_Name", "amountBoughtFromCompany","amountPaidCompany","dateOfPurchase"};
	}
	
	public static String[] PeriodicCustomersReport() {
		return new String[]{"date_from","date_to"};
	}

}
