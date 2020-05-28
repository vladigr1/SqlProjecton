package entities;

import java.util.ArrayList;
import java.util.List;

import enums.PricingModelName;

public class PricingModelType {
	// connections
	private List<PricingModel> pricingModelList = new ArrayList<>();

	// fields
	private PricingModelName pricingModelName;
	private String description;
	private double defaultDiscount;

	public PricingModelType(PricingModelName pricingModelName, String description, double defaultDiscount) {
		super();
		this.pricingModelName = pricingModelName;
		this.description = description;
		this.defaultDiscount = defaultDiscount;
	}

	public List<PricingModel> getPricingModelList() {
		return pricingModelList;
	}

	public void setPricingModelList(List<PricingModel> pricingModelList) {
		this.pricingModelList = pricingModelList;
	}

	public PricingModelName getPricingModelName() {
		return pricingModelName;
	}

//	public void setPricingModelName(PricingModelName pricingModelName) {
//		this.pricingModelName = pricingModelName;
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
	public String toString() {
		return "PricingModelType [pricingModelList=" + pricingModelList + ", pricingModelName=" + pricingModelName
				+ ", description=" + description + ", defaultDiscount=" + defaultDiscount + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PricingModelType))
			return false;
		PricingModelType model = (PricingModelType) obj;
		return this.pricingModelName.equals(model.getPricingModelName());
	}

}
