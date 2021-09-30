package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class PopulationDisplay implements DisplayElement, Observer{
    private List<Animal> animals = new ArrayList<>();
    @Override
    public void display() {
        // 현재 animals ArraysList에 들어있는 Animal 객체의 숫자를 출력한다.
        System.out.println("PopulationDisplay : "+animals.size());
    }

    @Override
    public void onAdded(Animal animal) {
        animals.add(animal);
        display();
    }

    @Override
    public void onRemoved(Animal animal) {
        animals.remove(animal);
        display();
    }
}
