package model;

public class Car {
    private final Long id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    private Car(Builder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.price = builder.price;
        this.registrationNumber = builder.registrationNumber;
    }

    public static class Builder {
        private Long id;
        private String brand;
        private String model;
        private int year;
        private String color;
        private double price;
        private String registrationNumber;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{"
                + "id=" + id
                + ", brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", year=" + year
                + ", color='" + color + '\''
                + ", price=" + price
                + ", registrationNumber='" + registrationNumber + '\''
                + '}';
    }
}
