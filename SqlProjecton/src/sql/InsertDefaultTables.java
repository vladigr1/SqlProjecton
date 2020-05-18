package sql;

import java.sql.Connection;
import enums.Affiliation;

public class InsertDefaultTables {

	public InsertDefaultTables(Connection con) {
		InsertDefaultUser(con);
		InsertDefaultEmployee(con);
		InsertDefaultSalesPattern(con);
	}

	public void InsertDefaultUser(Connection con) {
		String[] fields = { "username", "password", "connected", "firstName", "surname", "email" };
		Object[] values = { "user", "r", false, "firstName", "surname", "email" };
		InsertTables.insertUser(con, fields, values);
	}

	public void InsertDefaultEmployee(Connection con) {

		String[] fields = { "username", "password", "connected", "firstName", "surname", "email" };
		Object[] values = { "eUserName", "11", false, "Moshe", "Cahana", "Mail@mai.com" };
		InsertTables.insertUser(con, fields, values);

		String[] fields2 = { "role", "affiliation", "fkUsername" };
		Object[] values2 = { "role", Affiliation.Marketing.toString(), "eUserName" };
		InsertTables.insertEmployee(con, fields2, values2);
	}

	public void InsertDefaultSalesPattern(Connection con) {
		String[] fields = { "startTime", "endTime" };
		Object[] values = { "2/2/20", "3/3/23" };
		InsertTables.insertSalesPattern(con, fields, values);
		Object[] values2 = { "1/1/20", "4/4/23" };
		InsertTables.insertSalesPattern(con, fields, values2);
		Object[] values3 = { "5/5/20", "6/6/23" };
		InsertTables.insertSalesPattern(con, fields, values3);

	}

}
