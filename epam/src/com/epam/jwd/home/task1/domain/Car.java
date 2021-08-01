package com.epam.jwd.home.task1.domain;

import com.epam.jwd.home.task1.domain.enums.CarBrand;

public class Car {

	protected Double cost;
	protected Double fuelConsumption;
	protected CarBrand brand;
	protected Double maxSpeed;

	public Car() {
		super();
	}

	public Car(Double cost, Double fuelConsumption, CarBrand brand, Double maxSpeed) {
		super();
		this.cost = cost;
		this.fuelConsumption = fuelConsumption;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public CarBrand getBrand() {
		return brand;
	}

	public void setBrand(CarBrand brand) {
		this.brand = brand;
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
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((fuelConsumption == null) ? 0 : fuelConsumption.hashCode());
		result = prime * result + ((maxSpeed == null) ? 0 : maxSpeed.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand != other.brand)
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (fuelConsumption == null) {
			if (other.fuelConsumption != null)
				return false;
		} else if (!fuelConsumption.equals(other.fuelConsumption))
			return false;
		if (maxSpeed == null) {
			if (other.maxSpeed != null)
				return false;
		} else if (!maxSpeed.equals(other.maxSpeed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [cost=");
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
