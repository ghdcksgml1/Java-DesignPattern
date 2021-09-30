package animalKingdom;

public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    // flag : add = true, remove = false
    public void notifyObservers(Animal animal, boolean flag);
}
