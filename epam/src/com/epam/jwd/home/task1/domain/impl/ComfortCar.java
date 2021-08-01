package com.epam.jwd.home.task1.domain.impl;

import com.epam.jwd.home.task1.domain.Car;
import com.epam.jwd.home.task1.domain.enums.CarBrand;

public class ComfortCar extends Car {

	private Integer maxSeat;

	public ComfortCar() {
		super();
	}

	public ComfortCar(Double cost, Double fuelUse, CarBrand brand, Double maxSpeed, Integer maxSeat) {
		super(cost, fuelUse, brand, maxSpeed);
		this.maxSeat = maxSeat;
	}

	public Integer getMaxSeat() {
		return maxSeat;
	}

	public void setMaxSeat(Integer maxSeat) {
		this.maxSeat = maxSeat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((maxSeat == null) ? 0 : maxSeat.hashCode());
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
		ComfortCar other = (ComfortCar) obj;
		if (maxSeat == null) {
			if (other.maxSeat != null)
				return false;
		} else if (!maxSeat.equals(other.maxSeat))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ComfortCar [maxSeat=");
		builder.append(maxSeat);
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
