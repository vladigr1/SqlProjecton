package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTables { // insert to tables

	private static int insertRow(Connection con, String tableName, String[] fields, Object[] values) {
		int res = -1;
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
			PreparedStatement ps = con.prepareStatement(sb.toString(), Statement.RETURN_GENERATED_KEYS);
			for (int i = 1; i <= fields.length; ++i) {
				ps.setObject(i, values[i - 1]);
			}
			ps.execute();
			ResultSet rs = ps.getGeneratedKeys();
		    if (rs.next() != false) {
		    	res = rs.getInt(1);	
		    }	   
		} catch (SQLException ex) {/* handle any errors */
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(tableName + res);
		return res;
	}

	public static void insertUser(Connection con, Object[] values) {
		insertRow(con, "user", FieldIndicatorForInsert.User(), values);
	}
	
	public static void insertCustomer(Connection con, Object[] values) {
		insertRow(con, "customer", FieldIndicatorForInsert.Customer(), values);
	}

	public static int insertEmployee(Connection con, Object[] values) {
		return insertRow(con, "employee", FieldIndicatorForInsert.Employee(), values);

	}

	public static void insertSalesPattern(Connection con, Object[] values) {
		insertRow(con, "sales_pattern", FieldIndicatorForInsert.SalePattern(), values);
	}
	
	public static int insertFuelStationManager(Connection con, Object[] values) {
		return insertRow(con, "fuelStationManager", FieldIndicatorForInsert.FuelStationManager(), values);
	}
	
	public static void insertNotification(Connection con, Object[] values) {
		insertRow(con, "notification", FieldIndicatorForInsert.Notification(), values);
	}
	
	
	public static void insertShipmentMethod(Connection con, Object[] values) {
		insertRow(con, "ShipmentMethod", FieldIndicatorForInsert.ShipmentMethod(), values);
	}
	
	public static int insertOrders(Connection con, Object[] values) {
		return insertRow(con, "Orders", FieldIndicatorForInsert.Orders(), values);
	}
	
	public static void insertHomeFuelOrder(Connection con, Object[] values) {
		insertRow(con, "HomeFuelOrder", FieldIndicatorForInsert.HomeFuelOrder(), values);
	}

}
