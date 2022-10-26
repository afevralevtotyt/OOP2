package transport;

public abstract class Transport {
    private final String brand;
    private final String model;

    private final String productionCountry;

    private final int productionYear;
    private String bodyColor;
    protected int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
        this.brand = Utilits.checkValidStringOrDefault(brand, "default");
        this.model = Utilits.checkValidStringOrDefault(model, "default");
        this.productionCountry = Utilits.checkValidStringOrDefault(productionCountry, "default");
        this.productionYear = Math.max(productionYear, 2000);

        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = Utilits.checkValidStringOrDefault(bodyColor, "white");
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Транспортное средство производителя " +
                getBrand()+
                ", модель: " + getModel()+
                ", цвет: "+ getBodyColor()+
                ", произведенное в " + getProductionCountry()+
                ", год производства: " + getProductionYear() +
                ", максимальная скорость км/ч: " + getMaxSpeed();
    }

    public abstract void refill(String fuelType);
}

