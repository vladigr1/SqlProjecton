package sql;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTables { // insert to tables

	private static void insertRow(Connection con, String tableName, String[] fields, Object[] values) {
		try {
			// Get result test metadata
			System.out.println("inserting row to table -> " + tableName);
			StringBuilder valueString = new StringBuilder();
			for (int i = 0; i < values.length; i++) {
				valueString.append(values[i].toString() + " , ");
			}
			System.out.println("values -> " + valueString.toString());

			if (values.length != fields.length)
				throw new Exception("ERROR: there are more values than coloms in table->" + tableName);

			StringBuilder sb = new StringBuilder();
			sb.append("INSERT INTO " + tableName + " (");
			for (int i = 0; i < fields.length; i++) {
				if (i == fields.length - 1) {
					sb.append(fields[i] + ") VALUES (");
				} else {
					sb.append(fields[i] + ", ");
				}
			}
//			System.out.println("String builder->"+sb.toString());
			for (int i = 0; i < values.length; i++) {
				if (i == values.length - 1) {
					sb.append("?)");
				} else {
					sb.append("?, ");
				}
			}
//			System.out.println("String builder->"+sb.toString());
			PreparedStatement ps = con.prepareStatement(sb.toString());
			for (int i = 1; i <= fields.length; ++i) {
				ps.setObject(i, values[i - 1]);
			}
			ps.execute();

		} catch (SQLException ex) {/* handle any errors */
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void insertUser(Connection con, Object[] values) {
		insertRow(con, "user", FieldIndicatorForInsert.User(), values);
	}
	
	public static void insertCustomer(Connection con, Object[] values) {
		insertRow(con, "customer", FieldIndicatorForInsert.Customer(), values);
	}

	public static void insertEmployee(Connection con, Object[] values) {
		insertRow(con, "employee", FieldIndicatorForInsert.Employee(), values);

	}

	public static void insertSalesPattern(Connection con, Object[] values) {
		insertRow(con, "sales_pattern", FieldIndicatorForInsert.SalePattern(), values);
	}

}
