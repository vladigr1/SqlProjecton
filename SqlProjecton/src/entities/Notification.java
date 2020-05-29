package entities;

public class Notification {

	// connections
	private int employeeID;

	// fields
	private int notificationID;
	private String message;
	private boolean dismissed;

	public Notification(int employeeID, int notificationID, String message, boolean dismissed) {
		super();
		this.employeeID = employeeID;
		this.notificationID = notificationID;
		this.message = message;
		this.dismissed = dismissed;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getNotificationID() {
		return notificationID;
	}
//
//	public void setNotificationID(int notificationID) {
//		this.notificationID = notificationID;
//	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isDismissed() {
		return dismissed;
	}

	public void setDismissed(boolean dismissed) {
		this.dismissed = dismissed;
	}

	@Override
	public String toString() {
		return "Notification [employeeID=" + employeeID + ", notificationID=" + notificationID + ", message=" + message
				+ ", dismissed=" + dismissed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Notification))
			return false;
		Notification other = (Notification) obj;
		return this.notificationID == other.getNotificationID();
	}

}