import service.CarFilerImpl;
import service.CarFilter;
import storage.CarStorage;

public class Main {
    private static final CarStorage carStorage = new CarStorage();
    private static final CarFilter carFilter = new CarFilerImpl();

    public static void main(String[] args) {
        carFilter.getCarsByBrands(carStorage.cars, "Kia")
                .forEach(System.out::println);
        System.out.println("------------------------");
        carFilter.getCarsByModelAndOperatingTime(carStorage.cars, "Camaro", 2000)
                .forEach(System.out::println);
        System.out.println("------------------------");
        carFilter.getCarsByYearAndPrice(carStorage.cars, 2000, 30000.0)
                .forEach(System.out::println);
    }
}