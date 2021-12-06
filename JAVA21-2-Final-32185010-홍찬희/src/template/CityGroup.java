package template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityGroup extends CityComponent{
    // CityComponent의 요소를 저장하는 List
    private List<CityComponent> cityComponents = new ArrayList<CityComponent>();

    public void print(){
        // iterator를 통한 List<CityComponent> 정보 출력
        Iterator<CityComponent> iterator = cityComponents.iterator();
        while (iterator.hasNext()) {
            CityComponent cities =
                    (CityComponent)iterator.next();
            cities.print(); // City의 정보를 출력한다.
        }
    }

    // cityComponents에 정보들을 추가한다.
    public void add(CityComponent cityComponent){
        this.cityComponents.add(cityComponent);
    }
}
