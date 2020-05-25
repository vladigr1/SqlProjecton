package entities;

public class PricingModelType {
	//fields
	private PricingModelType pricingModelType;
	private String description;
	private double defaultDiscount;
	
	public PricingModelType(PricingModelType pricingModelType, String description, double defaultDiscount) {
		super();
		this.pricingModelType = pricingModelType;
		this.description = description;
		this.defaultDiscount = defaultDiscount;
	}
	public PricingModelType getPricingModelType() {
		return pricingModelType;
	}
//	public void setPricingModelType(PricingModelType pricingModelType) {
//		this.pricingModelType = pricingModelType;
//	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getDefaultDiscount() {
		return defaultDiscount;
	}
	public void setDefaultDiscount(double defaultDiscount) {
		this.defaultDiscount = defaultDiscount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PricingModelType))
			return false;
		PricingModelType model = (PricingModelType) obj;
		return this.pricingModelType == model.getPricingModelType();
	}
	
	
	@Override
	public String toString() {
		return "PricingModelType [pricingModelType=" + pricingModelType + ", description=" + description
				+ ", defaultDiscount=" + defaultDiscount + "]";
	}
		

}
