package service;

import java.util.List;
import model.Car;

public interface CarFilter {
    List<Car> getCarsByBrands(Car[] cars, String brands);

    List<Car> getCarsByModelAndOperatingTime(Car[] cars, String model, int yearsOfOperating);

    List<Car> getCarsByYearAndPrice(Car[] cars, int year, double price);
}
