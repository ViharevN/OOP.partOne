package transport;

public class Car {
    private String brand;// марка авто
    private String model;// модель авто
    private final int year; // год авто
    private String country;// страна сборки
    private String bodyType; // тип кузова
    private Integer numOfSeats; //Количество мест
    private double engineVolume; // объём двигателя
    private String color; // цвет авто
    private String transmission; //коробка передач
    private String regNumber; //Регистрационный номер
    private Boolean summerTyres; //признак «Летняя» или «Зимняя резина




    public Car(String brand, String model, Integer year, String country, String bodyType, Integer numOfSeats,
               Double engineVolume, String color, String transmission, String regNumber, Boolean summerTyres) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year == null || year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (numOfSeats == null || numOfSeats <= 0) {
            this.numOfSeats = 2;
        } else {
            this.numOfSeats = numOfSeats;
        }
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (regNumber == null || regNumber.length() < 9 || regNumber.isEmpty() || regNumber.isBlank()) {
            this.regNumber = "не верно введен номер";
        } else {
            this.regNumber = regNumber;
        }
        if (summerTyres == null) {
            this.summerTyres = false;
        } else {
            this.summerTyres = this.summerTyres;
        }



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

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Integer getNumOfSeats() {
        return numOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume == null || engineVolume < 0) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "ручная КПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.length() < 9 || regNumber.isEmpty() || regNumber.isBlank()) {
            this.regNumber = "не верно введен номер";
        } else {
            this.regNumber = regNumber;
        }
        return regNumber;
    }

    public Boolean getSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(Boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Boolean changeTyres() {
        this.summerTyres = !summerTyres;
        return summerTyres;
    }



    public String toString() {
        return "Марка: " + brand +
                ", Модель: " + model +
                ", Год выпуска: " + year +
                ", Страна производитель: " + country +
                ", Модель кузова: " + bodyType +
                ", Количество мест: " + numOfSeats +
                ", Объём двигателя: " + engineVolume +
                ", Цвет: " + color +
                ", Коробка передач: " + transmission +
                ", Регистрационный номер: " + regNumber +
                ", Шины: " + summerTyres;
    }
}
