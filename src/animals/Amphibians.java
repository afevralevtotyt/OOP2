package animals;

import transport.Utilits;

public class Amphibians extends Animals{

    private String habitat;
    public Amphibians(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = Utilits.checkValidStringOrDefault(habitat, "forest");
    }

    public void hunt(){
        System.out.println("I am a hunter");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        if (!super.equals(o)) return false;

        Amphibians that = (Amphibians) o;

        return habitat.equals(that.habitat);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + habitat.hashCode();
        return result;
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }
    public void walk(){
        System.out.println("I am the slowest animal");
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }


}
