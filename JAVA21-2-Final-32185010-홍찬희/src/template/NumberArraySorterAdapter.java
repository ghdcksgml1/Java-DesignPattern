package template;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberArraySorterAdapter implements NumberListSorter{
    private NumberArraySorter numberArraySorter; // NumberArraySorter를 멤버변수로 가지고 있음

    // constructor
    public NumberArraySorterAdapter(NumberArraySorter numberArraySorter) {
        this.numberArraySorter = numberArraySorter;
    }

    @Override // List<Integer>로 int[] sort를 수행하는 메소드
    public List<Integer> sort(List<Integer> numbers) {
        int[] nums = numbers.stream().mapToInt(i->i).toArray(); // List<Integer> -> int배열
        nums = numberArraySorter.sort(nums); // NumberArraySorter의 sort 메소드 실행
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList()); // int 배열 -> List<Integer>
        return list;
    }
}
