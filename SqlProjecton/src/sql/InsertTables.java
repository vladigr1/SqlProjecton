package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import entities.Employee;
import entities.SalesPattern;
import entities.User;

public class InsertTables { // insert to tables

	public static void insertRow(Connection con, String tableName, Object[] values) {
		try {
			Statement statement = con.createStatement();

			ResultSet results = statement.executeQuery("SELECT * FROM " + tableName);

			// Get result test metadata

			ResultSetMetaData metadata = results.getMetaData();
			int columnCount = metadata.getColumnCount();
			System.out.println("inserting row to table -> " + tableName);
			StringBuilder valueString = new StringBuilder();
			for (int i = 0; i < values.length; i++) {
				valueString.append(values[i].toString() + " , ");
			}
			System.out.println("values -> " + valueString.toString());

//			if (values.length != columnCount)
//				throw new Exception("ERROR: there are more values than coloms in table->" + tableName);

			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO " + tableName + " (");
			for (int i = 1; i <= columnCount; i++) {
				String columnName = metadata.getColumnName(i);
				if (i == columnCount) {
					sb.append(columnName + ") VALUES (");
				} else {
					sb.append(columnName + ", ");
				}
			}
			for (int i = 1; i <= columnCount; i++) {
				if (i == columnCount) {
					sb.append("?)");
				} else {
					sb.append("?, ");
					;
				}
			}
			PreparedStatement ps = con.prepareStatement(sb.toString());
			for (int i = 1; i <= columnCount; ++i) {
				ps.setObject(i, values[i - 1]);
			}
			ps.execute();

		} catch (SQLException ex) {/* handle any errors */
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

	public static void insertUser(Connection con, User user) {
		insertRow(con, "user", new Object[] { user.getUsername(), user.getPassword(), user.isConnected() ? "1" : "0",
				user.getFirstName(), user.getSurname(), user.getEmail() });
	}

	public static void insertEmployee(Connection con, Employee employee) {
		insertUser(con, employee);
		insertRow(con, "employee", new Object[] { employee.getEmployeeID(), employee.getRole(),
				employee.getAffiliation().toString(), employee.getUsername() });

	}
	
	public static void insertSalesPattern(Connection con, SalesPattern sp) {
		insertRow(con, "sales_pattern", new Object[] {sp.getSalesPatternID(),sp.getStartTime(),sp.getEndTime()});
	}
	
	

}
