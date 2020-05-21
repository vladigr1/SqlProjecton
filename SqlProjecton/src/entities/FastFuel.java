package entities;

public class FastFuel {
	// create hash code and equals after have sale form eldad

	// connections
	private Product product;
	private FuelStation fuelStaion;

	// fields
	private int fastFuelID;
	private String fastFuelTime;
	private double amountBought;
	private double finalPrice;

	public FastFuel(Product product, FuelStation fuelStaion, int fastFuelID, String fastFuelTime, double amountBought,
			double finalPrice) {
		super();
		this.product = product;
		this.fuelStaion = fuelStaion;
		this.fastFuelID = fastFuelID;
		this.fastFuelTime = fastFuelTime;
		this.amountBought = amountBought;
		this.finalPrice = finalPrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public FuelStation getFuelStaion() {
		return fuelStaion;
	}

	public void setFuelStaion(FuelStation fuelStaion) {
		this.fuelStaion = fuelStaion;
	}

	public int getFastFuelID() {
		return fastFuelID;
	}

//	public void setFastFuelID(int fastFuelID) {
//		this.fastFuelID = fastFuelID;
//	}

	public String getFastFuelTime() {
		return fastFuelTime;
	}

	public void setFastFuelTime(String fastFuelTime) {
		this.fastFuelTime = fastFuelTime;
	}

	public double getAmountBought() {
		return amountBought;
	}

	public void setAmountBought(double amountBought) {
		this.amountBought = amountBought;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FastFuel))
			return false;
		FastFuel fuel = (FastFuel) obj;
		return this.fastFuelID == fuel.getFastFuelID();
	}

	@Override
	public String toString() {
		return "FastFuel [product=" + product + ", fuelStaion=" + fuelStaion + ", fastFuelID=" + fastFuelID
				+ ", fastFuelTime=" + fastFuelTime + ", amountBought=" + amountBought + ", finalPrice=" + finalPrice
				+ "]";
	}

}