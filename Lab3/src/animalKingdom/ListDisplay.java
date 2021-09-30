package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class ListDisplay implements DisplayElement, Observer{
    private List<Animal> animals = new ArrayList<>();
    @Override
    public void display() {
        // 현재 animals ArrayList에 들어있는 Animal 객체들의 모든 정보를 객체가 들어온 순으로 출력한다.
        System.out.println("ListDisplay :");
        for(int i=1;i<=animals.size();i++){
            System.out.println(i+" : "+animals.get(i-1).toString()+", animalType="+animals.get(i-1).type());
        }
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
