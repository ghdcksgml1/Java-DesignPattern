import java.math.BigInteger;

public class Fraction {
    private int numerator; // 분자
    private int denominator; // 분모

    // Getter
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //

    public static final Fraction ZERO = new Fraction(0,1);
    // Constructor
    public Fraction(int numerator, int denominator){
        if (denominator == 0){ // 분모가 0이면 에러!!
            throw new ArithmeticException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        int gcd = gcd(numerator, denominator); // 최대공약수 구하기
        if (gcd > 1){ // gcd가 1 이상이면 분수가 약분되므로
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
    }

    // gcd 알고리즘
    private static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    @Override // toString
    public String toString() {
        return numerator +"/"+ denominator;
    }
}
