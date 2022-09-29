import service.CarFilerImpl;
import service.CarFilter;
import storage.CarStorage;

public class Main {
    private static final CarStorage carStorage = new CarStorage();
    private static final CarFilter carFilter = new CarFilerImpl();

    public static void main(String[] args) {
        carFilter.getCarsByBrands(carStorage.cars, "Kia")
                .forEach(System.out::println);
    }
}