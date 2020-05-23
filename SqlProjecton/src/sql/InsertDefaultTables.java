package sql;

import java.sql.Connection;
import java.util.Date;

import enums.Affiliation;
import enums.ProductName;

public class InsertDefaultTables {

	public InsertDefaultTables(Connection con) {

		insertDefaultUser(con);
		insertDefaultEmployee(con);
		insertDefaultCustomer(con);
		insertDefaultSalesPattern(con);
		insertDefaultSale(con); ///////
		insertDefaultFuelStationManager(con);
		// add here

		// elro additions
		insertDefaultProduct(con);
		insertDefaultProductInSalePattern(con);

		insertDefaultProductRatesUpdateRequest(con);
		insertDefaultProductInRequest(con);
		insertDefaultFuelStation(con);
		insertDefaultFastFuel(con);
		insertDefaultProductInStation(con);

		insertDefaultQuarterlyReport(con);
		insertDefaultIncomeReport(con);
		insertDefaultProductInIncomeReport(con);

		insertDefaultOutcomeReport(con);
		insertDefaultProductInOutcomeReport(con);

		insertDefaultInventroyReport(con);
		insertDefaultProductInInventroyReport(con);
		insertDefaultCustomerboughtInSale(con);
		insertDefaultSaleCommentsReport(con);////////
		insertDefaultFuelStationOrder(con);/////////

		// Vlad additions


	}

	// only add insert default method and after waards add the to
	// InsertDefaultTables

	public void insertDefaultUser(Connection con) {
		String userName = "user";
		Object[] values = { userName, "r", false, "firstName", "surname", "email" };
		InsertTables.insertUser(con, values);
	}

