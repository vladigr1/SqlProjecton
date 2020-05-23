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
	
	public static String[] Notification() {
		return new String[]{"dismissed", "fkmanageID" };
	}
	
	public static String[] ShipmentMethod() {
		return new String[]{"shipmentName","shipmentPrice", "shipmentMultiplier","shipmentType" };
	}
	
	public static String[] Orders() {
		return new String[]{"order_time", "amount_bought","final_price","address"};
	}
	
	public static String[] HomeFuelOrder() {
		return new String[]{"dutime", "fkcustomerID","fkshipmentName","fkorders_ID"};
	}
	
	public static String[] PurchasingProgramType() {
		return new String[]{"purchasing_program_Name","description", "monthly_price"};
	}
	
	public static String[] FuelCompany() {
		return new String[]{"fuel_Company_Name","fkemployeeID"};
	}
	
	public static String[] PurchasingProgram() {
		return new String[]{"fkcustomerID","fkpurchasingProgramType", "fkfuel_Company_Name"};
	}
	
	public static String[] CustomerBoughtFromCompany() {
		return new String[]{"fkcustomerID","fkfuel_Company_Name", "amount_Bought_From_Company","amount_Paid_Company"};
	}
	

}
