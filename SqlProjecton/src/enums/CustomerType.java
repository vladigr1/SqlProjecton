package enums;

public enum CustomerType {
	COMPANY {
		public String toString() {
			return "Company";
		}
	},
	PERSON {
		public String toString() {
			return "Person";
		}
	};

}
