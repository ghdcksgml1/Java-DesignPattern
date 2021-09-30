package animalKingdom;

public class Amphibian extends Animal{
    public Amphibian(String name, String move, String breath, String reproduce, int numberOfLegs,AnimalType animalType) {
        super(name, move, breath, reproduce, numberOfLegs);
    }
    @Override
    public AnimalType type() {
        return AnimalType.AMPHIBIAN;
    }
}
