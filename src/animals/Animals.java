package animals;

import transport.Utilits;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = Utilits.checkValidStringOrDefault(name, "animal");
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
    public void sleep() {
        System.out.println("I like sleep enough");
    }
    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;

        Animals animals = (Animals) o;

        if (age != animals.age) return false;
        return name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
