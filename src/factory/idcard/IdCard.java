package factory.idcard;

import factory.framework.Product;

public class IdCard extends Product {
    private final String owner;

    public IdCard(final String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "의  카드를 사용합니다.");
    }

    @Override
    public String toString() {
        return "[ID Card:" + owner + "]";
    }

    public String getOwner() {
        return new String(owner);
    }
}
