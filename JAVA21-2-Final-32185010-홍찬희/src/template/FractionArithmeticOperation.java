package template;

// receiver class
public class FractionArithmeticOperation {	
	Fraction value = Fraction.ZERO; // default
	
	public FractionArithmeticOperation() {
	}

	public static Fraction plus(Fraction a, Fraction b) {
		return new Fraction(a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator(), a.getDenominator() * b.getDenominator());
	}

	public static Fraction minus(Fraction a, Fraction b) {
		return new Fraction(a.getNumerator() * b.getDenominator() - b.getNumerator() * a.getDenominator(), a.getDenominator() * b.getDenominator());
	}

	public static Fraction multiply(Fraction a, Fraction b) {
		return new Fraction(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
	}

	public static Fraction divide(Fraction a, Fraction b) {
		return new Fraction(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
	}

	public static int compare(Fraction a, Fraction b) {
		return Double.compare(((double)a.getNumerator())/((double)a.getDenominator()), ((double)b.getNumerator())/((double)b.getDenominator()));
	}

	public void operate(String operator, Fraction operand) {
		Fraction prevValue = value;
		switch (operator) {
		case "+":
			value = plus(prevValue, operand);
			break;
		case "-":
			value = minus(prevValue, operand);
			break;
		case "*":
			value = multiply(prevValue, operand);
			break;
		case "/": 
			value = divide(prevValue, operand);
			break;
        }
		System.out.println("operate: " + prevValue + " " + operator + " " + operand + " = " + value);
	}
	
	public Fraction getValue() {
		return value;
	}

	public void setValue(Fraction value) {
		this.value = value;
	}
}
