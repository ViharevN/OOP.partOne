public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, String color, int year, String country, double engineVolume) {
        if (brand == null || brand.length() == 0) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.length() == 0) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (color == null || color.length() == 0) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.length() == 0) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return brand + " "
                + model + " "
                + year + " год выпуска, "
                + "сборка " + country
                + " цвет кузова " + color
                + ", объем двигателя " + engineVolume;
    }
}
