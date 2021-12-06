package template;

public class FractionComparator implements Comparator<Fraction>{
    @Override
    public int compare(Fraction o1, Fraction o2) {
        // Fraction의 분수중에서 작은게 앞으로 오게한다.
        return FractionArithmeticOperation.compare(o1,o2);
    }
}
