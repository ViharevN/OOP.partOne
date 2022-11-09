public class Main {
    public static void main(String[] args) {
        Human max = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human ann = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(max.toString());
        System.out.println(ann.toString());
        System.out.println(kate.toString());
        System.out.println(artem.toString());

        System.out.println();

        Car lada = new Car("Lada", "Granta", "желтый", 2015, "Россия", 1.7);
        Car audi = new Car("Audi", "A8", "черный", 2020, "Германия", 3.0);
        Car bmw = new Car("Bmw", "Z8", "черный", 2021, "Германия", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", "красный", 2018, "Южная Корея", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", "оранжевый", 2016, "Южная Корея", 1.6);

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());

    }
}