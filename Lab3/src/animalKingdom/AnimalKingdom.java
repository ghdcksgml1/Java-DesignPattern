package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class AnimalKingdom implements Subject{
    private List<Observer> observers = new ArrayList<>(); // Observer 객체들을 담고있는 ArrayList
    private List<Animal> animals = new ArrayList<>(); // animal 객체들을 담고있는 ArrayList

    // 동물 추가하기
    public void addAnimal(Animal animal){
        System.out.println("Adding "+animal.getName());
        animals.add(animal); // 인스턴스변수 animals에 객체를 추가한 뒤
        notifyObservers(animal, true); // 추가사실을 옵저버에게 알린다.
    }

    public void removeAnimal(Animal animal){
        System.out.println("Removing "+animal.getName());
        animals.remove(animal); // 인스턴스변수에서 매개변수 animal을 찾은 뒤 삭제한다.
        notifyObservers(animal, false); // 삭제사실을 옵저버에게 알린다.
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o); // 옵저버 객체를 추가한다.
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o); // 옵저버 객체를 삭제한다.
    }

    // 추가나 삭제시 옵저버에게 변동사항을 알리는 메소드
    @Override
    public void notifyObservers(Animal animal, boolean flag) {
        // 매개변수로 같이받은 flag를 이용해
        // flag가 true면 추가, flase면 삭제를 알린다.
        for(Observer o : this.observers){
            if(flag == true){
                o.onAdded(animal); // 옵저버의 추가됐음을 알리는 메소드로 animal 객체를 넘긴다.
            }else{
                o.onRemoved(animal); // 옵저버의 삭제됐음을 알리는 메소드로 animal 객체를 넘긴다.
            }
        }
        System.out.println("\n\n");
    }
}
