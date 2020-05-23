package sql;

import java.sql.Connection;
import java.util.Date;

import com.sun.jmx.snmp.Timestamp;

import entities.PurchasingProgram;
import entities.ShipmentType;
import enums.Affiliation;
import enums.PurchasingProgramName;

public class InsertDefaultTables {

	public InsertDefaultTables(Connection con) {
		
		
		  insertDefaultUser(con); insertDefaultEmployee(con);
		  insertDefaultCustomer(con); insertDefaultSalesPattern(con);
		  insertDefaultFuelStationManager(con); insertDefaultNotification(con);
		  insertDefaultShipmentType(con); insertDefaultOrders(con);
		  insertDefaultHomeFuelOrder(con); insertDefaultPurchasingProgramType(con);
		  
		  insertDefaultFuelCompany(con); insertDefaultPurchasingProgram(con);
		 
		insertCustomerBoughtFromCompany(con);
	}

	public void insertDefaultUser(Connection con) {
		Object[] values = { "user", "r", false, "firstName", "surname", "email" };
		InsertTables.insertUser(con, values);
	}

	public void insertDefaultEmployee(Connection con) {
		Object[] values = { "eUserName", "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);

		Object[] values2 = { "role", Affiliation.Marketing.toString(), "eUserName" };
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
	
	public void insertDefaultShipmentType(Connection con) {
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
		Object[] values = {username , "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);
		
		Object[] values2 = { customerID ,username , "hfcreditCard" };
		InsertTables.insertCustomer(con, values2);
		
		Object[] values3 = {fkshipmentName,50.5 , 1.3, ShipmentType.urgent.toString() };
		InsertTables.insertShipmentMethod(con, values3);
		
		Object[] values4 = { new Date(System.currentTimeMillis()), 5.5, 100.4,"some where in israel" };
		fkorders_ID =InsertTables.insertOrders(con, values4);
		
		Object[] values5 = { new Date(System.currentTimeMillis()), customerID, fkshipmentName,fkorders_ID};
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
	
}
