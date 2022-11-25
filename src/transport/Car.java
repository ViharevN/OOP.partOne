package transport;


import java.time.LocalDate;

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

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, Integer year, String country, String bodyType, Integer numOfSeats,
               Double engineVolume, String color, String transmission, String regNumber, Boolean summerTyres,
               Key key, Insurance insurance) {

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
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        this.insurance = new Insurance();


    }

    public Insurance getInsurance() {
        return insurance;
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

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean isCorrectNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0])||!Character.isAlphabetic(chars[4])
                || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2])
                && Character.isDigit(chars[3]) && Character.isDigit(chars[6])
                && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);

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
                ", Шины: " + summerTyres +
                ", key: " + key;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key(){
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return " Удаленный запуск: " + remoteEngineStart +
                    ", Бесключевой доступ: " + keylessAccess;
        }

    }
    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(LocalDate.now(), 10_000, "123456789");
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now())||expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }

        }
        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки не верный");
            }
        }

        @Override
        public String toString() {
            return "Дата " + expireDate +
                    ", Цена " + cost +
                    ", Номер'" + number;
        }
    }




}
