package animals;

import transport.Utilits;

public class NotFlyingBirds extends Birds{
    private String movementType;

    public NotFlyingBirds(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        setMovementType(movementType);
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = Utilits.checkValidStringOrDefault(movementType, "Walking");
    }

    public void walk(){
        System.out.println("I walk funny");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotFlyingBirds)) return false;
        if (!super.equals(o)) return false;

        NotFlyingBirds that = (NotFlyingBirds) o;

        return movementType.equals(that.movementType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + movementType.hashCode();
        return result;

    }

    @Override
    public String toString() {
        return "NotFlyingBirds{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }
}
