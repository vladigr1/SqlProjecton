package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenerateTables { // creating the tables if they are not exists

	public GenerateTables(Connection con) {

		generateUser(con);
		generateEmployee(con);
		generateCustomer(con);
		generateSalePattern(con);

		generateFuelStationManager(con);
		// add them here
		
		//elro additions
		generateProduct(con);
		generateProductInSalePattern(con);
		generateSale(con);//////
		generateProductRatesUpdateRequest(con);
		generateProductInRequest(con);
		generateFuelStation(con);
		generateFastFuel(con);
		generateProductInStation(con);
		
		generateQuarterlyReport(con);
		generateIncomeReport(con);
		generateProductInIncomeReport(con);
		
		
		generateOutcomeReport(con);
		generateProductInOutcomeReport(con);
		
		generateInventroyReport(con);
		generateProductInInventroyReport(con);
		
		generateCustomerboughtInSale(con);
		generateSaleCommentsReport(con);
		
		generateCar(con);/////
		generateRankingSheet(con);//////
		generatePricingModelType(con);/////
		generatePricingModel(con);////
		generateFullSingleMemberMonthly(con);////
		
		
		//vlad tables
		generateNotification(con);
		generateShipmentMethod(con);
		generateOrders(con);
		generateFuelStationOrder(con);//////
		generatePurchasingProgramType(con);
		generateFuelCompany(con);
		generateHomeFuelOrder(con);
		generatePurchasingProgram(con);
		generateCustomerBoughtFromCompany(con);
		generatePeriodicCustomersReport(con);
		System.out.println("finished generating tables");
		
		
	}

	// create a default function from generators
	public static void generateTable(Connection con, String tableName, String values) {
		PreparedStatement pst;
		String table = "CREATE TABLE if not exists " + tableName + values
				+ "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ";
		try {
			pst = con.prepareStatement(table);
			pst.execute();
		} catch (SQLException ex) {/* handle any errors */
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
//		System.out.println("*Generated a " + tableName + " table");

	}
	
	//elroye add
	//add inserts here elro
	
	
	public void generateFullSingleMemberMonthly(Connection con) {
		String tableName = "full_single_member_monthly";
		String values = "( " + "FK_registrationPlate varchar(32) NOT NULL,"	
				+ "FK_customerID varchar(32) NOT NULL,"
				+ "lastMonthUtillization DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_registrationPlate, FK_customerID),"	
				+ " KEY full_single_member_monthly_ibfk_1 (FK_registrationPlate),"//first FK
				+ " CONSTRAINT full_single_member_monthly_ibfk_1 FOREIGN KEY (FK_registrationPlate) "
				+ " REFERENCES car (registrationPlate) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY full_single_member_monthly_ibfk_2 (FK_customerID),"//second FK
				+ " CONSTRAINT full_single_member_monthly_ibfk_2 FOREIGN KEY (FK_customerID) "
				+ " REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE)";
			
		generateTable(con, tableName, values);
	}
	
	public void generatePricingModel(Connection con) {  // continue here
		String tableName = "pricing_model";
		String values =
				"( " + "FK_pricingModelName varchar(32) NOT NULL ,"
				+ "FK_registrationPlate varchar(32) NOT NULL,"
				+ "FK_customerID varchar(32) NOT NULL,"
				+ "currentDiscount DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_registrationPlate, FK_customerID),"	
				
				+ " KEY pricing_model_ibfk_1 (FK_registrationPlate),"//first FK
				+ " CONSTRAINT pricing_model_ibfk_1 FOREIGN KEY (FK_registrationPlate) "
				+ " REFERENCES car (registrationPlate) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY pricing_model_ibfk_2 (FK_customerID),"//second FK
				+ " CONSTRAINT pricing_model_ibfk_2 FOREIGN KEY (FK_customerID) "
				+ " REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE,"

				
				+ " KEY product_in_income_report_ibfk_3 (FK_pricingModelName) ,"//third FK
				+ " CONSTRAINT product_in_income_report_ibfk_3 FOREIGN KEY (FK_pricingModelName) "
				+ " REFERENCES pricing_model_type (pricingModelName) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	
	public void generatePricingModelType(Connection con) {
		String tableName = "pricing_model_type";
		String values = "( " + "pricingModelName varchar(32) NOT NULL,"
		        + " description varchar(32) NOT NULL ,"
		        + " defaultDiscount DOUBLE(32,2) NOT NULL ,"
				+ "PRIMARY KEY (pricingModelName) )";	
		generateTable(con, tableName, values);
	}
	
	
	public void generateRankingSheet(Connection con) {
		String tableName = "ranking_sheet";
		String values = "( " + "rankingSheetID int NOT NULL AUTO_INCREMENT ,"
		        + " customerTypeRank DOUBLE(32,2) NOT NULL ,"
		        + " fuelingHoursRank DOUBLE(32,2) NOT NULL ,"
				+ " fuelTypesRank DOUBLE(32,2) NOT NULL ,"
				+ " FK_customerID varchar(32) NOT NULL ,"
				+ "PRIMARY KEY (rankingSheetID) ,"
				+ "KEY ranking_sheet_ibfk_1 (FK_customerID), "
				+ " CONSTRAINT ranking_sheet_ibfk_1 FOREIGN KEY (FK_customerID) "
				+ "REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	
	
	public void generateCar(Connection con) {
		String tableName = "car";
		String values = "( " + "registrationPlate varchar(32) NOT NULL ,"
		        + " ownerName varchar(32) NOT NULL ,"
		        + " FK_productName varchar(32) NOT NULL ,"
				+ " FK_customerID varchar(32) NOT NULL ,"
				+ "PRIMARY KEY (registrationPlate) ,"
		        + "KEY car_ibfk_1 (FK_productName), "
				+ " CONSTRAINT car_ibfk_1 FOREIGN KEY (FK_productName) "
				+ "REFERENCES product (productName) ON DELETE CASCADE ON UPDATE CASCADE ,"
				+ "KEY car_ibfk_2 (FK_customerID), "
				+ " CONSTRAINT car_ibfk_2 FOREIGN KEY (FK_customerID) "
				+ "REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	
	
	
	///

	public void generateUser(Connection con) {
		String tableName = "user";
		String values = "( " + "username varchar(32) NOT NULL ,"
		        + " password varchar(32) NOT NULL ,"
				+ " connected varchar(1) NOT NULL ," 
		        + " firstName varchar(32) NOT NULL ,"
				+ " surname varchar(32) NOT NULL ,"
		        + "email varchar(32) NOT NULL ," + "PRIMARY KEY (username) )";
		generateTable(con, tableName, values);
	}

	public void generateEmployee(Connection con) {
		String tableName = "employee";
		String values = "( " + "employeeID int NOT NULL AUTO_INCREMENT ," 
		        + " role varchar(32) NOT NULL , "
				+ " affiliation varchar(32) NOT NULL , " 
		        + " fkUsername varchar(32) NOT NULL , "
				+ " PRIMARY KEY (employeeID) ," 
		        + "KEY employee_ibfk_1 (fkUsername), "
				+ " CONSTRAINT employee_ibfk_1 FOREIGN KEY (fkUsername) "
				+ "REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}

	public void generateCustomer(Connection con) {
		String tableName = "customer";
		String values = "( " + "customerID varchar(32) NOT NULL ,"
				+ " creditCard varchar(32) NOT NULL ,"
				+ " fkUsername varchar(32) NOT NULL ," 
				+ " PRIMARY KEY (customerID) ,"
				+ " KEY customer_ibfk_1 (fkUsername) ," 
				+ " CONSTRAINT customer_ibfk_1 FOREIGN KEY (fkUsername) "
				+ " REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	public void generateSalePattern(Connection con) {	
		String tableName = "sales_pattern";
		String values = "( " + "salesPatternID INT NOT NULL AUTO_INCREMENT ," 
				+ " startTime TIMESTAMP NOT NULL ,"
				+ " endTime TIMESTAMP NOT NULL ," 
				+ " PRIMARY KEY (salesPatternID) )";
		generateTable(con, tableName, values);
	}
	
	public void generateSale(Connection con) {	
		String tableName = "sale";
		String values = "( " + "saleID INT NOT NULL AUTO_INCREMENT ," 
				+ " fk_salesPatternID int NOT NULL ," 	
				+ " active varchar(1)  NOT NULL ," 
				+ " PRIMARY KEY (saleID) ,"
				+ " KEY sale_ibfk_1 (fk_salesPatternID) ,"
				+ " CONSTRAINT sale_ibfk_1 FOREIGN KEY (fk_salesPatternID) "
				+ " REFERENCES sales_pattern (salesPatternID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}

	public void generateFuelStationManager(Connection con) {
		String tableName = "fuelStationManager";
		String values = "( " 
				+ " FSmanagerID int NOT NULL AUTO_INCREMENT ," 
				+ " phoneNo varchar(32) NOT NULL ,"
				+ " fkemployeeID int NOT NULL ," 
				+ " PRIMARY KEY (FSmanagerID) ,"
				+ " KEY fuelStationManager_ibfk_1 (fkemployeeID) ,"
				+ " CONSTRAINT fuelStationManager_ibfk_1 FOREIGN KEY (fkemployeeID) "
				+ " REFERENCES employee (employeeID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	public void generateProduct(Connection con) {	
		String tableName = "product";
		String values =
				"( " + "productName varchar(32) NOT NULL ,"
				+ " maxPrice DOUBLE(32,2) NOT NULL ," 
				+ " currentPrice DOUBLE(32,2) NOT NULL ,"
				+ " PRIMARY KEY (productName) )";	
		generateTable(con,tableName,values);	
	}
	
	public void generateProductInSalePattern(Connection con) {	
		String tableName = "product_in_sale_pattern";
		String values =
				"( " + "FK_productName varchar(32) NOT NULL ,"
				+ "FK_salesPatternID INT NOT NULL,"		
				+ " salesDiscount DOUBLE(32,2) NOT NULL ," 
				+ " PRIMARY KEY (FK_productName,FK_salesPatternID),"	
				+ " KEY product_in_sale_pattern_ibfk_1 (FK_productName),"
				+ " CONSTRAINT product_in_sale_pattern_ibfk_1 FOREIGN KEY (FK_productName) "
				+ " REFERENCES product (productName) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ " KEY product_in_sale_pattern_ibfk_2 (FK_salesPatternID) ,"
				+ " CONSTRAINT product_in_sale_pattern_ibfk_2 FOREIGN KEY (FK_salesPatternID) "
				+ " REFERENCES sales_pattern (salesPatternID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	
	public void generateProductRatesUpdateRequest(Connection con) {	
		String tableName = "product_rates_update_request";
		String values =
				"( " + "updateRateRequestID INT NOT NULL AUTO_INCREMENT ,"
				+ " assessed varchar(1) NOT NULL ," 
				+ " approved varchar(1) NOT NULL ,"
				+ " PRIMARY KEY (updateRateRequestID) )";
		generateTable(con,tableName,values);		
	}
	
	public void generateProductInRequest(Connection con) {	
		String tableName = "product_in_request";
		String values =
				"( " + "FK_productName varchar(32) NOT NULL ,"
				+ "FK_updateRateRequestID INT NOT NULL,"		
				+ " currentRate DOUBLE(32,2) NOT NULL ," 
				+ " requestedRate DOUBLE(32,2) NOT NULL ," 
				+ " PRIMARY KEY (FK_productName,FK_updateRateRequestID),"	
				+ " KEY product_in_request_ibfk_1 (FK_productName),"
				+ " CONSTRAINT product_in_request_ibfk_1 FOREIGN KEY (FK_productName) "
				+ " REFERENCES product (productName) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ " KEY product_in_request_ibfk_2 (FK_updateRateRequestID) ,"
				+ " CONSTRAINT product_in_request_ibfk_2 FOREIGN KEY (FK_updateRateRequestID) "
				+ " REFERENCES product_rates_update_request (updateRateRequestID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);		
	}
	
	
	
	public void generateFuelStation(Connection con) {	
		String tableName = "fuel_station";
		String values =
				"( " + "fuelStationID INT NOT NULL AUTO_INCREMENT ,"		
				+ " stationName varchar(32) NOT NULL ," 
				+ " address varchar(32) NOT NULL ," 
//				+ " FK_fuelCompanyName varchar(32) NOT NULL ," 
				+ " FK_employeeID_manager INT NOT NULL ," 
				+ " PRIMARY KEY (fuelStationID),"	
//				+ " KEY fuel_station_ibfk_1 (FK_fuelCompanyName),"  //change after having company name
//				+ " CONSTRAINT fuel_station_ibfk_1 FOREIGN KEY (FK_fuelCompanyName) "
//				+ " REFERENCES fuel_company (fuelCompanyName) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ " KEY fuel_station_ibfk_2 (FK_employeeID_manager) ,"
				+ " CONSTRAINT fuel_station_ibfk_2 FOREIGN KEY (FK_employeeID_manager) "
				+ " REFERENCES employee (employeeID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);		
	}
	
		
	public void generateFastFuel(Connection con) {	
		String tableName = "fast_fuel";
		String values =
				"( " + "fastFuelID INT NOT NULL AUTO_INCREMENT ,"		
				+ " fastFuelTime TIMESTAMP NOT NULL ," 
				+ " amountBought DOUBLE(32,2) NOT NULL ," 
				+ " finalPrice DOUBLE(32,2) NOT NULL ," 
				+ "FK_productName varchar(32) NOT NULL ," 
				+ "FK_fuelStationID INT NOT NULL,"
				+ " PRIMARY KEY (fastFuelID),"	
				+ " KEY fast_fuel_ibfk_1 (FK_productName),"
				+ " CONSTRAINT fast_fuel_ibfk_1 FOREIGN KEY (FK_productName) "
				+ " REFERENCES product (productName) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ " KEY fast_fuel_ibfk_2 (FK_fuelStationID) ,"
				+ " CONSTRAINT fast_fuel_ibfk_2 FOREIGN KEY (FK_fuelStationID) "
				+ " REFERENCES fuel_station (fuelStationID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);		
	}
	
	public void generateProductInStation(Connection con) {
		String tableName = "product_in_station";
		String values =
				"( " + "productInStationID INT NOT NULL AUTO_INCREMENT ,"
				+ " capacity INT NOT NULL , " 
				+ " threshold INT NOT NULL , " 
				+ " supplierPrice DOUBLE(32,2) NOT NULL , "
				+ " FK_productName varchar(32) NOT NULL , " 
				+ " FK_fuelStationID INT NOT NULL , " 
				+ " PRIMARY KEY (productInStationID) ,"  //duplicate with id and product name
				+ " KEY product_in_station_ibfk_1 (FK_productName),"
				+ " CONSTRAINT product_in_station_ibfk_1 FOREIGN KEY (FK_productName) "
				+ " REFERENCES product (productName) ON DELETE CASCADE ON UPDATE CASCADE,"
				+ " KEY product_in_station_ibfk_2 (FK_fuelStationID),"
				+ " CONSTRAINT product_in_station_ibfk_2 FOREIGN KEY (FK_fuelStationID) "
				+ " REFERENCES fuel_station (fuelStationID) ON DELETE CASCADE ON UPDATE CASCADE)";	
		generateTable(con,tableName,values);	
	}
	
	
	public void generateQuarterlyReport(Connection con) {
		String tableName = "quarterly_report";
		String values =
				"( " + "repQuarter INT NOT NULL ," //change to year
				+ " repYear varchar(32) NOT NULL , " 
				+ " fromDate varchar(32) NOT NULL , " 
				+ " toDate varchar(32) NOT NULL , "
				+ " FK_fuelStationID INT NOT NULL , " 
				+ " PRIMARY KEY (repQuarter,repYear) ,"
				+ " KEY quarterly_report_ibfk_1 (FK_fuelStationID),"
				+ " CONSTRAINT quarterly_report_ibfk_1 FOREIGN KEY (FK_fuelStationID) "
				+ " REFERENCES fuel_station (fuelStationID) ON DELETE CASCADE ON UPDATE CASCADE)";	
		generateTable(con,tableName,values);	
	}
	
	public void generateIncomeReport(Connection con) {
		String tableName = "income_report";
		String values =
				"( " 
				+ "FK_repQuarter INT NOT NULL,"
				+ "FK_repYear varchar(32) NOT NULL ,"
				+ " totalIncome DOUBLE(32,2) NOT NULL , " 		
				+ " PRIMARY KEY (FK_repQuarter,FK_repYear) ,"
				+ " KEY income_report_ibfk_1 (FK_repQuarter,FK_repYear),"
				+ " CONSTRAINT income_report_ibfk_1 FOREIGN KEY (FK_repQuarter,FK_repYear) "
				+ " REFERENCES quarterly_report (repQuarter,repYear) ON DELETE CASCADE ON UPDATE CASCADE)";
				
//				+ " KEY income_report_ibfk_2 (FK_repYear),"
//				+ " CONSTRAINT income_report_ibfk_2 FOREIGN KEY (FK_repYear) "
//				+ " REFERENCES quarterly_report (repYear) ON DELETE CASCADE ON UPDATE CASCADE)";
		generateTable(con,tableName,values);	
	}
	
	

	
	public void generateProductInIncomeReport(Connection con) {
		String tableName = "product_in_income_report";
		String values =
				"( " + "FK_productInStationID INT NOT NULL ,"
				+ "FK_repQuarter_IncomeReport INT NOT NULL,"
				+ "FK_repYear_IncomeReport varchar(32) NOT NULL,"
				+ "income DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_productInStationID, FK_repQuarter_IncomeReport,FK_repYear_IncomeReport),"	
				
				+ " KEY product_in_income_report_ibfk_1 (FK_productInStationID),"//first FK
				+ " CONSTRAINT product_in_income_report_ibfk_1 FOREIGN KEY (FK_productInStationID) "
				+ " REFERENCES product_in_station (productInStationID) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY product_in_income_report_ibfk_2 (FK_repQuarter_IncomeReport,FK_repYear_IncomeReport) ,"//second FK
				+ " CONSTRAINT product_in_income_report_ibfk_2 FOREIGN KEY (FK_repQuarter_IncomeReport,FK_repYear_IncomeReport) "
				+ " REFERENCES income_report (FK_repQuarter,FK_repYear) ON DELETE CASCADE ON UPDATE CASCADE)";
		
//				+ " KEY product_in_income_report_ibfk_3 (FK_repYear_IncomeReport) ,"//third FK
//				+ " CONSTRAINT product_in_income_report_ibfk_3 FOREIGN KEY (FK_repYear_IncomeReport) "
//				+ " REFERENCES income_report (FK_repYear) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	
	
	public void generateOutcomeReport(Connection con) {
		String tableName = "outcome_report";
		String values =
				"( " + "FK_repQuarter INT NOT NULL,"
				+ "FK_repYear varchar(32) NOT NULL ,"
				+ " totalOutcome DOUBLE(32,2) NOT NULL , " 		
				+ " PRIMARY KEY (FK_repQuarter,FK_repYear) ,"
				+ " KEY outcome_report_ibfk_1 (FK_repQuarter,FK_repYear),"
				+ " CONSTRAINT outcome_report_ibfk_1 FOREIGN KEY (FK_repQuarter,FK_repYear) "
				+ " REFERENCES quarterly_report (repQuarter,repYear) ON DELETE CASCADE ON UPDATE CASCADE)";
		
//				+ " KEY outcome_report_ibfk_2 (FK_repYear),"
//				+ " CONSTRAINT outcome_report_ibfk_2 FOREIGN KEY (FK_repYear) "
//				+ " REFERENCES quarterly_report (repYear) ON DELETE CASCADE ON UPDATE CASCADE)";
		generateTable(con,tableName,values);		
	}
	
	
	public void generateProductInOutcomeReport(Connection con) { //----------------------**************--------------------------------------------------
		String tableName = "product_in_outcome_report";
		String values =
				"( " + "FK_productInStationID INT NOT NULL ,"
				+ "FK_repQuarter_OutcomeReport INT NOT NULL,"
				+ "FK_repYear_OutcomeReport varchar(32) NOT NULL,"
				+ "outcome DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_productInStationID, FK_repQuarter_OutcomeReport,FK_repYear_OutcomeReport),"	
				
				+ " KEY product_in_outcome_report_ibfk_1 (FK_productInStationID),"//first FK
				+ " CONSTRAINT product_in_outcome_report_ibfk_1 FOREIGN KEY (FK_productInStationID) "
				+ " REFERENCES product_in_station (productInStationID) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY product_in_outcome_report_ibfk_2 (FK_repQuarter_OutcomeReport,FK_repYear_OutcomeReport) ,"//second FK
				+ " CONSTRAINT product_in_outcome_report_ibfk_2 FOREIGN KEY (FK_repQuarter_OutcomeReport,FK_repYear_OutcomeReport) "
				+ " REFERENCES outcome_report (FK_repQuarter,FK_repYear) ON DELETE CASCADE ON UPDATE CASCADE )";
		
//				+ " KEY product_in_outcome_report_ibfk_3 (FK_repYear_OutcomeReport) ,"//third FK
//				+ " CONSTRAINT product_in_outcome_report_ibfk_3 FOREIGN KEY (FK_repYear_OutcomeReport) "
//				+ " REFERENCES outcome_report (FK_repYear) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	public void generateInventroyReport(Connection con) {
		String tableName = "inventory_report";
		String values =
				"( " + "FK_repQuarter INT NOT NULL,"	
					+ "FK_repYear varchar(32) NOT NULL ,"
					+ " PRIMARY KEY (FK_repQuarter,FK_repYear) ,"
					+ " KEY inventory_report_ibfk_1 (FK_repQuarter,FK_repYear),"
					+ " CONSTRAINT inventory_report_ibfk_1 FOREIGN KEY (FK_repQuarter,FK_repYear) "
					+ " REFERENCES quarterly_report (repQuarter,repYear) ON DELETE CASCADE ON UPDATE CASCADE)";
		
//					+ " KEY inventory_report_ibfk_2 (FK_repYear),"
//					+ " CONSTRAINT inventory_report_ibfk_2 FOREIGN KEY (FK_repYear) "
//					+ " REFERENCES quarterly_report (repYear) ON DELETE CASCADE ON UPDATE CASCADE)";	
		generateTable(con,tableName,values);	
	}
	
	
	public void generateProductInInventroyReport(Connection con) {
		String tableName = "product_in_inventory_report";
		String values =
				"( " + "FK_productInStationID INT NOT NULL ,"
				+ "FK_repQuarter_inventoryReport INT NOT NULL,"
				+ "FK_repYear_inventoryReport varchar(32) NOT NULL,"
				+ "amountSold DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_productInStationID, FK_repQuarter_inventoryReport,FK_repYear_inventoryReport),"	
				
				+ " KEY product_in_inventory_report_ibfk_1 (FK_productInStationID),"//first FK
				+ " CONSTRAINT product_in_inventory_report_ibfk_1 FOREIGN KEY (FK_productInStationID) "
				+ " REFERENCES product_in_station (productInStationID) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY product_in_inventory_report_ibfk_2 (FK_repQuarter_inventoryReport,FK_repYear_inventoryReport) ,"//second FK
				+ " CONSTRAINT product_in_inventory_report_ibfk_2 FOREIGN KEY (FK_repQuarter_inventoryReport,FK_repYear_inventoryReport) "
				+ " REFERENCES inventory_report (FK_repQuarter,FK_repYear) ON DELETE CASCADE ON UPDATE CASCADE )";
		
//		+ " KEY product_in_inventory_report_ibfk_2 (FK_repYear_inventoryReport) ,"//third FK
//		+ " CONSTRAINT product_in_inventory_report_ibfk_2 FOREIGN KEY (FK_repYear_inventoryReport) "
//		+ " REFERENCES inventory_report (FK_repYear) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	public void generateCustomerboughtInSale(Connection con) {
		String tableName = "customer_bought_in_sale";
		String values =
				"( " + "FK_saleID INT NOT NULL ,"
				+ "FK_customerID varchar(32) NOT NULL,"
				+ "amountPaid DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_saleID, FK_customerID),"	
				
				+ " KEY customer_bought_in_sale_ibfk_1 (FK_saleID),"//first FK
				+ " CONSTRAINT customer_bought_in_sale_ibfk_1 FOREIGN KEY (FK_saleID) "
				+ " REFERENCES sale (saleID) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY customer_bought_in_sale_ibfk_2 (FK_customerID) ,"//second FK
				+ " CONSTRAINT customer_bought_in_sale_ibfk_2 FOREIGN KEY (FK_customerID) "
				+ " REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	
	public void generateSaleCommentsReport(Connection con) {
		String tableName = "sale_comments_report";
		String values =
				"( " + "FK_saleID INT NOT NULL ,"
				+ "numberOfCustomersBought INT NOT NULL,"
				+ "sumOfPurchases DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_saleID),"	
				
				+ " KEY sale_comments_report_ibfk_1 (FK_saleID),"//first FK
				+ " CONSTRAINT sale_comments_report_ibfk_1 FOREIGN KEY (FK_saleID) "
				+ " REFERENCES sale (saleID) ON DELETE CASCADE ON UPDATE CASCADE)";
		generateTable(con,tableName,values);	
	}
	
	public void generateFuelStationOrder(Connection con) {
		String tableName = "fuel_station_order";
		String values =
				"( " + "fk_orders_ID INT NOT NULL ,"
				+ "FK_productInStationID INT NOT NULL ,"
				+ "assessed varchar(1) NOT NULL,"
				+ "approved varchar(1) NOT NULL,"
				+ "supplied varchar(1) NOT NULL,"
				+ "timeSupplied TIMESTAMP NOT NULL ,"
				+ " PRIMARY KEY (fk_orders_ID),"
				+ " KEY fuel_station_order_ibfk_1 (FK_productInStationID),"
				+ " CONSTRAINT fuel_station_order_ibfk_1 FOREIGN KEY (FK_productInStationID) "
				+ " REFERENCES product_in_station (productInStationID) ON DELETE CASCADE ON UPDATE CASCADE ,"
				+ " KEY fuel_station_order_ibfk_2 (fk_orders_ID),"
				+ " CONSTRAINT fuel_station_order_ibfk_2 FOREIGN KEY (fk_orders_ID) "
				+ " REFERENCES Orders (orders_ID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	public void generateNotification(Connection con) {
		String tableName = "notification";
		String values = "( " 
				+ " notificationID int NOT NULL AUTO_INCREMENT ," 
				+ " dismissed varchar(1) NOT NULL ,"
				+ " fkmanageID int NOT NULL ," 
				+ " PRIMARY KEY (notificationID) ,"
				+ " KEY notification_ibfk_1 (fkmanageID) ,"
				+ " CONSTRAINT notification_ibfk_1 FOREIGN KEY (fkmanageID) "
				+ " REFERENCES fuelStationManager (FSmanagerID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	public void generateShipmentMethod(Connection con) {
		String tableName = "ShipmentMethod";
		String values = "( " 
				+ " shipmentPrice float NOT NULL ," 
				+ " shipmentMultiplier float NOT NULL ,"
				+ " shipmentType varchar(32) NOT NULL ," 
				+ " PRIMARY KEY (shipmentType) )";
		generateTable(con, tableName, values);
	}
	
	public void generateOrders(Connection con) {
		String tableName = "Orders";
		String values = "( " 
				+ " orders_ID int NOT NULL AUTO_INCREMENT ," 
				+ " order_time TIMESTAMP NOT NULL ,"
				+ " amount_bought float NOT NULL ,"
				+ " final_price float NOT NULL ," 
				+ " address varchar(32) NOT NULL ," 
				+ " PRIMARY KEY (orders_ID) )";
		generateTable(con, tableName, values);
	}
	
	public void generateHomeFuelOrder(Connection con) {
		String tableName = "homeFuelOrder";
		String values = "( " 
				+ " homeFuelOrderID int NOT NULL AUTO_INCREMENT ," 
				+ " dutime TIMESTAMP NOT NULL ,"
				+ " fkcustomerID varchar(32) NOT NULL ,"
				+ " fkshipmentType varchar(32) NOT NULL ,"
				+ " fkorders_ID int NOT NULL ,"
				+ " fk_product_Name varchar(32) NOT NULL ,"
				+ " PRIMARY KEY (homeFuelOrderID) ,"
				+ " KEY homeFuelOrder_ibfk_1 (fkcustomerID) ,"
				+ " CONSTRAINT homeFuelOrder_ibfk_1 FOREIGN KEY (fkcustomerID) "
				+ " REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE ,"
				+ " KEY homeFuelOrder_ibfk_2 (fkshipmentType) ,"
				+ " CONSTRAINT homeFuelOrder_ibfk_2 FOREIGN KEY (fkshipmentType) "
				+ " REFERENCES ShipmentMethod (shipmentType) ON DELETE CASCADE ON UPDATE CASCADE ,"
				+ " KEY homeFuelOrder_ibfk_3 (fkorders_ID) ,"
				+ " CONSTRAINT homeFuelOrder_ibfk_3 FOREIGN KEY (fkorders_ID) "
				+ " REFERENCES Orders (orders_ID) ON DELETE CASCADE ON UPDATE CASCADE ,"
				+ " KEY homeFuelOrder_ibfk_4 (fk_product_Name) ,"
				+ " CONSTRAINT homeFuelOrder_ibfk_4 FOREIGN KEY (fk_product_Name) "
				+ " REFERENCES product (productName) ON DELETE CASCADE ON UPDATE CASCADE )";
			
		generateTable(con, tableName, values);
	}
	
	public void generatePurchasingProgramType(Connection con) {
		String tableName = "PurchasingProgramType";
		String values = "( " 
				+ " purchasing_program_Name varchar(32) NOT NULL ,"
				+ " description varchar(32) NOT NULL ," 
				+ " monthly_price float NOT NULL ,"
				+ " PRIMARY KEY (purchasing_program_Name) )";
		generateTable(con, tableName, values);
	}
	
	public void generateFuelCompany(Connection con) {
		String tableName = "FuelCompany";
		String values = "( " 
				+ " fuel_Company_Name varchar(32) NOT NULL ,"
				+ " fkemployeeID int NOT NULL ,"	//supplier
				+ " PRIMARY KEY (fuel_Company_Name) ,"
				+ " KEY FuelCompany_ibfk_1 (fkemployeeID) ,"
				+ " CONSTRAINT FuelCompany_ibfk_1 FOREIGN KEY (fkemployeeID) "
				+ " REFERENCES employee (employeeID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	public void generatePurchasingProgram(Connection con) {
		String tableName = "PurchasingProgram";
		String values = "( " 
				+ " fkcustomerID varchar(32) NOT NULL ,"
				+ " fkpurchasingProgramType varchar(32) NOT NULL ," 
				+ " fkfuel_Company_Name varchar(32) NOT NULL ,"
				+ " PRIMARY KEY (fkcustomerID) ,"
				//fk1
				+ " KEY PurchasingProgram_ibfk_1 (fkcustomerID,fkfuel_Company_Name) ,"
				+ " CONSTRAINT PurchasingProgram_ibfk_1 FOREIGN KEY (fkcustomerID) "
				+ " REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE ,"
				//fk2
				+ " KEY PurchasingProgram_ibfk_2 (fkpurchasingProgramType) ,"
				+ " CONSTRAINT PurchasingProgram_ibfk_2 FOREIGN KEY (fkpurchasingProgramType) "
				+ " REFERENCES PurchasingProgramType (purchasing_program_Name) ON DELETE CASCADE ON UPDATE CASCADE ,"
				//fk3
				+ " KEY PurchasingProgram_ibfk_3 (fkfuel_Company_Name) ,"
				+ " CONSTRAINT PurchasingProgram_ibfk_3 FOREIGN KEY (fkfuel_Company_Name) "
				+ " REFERENCES FuelCompany (fuel_Company_Name) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	public void generateCustomerBoughtFromCompany(Connection con) {
		String tableName = "CustomerBoughtFromCompany";
		String values = "( " 
				+ " fkcustomerID varchar(32) NOT NULL ,"
				+ " fkfuel_Company_Name varchar(32) NOT NULL ,"
				+ " amount_Bought_From_Company float NOT NULL ,"
				+ " amount_Paid_Company float NOT NULL ," 
				+ " PRIMARY KEY (fkcustomerID,fkfuel_Company_Name) ,"
				//fk1
				+ " KEY CustomerBoughtFromCompany_ibfk_1 (fkcustomerID) ,"
				+ " CONSTRAINT CustomerBoughtFromCompany_ibfk_1 FOREIGN KEY (fkcustomerID) "
				+ " REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE ,"
				//fk2
				+ " KEY CustomerBoughtFromCompany_ibfk_2 (fkfuel_Company_Name) ,"
				+ " CONSTRAINT CustomerBoughtFromCompany_ibfk_2 FOREIGN KEY (fkfuel_Company_Name) "
				+ " REFERENCES FuelCompany (fuel_Company_Name) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
	
	public void generatePeriodicCustomersReport(Connection con) {
		String tableName = "PeriodicCustomersReport";
		String values = "( " 
				+ " periodic_customer_report_id int NOT NULL  AUTO_INCREMENT ,"
				+ " date_from TIMESTAMP NOT NULL ,"
				+ " date_to TIMESTAMP NOT NULL ,"
				+ " PRIMARY KEY (periodic_customer_report_id) )";	
		generateTable(con, tableName, values);
	}
	
}