	public void insertDefaultEmployee(Connection con) {
		String userName = "eUserName";
		Object[] values = { userName, "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "MarketingRepresentative", Affiliation.Marketing.toString(), userName };
		InsertTables.insertEmployee(con, values2);
	}

	public void insertDefaultCustomer(Connection con) {
		String userName = "elro";
		String customerID = "2555555";
		Object[] values = { userName, "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { customerID, userName, "1111-2222-3333-4444" };
		InsertTables.insertCustomer(con, values2);
	}

	public void insertDefaultSalesPattern(Connection con) {
		Object[] values = { new Date(120, 11, 3), new Date(120, 5, 3) };
		InsertTables.insertSalesPattern(con, values);
		Object[] values2 = { new Date(120, 3, 1), new Date(123, 5, 4) };
		InsertTables.insertSalesPattern(con, values2);
		Object[] values3 = { new Date(120, 5, 5), new Date(123, 6, 6) };
		InsertTables.insertSalesPattern(con, values3);

	}
	
	public void insertDefaultSale(Connection con) {
		Object[] values = { new Date(120, 11, 3), new Date(120, 5, 3) };
		int generateKey=InsertTables.insertSalesPattern(con, values);
		Object[] values2 = { generateKey,false };
		InsertTables.insertSale(con, values2);

	}
	
	

	public void insertDefaultFuelStationManager(Connection con) {
		String userName = "fsmUserName";
		Object[] values = { userName, "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "role", Affiliation.FuelStation.toString(), userName };
		int fkemployeeID = InsertTables.insertEmployee(con, values2);
		Object[] values3 = { "0000", fkemployeeID };
		InsertTables.insertFuelStationManager(con, values3);

	}

	public void insertDefaultProduct(Connection con) {
		Object[] values = { ProductName.DIESEL.toString(), 212.3456, 3.14159265 };
		InsertTables.insertProduct(con, values);
		Object[] values2 = { ProductName.GASOLINE.toString(), 15.5, 10.25 };
		InsertTables.insertProduct(con, values2);

	}

	public void insertDefaultProductInSalePattern(Connection con) { // extends product
		Object[] values3 = { new Date(121, 2, 3), new Date(123, 2, 2) };
		int generatedKey = InsertTables.insertSalesPattern(con, values3);
		Object[] values2 = { ProductName.DIESEL.toString(), generatedKey, 0.5 };
		InsertTables.insertProductInSalePattern(con, values2);

	}

	public void insertDefaultProductRatesUpdateRequest(Connection con) {
		Object[] values = { false, false };
		InsertTables.insertProductRatesUpdateRequest(con, values);

	}

	public void insertDefaultProductInRequest(Connection con) {
		Object[] values = { false, false };
		int generatedKey = InsertTables.insertProductRatesUpdateRequest(con, values);
		Object[] values2 = { ProductName.DIESEL.toString(), generatedKey, 15.2, 100 };
		InsertTables.insertProductInRequest(con, values2);

	}

	public void insertDefaultFuelStation(Connection con) {

		String userName = "Manager333";
		Object[] values = { userName, "22", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "FuelStationManager", Affiliation.FuelStation.toString(), userName };
		int fkemployeeID = InsertTables.insertEmployee(con, values2);
		Object[] values3 = { "111111", fkemployeeID };
		int generatedKey = InsertTables.insertFuelStationManager(con, values3);
		Object[] values4 = { "Gazim", "Road 6", generatedKey };
		InsertTables.insertFuelStation(con, values4);

	}

	public void insertDefaultFastFuel(Connection con) {

		String userName = "ManagerHappy";
		Object[] values = { userName, "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "FuelStationManager", Affiliation.FuelStation.toString(), userName };
		int fkemployeeID = InsertTables.insertEmployee(con, values2);
		Object[] values3 = { "22233322", fkemployeeID };
		int generatedKey = InsertTables.insertFuelStationManager(con, values3);
		Object[] values4 = { "Paz", "Road 62", generatedKey };
		int generatedKey2 = InsertTables.insertFuelStation(con, values4);

		Object[] values5 = { ProductName.DIESEL.toString(), generatedKey2, new Date(119, 3, 3), 30, 200.19 };
		InsertTables.insertFastFuel(con, values5);

	}

	public void insertDefaultProductInStation(Connection con) {

		Object[] values = { ProductName.MOTORBIKEFUEL.toString(), 230.5, 2.2727 };
		InsertTables.insertProduct(con, values);

		String userName = "ManagerSad";
		Object[] valuess = { userName, "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, valuess);

		Object[] values2 = { "FuelStationManager", Affiliation.FuelStation.toString(), userName };
		int fkemployeeID = InsertTables.insertEmployee(con, values2);
		Object[] values3 = { "2443322", fkemployeeID };
		int generatedKey = InsertTables.insertFuelStationManager(con, values3);
		Object[] values4 = { "PazSad", "Road 62", generatedKey };
		int generatedKey2 = InsertTables.insertFuelStation(con, values4);

		Object[] values5 = { ProductName.MOTORBIKEFUEL.toString(), generatedKey2, 25, 10, 6.99 };
		InsertTables.insertProductInStation(con, values5);

	}

	public void insertDefaultQuarterlyReport(Connection con) {

		int fuelstationID = 1;
		Object[] values = { "2019", "2/2", "2/3", fuelstationID };
		InsertTables.insertQuarterlyReport(con, values);

	}

	public void insertDefaultIncomeReport(Connection con) {
		int fuelstationID = 1;
		Object[] values = { "2020", "5/5", "5/6", fuelstationID }; 
		int generatedKey = InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { generatedKey, 20.5 };
		InsertTables.insertIncomeReport(con, values2);

	}

	public void insertDefaultProductInIncomeReport(Connection con) {
		int fuelstationID = 1;
		Object[] values = { "2020", "3/2", "5/6", fuelstationID }; 
		int generatedKeyReport = InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { generatedKeyReport, 20.5 };
		InsertTables.insertIncomeReport(con, values2);

		int productInStation = 1; // already created such product in station
		Object[] values3 = { productInStation, generatedKeyReport, 100.82 };
		InsertTables.insertProductInIncomeReport(con, values3);
	}

	public void insertDefaultOutcomeReport(Connection con) {
		int fuelstationID = 1;
		Object[] values = { "2020", "5/5", "5/6", fuelstationID };
		int generatedKey = InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { generatedKey, 10.2 };
		InsertTables.insertOutcomeReport(con, values2);
	}

	public void insertDefaultProductInOutcomeReport(Connection con) {
		int fuelstationID = 1;
		Object[] values = { "2018", "2/3", "4/2", fuelstationID }; 
		int generatedKeyReport = InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { generatedKeyReport, 20.5 };
		InsertTables.insertOutcomeReport(con, values2);

		int productInStation = 1;
		Object[] values3 = { productInStation, generatedKeyReport, 54.65 };
		InsertTables.insertProductInOutcomeReport(con, values3);
	}

	public void insertDefaultInventroyReport(Connection con) {
		int fuelstationID = 1;
		Object[] values = { "2020", "5/5", "5/6", fuelstationID };
		int generatedKey = InsertTables.insertQuarterlyReport(con, values);
		Object[] values2 = { generatedKey };
		InsertTables.insertInventroyReport(con, values2);
	}

	public void insertDefaultProductInInventroyReport(Connection con) {
		int fuelstationID = 1;
		Object[] values = { "2020", "1/1", "2/2", fuelstationID }; 
		int generatedKeyReport = InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { generatedKeyReport };
		InsertTables.insertInventroyReport(con, values2);

		int productInStation = 1;

		Object[] values3 = { productInStation, generatedKeyReport, 25 };
		InsertTables.insertProductInInventroyReport(con, values3);
	}
		
	public void insertDefaultCustomerboughtInSale(Connection con) {
		String userName = "elro771";
		String customerID = "2557771";
		Object[] values = { userName, "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { customerID, userName, "1321-2222-3333-4444" };
		InsertTables.insertCustomer(con, values2);
		
		
		Object[] values3 = { new Date(120, 11, 3), new Date(120, 5, 3) };
		int generateKey=InsertTables.insertSalesPattern(con, values3);
		Object[] values4 = { generateKey,false };
		int generateKeySale=InsertTables.insertSale(con, values4);
		
		Object[] values5 = { generateKeySale,customerID,250.54 };
		InsertTables.insertCustomerboughtInSale(con, values5);
			
	}
	
	public void insertDefaultSaleCommentsReport(Connection con) {
	
		Object[] values3 = { new Date(120, 11, 3), new Date(120, 5, 3) };
		int generateKey=InsertTables.insertSalesPattern(con, values3);
		Object[] values4 = { generateKey,false };
		int generateKeySale=InsertTables.insertSale(con, values4);
		
		Object[] values5 = { generateKeySale,15,250.54 };
		InsertTables.insertSaleCommentsReport(con, values5);
			
	}
		
	public void insertDefaultFuelStationOrder(Connection con) {
		int orderID=1;
		int productInStationID=1;
		
		Object[] values = { orderID,productInStationID,false,false,false,  new Date(118, 11, 3)};
		InsertTables.insertFuelStationOrder(con, values);
			
	}
	
	
	
	
}
