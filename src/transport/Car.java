package transport;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car extends Transport {
    private Insurence insurence;
    double engineVolume;
    private String transmisson;
    private String bodyType;
    private String registrationNumber;
    private int seatPlaces;
    private  String rubberType;
    private Keys keyType;

    private String fuel;


    public static class Insurence {
        private Calendar insurenceDate;
        private double price;
        private String number;
        public Insurence(Calendar insuarenceDate, double price, String number) {
            if (insuarenceDate.getClass() == GregorianCalendar.class) {
                this.insurenceDate = insuarenceDate;
            } else {
                this.insurenceDate = GregorianCalendar.getInstance();
            }
            if (price > 0) {
                this.price = price;
            } else {
                this.price = 1;
            }
            if (!number.isBlank() && !number.isBlank() && !number.equals("")) {
                this.number = number;
            }
        }

        public Calendar getInsurenceDate() {
            return this.insurenceDate;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public static class Keys {
        boolean remote;
        boolean withOutKeyAccess;

        @Override
        public String toString() {
            String rem = "нет";
            if (remote) {
                rem = "да";
            }
            String access = "нет";
            if (withOutKeyAccess) {
                access = "да";
            }
            return "Дистаноционный запуск: " + rem + ", бесключевой доступ: " + access;
        }


        public Keys(String remote, String withOutKeyAccess) {
            if (remote.toLowerCase().equals("дистанционный")) {
                this.remote = true;
            } else {
                this.remote = false;
            }
            if (withOutKeyAccess.toLowerCase().equals("бесключевой".toLowerCase())) {

                this.withOutKeyAccess = true;
            } else {
                this.withOutKeyAccess = false;
            }

        }

        public boolean isRemote() {
            return remote;
        }

        public boolean isWithOutKeyAccess() {
            return withOutKeyAccess;
        }
    }


    public Car(String brand, String model, double engineVolume, String bodyColor, int maxSpeed, int productionYear, String productionCountry, String transmisson, String bodyType, String registrationNumber, int seatPlaces, String rubberType, Insurence insurence, Keys keyType) {
        super(brand, model, productionYear,  productionCountry, bodyColor, maxSpeed);
        if (Double.compare(engineVolume, 0) != 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmisson != null && !transmisson.isEmpty() && !transmisson.isBlank()) {
            if (transmisson.equals("Автомат") || transmisson.equals("Механика")) {
                this.transmisson = transmisson;
            } else {
                this.transmisson = "Коробка передач указана неверно";
            }
        } else {
            this.transmisson = "Автомат";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            if (bodyType.equals("Седан") || bodyType.equals("Кроссовер")) {
                this.bodyType = bodyType;
            } else {
                this.bodyType = "Неизвестный тип кузова";
            }
        } else {
            this.bodyType = "Седан";
        }
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Без номера";
        }
        if (seatPlaces > 0) {
            this.seatPlaces = seatPlaces;
        } else {
            this.seatPlaces = 5;
        }
        if (rubberType != null && !rubberType.isEmpty() && !rubberType.isBlank()) {
            if (rubberType.equals("Зима") || rubberType.equals("Лето")) {
                this.rubberType = rubberType;
            } else {
                this.rubberType = "Неизвестный тип резины";
            }
        }
        this.insurence = insurence;
        this.keyType = keyType;

    }

    public void changeRubber() {
        if (LocalDate.now().getMonthValue() <= 2 || LocalDate.now().getMonthValue() >= 11) {
            this.rubberType = "Зима";

        } else {
            this.rubberType = "Лето";
        }
    }

    public void checkRegistrationNumber() {
        if (this.registrationNumber.toLowerCase().matches("[abceopkmhaxty][0-9][0-9][0-9][abceopkmhaxty][abceopkmhaxty][0-9][0-9][0-9]}")) {
            System.out.println("Номер соответствует стандарту");
        } else {
            System.out.println("Неверный госномер");
        }
    }

    public void checkInsuranceNumber() {
        if (this.insurence.number.length() != 9) {
            System.out.println("Неверный номер страховки");
        }
    }

    public void checkInsuranceActuality() {
        if (!this.insurence.insurenceDate.after(GregorianCalendar.getInstance())) {
            System.out.println("Страховка уже не действует");
        }
    }

    public Insurence getInsurence() {
        return insurence;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmisson() {
        return transmisson;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeatPlaces() {
        return seatPlaces;
    }

    public String getRubberType() {
        return rubberType;
    }

    public Keys getKeyType() {
        return keyType;
    }

    @Override
    public void refill(String fuelType) {
        if(fuelType.toLowerCase().equals("бензин")||fuelType.toLowerCase().equals("дизель")||fuelType.toLowerCase().equals("электричество")){
            System.out.println("Машина заправлена топливом: "+fuelType);
        }else{
            System.out.println("Выбран неверный тип топлива");
        }
    }

    public void printCarInfo() {
        System.out.println("Aвтомобиль" +
                "марки " + getBrand() +
                ", модель " + getModel() +
                ", объем двигателя " + engineVolume +
                ", цвет " + getBodyColor() +
                ", год производства " + getProductionYear() +
                ", страна сборки " + getProductionCountry() +
                ", максимальная скорость " +getMaxSpeed()
        );
    }
}

