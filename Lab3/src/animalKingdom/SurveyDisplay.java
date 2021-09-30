package animalKingdom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SurveyDisplay implements DisplayElement,Observer{
    private List<Animal> animals = new ArrayList<>();
    @Override
    public void display() {
        // animals ArrayList에 들어있는 Animal 객체의 정보들을
        // AnimalType Enum에 정의되어있는 순으로 정렬하여 출력한다.
        animals.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                // ordinal을 이용해 Enum 순으로 정렬
                return o1.type().ordinal() - o2.type().ordinal();
            }});
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
