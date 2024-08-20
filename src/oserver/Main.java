package oserver;

public class Main {

    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        DigitObserver observer1 = new DigitObserver();
        GraphObserver observer2 = new GraphObserver();
        generator.add(observer1);
        generator.add(observer2);
        generator.execute();
    }
}
