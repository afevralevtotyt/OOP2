package transport;

public class Train extends Transport {
    private int fare;
    private int travelTime;
    private String startStation;
    private String finalStation;

    private int carriageNumber;

    public Train(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed, int fare, int travelTime, String startStation, String finalStation, int carriageNumber) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxSpeed);
        setFare(fare);
        setTravelTime(travelTime);
        setStartStation(startStation);
        setFinalStation(finalStation);
        setCarriageNumber(carriageNumber);

    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = Math.max(fare, 0);
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = Math.max(travelTime, 10);
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = Utilits.checkValidStringOrDefault(startStation, "default");
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = Utilits.checkValidStringOrDefault(finalStation, "default");
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = Math.max(carriageNumber, 0);
    }
    @Override
    public void refill(String fuelType) {
        if(fuelType.toLowerCase().equals("дизель")){
            System.out.println("Поезд заправлен топливом: "+fuelType);
        }else{
            System.out.println("Выбран неверный тип топлива");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", станция отбытия: " + getStartStation()+
                ", конечная станция: "+ getFinalStation()+
                ", количество вагонов" + getCarriageNumber();
    }
}
