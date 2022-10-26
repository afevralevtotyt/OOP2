package animals;

import transport.Utilits;

public class FlyingBirds extends Birds{
    private String movementType;

    public FlyingBirds(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = movementType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = Utilits.checkValidStringOrDefault(movementType, "Flying");
    }

    public void hunt(){
        super.hunt();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlyingBirds)) return false;
        if (!super.equals(o)) return false;

        FlyingBirds that = (FlyingBirds) o;

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
        return "FlyingBirds{" +
                "movementType='" + movementType + '\'' +
                "} " + super.toString();
    }
}
