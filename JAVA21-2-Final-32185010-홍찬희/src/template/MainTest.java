package template;

import java.util.Arrays;
import java.util.List;

// Java21-2 Final (2021/12/06 Kyoung Shin Park)
public class MainTest {

	public static void main(String[] args) {
		// City - Composite pattern
		CityComponent korea = new CityGroup();
		CityComponent japan = new CityGroup();
		CityComponent usa = new CityGroup();
		CityComponent cities = new CityGroup();
		korea.add(new City("Seoul", "Korea"));
		korea.add(new City("Busan", "Korea"));
		japan.add(new City("Tokyo", "Japan"));
		japan.add(new City("Osaka", "Japan"));
		usa.add(new City("Los Angeles", "USA"));
		usa.add(new City("San Franscico", "USA"));
		usa.add(new City("New York", "USA"));
		cities.add(new City("London", "UK"));
		cities.add(new City("Paris", "France"));
		cities.add(new City("Berlin", "Germany"));
		cities.add(korea);
		cities.add(japan);
		cities.add(usa);
		System.out.println("all cities");
		cities.print();

		// Fraction & Double - Template Method pattern & Strategy pattern
		// sort by fractions using AbstractSorter & Sorter
		Fraction[] fractions = {
				new Fraction(5, 4),
				new Fraction(1, 2),
				new Fraction(2, 3),
				new Fraction(4, 7),
				new Fraction(13, 7)
		};
		Double[] doubles = {
				5.0/4.0,
				1.0/2.0,
				2.0/3.0,
				4.0/7.0,
				13.0/7.0
		};
		System.out.println("\noriginal fractions");
		for (var f : fractions) {
			System.out.println(f);
		}
		System.out.println("\noriginal doubles");
		for (var d : doubles) {
			System.out.println(d);
		}

		// template method pattern
		System.out.println("\nsort by Fraction using AbstractSorter (template method pattern)");
		AbstractSorter<Fraction> sorter1 = new FractionSorter();
		sorter1.bubbleSort(fractions);
		for (var f : fractions) {
			System.out.println(f);
		}
		System.out.println("\nsort by Double using AbstractSorter (template method pattern)");
		AbstractSorter<Double> sorter2 = new DoubleSorter();
		sorter2.bubbleSort(doubles);
		for (var d : doubles) {
			System.out.println(d);
		}
		
		fractions = new Fraction[] {
				new Fraction(5, 4),
				new Fraction(1, 2),
				new Fraction(2, 3),
				new Fraction(4, 7),
				new Fraction(13, 7)
		};
		doubles = new Double[] {
				5.0/4.0,
				1.0/2.0,
				2.0/3.0,
				4.0/7.0,
				13.0/7.0
		};
		System.out.println("\noriginal fractions");
		for (var f : fractions) {
			System.out.println(f);
		}
		System.out.println("\noriginal doubles");
		for (var d : doubles) {
			System.out.println(d);
		}

		// strategy pattern
		System.out.println("\nsort by Fraction using Sorter (strategy pattern)");
		Sorter<Fraction> sorter3 = new Sorter<Fraction>(new FractionComparator());
		sorter3.bubbleSort(fractions);
		for (var f : fractions) {
			System.out.println(f);
		}
		System.out.println("\nsort by Double using Sorter (strategy pattern)");
		Sorter<Double> sorter4 = new Sorter<Double>(new DoubleComparator());
		sorter4.bubbleSort(doubles);
		for (var d : doubles) {
			System.out.println(d);
		}

		// Adapter pattern
		// array of numbers
		int[] numArray = {-20, 87, 12, 25, -57, 65};
		System.out.println("\noriginal numbers array");
		for (var n : numArray) {
			System.out.println(n);
		}
		System.out.println("\nsorted numbers using NumberArraySorter");
		NumberArraySorter sorter = new NumberArraySorter();
		int[] sortedArray = sorter.sort(numArray);
		for (var n : sortedArray) {
			System.out.println(n);
		}
		System.out.println("\noriginal numbers list");
		List<Integer> numList = Arrays.asList(-20, 87, 12, 25, -57, 65);
		for (var n : numList) {
			System.out.println(n);
		}
		System.out.println("\nsorted numbers using Adapater");
		NumberListSorter listSorter = new NumberArraySorterAdapter(sorter);
		List<Integer> sortedList = listSorter.sort(numList);	
		sortedList.forEach(System.out::println);		
	}

}
