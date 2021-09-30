package animalKingdom;

public class Fish extends Animal{
    public Fish(String name, String move, String breath, String reproduce, int numberOfLegs,AnimalType animalType) {
        super(name, move, breath, reproduce, numberOfLegs);
    }
    @Override
    public AnimalType type() {
        return AnimalType.FISH;
    }
}
