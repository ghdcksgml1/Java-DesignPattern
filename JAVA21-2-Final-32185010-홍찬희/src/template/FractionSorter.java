package template;

public class FractionSorter extends AbstractSorter<Fraction>{


    @Override
    int compare(Fraction o1, Fraction o2) {
        // Fraction의 분수 중에서 작은게 앞으로 오게 한다.
        return FractionArithmeticOperation.compare(o1,o2);
    }
}
