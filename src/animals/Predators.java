package animals;

import transport.Utilits;

public class Predators extends Mammals{

    private String foodType;

    public Predators(String name, int age, String habitat, int movementSpeed, String foodType) {
        super(name, age, habitat, movementSpeed);
        setFoodType(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = Utilits.checkValidStringOrDefault(foodType,"meat");
    }

    public void hunt(){
        System.out.println("I'm a hunter");
    }

    @Override
    public void walk() {
        System.out.println("I walk very fast");
    }

    @Override
    public void eat() {
        System.out.println("I like meat!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;

        Predators predators = (Predators) o;

        return foodType.equals(predators.foodType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + foodType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Predators{" +
                "foodType='" + foodType + '\'' +
                "} " + super.toString();
    }
}
