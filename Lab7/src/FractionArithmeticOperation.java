public class FractionArithmeticOperation {
    Fraction value = Fraction.ZERO; // default 값은 0
    public static Fraction plus(Fraction a, Fraction b){ // 분수의 더하기
        return new Fraction(a.getNumerator() * b.getDenominator()
        + b.getNumerator() * a.getDenominator(), a.getDenominator() *
        b.getDenominator());
    }
    public static Fraction minus(Fraction a, Fraction b){ // 분수의 빼기
        return new Fraction(a.getNumerator() * b.getDenominator()
                - b.getNumerator() * a.getDenominator(), a.getDenominator() *
                b.getDenominator());
    }
    public static Fraction multiply(Fraction a, Fraction b){ // 분수의 곱하기
        return new Fraction(a.getNumerator() * b.getNumerator()
                , a.getDenominator() * b.getDenominator());
    }
    public static Fraction divide(Fraction a, Fraction b){ // 분수의 나누기
        return new Fraction(a.getNumerator() * b.getDenominator(),
                a.getDenominator() * b.getNumerator());
    }
}
