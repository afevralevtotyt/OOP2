import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow",190,2015, "Russia", "Автомат", "КУКУ", "k542ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 6000, "987654321"), new Car.Keys("дистанционный", "Бесключевой"));
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 200,2020, "Germany", "Автомат", "Седан", "k543ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.APRIL, 1), 8000, "987654321"),  new Car.Keys("дистанционный", "Бесключевой"));
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "black", 220,2021, "Germany", "Автомат", "Седан", "k543ak039", 5, "Зиа", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 6000, "987654321"),  new Car.Keys("дистанционный", "Бесключевой"));
        Car kiaSportage = new Car("KIA", "Sportage 4th gen", 2.4, "red", 200,2018, "South Korea", "Механика", "Седан", "k543ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 12000, "987654321"),  new Car.Keys("дистанционный", "Бесключевой"));
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 180, 2016, "South Korea", "Автомат", "Седан", "а555ak038", 5, "Зима", new Car.Insurence(new GregorianCalendar(2022, Calendar.NOVEMBER, 1), 18000, "9876543214"),  new Car.Keys("дистанционный", "Бесключевой"));
        hyundaiAvante.setMaxSpeed(300);
        Train martin = new Train("Ласточка", "В-901", 2011, "Россия", "", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        Bus ikarus = new Bus("Mercedes", "Ikarus", 2010, "Germany", "green", 160);
        Bus vito = new Bus("Mercedes", "Vito", 2014, "Germany", "blue", 180);
        Bus sangYoung = new Bus("SangYoung", "M1", 206, "South Korea", "black", 175);
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
        System.out.println(martin);
        System.out.println(leningrad);
        System.out.println(ikarus);
        System.out.println(vito);
        System.out.println(sangYoung);
        ikarus.refill("ДИЗЕЛЬ");

        Herbivores gazelle = new Herbivores("Газель", 12, "desert",30, "");
        Herbivores giraffe = new Herbivores("Жираф", 2, "desert",10, "");
        Herbivores horse = new Herbivores("Поня", 10, "meadow",40, "");
        Predators hyena = new Predators("Маша", 20, "steppe", 20, "");
        Predators tiger = new Predators("Миша", 14, "forest", 55, "");
        Predators bear = new Predators("Степа", 11, "forest", 20, "mixed");
        Amphibians frog = new Amphibians("Чача", 1, "lake");
        Amphibians adder = new Amphibians("Жужа", 2, "lake");
        FlyingBirds gull = new FlyingBirds("Джонатан Ливингстоун", 3, "coast" , "");
        FlyingBirds albatross = new FlyingBirds("Симба", 4, "coast" , "");
        FlyingBirds falcon = new FlyingBirds("Румбик", 5, "coast" , "");
        NotFlyingBirds peacock = new NotFlyingBirds("Пикок", 3, "", "");
        NotFlyingBirds penguin = new NotFlyingBirds("Пинги", 4, "", "");
        NotFlyingBirds dodoBird = new NotFlyingBirds("Додо", 3, "", "");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(adder);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

    }
}
