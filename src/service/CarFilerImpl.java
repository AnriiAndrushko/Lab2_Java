package service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import model.Car;

public class CarFilerImpl implements CarFilter {
    @Override
    public List<Car> getCarsByBrands(Car[] cars, String brand) {
        return Arrays.stream(cars)
                .filter(c -> c.getBrand().equals(brand))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsByModelAndOperatingTime(Car[] cars, String model, int yearsOfOperating) {
        return null;
    }

    @Override
    public List<Car> getCarsByYearAndPrice(Car[] cars, int year, double price) {
        return null;
    }
}