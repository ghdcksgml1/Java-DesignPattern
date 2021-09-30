package animalKingdom;

public interface Observer {
    public void onAdded(Animal animal);
    public void onRemoved(Animal animal);
}
