package enums;

public enum PurchasingProgramName {
	single {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Single";
		}
		
	},
	expensive {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Expensive";
		}
	};
}