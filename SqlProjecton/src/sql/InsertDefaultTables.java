package sql;

import java.sql.Connection;

import java.util.Date;
import com.sun.jmx.snmp.Timestamp;

import entities.PurchasingProgram;
import enums.Affiliation;
import enums.PricingModelName;
import enums.ProductName;
import enums.PurchasingProgramName;
import enums.ShipmentType;

public class InsertDefaultTables {

	public InsertDefaultTables(Connection con) {

		insertDefaultUser(con);
		insertDefaultEmployee(con);
		insertDefaultCustomer(con);
		insertDefaultSalesPattern(con);
		insertDefaultSale(con); 
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
		insertDefaultSaleCommentsReport(con);
		
		insertDefaultCar(con);////
		insertDefaultRankingSheet(con);///
		insertDefaultPricingModelType(con);///
		insertDefaultPricingModel(con);////
		insertDefaultFullSingleMemberMonthly(con);////
		

		// Vlad additions
		  insertDefaultNotification(con);
		  insertDefaultShipmentMethod(con); 
		  insertDefaultOrders(con);
		  insertDefaultFuelStationOrder(con);/////////
		  insertDefaultHomeFuelOrder(con); 
		  insertDefaultPurchasingProgramType(con);
		  insertDefaultFuelCompany(con); 
		  insertDefaultPurchasingProgram(con);
		 
		insertCustomerBoughtFromCompany(con);
		
		System.out.println("finished insertions");
	}

	// only add insert default method and after waards add the to
	// InsertDefaultTables
	//elro
	
	
	
