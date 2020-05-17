package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTables {
	
	public static void InsertUser(Connection con,String username, String password, boolean connected, String firstName, String surname, String email) {
		try {
		PreparedStatement insertCourse = con.prepareStatement("INSERT INTO User VALUES(?,?,?,?,?,?)");
		insertCourse.setString(1,username);
		insertCourse.setString(2,password);
		insertCourse.setString(3,Integer.toString( (connected ? 0 : 1) ));
		insertCourse.setString(4,firstName);
		insertCourse.setString(5,surname);
		insertCourse.setString(6,email);
		insertCourse.executeUpdate();
		}catch (SQLException ex) {
			/* handle any errors*/
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            }
	}
	
	
}
