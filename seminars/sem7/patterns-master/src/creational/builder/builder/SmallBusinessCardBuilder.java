package creational.builder.builder;

public class SmallBusinessCardBuilder extends BusinessCardBuilder {
    @Override
    void buildName() {
        getCard().setName("Маленькая визитка");
    }

    @Override
    void buildPrice() {
        getCard().setPrice(100);
    }

    @Override
    void buildSize() {
        getCard().setSize(new int[]{16, 9});
    }

}
