public class FractionArithmeticOperationCommand implements Command{
    private FractionArithmeticOperation operation; // 연산대상 default=0
    private String operator; // 연산자
    private Fraction operand; // 연산수

    // constructor
    public FractionArithmeticOperationCommand(FractionArithmeticOperation operation, String operator, Fraction operand){
        this.operation = operation;
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public void execute() {
        System.out.print(operation.value.toString()); // operation의 현재 value 값을 출력
        if(this.operator.equals("+")){ // operator가 '+'면 분수의 덧셈연산
            this.operation.value = FractionArithmeticOperation.plus(operation.value, operand);
            System.out.print(" + ");
        }else if(this.operator.equals("-")){ // operator가 '-'면 분수의 뺄셈연산
            this.operation.value = FractionArithmeticOperation.minus(operation.value, operand);
            System.out.print(" - ");
        }else if(this.operator.equals("*")){ // operator가 '*'면 분수의 곱셈연산
            this.operation.value = FractionArithmeticOperation.multiply(operation.value, operand);
            System.out.print(" * ");
        }else if(this.operator.equals("/")){ // operator가 '/'면 분수의 나눗셈연산
            this.operation.value = FractionArithmeticOperation.divide(operation.value, operand);
            System.out.print(" / ");
        }
        System.out.println(operand.toString()+" = "+this.operation.value.toString());
    }

    @Override
    public void undo() {
        this.operator = oppositeOperator(this.operator); // 현재 operator의 반대되는 operator 받아오기
        this.execute(); // operator가 반대인것 빼고는 계산과정은 같기때문에 this.execute 메소드 실행
    }

    // 매개변수로 받은 operator의 반대되는 부호를 출력해주는 메소드
    public String oppositeOperator(String operator){
        if (operator.equals("+")){
            return "-";
        }else if(operator.equals("-")){
            return "+";
        }else if(operator.equals("*")){
            return "/";
        }else if(operator.equals("/")){
            return "*";
        }
        return null;
    }
}
