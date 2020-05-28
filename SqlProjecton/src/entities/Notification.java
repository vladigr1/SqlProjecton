package entities;

public class Notification {

	// connections
	private FuelStationManager fuelStationManager;

	// fields
	private int notificationID;
	private String message;
	private boolean dismissed;

	public Notification(FuelStationManager fuelStationManager, int notificationID, String message, boolean dismissed) {
		this.fuelStationManager = fuelStationManager;
		this.notificationID = notificationID;
		this.message = message;
		this.dismissed = dismissed;
	}

	public FuelStationManager getFuelStationManager() {
		return fuelStationManager;
	}

	public void setFuelStationManager(FuelStationManager fuelStationManager) {
		this.fuelStationManager = fuelStationManager;
	}

	public int getNotificationID() {
		return notificationID;
	}

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
		return "Notification [fuelStationManager=" + fuelStationManager + ", notificationID=" + notificationID
				+ ", message=" + message + ", dismissed=" + dismissed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Notification))
			return false;
		Notification other = (Notification) obj;
		return this.notificationID == other.getNotificationID();
	}

}