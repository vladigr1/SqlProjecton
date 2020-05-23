package entities;

public enum ShipmentType {
	regular {
		public String toString() {
			return "Regular";
		}
	},
	urgent {
		public String toString() {
			return "Urgent";
		}
	}
}