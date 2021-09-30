package animalKingdom;

public class Reptile extends Animal{
    public Reptile(String name, String move, String breath, String reproduce, int numberOfLegs,AnimalType animalType) {
        super(name, move, breath, reproduce, numberOfLegs);
    }
    @Override
    public AnimalType type() {
        return AnimalType.REPTILE;
    }
}
