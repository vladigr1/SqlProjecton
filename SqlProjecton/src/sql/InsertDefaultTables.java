package sql;

import java.sql.Connection;

public class InsertDefaultTables {
	
	public InsertDefaultTables(Connection con){
		InsertDefaultUser(con);
	}
	
	public void InsertDefaultUser (Connection con) {
		InsertTables.InsertUser(con, "user", "r", false, "firstName", "surname", "email");
		System.out.println("*Generated a default user");
	}
}