	public void insertDefaultFullSingleMemberMonthly(Connection con) {
		String registrationPlate="65-101-33";
		String customerID = "212354252";		
		double lastMonthUtillization=3.14;
		Object[] values = { registrationPlate, customerID,lastMonthUtillization};
		InsertTables.insertFullSingleMemberMonthly(con, values);	
	}
	
	
	public void insertDefaultPricingModel(Connection con) {
		String pricingModelType = PricingModelName.MonthlyProgramMultipleCars.toString();	
		String registrationPlate="65-101-33";
		String customerID = "212354252";		
		double currentDiscount=0.15;
		Object[] values = { pricingModelType, registrationPlate, customerID,currentDiscount};
		InsertTables.insertPricingModel(con, values);	
	}
	
	
	public void insertDefaultPricingModelType(Connection con) {
		String pricingModelType = PricingModelName.MonthlyProgramMultipleCars.toString();
		String description = "some desc";
		double defaultDiscount=0.2;
		
		Object[] values = { pricingModelType, description, defaultDiscount};
		InsertTables.insertPricingModelType(con, values);
		
		
	}
	
	
	public void insertDefaultRankingSheet(Connection con) {
		String userName = "elro2222";
		String customerID = "212354252";
		Object[] values = { userName, "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { customerID, userName, "1331-2222-3333-4444" };
		InsertTables.insertCustomer(con, values2);
		
		double customerTypeRank=0.75;
		double fuelingHoursRank=0.89;
		double fuelTypesRank=0.43;
		
		Object[] values3 = { customerTypeRank, fuelingHoursRank, fuelTypesRank ,customerID };
		InsertTables.insertRankingSheet(con, values3);
		
		
	}
		
	public void insertDefaultCar(Connection con) {
		String userName = "elro21";
		String customerID = "212334252";
		Object[] values = { userName, "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { customerID, userName, "1321-2222-3333-4444" };
		InsertTables.insertCustomer(con, values2);
		
		String registrationPlate="65-101-33";
		String ownerName="Kevin";
		Object[] values3 = { registrationPlate, ownerName, ProductName.DIESEL.toString() ,customerID };
		InsertTables.insertCar(con, values3);
		
		
	}
	
	
	
	
	
	
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
		int quarter=1;
		String year="2020";
		Object[] values = { quarter ,year, "2/2", "2/3", fuelstationID };
		InsertTables.insertQuarterlyReport(con, values);

	}

	public void insertDefaultIncomeReport(Connection con) {
		int fuelstationID = 1;
		int quarter=2;
		String year="2020";
		Object[] values = { quarter ,year, "5/5", "5/6", fuelstationID }; 
		InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = {quarter ,year, 20.5 };
		InsertTables.insertIncomeReport(con, values2);

	}

	public void insertDefaultProductInIncomeReport(Connection con) {
		int fuelstationID = 1;
		int quarter=3;
		String year="2020";
		Object[] values = { quarter ,year, "3/2", "5/6", fuelstationID }; 
		 InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { quarter,year, 20.5 };
		InsertTables.insertIncomeReport(con, values2);

		int productInStation = 1; // already created such product in station
		Object[] values3 = { productInStation, quarter,year, 100.82 };
		InsertTables.insertProductInIncomeReport(con, values3);
	}

	public void insertDefaultOutcomeReport(Connection con) {
		int fuelstationID = 1;
		int quarter=1;
		String year="2019";
		Object[] values = { quarter ,year, "5/5", "5/6", fuelstationID };
		InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { quarter ,year, 10.2 };
		InsertTables.insertOutcomeReport(con, values2);
	}

	public void insertDefaultProductInOutcomeReport(Connection con) {
		int fuelstationID = 1;
		int quarter=2;
		String year="2019";
		Object[] values = { quarter ,year, "2/3", "4/2", fuelstationID }; 
		InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { quarter ,year, 20.5 };
		InsertTables.insertOutcomeReport(con, values2);

		int productInStation = 1;
		Object[] values3 = { productInStation, quarter ,year, 54.65 };
		InsertTables.insertProductInOutcomeReport(con, values3);
	}

	public void insertDefaultInventroyReport(Connection con) {
		int fuelstationID = 1;
		int quarter=1;
		String year="2018";
		Object[] values = { quarter ,year, "5/5", "5/6", fuelstationID };
		InsertTables.insertQuarterlyReport(con, values);
		Object[] values2 = { quarter ,year };
		InsertTables.insertInventroyReport(con, values2);
	}

	public void insertDefaultProductInInventroyReport(Connection con) {
		int fuelstationID = 1;
		int quarter=2;
		String year="2018";
		Object[] values = { quarter ,year, "1/1", "2/2", fuelstationID }; 
		InsertTables.insertQuarterlyReport(con, values);

		Object[] values2 = { quarter ,year };
		InsertTables.insertInventroyReport(con, values2);

		int productInStation = 1;

		Object[] values3 = { productInStation, quarter ,year, 25 };
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
	
	public void insertDefaultNotification(Connection con) {
		String Username = "fsmUserName2";	//pk and refrance
		int fkemployeeID;
		int FSmanagerID;
		
		Object[] values = {Username , "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);
		
		Object[] values2 = { "role", Affiliation.FuelStation.toString(), Username };
		
		fkemployeeID = InsertTables.insertEmployee(con, values2);
		Object[] values3 = {"0000", fkemployeeID};
		
		FSmanagerID = InsertTables.insertFuelStationManager(con, values3);
		
		Object[] values4 = {false, FSmanagerID};
		InsertTables.insertNotification(con, values4);
		
	}
	
	public void insertDefaultShipmentMethod(Connection con) {
		Object[] values3 = {"vladiregular",50.5 , 1.3, ShipmentType.regular.toString() };
		InsertTables.insertShipmentMethod(con, values3);
	}
	
	public void insertDefaultOrders(Connection con) {
		
		Object[] values = { new Date(System.currentTimeMillis()), 5.5, 100.4,"in israel" };
		InsertTables.insertOrders(con, values);
	}
	
	public void insertDefaultHomeFuelOrder(Connection con) {
		String username = "hfCusUserName";
		String customerID = "123456";
		String fkshipmentName = "vladiExpress";
		int fkorders_ID;
		//generate user for customer
		Object[] values = {username , "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);
		//generate customer
		Object[] values2 = { customerID ,username , "hfcreditCard" };
		InsertTables.insertCustomer(con, values2);
		
		Object[] values3 = {fkshipmentName,50.5 , 1.3, ShipmentType.urgent.toString() };
		InsertTables.insertShipmentMethod(con, values3);
		
		Object[] values4 = { new Date(System.currentTimeMillis()), 5.5, 100.4,"some where in israel" };
		fkorders_ID =InsertTables.insertOrders(con, values4);
		//generate homefuel order using pre set product DIESEL set in insert...product
		Object[] values5 = { new Date(System.currentTimeMillis()), customerID, fkshipmentName,fkorders_ID,ProductName.DIESEL.toString()};
		InsertTables.insertHomeFuelOrder(con, values5);
	}
	
	public void insertDefaultPurchasingProgramType(Connection con) {
		
		Object[] values = {PurchasingProgramName.single.toString() , "for single car", 100.4 };
		InsertTables.insertPurchasingProgramType(con, values);
	}
	
	public void insertDefaultFuelCompany(Connection con) {
		String userName = "SupplierUserName";
		int fkemployeeID;
		Object[] values = { userName, "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "role", Affiliation.Marketing.toString(), userName };
		fkemployeeID = InsertTables.insertEmployee(con, values2);
		
		Object[] values3 = { "Sonol", fkemployeeID };
		InsertTables.insertFuelCompany(con, values3);
	}
	
	public void insertDefaultPurchasingProgram(Connection con) {
		String supplieruserName = "Supplier2UserName";
		String customerUserName = "customer13UserName";
		int fkemployeeID;
		String fkcustomer = "1212";
		String fkpurchasingProgramType = PurchasingProgramName.expensive.toString();
		String fkfuel_Company_Name = "paz";
		
		//customer
		Object[] values1 = { customerUserName, "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values1);

		Object[] values2 = { fkcustomer , customerUserName, "1111-2222-3333-4444" };
		InsertTables.insertCustomer(con, values2);
		

		//PurchasingProgramType
		Object[] values3 = {fkpurchasingProgramType , "for not single car", 100.4 };
		InsertTables.insertPurchasingProgramType(con, values3);
		
		
		//fuelCompany
		Object[] values4 = { supplieruserName, "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values4);

		Object[] values5 = { "role", Affiliation.Marketing.toString(), supplieruserName };
		fkemployeeID = InsertTables.insertEmployee(con, values5);
		
		Object[] values6 = {fkfuel_Company_Name , fkemployeeID };
		InsertTables.insertFuelCompany(con, values6);

		//purchasing program
		Object[] values7 = { fkcustomer , fkpurchasingProgramType, fkfuel_Company_Name };
		InsertTables.insertPurchasingProgram(con, values7);
	}
	
	public void insertCustomerBoughtFromCompany(Connection con) {
		String supplieruserName = "Supplier3UserName";
		String customerUserName = "customer6UserName";
		int fkemployeeID;
		String fkcustomer = "221212";
		String fkfuel_Company_Name = "zap";
		
		//customer
		Object[] values1 = { customerUserName, "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values1);

		Object[] values2 = { fkcustomer , customerUserName, "1111-2222-3333-4444" };
		InsertTables.insertCustomer(con, values2);
		
		
		//fuelCompany
		Object[] values4 = { supplieruserName, "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values4);
		Object[] values5 = { "role", Affiliation.Marketing.toString(), supplieruserName };
		fkemployeeID = InsertTables.insertEmployee(con, values5);
		
		Object[] values6 = {fkfuel_Company_Name , fkemployeeID };
		InsertTables.insertFuelCompany(con, values6);

		//CustomerBoughtFromCompany
		Object[] values7 = {fkcustomer , fkfuel_Company_Name, 3.4, 34.0};
		InsertTables.insertCustomerBoughtFromCompany(con, values7);
	}
	
	public void insertDefaultSaleCommentsReport(Connection con) {
	
		Object[] values3 = { new Date(120, 11, 3), new Date(120, 5, 3) };
		int generateKey=InsertTables.insertSalesPattern(con, values3);
		Object[] values4 = { generateKey,false };
		int generateKeySale=InsertTables.insertSale(con, values4);
		
		Object[] values5 = { generateKeySale,15,250.54 };
		InsertTables.insertSaleCommentsReport(con, values5);
		
//		Object[] values6 = { generateKeySale,12,230.54 };    //for checking that the relation is 1 to 1
//		InsertTables.insertSaleCommentsReport(con, values6);
			
	}
		
	public void insertDefaultFuelStationOrder(Connection con) {
		int orderID;
		int productInStationID=1;
		
		Object[] values = { new Date(System.currentTimeMillis()), 5.5, 100.4,"in israel" };
		orderID = InsertTables.insertOrders(con, values);
		
		Object[] values2 = { orderID,productInStationID,false,false,false,  new Date(118, 11, 3)};
		InsertTables.insertFuelStationOrder(con, values2);
			
	}
	
	//vlad add
	
	
	
}
