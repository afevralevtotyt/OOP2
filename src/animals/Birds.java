package animals;

import transport.Utilits;

public class Birds extends Animals{
     private String habitat;

    public Birds(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = Utilits.checkValidStringOrDefault(habitat, "trees");
    }

    public void hunt(){
         System.out.println("I am the best hunter");
     }


    @Override
    public void eat() {
        System.out.println("I like mixed food");
    }

    @Override
    public void move() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;

        Birds birds = (Birds) o;

        return habitat.equals(birds.habitat);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + habitat.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
