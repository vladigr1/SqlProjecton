package enums;

public enum CustomerType {
	Company{
		public String toString() {
			return "Company";
		}
	},
	Person {
		public String toString() {
			return "Person";
		}
	};

}
