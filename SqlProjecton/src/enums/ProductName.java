package enums;

public enum ProductName {	
	DIESEL {
		public String toString() {
			return "Diesel";
		}
	},
	GASOLINE {
		public String toString() {
			return "Gasoline";
		}
	},
	MOTORBIKEFUEL {
		public String toString() {
			return "Motor Bike Fuel";
		}
	},
	HOMEFUEL {
		public String toString() {
			return "Home Fuel";
		}
	};
}
