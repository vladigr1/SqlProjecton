package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenerateTables {  // creating the tables if theey are not exists
	
	public  GenerateTables(Connection con) {
		generateUser(con);
		generateEmployee(con);
		generateCustomer(con);
		//add them here
		
	}
	
	public void generateUser (Connection con) {
		PreparedStatement pst;
		String table = "CREATE TABLE if not exists user ( "
	            + "username varchar(32) NOT NULL ,"
	            + " password varchar(32) NOT NULL ,"
	            + " connected varchar(1) NOT NULL ,"
	            + " firstName varchar(32) NOT NULL ,"
	            + " surname varchar(32) NOT NULL ,"
				+ "email varchar(32) NOT NULL ,"
				+ "PRIMARY KEY (username) )"
				+ "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ";
		try {
			pst = con.prepareStatement(table);
			pst.execute();
		} catch (SQLException ex){/* handle any errors*/
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            }
		System.out.println("*Generated a user table");
	}
	
	public void generateEmployee(Connection con) {
		PreparedStatement pst;
		String table = "CREATE TABLE if not exists employee ( "
	            + "employeeID varchar(32) NOT NULL ,"
	            + " role varchar(32) NOT NULL , "
	            + " affiliation varchar(32) NOT NULL , "
	            + " fkUsername varchar(32) NOT NULL , "
	            + " PRIMARY KEY (employeeID) ,"
				+ "KEY employee_ibfk_1 (fkUsername), "
				+ " CONSTRAINT employee_ibfk_1 FOREIGN KEY (fkUsername) "
				+ "REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )"
				+ " ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ";
		try {
			pst = con.prepareStatement(table);
			pst.execute();
		} catch (SQLException ex){/* handle any errors*/
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            }
		System.out.println("*Generated a employee table");

	}
	
	public void generateCustomer(Connection con) {
		PreparedStatement pst;
		String table = "CREATE TABLE if not exists customer ( "
	            + "customerID varchar(32) NOT NULL ,"
	            + " creditCard varchar(16) NOT NULL ,"
	            + " fkUsername varchar(32) NOT NULL ,"
	            + " PRIMARY KEY (customerID) ,"
	            + " KEY customer_ibfk_1 (fkUsername) ,"
	            + " CONSTRAINT customer_ibfk_1 FOREIGN KEY (fkUsername) "
	            + " REFERENCES user (username) ON DELETE CASCADE ON UPDATE CASCADE )"
				+ " ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci";
		try {
			pst = con.prepareStatement(table);
			pst.execute();
		} catch (SQLException ex){/* handle any errors*/
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            }
		System.out.println("*Generated a customer table");
	}
}
