public interface Command {
    void execute(); // 동작
    void undo(); // 이전 동작
}
