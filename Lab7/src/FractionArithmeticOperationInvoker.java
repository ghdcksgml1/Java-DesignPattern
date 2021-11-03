import java.util.Stack;

public class FractionArithmeticOperationInvoker {
    private Command command;
    private Stack<Command> stack1 = new Stack<>(); // undo를 위한 스택
    private Stack<Command> stack2 = new Stack<>(); // go를 위한 스택

    // Command Interface를 set해주는 메소드
    public void setCommand(Command c){
        this.command = c;
    }

    // 현재 Command의 동작을 실행시키는 메소드
    public void execute(){
        stack1.push(command); // 현재 Command를 stack1 스택에 push 해준다.
        this.command.execute(); // 현재 Command의 execute 메소드를 실행시킨다.
    }

    // operand를 곱하기면 나누기, 더하기면 빼기를 통해 이전 값을 반환해주는 메소드
    public void undo(){
        if(stack1.isEmpty()){ // 스택이 비어있으면 오류 메시지를 출력하고 동작을 마친다.
            System.out.println("no undo command in the stack!");
            return;
        }
        stack1.peek().undo(); // 스택의 최상단의 Command의 undo 메소드를 실행시킨다.
        stack2.push(stack1.peek()); // [추가코드] stack2 스택에 최상단의 값을 넣어준다.
        stack1.pop(); // 스택을 pop한다.
    }

    // [추가코드]
    public void go(){
        if(stack2.isEmpty()){ // 스택이 비어있으면 오류 메시지를 출력하고 동작을 마친다.
            System.out.println("no go command in the stack!");
            return;
        }
        stack2.peek().undo(); // stack2의 최상단의 Command의 undo 메소드를 실행시킨다.
        stack1.push(stack2.peek()); // stack1 스택에 stack2의 최상단의 Command를 넣어주고
        stack2.pop(); // stack2의 스택을 pop해준다.
    }
}
