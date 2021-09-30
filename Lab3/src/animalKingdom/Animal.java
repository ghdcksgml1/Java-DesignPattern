package animalKingdom;

public abstract class Animal {
    private String name;
    private String move;
    private String breath;
    private String reproduce;
    private int numberOfLegs;

    public Animal(String name, String move, String breath, String reproduce, int numberOfLegs) {
        this.name = name;
        this.move = move;
        this.breath = breath;
        this.reproduce = reproduce;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public String getMove() {
        return move;
    }

    public String getBreath() {
        return breath;
    }

    public String getReproduce() {
        return reproduce;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return "name='" + name +", move='" + move + ", breath='" + breath + ", reproduce='" + reproduce + ", numberOfLegs=" + numberOfLegs;
    }

    public abstract AnimalType type();
}
