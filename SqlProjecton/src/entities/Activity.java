package entities;

import java.util.Date;

public class Activity {
	// connection
	private int employeeID;

	//fields
	private int activityID;
	private Date dateTime;
	private String action;

	public Activity(int employeeID, int activityID, Date dateTime, String action) {
		super();
		this.employeeID = employeeID;
		this.activityID = activityID;
		this.dateTime = dateTime;
		this.action = action;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getActivityID() {
		return activityID;
	}

//	public void setActivityID(int activityID) {
//		this.activityID = activityID;
//	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Activity [employeeID=" + employeeID + ", activityID=" + activityID + ", dateTime=" + dateTime
				+ ", action=" + action + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Activity))
			return false;
		Activity other = (Activity) obj;
		return this.activityID == other.getActivityID();
	}

}
