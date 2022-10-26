package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
    }

    @Override
    public void refill(String fuelType) {
        if(fuelType.toLowerCase().equals("бензин")||fuelType.toLowerCase().equals("дизель")){
            System.out.println("Автобус заправлен топливом: "+fuelType);
        }else{
            System.out.println("Выбран неверный тип топлива");
        }
    }
}
