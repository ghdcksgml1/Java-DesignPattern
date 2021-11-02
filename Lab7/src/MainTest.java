public class MainTest {
    public static void main(String[] args) {
        Fraction a = new Fraction(5, 4);
        Fraction b = new Fraction(1, 2);
        Fraction c = new Fraction(2, 3);
        Fraction d = new Fraction(4, 7);
        Fraction e = new Fraction(13, 7);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);

        // receiver class
        FractionArithmeticOperation operation = new FractionArithmeticOperation();
        // invoker class
        FractionArithmeticOperationInvoker invoker = new FractionArithmeticOperationInvoker();
        // set command using command class and then invoke
        invoker.setCommand(new FractionArithmeticOperationCommand(operation, "+", a));
        invoker.execute(); // 0/1 + 5/4 = 5/4
        invoker.setCommand(new FractionArithmeticOperationCommand(operation, "+", b));
        invoker.execute(); // 5/4 + 1/2 = 7/4
        invoker.setCommand(new FractionArithmeticOperationCommand(operation, "-", c));
        invoker.execute(); // 7/4 ‐ 2/3 = 13/12
        invoker.setCommand(new FractionArithmeticOperationCommand(operation, "*", d));
        invoker.execute(); // 13/12 * 4/7 = 13/21
        invoker.setCommand(new FractionArithmeticOperationCommand(operation, "/", e));
        invoker.execute(); // 13/21 / 13/7 = 1/3
        System.out.println();
        invoker.undo(); // 1/3 * 13/7 = 13/21
        invoker.undo(); // 13/21 / 4/7 = 13/12
        invoker.undo(); // 13/12 + 2/3 = 7/4
        invoker.go(); // [추가코드] 7/4 - 2/3 = 13/12
        invoker.undo(); // 13/12 + 2/3 = 7/4
        invoker.undo(); // 7/4 ‐ 1/2 = 5/4
        invoker.undo(); // 5/4 ‐ 5/4 = 0/1
        invoker.undo(); // no undo command in the stack
    }
}
