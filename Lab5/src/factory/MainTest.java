package factory;

import java.util.List;

public class MainTest {
    public static void main(String[] args){
        List<PeriodicElement> list = PeriodicElementImporter.loadCSV("PeriodicElements.csv");
        list.forEach(System.out::println);

//        int number = UserInput.getIntegerBetween(1,118);
//        PeriodicElement element = list.stream().filter(e -> e.getNumber() == number).findAny().orElse(null);
    }
}
