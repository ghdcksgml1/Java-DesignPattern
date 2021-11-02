import java.util.Stack;

public class FractionArithmeticOperationInvoker {
    private Command command;
    private Stack<Command> stack1 = new Stack<>(); // undo를 위한 스택
    private Stack<Command> stack2 = new Stack<>(); // go를 위한 스택

    public void setCommand(Command c){
        this.command = c;
    }

    public void execute(){
        stack1.push(command);
        this.command.execute();
    }

    public void undo(){
        if(stack1.isEmpty()){
            System.out.println("no undo command in the stack!");
            return;
        }
        stack1.peek().undo();
        stack2.push(stack1.peek());
        stack1.pop();
    }

    // [추가코드]
    public void go(){
        if(stack2.isEmpty()){
            System.out.println("no go command in the stack!");
            return;
        }
        stack2.peek().undo();
        stack1.push(stack2.peek());
        stack2.pop();
    }
}
