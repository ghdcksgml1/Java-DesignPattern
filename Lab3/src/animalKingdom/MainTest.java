package animalKingdom;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        // 각각의 동물종류별 객체들을 Animal 클래스로 upcasting
        Animal dog = new Mammal("Dog", "walk", "lungs", "live birth", 4, AnimalType.MAMMAL);
        Animal human = new Mammal("Human", "walk", "lungs", "live birth", 2, AnimalType.MAMMAL);
        Animal whale = new Mammal("Whale", "swim", "lungs", "live birth", 0, AnimalType.MAMMAL);
        Animal ostrich = new Bird("Ostrich", "fly", "lungs", "lay eggs", 2, AnimalType.BIRD);
        Animal turtle = new Reptile("Turtle", "walk", "lungs", "lay eggs", 4, AnimalType.REPTILE);
        Animal snake = new Reptile("Snake", "walk", "lungs", "lay eggs", 0, AnimalType.REPTILE);
        Animal frog = new Amphibian("Frog", "walk & swim", "lung & gills", "lay eggs", 4, AnimalType.AMPHIBIAN);
        Animal salmon = new Fish("Salman", "swim", "gills", "lay eggs", 0, AnimalType.FISH);

        AnimalKingdom kingdom = new AnimalKingdom();
        // Observer 추가
        kingdom.addObserver(new ListDisplay());
        kingdom.addObserver(new PopulationDisplay());
        kingdom.addObserver(new SurveyDisplay());

        // AnimalKingdom 객체의 동물을 추가
        kingdom.addAnimal(turtle);
        Thread.sleep((int)(Math.random()*2000)); // 0~2초 대기
        kingdom.addAnimal(salmon);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.addAnimal(dog);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.addAnimal(human);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.addAnimal(frog);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.addAnimal(ostrich);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.addAnimal(whale);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.addAnimal(snake);

        // AnimalKingdom 객체의 동물을 삭제
        kingdom.removeAnimal(turtle);
        Thread.sleep((int)(Math.random()*2000)); // 0~2초 대기
        kingdom.removeAnimal(salmon);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.removeAnimal(dog);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.removeAnimal(human);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.removeAnimal(frog);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.removeAnimal(ostrich);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.removeAnimal(whale);
        Thread.sleep((int)(Math.random()*2000));
        kingdom.removeAnimal(snake);
    }
}
