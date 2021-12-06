package template;

public class Fraction {
	private int numerator;
	private int denominator;
	public static final Fraction ZERO = new Fraction(0, 1);
	
	public Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			throw new ArithmeticException();
		}
		this.numerator = numerator;
		this.denominator = denominator;
		int gcd = gcd(numerator, denominator);
		if (gcd> 1) {
			this.numerator /= gcd;
			this.denominator /= gcd;
		}
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	@Override
	public String toString() {
		return "Fraction [" + numerator + "/" + denominator + "]";
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}
}
