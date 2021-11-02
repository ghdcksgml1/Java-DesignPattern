public class FractionArithmeticOperation {
    Fraction value = Fraction.ZERO; // default
    public static Fraction plus(Fraction a, Fraction b){
        return new Fraction(a.getNumerator() * b.getDenominator()
        + b.getNumerator() * a.getDenominator(), a.getDenominator() *
        b.getDenominator());
    }
    public static Fraction minus(Fraction a, Fraction b){
        return new Fraction(a.getNumerator() * b.getDenominator()
                - b.getNumerator() * a.getDenominator(), a.getDenominator() *
                b.getDenominator());
    }
    public static Fraction multiply(Fraction a, Fraction b){
        return new Fraction(a.getNumerator() * b.getNumerator()
                , a.getDenominator() * b.getDenominator());
    }
    public static Fraction divide(Fraction a, Fraction b){
        return new Fraction(a.getNumerator() * b.getDenominator(),
                a.getDenominator() * b.getNumerator());
    }
}
