import java.math.BigInteger;

public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static final Fraction ZERO = new Fraction(0,1);
    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            throw new ArithmeticException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        int gcd = gcd(numerator, denominator);
        if (gcd > 1){
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
    }

    // ...

    private static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    @Override
    public String toString() {
        return numerator +"/"+ denominator;
    }
}
