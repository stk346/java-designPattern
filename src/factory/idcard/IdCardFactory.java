package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

public class IdCardFactory extends Factory {

    @Override
    protected Product createProduct(final String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(final Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
