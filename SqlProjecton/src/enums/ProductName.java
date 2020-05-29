package enums;

public enum ProductName {	
	Diesel {
		public String toString() {
			return "Diesel";
		}
	},
	Gasoline {
		public String toString() {
			return "Gasoline";
		}
	},
	MotorBikeFuel {
		public String toString() {
			return "Motor Bike Fuel";
		}
	},
	HomeFuel {
		public String toString() {
			return "Home Fuel";
		}
	};
}
