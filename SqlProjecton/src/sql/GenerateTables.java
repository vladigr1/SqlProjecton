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
		// add them here
		
		//elro additions
		generateProduct(con);
		generateProductInSalePattern(con);
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
		System.out.println("*Generated a " + tableName + " table");

	}

	public void generateUser(Connection con) {
		String tableName = "user";
		String values =
				"( " 
				+ "username varchar(32) NOT NULL ,"
				+ " password varchar(32) NOT NULL ," 
				+ " connected varchar(1) NOT NULL ,"
				+ " firstName varchar(32) NOT NULL ," 
				+ " surname varchar(32) NOT NULL ,"
				+ "email varchar(32) NOT NULL ," 
				+ "PRIMARY KEY (username) )";	
		generateTable(con,tableName,values);			
	}

	public void generateEmployee(Connection con) {
		String tableName = "employee";
		String values =
				"( " + "employeeID int NOT NULL AUTO_INCREMENT ,"
				+ " role varchar(32) NOT NULL , " 
				+ " affiliation varchar(32) NOT NULL , "
				+ " fkUsername varchar(32) NOT NULL , " 
				+ " PRIMARY KEY (employeeID) ,"
				+ "KEY employee_ibfk_1 (fkUsername), " 
				+ " CONSTRAINT employee_ibfk_1 FOREIGN KEY (fkUsername) "
				+ "REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )";	
		generateTable(con,tableName,values);	
	}

	public void generateCustomer(Connection con) {	
		String tableName = "customer";
		String values =
				"( " + "customerID varchar(32) NOT NULL ,"
				+ " creditCard varchar(32) NOT NULL ," 
				+ " fkUsername varchar(32) NOT NULL ,"
				+ " PRIMARY KEY (customerID) ,"
				+ " KEY customer_ibfk_1 (fkUsername) ,"
				+ " CONSTRAINT customer_ibfk_1 FOREIGN KEY (fkUsername) "
				+ " REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )";	
		generateTable(con,tableName,values);	
	}
	
	public void generateSalePattern(Connection con) {	
		String tableName = "sales_pattern";
		String values =
				"( " + "salesPatternID INT NOT NULL AUTO_INCREMENT ,"
				+ " startTime varchar(32) NOT NULL ," 
				+ " endTime varchar(32) NOT NULL ,"
				+ " PRIMARY KEY (salesPatternID) )";
		generateTable(con,tableName,values);	
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
				+ " fastFuelTime varchar(32) NOT NULL ," 
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
				+ " PRIMARY KEY (productInStationID) ,"
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
				"( " + "repQuarter INT NOT NULL AUTO_INCREMENT ,"
				+ " repYear varchar(32) NOT NULL , " 
				+ " fromDate varchar(32) NOT NULL , " 
				+ " toDate varchar(32) NOT NULL , "
				+ " FK_fuelStationID INT NOT NULL , " 
				+ " PRIMARY KEY (repQuarter) ,"
				+ " KEY quarterly_report_ibfk_1 (FK_fuelStationID),"
				+ " CONSTRAINT quarterly_report_ibfk_1 FOREIGN KEY (FK_fuelStationID) "
				+ " REFERENCES fuel_station (fuelStationID) ON DELETE CASCADE ON UPDATE CASCADE)";	
		generateTable(con,tableName,values);	
	}
	
	public void generateIncomeReport(Connection con) {
		String tableName = "income_report";
		String values =
				"( " + "FK_repQuarter INT NOT NULL,"
				+ " totalIncome DOUBLE(32,2) NOT NULL , " 		
				+ " PRIMARY KEY (FK_repQuarter) ,"
				+ " KEY income_report_ibfk_1 (FK_repQuarter),"
				+ " CONSTRAINT income_report_ibfk_1 FOREIGN KEY (FK_repQuarter) "
				+ " REFERENCES quarterly_report (repQuarter) ON DELETE CASCADE ON UPDATE CASCADE)";	
		generateTable(con,tableName,values);	
	}
	
	

	
	public void generateProductInIncomeReport(Connection con) {
		String tableName = "product_in_income_report";
		String values =
				"( " + "FK_productInStationID INT NOT NULL ,"
				+ "FK_repQuarter_IncomeReport INT NOT NULL,"
				+ "income DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_productInStationID, FK_repQuarter_IncomeReport),"	
				
				+ " KEY product_in_income_report_ibfk_1 (FK_productInStationID),"//first FK
				+ " CONSTRAINT product_in_income_report_ibfk_1 FOREIGN KEY (FK_productInStationID) "
				+ " REFERENCES product_in_station (productInStationID) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY product_in_income_report_ibfk_2 (FK_repQuarter_IncomeReport) ,"//second FK
				+ " CONSTRAINT product_in_income_report_ibfk_2 FOREIGN KEY (FK_repQuarter_IncomeReport) "
				+ " REFERENCES income_report (FK_repQuarter) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	
	
	public void generateOutcomeReport(Connection con) {
		String tableName = "outcome_report";
		String values =
				"( " + "FK_repQuarter INT NOT NULL,"
				+ " totalOutcome DOUBLE(32,2) NOT NULL , " 		
				+ " PRIMARY KEY (FK_repQuarter) ,"
				+ " KEY outcome_report_ibfk_1 (FK_repQuarter),"
				+ " CONSTRAINT outcome_report_ibfk_1 FOREIGN KEY (FK_repQuarter) "
				+ " REFERENCES quarterly_report (repQuarter) ON DELETE CASCADE ON UPDATE CASCADE)";	
		generateTable(con,tableName,values);	
	}
	
	
	public void generateProductInOutcomeReport(Connection con) { //----------------------**************--------------------------------------------------
		String tableName = "product_in_outcome_report";
		String values =
				"( " + "FK_productInStationID INT NOT NULL ,"
				+ "FK_repQuarter_OutcomeReport INT NOT NULL,"
				+ "outcome DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_productInStationID, FK_repQuarter_OutcomeReport),"	
				
				+ " KEY product_in_outcome_report_ibfk_1 (FK_productInStationID),"//first FK
				+ " CONSTRAINT product_in_outcome_report_ibfk_1 FOREIGN KEY (FK_productInStationID) "
				+ " REFERENCES product_in_station (productInStationID) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY product_in_outcome_report_ibfk_2 (FK_repQuarter_OutcomeReport) ,"//second FK
				+ " CONSTRAINT product_in_outcome_report_ibfk_2 FOREIGN KEY (FK_repQuarter_OutcomeReport) "
				+ " REFERENCES outcome_report (FK_repQuarter) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
	
	public void generateInventroyReport(Connection con) {
		String tableName = "inventory_report";
		String values =
				"( " + "FK_repQuarter INT NOT NULL,"	
				+ " PRIMARY KEY (FK_repQuarter) ,"
				+ " KEY inventory_report_report_ibfk_1 (FK_repQuarter),"
				+ " CONSTRAINT inventory_report_report_ibfk_1 FOREIGN KEY (FK_repQuarter) "
				+ " REFERENCES quarterly_report (repQuarter) ON DELETE CASCADE ON UPDATE CASCADE)";	
		generateTable(con,tableName,values);	
	}
	
	
	public void generateProductInInventroyReport(Connection con) {
		String tableName = "product_in_inventory_report";
		String values =
				"( " + "FK_productInStationID INT NOT NULL ,"
				+ "FK_repQuarter_inventoryReport INT NOT NULL,"
				+ "amountSold DOUBLE(32,2) NOT NULL,"
				+ " PRIMARY KEY (FK_productInStationID, FK_repQuarter_inventoryReport),"	
				
				+ " KEY product_in_inventory_report_ibfk_1 (FK_productInStationID),"//first FK
				+ " CONSTRAINT product_in_inventory_report_ibfk_1 FOREIGN KEY (FK_productInStationID) "
				+ " REFERENCES product_in_station (productInStationID) ON DELETE CASCADE ON UPDATE CASCADE,"
				
				+ " KEY product_in_inventory_report_ibfk_2 (FK_repQuarter_inventoryReport) ,"//second FK
				+ " CONSTRAINT product_in_inventory_report_ibfk_2 FOREIGN KEY (FK_repQuarter_inventoryReport) "
				+ " REFERENCES inventory_report (FK_repQuarter) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con,tableName,values);	
	}
		
}
