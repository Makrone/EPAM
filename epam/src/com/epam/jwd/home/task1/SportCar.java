package com.epam.jwd.home.task1;

public class SportCar extends Car {

	private boolean hasSpoiler;

	public SportCar() {
		super();
	}

	public SportCar(Double cost, Double fuelUse, CarBrand brand, Double maxSpeed,boolean hasSpoiler) {
		super(cost, fuelUse, brand,maxSpeed);
		this.maxSpeed = maxSpeed;
		this.hasSpoiler=hasSpoiler;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (hasSpoiler ? 1231 : 1237);
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
		SportCar other = (SportCar) obj;
		if (hasSpoiler != other.hasSpoiler)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SportCar [hasSpoiler=");
		builder.append(hasSpoiler);
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
