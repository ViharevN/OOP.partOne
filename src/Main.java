import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada =
                new Car("Lada", "Granta", 2020, "Россия", "седан", 4,
                1.7, "желтый", "Ручная", "x000xx000", true);

        Car audi =
                new Car("Audi", "A8", 2020, "Германия", "седан", 4,
                3.0, "черный", "автомат", "х000хх000", true);

        Car bmw =
                new Car("Bmw", "Z8", 2021, "Германия", "седан", 4,
                3.0, "черный", "автомат", "х000хх000", true);

        Car kia =
                new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея",
                "кроссовер", 4, 2.4, "красный", "автомат",
                "х000хх000", false);

        Car hyundai =
                new Car("Hyundai", "Avante", 2016, "Южная Корея", "седан",
                4, 1.6, "оранжевый", "автомат", "х000хх000",
                null);


        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
        audi.setSummerTyres(true);
        System.out.println(audi.toString());
        audi.changeTyres();
        System.out.println(audi.toString());
        audi.setRegNumber(null);
        System.out.println(audi.toString());
        audi.setRegNumber("x112xx000");
        System.out.println(audi.toString());


    }
}