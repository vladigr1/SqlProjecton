package sql;

import java.sql.Connection;

import enums.Affiliation;
import enums.ProductName;

public class InsertDefaultTables {

	public InsertDefaultTables(Connection con) {

		insertDefaultUser(con);
		insertDefaultEmployee(con);
		insertDefaultCustomer(con);
		insertDefaultSalesPattern(con);
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
		
		
		//Vlad additions
	    insertDefaultFuelStationManager(con);

	}

	// only add insert default method and after waards add the to
	// InsertDefaultTables

	public void insertDefaultUser(Connection con) {
		Object[] values = { "user", "r", false, "firstName", "surname", "email" };
		InsertTables.insertUser(con, values);
	}

	public void insertDefaultEmployee(Connection con) {
		Object[] values = { "eUserName", "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "FuelStationManager", Affiliation.Marketing.toString(), "eUserName" };
		InsertTables.insertEmployee(con, values2);
	}

	public void insertDefaultCustomer(Connection con) {
		Object[] values = { "elro", "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "2555555", "elro", "1111-2222-3333-4444" };
		InsertTables.insertCustomer(con, values2);
	}

	public void insertDefaultSalesPattern(Connection con) {
		Object[] values = { "2/2/20", "3/3/23" };
		InsertTables.insertSalesPattern(con, values);
		Object[] values2 = { "1/1/20", "4/4/23" };
		InsertTables.insertSalesPattern(con, values2);
		Object[] values3 = { "5/5/20", "6/6/23" };
		InsertTables.insertSalesPattern(con, values3);

	}
	
	public void insertDefaultFuelStationManager(Connection con) {
		Object[] values = { "fsmUserName", "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "role", Affiliation.FuelStation.toString(), "fsmUserName" };
		int fkemployeeID = InsertTables.insertEmployee(con, values2);
		Object[] values3 = {"0000", fkemployeeID};
		InsertTables.insertFuelStationManager(con, values3);
		
	}

	public void insertDefaultProduct(Connection con) {
		Object[] values = { ProductName.DIESEL.toString(), 212.3456, 3.14159265 };
		InsertTables.insertProduct(con, values);
		Object[] values2 = { ProductName.GASOLINE.toString(), 15.5, 10.25 };
		InsertTables.insertProduct(con, values2);

	}

	public void insertDefaultProductInSalePattern(Connection con) { // extends product
		Object[] values2 = { ProductName.DIESEL.toString(), 1, 0.5 };
		InsertTables.insertProductInSalePattern(con, values2);

	}

	public void insertDefaultProductRatesUpdateRequest(Connection con) {
		Object[] values = { false, false };
		InsertTables.insertProductRatesUpdateRequest(con, values);

	}

	public void insertDefaultProductInRequest(Connection con) {
		Object[] values = { ProductName.DIESEL.toString(), 1, 15.2, 100 };
		InsertTables.insertProductInRequest(con, values);

	}

	public void insertDefaultFuelStation(Connection con) {
		Object[] values = { "Gazim", "Road 6", 1 };
		InsertTables.insertFuelStation(con, values);

	}

	public void insertDefaultFastFuel(Connection con) {
		Object[] values = { ProductName.DIESEL.toString(), 1, "3/3/19", 30, 200.19 };
		InsertTables.insertFastFuel(con, values);

	}

	public void insertDefaultProductInStation(Connection con) {

		Object[] values = { ProductName.MOTORBIKEFUEL.toString(), 230.5, 2.2727 };
		InsertTables.insertProduct(con, values);

		Object[] values2 = { ProductName.MOTORBIKEFUEL.toString(), 1, 25, 10, 6.99 };
		InsertTables.insertProductInStation(con, values2);

	}

	public void insertDefaultQuarterlyReport(Connection con) {
		Object[] values = { "2019", "2/2", "2/3", 1 };
		InsertTables.insertQuarterlyReport(con, values);

	}

	public void insertDefaultIncomeReport(Connection con) {
		Object[] values = { "2020", "5/5", "5/6", 1 }; //quareterly report no. 2
		InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { 2, 20.5 };
		InsertTables.insertIncomeReport(con, values2);

	}

	public void insertDefaultProductInIncomeReport(Connection con) {
		Object[] values = { 1, 2, 100.82 }; 
		InsertTables.insertProductInIncomeReport(con, values);
	}
	

	public void insertDefaultOutcomeReport(Connection con) {
		Object[] values = { "2020", "5/5", "5/6", 1 };//quareterly report no. 3
		InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { 3, 10.2 };
		InsertTables.insertOutcomeReport(con, values2);
	}
		
	public void insertDefaultProductInOutcomeReport(Connection con) {
		Object[] values = { 1, 3, 54.65 }; 
		InsertTables.insertProductInOutcomeReport(con, values);
	}

	
	public void insertDefaultInventroyReport(Connection con) {
		Object[] values = { "2020", "5/5", "5/6", 1 };//quareterly report no. 4
		InsertTables.insertQuarterlyReport(con, values);
		Object[] values2 = { 4 };
		InsertTables.insertInventroyReport(con, values2);
	}
	
	public void insertDefaultProductInInventroyReport(Connection con) {
		Object[] values = { 1, 4, 25 }; 
		InsertTables.insertProductInInventroyReport(con, values);
	}

}
