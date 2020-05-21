package sql;

public class FieldIndicatorForInsert {
	public static String[] User() {
		return new String[]{ "username", "password", "connected", "firstName", "surname", "email" };
	}
	public static String[] Employee() {
		return new String[]{ "role", "affiliation", "fkUsername" };
	}
	public static String[] SalePattern() {
		return new String[]{ "startTime", "endTime" };
	}
	
	public static String[] Customer() {
		return new String[]{ "customerID","fkUsername", "creditCard" };
	}
	
	public static String[] FuelStationManager() {
		return new String[]{"phoneNo", "fkemployeeID" };
	}
}
