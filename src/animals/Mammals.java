package animals;

import transport.Utilits;

import java.sql.SQLOutput;
import java.util.Objects;

public abstract class Mammals extends Animals{

    private String habitat;
    private int movementSpeed;

    public Mammals(String name, int age, String habitat, int movementSpeed) {
        super(name, age);
        this.habitat = Utilits.checkValidStringOrDefault(habitat, "forest");
        setMovementSpeed(movementSpeed);
    }

    public String getHabitat() {
        return habitat;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = Math.max(movementSpeed, 5);
    }

    public void walk() {
        System.out.println("I'm walking");
    }


    @Override
    public void eat() {
    }


    @Override
    public void move() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        if (!super.equals(o)) return false;

        Mammals mammals = (Mammals) o;

        if (movementSpeed != mammals.movementSpeed) return false;
        return Objects.equals(habitat, mammals.habitat);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (habitat != null ? habitat.hashCode() : 0);
        result = 31 * result + movementSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "habitat='" + habitat + '\'' +
                ", movementSpeed=" + movementSpeed +
                "} " + super.toString();
    }
}
