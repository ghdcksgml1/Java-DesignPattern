public class FractionArithmeticOperationCommand implements Command{
    private FractionArithmeticOperation operation;
    private String operator;
    private Fraction operand;

    public FractionArithmeticOperationCommand(FractionArithmeticOperation operation, String operator, Fraction operand){
        this.operation = operation;
        this.operator = operator;
        this.operand = operand;
    }
    @Override
    public void execute() {
        System.out.print(operation.value.toString());
        if(this.operator.equals("+")){
            this.operation.value = FractionArithmeticOperation.plus(operation.value, operand);
            System.out.print(" + ");
        }else if(this.operator.equals("-")){
            this.operation.value = FractionArithmeticOperation.minus(operation.value, operand);
            System.out.print(" - ");
        }else if(this.operator.equals("*")){
            this.operation.value = FractionArithmeticOperation.multiply(operation.value, operand);
            System.out.print(" * ");
        }else if(this.operator.equals("/")){
            this.operation.value = FractionArithmeticOperation.divide(operation.value, operand);
            System.out.print(" / ");
        }
        System.out.println(operand.toString()+" = "+this.operation.value.toString());
    }

    @Override
    public void undo() {
        System.out.print(operation.value.toString());
        this.operator = oppositeOperator(this.operator);
        if(this.operator.equals("+")){
            this.operation.value = FractionArithmeticOperation.plus(operation.value, operand);
            System.out.print(" + ");
        }else if(this.operator.equals("-")){
            this.operation.value = FractionArithmeticOperation.minus(operation.value, operand);
            System.out.print(" - ");
        }else if(this.operator.equals("*")){
            this.operation.value = FractionArithmeticOperation.multiply(operation.value, operand);
            System.out.print(" * ");
        }else if(this.operator.equals("/")){
            this.operation.value = FractionArithmeticOperation.divide(operation.value, operand);
            System.out.print(" / ");
        }
        System.out.println(operand.toString()+" = "+this.operation.value.toString());
    }

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
