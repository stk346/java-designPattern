package adapter.위임;

public class Main {
    public static void main(String[] args) {
        // Print 타입으로 선언해서 showWithParen, showWithAster 메서드를 숨김
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
