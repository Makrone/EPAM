package com.epam.jwd.home.task1;

import java.util.List;

public class Aplication {

	public static void main(String[] args) {

		TaxPark park = new TaxPark();

		CargoCar cargoCar = new CargoCar(20000.0, 20.3, CarBrand.FORD, 150.0, 400.0);
		park.addCar(cargoCar);
		CargoCar cargoCar2 = new CargoCar(24252.6, 19.7, CarBrand.VOLKSWAGEN, 163.0, 370.0);
		park.addCar(cargoCar2);

		ComfortCar comfCar = new ComfortCar(10000.0, 8.0, CarBrand.SKODA, 180.0, 4);
		park.addCar(comfCar);
		ComfortCar comfCar2 = new ComfortCar(21952.6, 10.7, CarBrand.KIA, 170.0, 5);
		park.addCar(comfCar2);

		SportCar sportCar = new SportCar(40000.0, 15.3, CarBrand.CHEVROLET, 249.0, false);
		park.addCar(sportCar);
		SportCar sportCar2 = new SportCar(56000.0, 9.6, CarBrand.TESLA, 306.0, true);
		park.addCar(sportCar2);

		System.out.println("Полная стоимость таксопарка = " + park.getTotalCost());
		System.out.println("Первоначальный порядок машин: ");
		park.printCars();
		System.out.println();
		park.sortByFuelConsumption();
		System.out.println("Порядок машин после сортировки по расходу топлива: ");
		park.printCars();
		System.out.println();
		System.out.println("Поиск машины со скоростью более 155 и менее 250 км/ч");
		List<Car> filtredCars = park.getCarsBySpeedRange(155.0, 250.0);
		for (Car car : filtredCars) {
			System.out.println(car);
		}
	}

}
