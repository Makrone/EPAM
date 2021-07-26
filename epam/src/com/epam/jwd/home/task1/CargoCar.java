package com.epam.jwd.home.task1;

public class CargoCar extends Car {

	private Double liftingCapacity;

	public CargoCar() {
		super();
	}

	public CargoCar(Double cost, Double fuelConsumption, CarBrand brand, Double maxSpeed, Double liftingCapacity) {
		super(cost, fuelConsumption, brand, maxSpeed);
		this.liftingCapacity = liftingCapacity;
	}

	public Double getLiftingCapacity() {
		return liftingCapacity;
	}

	public void setLiftingCapacity(Double liftingCapacity) {
		this.liftingCapacity = liftingCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((liftingCapacity == null) ? 0 : liftingCapacity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoCar other = (CargoCar) obj;
		if (liftingCapacity == null) {
			if (other.liftingCapacity != null)
				return false;
		} else if (!liftingCapacity.equals(other.liftingCapacity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CargoCar [liftingCapacity=");
		builder.append(liftingCapacity);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", fuelConsumption=");
		builder.append(fuelConsumption);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append("]");
		return builder.toString();
	}

}
