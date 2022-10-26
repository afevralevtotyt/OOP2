package animals;

import transport.Utilits;

public class Herbivores extends Mammals{
    private String foodType;

    public Herbivores(String name, int age, String habitat, int movementSpeed, String foodType) {
        super(name, age, habitat, movementSpeed);
        setFoodType(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void eat(){
        System.out.println("I like grass");
    }
    @Override
    public void walk(){
        System.out.println("I walk too slow");
    }

    public void graze(){
        System.out.println("Chew, chew");
    }

    public void setFoodType(String foodType) {
        this.foodType = Utilits.checkValidStringOrDefault(foodType, "grass");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;

        Herbivores that = (Herbivores) o;

        return foodType.equals(that.foodType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + foodType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "foodType='" + foodType + '\'' +
                "} " + super.toString();
    }
}
