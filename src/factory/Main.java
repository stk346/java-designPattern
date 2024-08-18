package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IdCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("권영진");
        Product card2 = factory.create("신태경");
        Product card3 = factory.create("조재상");

        card1.use();
        card2.use();
        card3.use();
    }
}
