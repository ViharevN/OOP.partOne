import transport.Car;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        Car lada = new Car("Lada",
                        "Granta",
                        2020,
                        "Россия",
                        "седан",
                        4,
                        1.7,
                        "желтый",
                        "Ручная",
                        "x000xx000",
                        true,
                        null,
                        null);

        Car audi = new Car("Audi",
                        "A8",
                        2020,
                        "Германия",
                        "седан",
                        4,
                        3.0,
                        "черный",
                        "автомат",
                        "х000хх000",
                        true,
                        null,
                        null);

        Car bmw = new Car("Bmw",
                        "Z8",
                        2021,
                        "Германия",
                        "седан",
                        4,
                        3.0,
                        "черный",
                        "автомат",
                        "х000хх000",
                        true,
                        null,
                        null);

        Car kia = new Car("Kia",
                        "Sportage 4-го поколения",
                        2018,
                        "Южная Корея",
                        "кроссовер",
                        4,
                        2.4,
                        "красный",
                        "автомат",
                        "х000хх000",
                        false,
                        null,
                        null);

        Car hyundai = new Car("Hyundai",
                        "Avante",
                        2016,
                        "Южная Корея",
                        "седан",
                        4,
                        1.6,
                        "оранжевый",
                        "автомат",
                        "х000хх000",
                        null,
                        null,
                        null);

        Car[] cars = {lada, audi, bmw, kia, hyundai};

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
        audi.setSummerTyres(true);
        System.out.println(audi.toString());
        audi.changeTyres();
        System.out.println(audi.toString());
        audi.isCorrectNumber();
        System.out.println(audi.toString());
        audi.isCorrectNumber();
        System.out.println(audi.toString());
        System.out.println(lada.getInsurance());

//        Car.Key audiKey =  audi.new Key("автозапуск", "бесключевой доступ");
        lada.setRegNumber("x1111x99");
        System.out.println(lada.getRegNumber());
        System.out.println(lada.isCorrectNumber());
    }
}