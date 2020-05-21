package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenerateTables { // creating the tables if they are not exists

	public GenerateTables(Connection con) {

		/*
		 * generateUser(con); generateEmployee(con); generateCustomer(con);
		 * generateSalePattern(con);
		 */

		//generateFuelStationManager(con);
		//generateNotification(con);
		generateHomeFuelOrder(con);
		// add them here

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
		String values = "( " + "username varchar(32) NOT NULL ," + " password varchar(32) NOT NULL ,"
				+ " connected varchar(1) NOT NULL ," + " firstName varchar(32) NOT NULL ,"
				+ " surname varchar(32) NOT NULL ," + "email varchar(32) NOT NULL ," + "PRIMARY KEY (username) )";
		generateTable(con, tableName, values);
	}

	public void generateEmployee(Connection con) {
		String tableName = "employee";
		String values = "( " + "employeeID int NOT NULL AUTO_INCREMENT ," + " role varchar(32) NOT NULL , "
				+ " affiliation varchar(32) NOT NULL , " + " fkUsername varchar(32) NOT NULL , "
				+ " PRIMARY KEY (employeeID) ," + "KEY employee_ibfk_1 (fkUsername), "
				+ " CONSTRAINT employee_ibfk_1 FOREIGN KEY (fkUsername) "
				+ "REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}

	public void generateCustomer(Connection con) {
		String tableName = "customer";
		String values = "( " 
				+ "customerID varchar(32) NOT NULL ," 
				+ " creditCard varchar(32) NOT NULL ,"
				+ " fkUsername varchar(32) NOT NULL ," + " PRIMARY KEY (customerID) ,"
				+ " KEY customer_ibfk_1 (fkUsername) ," + " CONSTRAINT customer_ibfk_1 FOREIGN KEY (fkUsername) "
				+ " REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}

	public void generateSalePattern(Connection con) {
		String tableName = "sales_pattern";
		String values = "( " + "salesPatternID INT NOT NULL AUTO_INCREMENT ," + " startTime varchar(32) NOT NULL ,"
				+ " endTime varchar(32) NOT NULL ," + " PRIMARY KEY (salesPatternID) )";
//				+ " KEY salePattern_ibfk_1 (FK_saleID) ,"
//				+ " CONSTRAINT salePattern_ibfk_1 FOREIGN KEY (FK_saleID) "
//				+ " REFERENCES sale (saleID) ON DELETE CASCADE ON UPDATE CASCADE )";	
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
	public void generateHomeFuelOrder(Connection con) {
		String tableName = "homeFuelOrder";
		String values = "( " 
				+ " homeFuelOrderID int NOT NULL AUTO_INCREMENT ," 
				+ " dutime TIMESTAMP NOT NULL ,"
				+ " fkcustomerID varchar(32) NOT NULL ," 
				+ " PRIMARY KEY (homeFuelOrderID) ,"
				+ " KEY homeFuelOrder_ibfk_1 (fkcustomerID) ,"
				+ " CONSTRAINT homeFuelOrder_ibfk_1 FOREIGN KEY (fkcustomerID) "
				+ " REFERENCES customer (customerID) ON DELETE CASCADE ON UPDATE CASCADE )";
		generateTable(con, tableName, values);
	}
}
