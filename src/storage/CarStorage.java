package storage;

import model.Car;

public class CarStorage {
    private static final String[] BRANDS = {"Kia",
            "Acura",
            "Aston Martin",
            "Citroen",
            "Nissan",
            "Mazda",
            "Maserati",
            "Ford",
            "BMW",
            "Tesla"};
    private static final String[] MODEL = {"Fission",
            "Axxelo",
            "Manx DL",
            "Microlux",
            "Turnpike",
            "S",
            "X",
            "GTX",
            "Camaro"};

    private static final String[] COLORS = {"aqua",
            "black",
            "blue",
            "fuchsia",
            "gray",
            "green",
            "lime",
            "maroon",
            "navy",
            "olive",
            "purple",
            "red",
            "silver",
            "teal",
            "white",
            "yellow"};

    private static int ARRAY_SIZE = 100;

    public Car[] cars;

    public CarStorage() {
        cars = new Car[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            Car car = new Car.Builder()
                    .setId((long) i)
                    .setBrand(BRANDS[i % BRANDS.length])
                    .setModel(MODEL[i % MODEL.length])
                    .setYear(1930 + i)
                    .setColor(COLORS[i % COLORS.length])
                    .setPeace(1000 * i)
                    .setRegistrationNumber("SQ" + (i + 1000) + "GP")
                    .build();
            cars[i] = car;
        }
    }
}
