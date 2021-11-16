import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("\n\nDynamicArray add & print");
        DataCollection<City> arr = new DynamicArray<>();
        arr.put(new City("서울", "한국")); // put 8~10 elements
        arr.put(new City("베이징","중국"));
        arr.put(new City("도쿄","일본"));
        arr.put(new City("마닐라","필리핀"));
        arr.put(new City("방콕","타이"));
        arr.put(new City("하노이","베트남"));
        arr.put(new City("몰레","몰디브"));
        arr.put(new City("카불","아프카니스탄"));
        arr.put(new City("리야드","사우디아라비아"));
        arr.put(new City("예루살렘","이스라엘"));

        arr.forEach(System.out::println); // test Iterable<E>
        System.out.println();
        // remove & insert & elemAt & clear & remove all using iterator &
        // print using for/while/foreach
        arr.remove(1);
        arr.remove(2);
        arr.remove(3);
        arr.insert(0,new City("앙카라","터키"));
        System.out.println("index 5: "+arr.elemAt(5));
        arr.forEach(System.out::println);
        System.out.println();

        ArrayList<City> list = new ArrayList<>();
        list.add(new City("서울", "한국")); // put 8~10 elements
        list.add(new City("베이징","중국"));
        list.add(new City("도쿄","일본"));
        list.add(new City("마닐라","필리핀"));
        list.add(new City("방콕","타이"));
        list.add(new City("하노이","베트남"));
        list.add(new City("몰레","몰디브"));
        list.add(new City("카불","아프카니스탄"));
        list.add(new City("리야드","사우디아라비아"));
        list.add(new City("예루살렘","이스라엘"));
        arr = new ListDataCollection<>(list);
        arr.put(new City("시카고", "미국")); // put 2~3 elements
        arr.put(new City("브라질리아","브라질"));
        arr.forEach(System.out::println);
        System.out.println();

        // remove & insert & elemAt & clear & remove all using iterator &
        arr.remove(0); arr.remove(0); arr.remove(0);
        arr.insert(0,new City("시드니","호주"));
        System.out.println("index0 : "+arr.elemAt(0));
        // print using for/while/foreach
        arr.forEach(System.out::println);
        System.out.println();
        arr.clear();
        arr.forEach(System.out::println);
        System.out.println();

        Stack<City> stack = new Stack<>();
        stack.add(new City("서울", "한국")); // put 8~10 elements
        stack.add(new City("베이징","중국"));
        stack.add(new City("도쿄","일본"));
        stack.add(new City("마닐라","필리핀"));
        stack.add(new City("방콕","타이"));
        stack.add(new City("하노이","베트남"));
        stack.add(new City("몰레","몰디브"));
        stack.add(new City("카불","아프카니스탄"));
        stack.add(new City("리야드","사우디아라비아"));
        stack.add(new City("예루살렘","이스라엘"));
        arr = new ListDataCollection<>(stack);
        arr.put(new City("시카고", "미국")); // put 2~3 elements
        arr.put(new City("브라질리아","브라질"));
        // remove & insert & elemAt & clear & remove all using iterator &
        arr.remove(0); arr.remove(0); arr.remove(0);
        arr.insert(0,new City("시드니","호주"));
        System.out.println("index0 : "+arr.elemAt(0));
        // print using for/while/foreach
        arr.forEach(System.out::println);
        System.out.println();
        arr.clear();
        arr.forEach(System.out::println);
        System.out.println();

        // [추가코드] LinkedList
        LinkedList<City> linkedList = new LinkedList<>();
        linkedList.add(new City("서울", "한국")); // put 8~10 elements
        linkedList.add(new City("베이징","중국"));
        linkedList.add(new City("도쿄","일본"));
        linkedList.add(new City("마닐라","필리핀"));
        linkedList.add(new City("방콕","타이"));
        linkedList.add(new City("하노이","베트남"));
        linkedList.add(new City("몰레","몰디브"));
        linkedList.add(new City("카불","아프카니스탄"));
        linkedList.add(new City("리야드","사우디아라비아"));
        linkedList.add(new City("예루살렘","이스라엘"));
        arr = new ListDataCollection<>(linkedList);
        arr.put(new City("시카고", "미국")); // put 2~3 elements
        arr.put(new City("브라질리아","브라질"));
        // remove & insert & elemAt & clear & remove all using iterator &
        arr.remove(0); arr.remove(0); arr.remove(0);
        arr.insert(0,new City("시드니","호주"));
        System.out.println("index0 : "+arr.elemAt(0));
        // print using for/while/foreach
        arr.forEach(System.out::println);
        System.out.println();
        arr.clear();
        arr.forEach(System.out::println);
        System.out.println();
    }
}
