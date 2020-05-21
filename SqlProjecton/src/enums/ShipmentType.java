package enums;

public enum ShipmentType {
	regular {
		public String toString() {
			return "Management";
		}
	},
	urgent {
		public String toString() {
			return "Urgent";
		}
	}
}