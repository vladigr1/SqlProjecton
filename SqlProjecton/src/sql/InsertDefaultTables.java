package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Employee;
import entities.SalesPattern;
import entities.User;
import enums.Affiliation;

public class InsertDefaultTables {

	public InsertDefaultTables(Connection con) {
		InsertDefaultUser(con);
		InsertDefaultEmployee(con);
		InsertDefaultSalesPattern(con);
	}

	public void InsertDefaultUser(Connection con) {
		User user = new User("user", "r", false, "firstName", "surname", "email");
		InsertTables.insertUser(con, user);
	}

	public void InsertDefaultEmployee(Connection con) {
		Employee employee = new Employee("eUserName", "11", false, "Moshe", "Cahana", "Mail@mai.com", "222222555",
				"role", Affiliation.Marketing);
		InsertTables.insertEmployee(con, employee);
	}

	public void InsertDefaultSalesPattern(Connection con) {
		int id = generateKeyForTable(con, "sales_pattern","salesPatternID");
		if (id == -1) {
			System.out.println("Error!, cannot generat id");
		} else {
			SalesPattern sp = new SalesPattern(null, null, id, "2/2/20", "3/3/23");
			InsertTables.insertSalesPattern(con, sp);
		}
		id = generateKeyForTable(con, "sales_pattern","salesPatternID");
		if (id == -1) {
			System.out.println("Error!, cannot generat id");
		} else {
			SalesPattern sp = new SalesPattern(null, null, id, "4/4/20", "3/3/25");
			InsertTables.insertSalesPattern(con, sp);
		}
		id = generateKeyForTable(con, "sales_pattern","salesPatternID");
		if (id == -1) {
			System.out.println("Error!, cannot generat id");
		} else {
			SalesPattern sp = new SalesPattern(null, null, id, "1/1/10", "9/9/25");
			InsertTables.insertSalesPattern(con, sp);
		}
	}

	private int generateKeyForTable(Connection con, String tableName,String pkField) {
		ResultSet rs = null;
		int lastid = -1;
		try {
			Statement stmt = con.createStatement();

			//
			// Example of using Statement.getGeneratedKeys()
			// to retrieve the value of an auto-increment
			// value
			//

//			rs = stmt.executeQuery("SELECT MAX(" + pkField + ") AS id FROM " + tableName);
//			lastid = rs.getInt("id");			
			rs = stmt.executeQuery("select MAX("+pkField+") as last_id from " + tableName);
			if (!rs.next())
				lastid = 1;
			else {
				lastid = rs.getInt(1);
				lastid++;
			}
//			lastid = rs.getInt(1);
//			System.out.println("last id is->" + lastid);
//			if (lastid == 0)
//				lastid = 1;
//			else
//				lastid++;
		} catch (SQLException ex) {/* handle any errors */
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		System.out.println("Key returned from getGeneratedKeys():" + lastid);

		return lastid;
	}

}
