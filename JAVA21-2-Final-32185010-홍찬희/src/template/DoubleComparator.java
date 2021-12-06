package template;

public class DoubleComparator implements Comparator<Double>{
    @Override
    public int compare(Double o1, Double o2) {
        // Double의 compare 메소드를 이용해 비교해준다.
        return Double.compare(o1,o2);
    }
}
