package sql;

import java.sql.Connection;
import java.util.Date;

import com.sun.jmx.snmp.Timestamp;

import enums.Affiliation;
import enums.ShipmentType;

public class InsertDefaultTables {

	public InsertDefaultTables(Connection con) {
		
		  insertDefaultUser(con); insertDefaultEmployee(con);
		  insertDefaultCustomer(con); insertDefaultSalesPattern(con);
		  insertDefaultFuelStationManager(con);
		 
		insertDefaultNotification(con);
		insertDefaultHomeFuelOrder(con);
		insertDefaultShipmentType(con);
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
		
		Object[] values = {Username , "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);
		
		Object[] values2 = { "role", Affiliation.FuelStation.toString(), Username };
		
		int fkemployeeID = InsertTables.insertEmployee(con, values2);
		Object[] values3 = {"0000", fkemployeeID};
		
		int FSmanagerID = InsertTables.insertFuelStationManager(con, values3);
		
		Object[] values4 = {false, FSmanagerID};
		InsertTables.insertNotification(con, values4);
		
	}
	
	public void insertDefaultShipmentType(Connection con) {
		Object[] values3 = {"vladiregular",50.5 , 1.3, ShipmentType.regular.toString() };
		InsertTables.insertShipmentMethod(con, values3);
	}
	
	public void insertDefaultHomeFuelOrder(Connection con) {
		String username = "hfCusUserName";
		String customerID = "123456";
		String fkshipmentName = "vladiExpress";
		Object[] values = {username , "1234", false, "Elroye", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, values);
		
		Object[] values2 = { customerID ,username , "hfcreditCard" };
		InsertTables.insertCustomer(con, values2);
		
		Object[] values3 = {fkshipmentName,50.5 , 1.3, ShipmentType.urgent.toString() };
		InsertTables.insertShipmentMethod(con, values3);
		
		Object[] values4 = { new Date(System.currentTimeMillis()), customerID, fkshipmentName };
		InsertTables.insertHomeFuelOrder(con, values4);
	}
	
}
