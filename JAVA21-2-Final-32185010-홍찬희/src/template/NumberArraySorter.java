package template;

import java.util.Arrays;
//Java21-2 Final (2021/12/06 Kyoung Shin Park)

public class NumberArraySorter {
	public int[] sort(int[] numbers) {
		int[] result = numbers.clone(); // deep copy
		Arrays.sort(result);
		return result;
	}
}
